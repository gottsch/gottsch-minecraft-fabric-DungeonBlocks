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

import mod.gottsch.fabric.dungeonblocks.core.DungeonBlocks;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

/**
 * @author Mark Gottschling on Mar 25, 2020
 *
 */
public abstract class FacadeShapeBlock extends NonCubeFacingBlock implements IFacadeShapeBlock {

	/**
	 * 
	 * @param settings
	 */
	public FacadeShapeBlock(AbstractBlock.Settings settings) {
		super(settings);
	}


	/**
	 *
	 */
	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		super.appendProperties(builder);
		builder.add(SHAPE);
	}

	/**
	 * This method returns the state of the block so that the correct entry in the
	 * blockstate.json file can be selected and the corresponding block model
	 * rendered.
	 */
	@Override
	public BlockState getPlacementState(ItemPlacementContext context) {
		BlockState blockState = super.getPlacementState(context);
		// custom method to get block state
		BlockState placementBlockState = getBlockStateForPlacement(context.getWorld(), blockState, context.getBlockPos());

		return placementBlockState;
	}

	@Override
	public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
		BlockState placementBlockState = super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
		// custom method to get block state
		placementBlockState = getBlockStateForPlacement(world, placementBlockState, pos);
		return placementBlockState;
	}
	
	/**
	 * Checks if a block is same as FacadeBlock
	 */
	@Override
	public abstract boolean isBlockInstanceOf(Block block);

	@Override
	public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
		if (!world.isClient()) {
			DungeonBlocks.LOGGER.debug("on placed...");
			world.updateNeighbor(pos, state.getBlock(), pos);
		}
	}
//	public void onPlace(BlockState state, World level, BlockPos pos, BlockState state2, boolean flag) {
//		level.updateNeighbor(pos, state.getBlock(), pos);
//	}

	@Override
	public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
		DungeonBlocks.LOGGER.debug("on state replaced...");
		world.updateNeighbor(pos, state.getBlock(), pos);
	}

	// TODO this is moot as base class already does this.
	@Override
	public boolean hasSidedTransparency(BlockState state) {
		return true;
	}
}
