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

import net.minecraft.block.*;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;

/**
 * @author Mark Gottschling on Jan 18, 2020
 *
 */
public class SconceBlock extends NonCubeFacingBlock {

	private static final VoxelShape NORTH_FACING_SHAPE = Block
			.createCuboidShape(2.0D, 2.0D, 9.0D, 14.0D, 15.0D, 15.9999D);
	private static final VoxelShape EAST_FACING_SHAPE = Block
			.createCuboidShape(0.0001D, 2.0D, 2.0D, 6.0D, 15.0D, 14.0D);
	private static final VoxelShape SOUTH_FACING_SHAPE = Block
			.createCuboidShape(2.0D, 2.0D, 0.0001D, 14.0D, 15.0D, 6.0D);
	private static final VoxelShape WEST_FACING_SHAPE = Block
			.createCuboidShape(9.0D, 2.0D, 2.0D, 15.9999D, 15.0D, 14.0D);

	/**
	 * 
	 * @param properties
	 */
	public SconceBlock(AbstractBlock.Settings properties) {
		super(properties);
	}

	@Override
	public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
		 return !state.isOf(Blocks.WATER);
	}

	@Override
	public void randomDisplayTick(BlockState state, World level, BlockPos pos, Random rand) {
		Direction direction = state.get(FACING);
		double d0 = (double) pos.getX() + 0.5D;
		double d1 = (double) pos.getY() + 0.7D;
		double d2 = (double) pos.getZ() + 0.5D;
		double d3 = 0.30D; // y offset
		double d4 = 0.22D; // horizontal offset middle
		double d5 = (double) pos.getX() + 0.25D;
		double d6 = (double) pos.getZ() + 0.25D;
		double d7 = (double) pos.getX() + 0.75D;
		double d8 = (double) pos.getZ() + 0.75D;
		double d9 = 0.27D; // horizontal offset for side torches

		if (direction.getAxis().isHorizontal()) {
			Direction directionFacing = direction.getOpposite();
			// middle
			level.addParticle(ParticleTypes.SMOKE,
					d0 + d4 * (double) directionFacing.getOffsetX(), d1 + d3,
					d2 + d4 * (double) directionFacing.getOffsetZ(), 0.0D, 0.0D,
					0.0D);
			level.addParticle(ParticleTypes.FLAME,
					d0 + d4 * (double) directionFacing.getOffsetX(), d1 + d3,
					d2 + d4 * (double) directionFacing.getOffsetZ(), 0.0D, 0.0D,
					0.0D);

			// right
			if (directionFacing.getOffsetX() != 0) {
				level.addParticle(ParticleTypes.SMOKE,
						d0 + d9 * (double) directionFacing.getOffsetX(),
						d1 + d3,
						d6 + d9 * (double) directionFacing.getOffsetZ(), 0.0D,
						0.0D, 0.0D);
				level.addParticle(ParticleTypes.FLAME,
						d0 + d9 * (double) directionFacing.getOffsetX(),
						d1 + d3,
						d6 + d9 * (double) directionFacing.getOffsetZ(), 0.0D,
						0.0D, 0.0D);
			} else {
				level.addParticle(ParticleTypes.SMOKE,
						d5 + d9 * (double) directionFacing.getOffsetX(),
						d1 + d3,
						d2 + d9 * (double) directionFacing.getOffsetZ(), 0.0D,
						0.0D, 0.0D);
				level.addParticle(ParticleTypes.FLAME,
						d5 + d9 * (double) directionFacing.getOffsetX(),
						d1 + d3,
						d2 + d9 * (double) directionFacing.getOffsetZ(), 0.0D,
						0.0D, 0.0D);
			}

			// left
			if (directionFacing.getOffsetX() != 0) {
				level.addParticle(ParticleTypes.SMOKE,
						d0 + d4 * (double) directionFacing.getOffsetX(),
						d1 + d3,
						d8 + d4 * (double) directionFacing.getOffsetZ(), 0.0D,
						0.0D, 0.0D);
				level.addParticle(ParticleTypes.FLAME,
						d0 + d4 * (double) directionFacing.getOffsetX(),
						d1 + d3,
						d8 + d4 * (double) directionFacing.getOffsetZ(), 0.0D,
						0.0D, 0.0D);
			} else {
				level.addParticle(ParticleTypes.SMOKE,
						d7 + d4 * (double) directionFacing.getOffsetX(),
						d1 + d3,
						d2 + d4 * (double) directionFacing.getOffsetZ(), 0.0D,
						0.0D, 0.0D);
				level.addParticle(ParticleTypes.FLAME,
						d7 + d4 * (double) directionFacing.getOffsetX(),
						d1 + d3,
						d2 + d4 * (double) directionFacing.getOffsetZ(), 0.0D,
						0.0D, 0.0D);
			}
		}
	}

	/**
	 * 
	 */
	@Override
	public VoxelShape getOutlineShape(BlockState state, BlockView getter, BlockPos pos, ShapeContext context) {
		Direction direction = state.get(FACING);

		switch (direction) {
		case NORTH :
		default :
			return NORTH_FACING_SHAPE;
		case EAST :
			return EAST_FACING_SHAPE;
		case SOUTH :
			return SOUTH_FACING_SHAPE;
		case WEST :
			return WEST_FACING_SHAPE;
		}
	}
}
