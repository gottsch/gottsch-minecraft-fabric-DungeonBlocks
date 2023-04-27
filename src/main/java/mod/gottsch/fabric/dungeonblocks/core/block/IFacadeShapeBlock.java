/*
 * This file is part of  DungeonBlocks.
 * Copyright (c) 2020 Mark Gottschling (gottsch)
 * 
 * All rights reserved.
 *
 * DungeonBlocks is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * DungeonBlocks is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with DungeonBlocks.  If not, see <http://www.gnu.org/licenses/lgpl>.
 */
package mod.gottsch.fabric.dungeonblocks.core.block;

import mod.gottsch.fabric.dungeonblocks.core.state.properties.FacadeShape;
import mod.gottsch.fabric.gottschcore.block.IFacingBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

/**
 * @author Mark Gottschling on Mar 24, 2020
 *
 */
public interface IFacadeShapeBlock extends IFacingBlock {
	public static final EnumProperty<FacadeShape> SHAPE = EnumProperty.of("shape", FacadeShape.class);

	public boolean isBlockInstanceOf(Block block);

	/**
	 * Returns the VoxelShape (ie bounding box) of the block in the correct position.
	 * NOTE if shape != STRAIGHT, then facing index can only == North || South
	 */
	default public int getBlockShapeIndex(BlockState state, BlockView getter, BlockPos pos) {
		int facingIndex = 0;
		int shapeIndex = 0;

		Direction direction = state.get(FACING);
		FacadeShape shape = state.get(SHAPE);

		facingIndex = switch (direction) {
			case SOUTH ->  Direction.SOUTH.getHorizontal();
			case EAST -> Direction.EAST.getHorizontal();
			case WEST -> Direction.WEST.getHorizontal();
			default -> Direction.NORTH.getHorizontal();
		};

		// TODO make consts for all the indexes or an enum with int values
		shapeIndex = switch (shape) {
		case STRAIGHT -> facingIndex;
		case INNER_LEFT -> {
			int i = 4;
			if (facingIndex == 0) i = 4;
			else if (facingIndex == 2)	i = 5;
			yield i;
		}
		case INNER_RIGHT -> {
			int i = 6;
			if (facingIndex == 0) i = 6;
			else if (facingIndex == 2) i = 7;
			yield i;
		}
		case OUTER_LEFT -> {
			int i = 9;
			if (facingIndex == 0) i = 9;
			else if (facingIndex == 2) i = 8;
			yield i;
		}
		case OUTER_RIGHT -> {
			int i = 11;
			if (facingIndex == 0) i = 11;
			else if (facingIndex == 2) i = 10;
			yield i;
		}
		default -> 0;
		};
		return shapeIndex;
	}

	/**
	 * 
	 * @param level
	 * @param blockState
	 * @param blockPos
	 * @return
	 */
	default public BlockState getBlockStateForPlacement(WorldAccess level, BlockState blockState, BlockPos blockPos) {
		Direction direction = blockState.get(FACING);
		BlockState newState = blockState;
		
		// test the direction theblock is facing
		newState = switch (direction) {
		case SOUTH -> getStateForSouthDirection(level, blockPos, blockState);
		case NORTH -> getStateForNorthDirection(level, blockPos, blockState);
		case EAST -> getStateForEastDirection(level, blockPos, blockState);
		case WEST -> getStateForWestDirection(level, blockPos, blockState);
		default -> blockState.with(SHAPE, FacadeShape.STRAIGHT);
		};
		return newState;
	}

	/**
	 * Check whether there is a same block at the given position and it has the same
	 * properties as the given BlockState
	 */
	default public boolean isSameBasic(WorldAccess level, BlockPos pos, BlockState stateIn) {
		BlockState state = level.getBlockState(pos);
		Block block = state.getBlock();
		/**
		 * Checks if a block is an instance of this class
		 */
		return isBlockInstanceOf(block) && state.get(FACING) == stateIn.get(FACING);
	}

	default BlockState getStateForSouthDirection(WorldAccess level, BlockPos blockPos, BlockState blockState) {
		BlockState neighborState;
		Block neighborBlock;
		Direction neighborFacing;

		neighborState = level.getBlockState(blockPos.south());
		neighborBlock = neighborState.getBlock();

		// inner test
		if (isBlockInstanceOf(neighborBlock)) {
			neighborFacing = neighborState.get(FACING);
			if (neighborFacing == Direction.WEST && !isSameBasic(level, blockPos.east(), blockState)) {
				blockState = blockState.with(SHAPE, FacadeShape.INNER_RIGHT);
			} else if (neighborFacing == Direction.EAST && !isSameBasic(level, blockPos.west(), blockState)) {
				blockState = blockState.with(SHAPE, FacadeShape.INNER_LEFT);
			}
			return blockState;
		}

		// outer test
		neighborState = level.getBlockState(blockPos.north());
		neighborBlock = neighborState.getBlock();

		if (isBlockInstanceOf(neighborBlock)) {
			neighborFacing = neighborState.get(FACING);
			if (neighborFacing == Direction.WEST && !isSameBasic(level, blockPos.west(), blockState)) {
				blockState = blockState.with(SHAPE, FacadeShape.OUTER_LEFT);
			} else if (neighborFacing == Direction.EAST && !isSameBasic(level, blockPos.east(), blockState)) {
				blockState = blockState.with(SHAPE, FacadeShape.OUTER_RIGHT);
			}
		}

		return blockState;
	}

	default public BlockState getStateForNorthDirection(WorldAccess level, BlockPos blockPos, BlockState blockState) {
		BlockState neighborState;
		Block neighborBlock;
		Direction neighborFacing;

		neighborState = level.getBlockState(blockPos.north());
		neighborBlock = neighborState.getBlock();

		// inner test
		if (isBlockInstanceOf(neighborBlock)) {
			neighborFacing = neighborState.get(FACING);
			if (neighborFacing == Direction.WEST && !isSameBasic(level, blockPos.east(), blockState)) {
				blockState = blockState.with(SHAPE, FacadeShape.INNER_RIGHT);
			} else if (neighborFacing == Direction.EAST && !isSameBasic(level, blockPos.west(), blockState)) {
				blockState = blockState.with(SHAPE, FacadeShape.INNER_LEFT);
			}
			return blockState;
		}

		// outer test
		neighborState = level.getBlockState(blockPos.south());
		neighborBlock = neighborState.getBlock();

		if (isBlockInstanceOf(neighborBlock)) {
			neighborFacing = neighborState.get(FACING);
			if (neighborFacing == Direction.WEST && !isSameBasic(level, blockPos.west(), blockState)) {
				blockState = blockState.with(SHAPE, FacadeShape.OUTER_LEFT);
			} else if (neighborFacing == Direction.EAST && !isSameBasic(level, blockPos.east(), blockState)) {
				blockState = blockState.with(SHAPE, FacadeShape.OUTER_RIGHT);
			}
		}
		return blockState;
	}

	default public BlockState getStateForEastDirection(WorldAccess level, BlockPos blockPos, BlockState blockState) {
		BlockState neighborState;
		Block neighborBlock;
		Direction neighborFacing;

		neighborState = level.getBlockState(blockPos.east());
		neighborBlock = neighborState.getBlock();

		// inner test
		if (isBlockInstanceOf(neighborBlock)) {
			neighborFacing = neighborState.get(FACING);
			if (neighborFacing == Direction.NORTH && !isSameBasic(level, blockPos.south(), blockState)) {
				blockState = blockState.with(FACING, Direction.NORTH);
				blockState = blockState.with(SHAPE, FacadeShape.INNER_LEFT);
			} else if (neighborFacing == Direction.SOUTH && !isSameBasic(level, blockPos.north(), blockState)) {
				blockState = blockState.with(FACING, Direction.SOUTH);
				blockState = blockState.with(SHAPE, FacadeShape.INNER_LEFT);
			}
			return blockState;
		}

		// outer test
		neighborState = level.getBlockState(blockPos.west());
		neighborBlock = neighborState.getBlock();

		if (isBlockInstanceOf(neighborBlock)) {
			neighborFacing = neighborState.get(FACING);
			if (neighborFacing == Direction.NORTH && !isSameBasic(level, blockPos.north(), blockState)) {
				blockState = blockState.with(FACING, Direction.NORTH);
				blockState = blockState.with(SHAPE, FacadeShape.OUTER_RIGHT);
			} else if (neighborFacing == Direction.SOUTH && !isSameBasic(level, blockPos.south(), blockState)) {
				blockState = blockState.with(FACING, Direction.SOUTH);
				blockState = blockState.with(SHAPE, FacadeShape.OUTER_RIGHT);
			}
		}
		return blockState;
	}

	default public BlockState getStateForWestDirection(WorldAccess level, BlockPos blockPos, BlockState blockState) {
		BlockState neighborState;
		Block neighborBlock;
		Direction neighborFacing;

		neighborState = level.getBlockState(blockPos.west());
		neighborBlock = neighborState.getBlock();

		// inner test
		if (isBlockInstanceOf(neighborBlock)) {
			neighborFacing = neighborState.get(FACING);
			if (neighborFacing == Direction.NORTH && !isSameBasic(level, blockPos.south(), blockState)) {
				blockState = blockState.with(FACING, Direction.NORTH);
				blockState = blockState.with(SHAPE, FacadeShape.INNER_RIGHT);
			} else if (neighborFacing == Direction.SOUTH && !isSameBasic(level, blockPos.north(), blockState)) {
				blockState = blockState.with(FACING, Direction.SOUTH);
				blockState = blockState.with(SHAPE, FacadeShape.INNER_RIGHT);
			}
			return blockState;
		}

		// outer test
		neighborState = level.getBlockState(blockPos.east());
		neighborBlock = neighborState.getBlock();

		if (isBlockInstanceOf(neighborBlock)) {
			neighborFacing = neighborState.get(FACING);
			if (neighborFacing == Direction.NORTH && !isSameBasic(level, blockPos.north(), blockState)) {
				blockState = blockState.with(FACING, Direction.NORTH);
				blockState = blockState.with(SHAPE, FacadeShape.OUTER_LEFT);
			} else if (neighborFacing == Direction.SOUTH && !isSameBasic(level, blockPos.south(), blockState)) {
				blockState = blockState.with(FACING, Direction.SOUTH);
				blockState = blockState.with(SHAPE, FacadeShape.OUTER_LEFT);
			}
		}
		return blockState;
	}
}
