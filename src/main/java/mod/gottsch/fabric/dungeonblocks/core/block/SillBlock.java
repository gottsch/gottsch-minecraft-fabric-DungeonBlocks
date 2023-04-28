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
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

/**
 * @author Mark Gottschling on Jan 18, 2020
 *
 */
public class SillBlock extends NonCubeFacingBlock {
	
	// Voxels are like the bounding boxes (AABBs) NF= North Facing, SF = South Facing, etc
	private static final VoxelShape MAIN_PART = Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D);
	private static final VoxelShape NF_TOP_PART = Block.createCuboidShape(0.0D, 12.0D, 8.0D, 16.0D, 16.0D, 16.0D);
	private static final VoxelShape EF_TOP_PART = Block.createCuboidShape(0.0D, 12.0D, 0.0D, 8.0D, 16.0D, 16.0D);
	private static final VoxelShape SF_TOP_PART = Block.createCuboidShape(0.0D, 12.0D, 0.0D, 16.0D, 16.0D, 8.0D);
	private static final VoxelShape WF_TOP_PART = Block.createCuboidShape(8.0D, 12.0D, 0.0D, 16.0D, 16.0D, 16.0D);
	
	private static final VoxelShape NORTH_FACING_AABB = VoxelShapes.union(MAIN_PART, NF_TOP_PART);
	private static final VoxelShape EAST_FACING_AABB = VoxelShapes.union(MAIN_PART, EF_TOP_PART);
	private static final VoxelShape SOUTH_FACING_AABB = VoxelShapes.union(MAIN_PART, SF_TOP_PART);
	private static final VoxelShape WEST_FACING_AABB = VoxelShapes.union(MAIN_PART, WF_TOP_PART);
	
	/**
	 * 
	 * @param properties
	 */
	public SillBlock(AbstractBlock.Settings properties) {
		super(properties);
	}

	/**
	 * 
	 */
	@Override
	public VoxelShape getOutlineShape(BlockState state, BlockView getter, BlockPos pos, ShapeContext context) {
		Direction direction = state.get(FACING);

		switch (direction) {
		case NORTH:
		default:
			return NORTH_FACING_AABB;
		case EAST:
			return EAST_FACING_AABB;
		case SOUTH:
			return SOUTH_FACING_AABB;
		case WEST:
			return WEST_FACING_AABB;
		}
	}
}