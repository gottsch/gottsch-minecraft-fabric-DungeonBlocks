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
 * along with DungeonBlocks.  If not, see <http://www.gnu.uniong/licenses/lgpl>.
 */
package mod.gottsch.fabric.dungeonblocks.core.block;


import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

/**
 * @author Mark Gottschling on Jan 18, 2020
 *
 */
public class PillarBaseBlock extends NonCubeBasedBlock {

	// Voxels are like the bounding boxes (AABBs) NF= North Facing, SF = South
	// Facing, etc
	private static final VoxelShape NORTH_AABB = VoxelShapes.union(
			Block.createCuboidShape(0.0D, 0.0D, 8.0D, 16.0D, 16.0D, 16.0D), // "base"
			Block.createCuboidShape(1.0D, 1.0D, 6.0D, 15.0D, 15.0D, 8.0D), // "middle base"
			Block.createCuboidShape(2.0D, 2.0D, 2.0D, 14.0D, 14.0D, 6.0D), // "middle top"
			Block.createCuboidShape(1.0D, 1.0D, 0.0D, 15.0D, 15.0D, 2.0D) // "top"
	);

	private static final VoxelShape SOUTH_AABB = VoxelShapes.union(
			Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 8.0D), // "base"
			Block.createCuboidShape(1.0D, 1.0D, 8.0D, 15.0D, 15.0D, 10.0D), // "middle base"
			Block.createCuboidShape(2.0D, 2.0D, 10.0D, 14.0D, 14.0D, 14.0D), // "middle top"
			Block.createCuboidShape(1.0D, 1.0D, 14.0D, 15.0D, 15.0D, 16.0D) // "top"

	);

	private static final VoxelShape EAST_AABB = VoxelShapes.union(
			Block.createCuboidShape(0.0D, 0.0D, 0.0D, 8.0D, 16.0D, 16.0D), // "base"
			Block.createCuboidShape(8.0D, 1.0D, 1.0D, 10.0D, 15.0D, 15.0D), // "middle base"
			Block.createCuboidShape(10.0D, 2.0D, 2.0D, 14.0D, 14.0D, 14.0D), // "middle top"
			Block.createCuboidShape(14.0D, 1.0D, 1.0D, 16.0D, 15.0D, 15.0D) // "top"
	);

	private static final VoxelShape WEST_AABB = VoxelShapes.union(
			Block.createCuboidShape(8.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D), // "base"
			Block.createCuboidShape(6.0D, 1.0D, 1.0D, 8.0D, 15.0D, 15.0D), // "middle base"
			Block.createCuboidShape(2.0D, 2.0D, 2.0D, 6.0D, 14.0D, 14.0D), // "middle top"
			Block.createCuboidShape(0.0D, 1.0D, 1.0D, 2.0D, 15.0D, 15.0D) // "top"
	);

	private static final VoxelShape UP_AABB = VoxelShapes.union(
			Block.createCuboidShape(1.0D, 14.0D, 1.0D, 15.0D, 16.0D, 15.0D),
			Block.createCuboidShape(2.0D, 10.0D, 2.0D, 14.0D, 14.0D, 14.0D),
			Block.createCuboidShape(1.0D, 8.0D, 1.0D, 15.0D, 10.0D, 15.0D),
			Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D));

	private static final VoxelShape DOWN_AABB = VoxelShapes.union( // shape is inverted
			Block.createCuboidShape(0.0D, 8.0D, 0.0D, 16.0D, 16.0D, 16.0D), // "base"
			Block.createCuboidShape(1.0D, 6.0D, 1.0D, 15.0D, 8.0D, 15.0D), // "middle base"
			Block.createCuboidShape(2.0D, 2.0D, 2.0D, 14.0D, 6.0D, 14.0D), // "middle top"
			Block.createCuboidShape(1.0D, 0.0D, 1.0D, 15.0D, 2.0D, 15.0D) // "top"
	);

	public PillarBaseBlock(AbstractBlock.Settings properties) {
		super(properties);
	}

	/**
	 * 
	 */
	@Override
	public VoxelShape getOutlineShape(BlockState state, BlockView getter, BlockPos pos, ShapeContext context) {
		Direction direction = state.get(BASE);

		return switch (direction) {
		case UP -> UP_AABB;
		case DOWN -> DOWN_AABB;
		case NORTH -> NORTH_AABB;
		case SOUTH -> SOUTH_AABB;
		case EAST -> EAST_AABB;
		case WEST -> WEST_AABB;
		default -> DOWN_AABB;
		};
	}
}
