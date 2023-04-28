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

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

/**
 * @author Mark Gottschling on Jan 18, 2020
 *
 */
public class CorniceBlock extends FacadeShapeBlock {

	// Voxels are like the bounding boxes (AABBs) NF= North Facing, SF = South
	// Facing, etc
	private static final VoxelShape NORTH_FACING_SHAPE = VoxelShapes.union(
			Block.createCuboidShape(0.0D, 0.0D, 8.0D, 16.0D, 12.0D, 16.0D),
			Block.createCuboidShape(0.0D, 12.0D, 3.0D, 16.0D, 16.0D, 16.0D));

	private static final VoxelShape WEST_FACING_SHAPE = VoxelShapes.union(
			Block.createCuboidShape(8.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D),
			Block.createCuboidShape(3.0D, 12.0D, 0.0D, 16.0D, 16.0D, 16.0D));

	private static final VoxelShape SOUTH_FACING_SHAPE = VoxelShapes.union(
			Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 8.0D),
			Block.createCuboidShape(0.0D, 12.0D, 0.0D, 16.0D, 16.0D, 13.0D));

	private static final VoxelShape EAST_FACING_SHAPE = VoxelShapes.union(
			Block.createCuboidShape(0.0D, 0.0D, 0.0D, 8.0D, 12.0D, 16.0D),
			Block.createCuboidShape(0.0D, 12.0D, 0.0D, 13.0D, 16.0D, 16.0D));

	// outer corners
	private static final VoxelShape TOP_LEFT_OUTER_SHAPE = VoxelShapes.union(
			Block.createCuboidShape(8.0D, 0D, 8.0D, 16.0D, 12.0D, 16.0D),
			Block.createCuboidShape(3.0D, 12D, 3.0D, 16.0D, 16.0D, 16.0D));
	private static final VoxelShape TOP_RIGHT_OUTER_SHAPE = VoxelShapes.union(
			Block.createCuboidShape(0D, 0D, 8.0D, 8.0D, 12.0D, 16.0D),
			Block.createCuboidShape(0D, 12D, 3.0D, 13.0D, 16.0D, 16.0D));

	private static final VoxelShape BOTTOM_LEFT_OUTER_SHAPE = VoxelShapes.union(
			Block.createCuboidShape(8.0D, 0D, 0D, 16.0D, 12.0D, 8.0D),
			Block.createCuboidShape(3D, 12D, 0D, 16.0D, 16.0D, 13.0D));
	private static final VoxelShape BOTTOM_RIGHT_OUTER_SHAPE = VoxelShapes.union(
			Block.createCuboidShape(0D, 0D, 0D, 8.0D, 12.0D, 8.0D),
			Block.createCuboidShape(0D, 12D, 0D, 13.0D, 16.0D, 13.0D));

	// inner corners
	private static final VoxelShape TOP_LEFT_INNER_SHAPE = VoxelShapes.union(SOUTH_FACING_SHAPE,
			Block.createCuboidShape(0.0D, 0D, 8.0D, 8.0D, 12.0D, 16.0D),
			Block.createCuboidShape(0D, 12D, 13D, 13D, 16D, 16D));
	private static final VoxelShape TOP_RIGHT_INNER_SHAPE = VoxelShapes.union(SOUTH_FACING_SHAPE,
			Block.createCuboidShape(8.0D, 0D, 8.0D, 16.0D, 12.0D, 16.0D),
			Block.createCuboidShape(3D, 12D, 13D, 16D, 16D, 16D));

	private static final VoxelShape BOTTOM_LEFT_INNER_SHAPE = VoxelShapes.union(NORTH_FACING_SHAPE,
			Block.createCuboidShape(0.0D, 0D, 0.0D, 8.0D, 12.0D, 8.0D), Block.createCuboidShape(0D, 12D, 0D, 13D, 16D, 3D));
	private static final VoxelShape BOTTOM_RIGHT_INNER_SHAPE = VoxelShapes.union(NORTH_FACING_SHAPE,
			Block.createCuboidShape(8.0D, 0D, 0D, 16.0D, 12.0D, 8.0D), Block.createCuboidShape(3D, 12D, 0D, 16D, 16D, 3D));

	// SWNE = 0,1,2,3
	private VoxelShape voxelShapes[] = {
			// straight
			SOUTH_FACING_SHAPE, WEST_FACING_SHAPE, NORTH_FACING_SHAPE, EAST_FACING_SHAPE,

			// inner left
			TOP_LEFT_INNER_SHAPE, // 4
			BOTTOM_LEFT_INNER_SHAPE, // 5

			// inner right
			TOP_RIGHT_INNER_SHAPE, // 6
			BOTTOM_RIGHT_INNER_SHAPE, // 7

			// outer left
			TOP_LEFT_OUTER_SHAPE, BOTTOM_LEFT_OUTER_SHAPE,

			// outer right
			TOP_RIGHT_OUTER_SHAPE, BOTTOM_RIGHT_OUTER_SHAPE };

	/**
	 * 
	 * @param properties
	 */
	public CorniceBlock(AbstractBlock.Settings properties) {
		super(properties);
	}

	/**
	 * Returns the VoxelShape (ie bounding box) of the block in the correctposition.
	 * NOTE if shape != STRAIGHT, then facing index can only == North || South
	 */
	@Override
	public VoxelShape getOutlineShape(BlockState state, BlockView getter, BlockPos pos, ShapeContext context) {
		int shapeIndex = getBlockShapeIndex(state, getter, pos);
		return voxelShapes[shapeIndex];
	}

	/**
	 * Checks if a block is same as FacadeBlock
	 */
	@Override
	public boolean isBlockInstanceOf(Block block) {
		return block instanceof CorniceBlock;
	}
}
