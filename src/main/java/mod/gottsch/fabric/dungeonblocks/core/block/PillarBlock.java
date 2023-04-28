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
import net.minecraft.world.BlockView;

/**
 * @author Mark Gottschling on Jan 18, 2020
 *
 */
public class PillarBlock extends NonCubeBasedBlock {
	
	// Voxels are like the bounding boxes (AABBs) NF= North Facing, SF = South Facing, etc
	private static final VoxelShape NORTH_SOUTH_AABB = Block.createCuboidShape(3.0D, 3.0D, 0.0D, 13.0D, 13.0D, 16.0D);
	private static final VoxelShape EAST_WEST_AABB = Block.createCuboidShape(0.0D, 3.0D, 3.0D, 16.0D, 13.0D, 13.0D);
	private static final VoxelShape UP_DOWN_AABB = Block.createCuboidShape(3.0D, 0.0D, 3.0D, 13.0D, 16.0D, 13.0D);
	
	public PillarBlock(AbstractBlock.Settings properties) {
		super(properties);
	}

	/**
	 * 
	 */
	@Override
	public VoxelShape getOutlineShape(BlockState state, BlockView getter, BlockPos pos, ShapeContext context) {
		Direction direction = state.get(BASE);

		switch (direction) {
		case UP:
		case DOWN:
		default:
			return UP_DOWN_AABB;
		case NORTH:
		case SOUTH:
			return NORTH_SOUTH_AABB;
		case EAST:
		case WEST:
			return EAST_WEST_AABB;
		}
	}
}
