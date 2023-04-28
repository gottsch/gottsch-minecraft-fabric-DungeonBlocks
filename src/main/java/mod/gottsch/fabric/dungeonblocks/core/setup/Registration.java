/*
 * This file is part of  DungeonBlocks.
 * Copyright (c) 2023 Mark Gottschling (gottsch)
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
package mod.gottsch.fabric.dungeonblocks.core.setup;

import mod.gottsch.fabric.dungeonblocks.core.block.*;
import mod.gottsch.fabric.dungeonblocks.core.config.ID;
import mod.gottsch.fabric.dungeonblocks.core.DungeonBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

/**
 * Created by Mark Gottschling on 4/25/2023
 */
public class Registration {
    // logo
    public static final Item LOGO = Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, "dungeonblocks_logo"), new Item(new FabricItemSettings()));

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(new Identifier(DungeonBlocks.MOD_ID, "all_group"))
            .icon(() -> new ItemStack(LOGO))
            .build();

    /*
     * Blocks
     */

    // facade
    public static final Block STONE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool());
    public static final Block  SMOOTH_STONE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE).requiresTool());
    public static final Block COBBLESTONE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool());
    public static final Block MOSSY_COBBLESTONE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_COBBLESTONE).requiresTool());
    public static final Block BRICKS_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.BRICKS).requiresTool());
    public static final Block STONE_BRICKS_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool());
    public static final Block MOSSY_STONE_BRICKS_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICKS).requiresTool());
    public static final Block CRACKED_STONE_BRICKS_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.CRACKED_STONE_BRICKS).requiresTool());
    public static final Block CHISELED_STONE_BRICKS_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_STONE_BRICKS).requiresTool());
    public static final Block OBSIDIAN_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).requiresTool());

    public static final Block SANDSTONE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE).requiresTool());
    public static final Block SMOOTH_SANDSTONE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_SANDSTONE).requiresTool());
    public static final Block CHISELED_SANDSTONE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_SANDSTONE).requiresTool());
    public static final Block CUT_SANDSTONE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.CUT_SANDSTONE).requiresTool());
    public static final Block RED_SANDSTONE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.RED_SANDSTONE).requiresTool());
    public static final Block SMOOTH_RED_SANDSTONE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_RED_SANDSTONE).requiresTool());
    public static final Block CHISELED_RED_SANDSTONE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_RED_SANDSTONE).requiresTool());
    public static final Block CUT_RED_SANDSTONE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.CUT_RED_SANDSTONE).requiresTool());

    public static final Block GRANITE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.GRANITE).requiresTool());
    public static final Block POLISHED_GRANITE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_GRANITE).requiresTool());
    public static final Block DIORITE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.DIORITE).requiresTool());
    public static final Block POLISHED_DIORITE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_DIORITE).requiresTool());
    public static final Block ANDESITE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE).requiresTool());
    public static final Block POLISHED_ANDESITE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_ANDESITE).requiresTool());

    public static final Block BLACKSTONE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.BLACKSTONE).requiresTool());
    public static final Block POLISHED_BLACKSTONE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE).requiresTool());
    public static final Block CHISELED_POLISHED_BLACKSTONE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_POLISHED_BLACKSTONE).requiresTool());
    public static final Block GILDED_BLACKSTONE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.GILDED_BLACKSTONE).requiresTool());
    public static final Block POLISHED_BLACKSTONE_BRICKS_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS).requiresTool());
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICKS_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS).requiresTool());

    public static final Block DEEPSLATE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).requiresTool());
    public static final Block DEEPSLATE_BRICKS_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS).requiresTool());
    public static final Block CRACKED_DEEPSLATE_BRICKS_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.CRACKED_DEEPSLATE_BRICKS).requiresTool());
    public static final Block COBBLED_DEEPSLATE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.COBBLED_DEEPSLATE).requiresTool());
    public static final Block POLISHED_DEEPSLATE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_DEEPSLATE).requiresTool());
    public static final Block CHISELED_DEEPSLATE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_DEEPSLATE).requiresTool());
    public static final Block DEEPSLATE_TILES_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_TILES).requiresTool());
    public static final Block CRACKED_DEEPSLATE_TILES_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.CRACKED_DEEPSLATE_TILES).requiresTool());
    
    // quarter facade
    public static final Block STONE_QUARTER_FACADE = new QuarterFacadeBlock(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool());
    public static final Block  SMOOTH_STONE_QUARTER_FACADE = new QuarterFacadeBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE).requiresTool());
    public static final Block COBBLESTONE_QUARTER_FACADE = new QuarterFacadeBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool());
    public static final Block MOSSY_COBBLESTONE_QUARTER_FACADE = new QuarterFacadeBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_COBBLESTONE).requiresTool());
    public static final Block BRICKS_QUARTER_FACADE = new QuarterFacadeBlock(FabricBlockSettings.copyOf(Blocks.BRICKS).requiresTool());
    public static final Block STONE_BRICKS_QUARTER_FACADE = new QuarterFacadeBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool());
    public static final Block MOSSY_STONE_BRICKS_QUARTER_FACADE = new QuarterFacadeBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICKS).requiresTool());
    public static final Block CRACKED_STONE_BRICKS_QUARTER_FACADE = new QuarterFacadeBlock(FabricBlockSettings.copyOf(Blocks.CRACKED_STONE_BRICKS).requiresTool());
    public static final Block CHISELED_STONE_BRICKS_QUARTER_FACADE = new QuarterFacadeBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_STONE_BRICKS).requiresTool());
    public static final Block OBSIDIAN_QUARTER_FACADE = new QuarterFacadeBlock(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).requiresTool());

    public static final Block SANDSTONE_QUARTER_FACADE = new QuarterFacadeBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE).requiresTool());
    public static final Block SMOOTH_SANDSTONE_QUARTER_FACADE = new QuarterFacadeBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_SANDSTONE).requiresTool());
    public static final Block CHISELED_SANDSTONE_QUARTER_FACADE = new QuarterFacadeBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_SANDSTONE).requiresTool());
    public static final Block CUT_SANDSTONE_QUARTER_FACADE = new QuarterFacadeBlock(FabricBlockSettings.copyOf(Blocks.CUT_SANDSTONE).requiresTool());
    public static final Block RED_SANDSTONE_QUARTER_FACADE = new QuarterFacadeBlock(FabricBlockSettings.copyOf(Blocks.RED_SANDSTONE).requiresTool());
    public static final Block SMOOTH_RED_SANDSTONE_QUARTER_FACADE = new QuarterFacadeBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_RED_SANDSTONE).requiresTool());
    public static final Block CHISELED_RED_SANDSTONE_QUARTER_FACADE = new QuarterFacadeBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_RED_SANDSTONE).requiresTool());
    public static final Block CUT_RED_SANDSTONE_QUARTER_FACADE = new QuarterFacadeBlock(FabricBlockSettings.copyOf(Blocks.CUT_RED_SANDSTONE).requiresTool());

    public static final Block GRANITE_QUARTER_FACADE = new QuarterFacadeBlock(FabricBlockSettings.copyOf(Blocks.GRANITE).requiresTool());
    public static final Block POLISHED_GRANITE_QUARTER_FACADE = new QuarterFacadeBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_GRANITE).requiresTool());
    public static final Block DIORITE_QUARTER_FACADE = new QuarterFacadeBlock(FabricBlockSettings.copyOf(Blocks.DIORITE).requiresTool());
    public static final Block POLISHED_DIORITE_QUARTER_FACADE = new QuarterFacadeBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_DIORITE).requiresTool());
    public static final Block ANDESITE_QUARTER_FACADE = new QuarterFacadeBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE).requiresTool());
    public static final Block POLISHED_ANDESITE_QUARTER_FACADE = new QuarterFacadeBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_ANDESITE).requiresTool());

    public static final Block BLACKSTONE_QUARTER_FACADE = new QuarterFacadeBlock(FabricBlockSettings.copyOf(Blocks.BLACKSTONE).requiresTool());
    public static final Block POLISHED_BLACKSTONE_QUARTER_FACADE = new QuarterFacadeBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE).requiresTool());
    public static final Block CHISELED_POLISHED_BLACKSTONE_QUARTER_FACADE = new QuarterFacadeBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_POLISHED_BLACKSTONE).requiresTool());
    public static final Block GILDED_BLACKSTONE_QUARTER_FACADE = new QuarterFacadeBlock(FabricBlockSettings.copyOf(Blocks.GILDED_BLACKSTONE).requiresTool());
    public static final Block POLISHED_BLACKSTONE_BRICKS_QUARTER_FACADE = new QuarterFacadeBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS).requiresTool());
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICKS_QUARTER_FACADE = new QuarterFacadeBlock(FabricBlockSettings.copyOf(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS).requiresTool());

    public static final Block DEEPSLATE_QUARTER_FACADE = new QuarterFacadeBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).requiresTool());
    public static final Block DEEPSLATE_BRICKS_QUARTER_FACADE = new QuarterFacadeBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS).requiresTool());
    public static final Block CRACKED_DEEPSLATE_BRICKS_QUARTER_FACADE = new QuarterFacadeBlock(FabricBlockSettings.copyOf(Blocks.CRACKED_DEEPSLATE_BRICKS).requiresTool());
    public static final Block COBBLED_DEEPSLATE_QUARTER_FACADE = new QuarterFacadeBlock(FabricBlockSettings.copyOf(Blocks.COBBLED_DEEPSLATE).requiresTool());
    public static final Block POLISHED_DEEPSLATE_QUARTER_FACADE = new QuarterFacadeBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_DEEPSLATE).requiresTool());
    public static final Block CHISELED_DEEPSLATE_QUARTER_FACADE = new QuarterFacadeBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_DEEPSLATE).requiresTool());
    public static final Block DEEPSLATE_TILES_QUARTER_FACADE = new QuarterFacadeBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_TILES).requiresTool());
    public static final Block CRACKED_DEEPSLATE_TILES_QUARTER_FACADE = new QuarterFacadeBlock(FabricBlockSettings.copyOf(Blocks.CRACKED_DEEPSLATE_TILES).requiresTool());

    // fluted
    public static final Block STONE_FLUTED = new FlutedBlock(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool());
    public static final Block  SMOOTH_STONE_FLUTED = new FlutedBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE).requiresTool());
    public static final Block COBBLESTONE_FLUTED = new FlutedBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool());
    public static final Block MOSSY_COBBLESTONE_FLUTED = new FlutedBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_COBBLESTONE).requiresTool());
    public static final Block BRICKS_FLUTED = new FlutedBlock(FabricBlockSettings.copyOf(Blocks.BRICKS).requiresTool());
    public static final Block STONE_BRICKS_FLUTED = new FlutedBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool());
    public static final Block MOSSY_STONE_BRICKS_FLUTED = new FlutedBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICKS).requiresTool());
    public static final Block CRACKED_STONE_BRICKS_FLUTED = new FlutedBlock(FabricBlockSettings.copyOf(Blocks.CRACKED_STONE_BRICKS).requiresTool());
    public static final Block CHISELED_STONE_BRICKS_FLUTED = new FlutedBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_STONE_BRICKS).requiresTool());
    public static final Block OBSIDIAN_FLUTED = new FlutedBlock(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).requiresTool());

    public static final Block SANDSTONE_FLUTED = new FlutedBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE).requiresTool());
    public static final Block SMOOTH_SANDSTONE_FLUTED = new FlutedBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_SANDSTONE).requiresTool());
    public static final Block CHISELED_SANDSTONE_FLUTED = new FlutedBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_SANDSTONE).requiresTool());
    public static final Block CUT_SANDSTONE_FLUTED = new FlutedBlock(FabricBlockSettings.copyOf(Blocks.CUT_SANDSTONE).requiresTool());
    public static final Block RED_SANDSTONE_FLUTED = new FlutedBlock(FabricBlockSettings.copyOf(Blocks.RED_SANDSTONE).requiresTool());
    public static final Block SMOOTH_RED_SANDSTONE_FLUTED = new FlutedBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_RED_SANDSTONE).requiresTool());
    public static final Block CHISELED_RED_SANDSTONE_FLUTED = new FlutedBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_RED_SANDSTONE).requiresTool());
    public static final Block CUT_RED_SANDSTONE_FLUTED = new FlutedBlock(FabricBlockSettings.copyOf(Blocks.CUT_RED_SANDSTONE).requiresTool());

    public static final Block GRANITE_FLUTED = new FlutedBlock(FabricBlockSettings.copyOf(Blocks.GRANITE).requiresTool());
    public static final Block POLISHED_GRANITE_FLUTED = new FlutedBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_GRANITE).requiresTool());
    public static final Block DIORITE_FLUTED = new FlutedBlock(FabricBlockSettings.copyOf(Blocks.DIORITE).requiresTool());
    public static final Block POLISHED_DIORITE_FLUTED = new FlutedBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_DIORITE).requiresTool());
    public static final Block ANDESITE_FLUTED = new FlutedBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE).requiresTool());
    public static final Block POLISHED_ANDESITE_FLUTED = new FlutedBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_ANDESITE).requiresTool());

    public static final Block BLACKSTONE_FLUTED = new FlutedBlock(FabricBlockSettings.copyOf(Blocks.BLACKSTONE).requiresTool());
    public static final Block POLISHED_BLACKSTONE_FLUTED = new FlutedBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE).requiresTool());
    public static final Block CHISELED_POLISHED_BLACKSTONE_FLUTED = new FlutedBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_POLISHED_BLACKSTONE).requiresTool());
    public static final Block GILDED_BLACKSTONE_FLUTED = new FlutedBlock(FabricBlockSettings.copyOf(Blocks.GILDED_BLACKSTONE).requiresTool());
    public static final Block POLISHED_BLACKSTONE_BRICKS_FLUTED = new FlutedBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS).requiresTool());
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICKS_FLUTED = new FlutedBlock(FabricBlockSettings.copyOf(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS).requiresTool());

    public static final Block DEEPSLATE_FLUTED = new FlutedBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).requiresTool());
    public static final Block DEEPSLATE_BRICKS_FLUTED = new FlutedBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS).requiresTool());
    public static final Block CRACKED_DEEPSLATE_BRICKS_FLUTED = new FlutedBlock(FabricBlockSettings.copyOf(Blocks.CRACKED_DEEPSLATE_BRICKS).requiresTool());
    public static final Block COBBLED_DEEPSLATE_FLUTED = new FlutedBlock(FabricBlockSettings.copyOf(Blocks.COBBLED_DEEPSLATE).requiresTool());
    public static final Block POLISHED_DEEPSLATE_FLUTED = new FlutedBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_DEEPSLATE).requiresTool());
    public static final Block CHISELED_DEEPSLATE_FLUTED = new FlutedBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_DEEPSLATE).requiresTool());
    public static final Block DEEPSLATE_TILES_FLUTED = new FlutedBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_TILES).requiresTool());
    public static final Block CRACKED_DEEPSLATE_TILES_FLUTED = new FlutedBlock(FabricBlockSettings.copyOf(Blocks.CRACKED_DEEPSLATE_TILES).requiresTool());

    // fluted facade
    public static final Block STONE_FLUTED_FACADE = new FlutedFacadeBlock(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool());
    public static final Block  SMOOTH_STONE_FLUTED_FACADE = new FlutedFacadeBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE).requiresTool());
    public static final Block COBBLESTONE_FLUTED_FACADE = new FlutedFacadeBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool());
    public static final Block MOSSY_COBBLESTONE_FLUTED_FACADE = new FlutedFacadeBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_COBBLESTONE).requiresTool());
    public static final Block BRICKS_FLUTED_FACADE = new FlutedFacadeBlock(FabricBlockSettings.copyOf(Blocks.BRICKS).requiresTool());
    public static final Block STONE_BRICKS_FLUTED_FACADE = new FlutedFacadeBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool());
    public static final Block MOSSY_STONE_BRICKS_FLUTED_FACADE = new FlutedFacadeBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICKS).requiresTool());
    public static final Block CRACKED_STONE_BRICKS_FLUTED_FACADE = new FlutedFacadeBlock(FabricBlockSettings.copyOf(Blocks.CRACKED_STONE_BRICKS).requiresTool());
    public static final Block CHISELED_STONE_BRICKS_FLUTED_FACADE = new FlutedFacadeBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_STONE_BRICKS).requiresTool());
    public static final Block OBSIDIAN_FLUTED_FACADE = new FlutedFacadeBlock(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).requiresTool());

    public static final Block SANDSTONE_FLUTED_FACADE = new FlutedFacadeBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE).requiresTool());
    public static final Block SMOOTH_SANDSTONE_FLUTED_FACADE = new FlutedFacadeBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_SANDSTONE).requiresTool());
    public static final Block CHISELED_SANDSTONE_FLUTED_FACADE = new FlutedFacadeBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_SANDSTONE).requiresTool());
    public static final Block CUT_SANDSTONE_FLUTED_FACADE = new FlutedFacadeBlock(FabricBlockSettings.copyOf(Blocks.CUT_SANDSTONE).requiresTool());
    public static final Block RED_SANDSTONE_FLUTED_FACADE = new FlutedFacadeBlock(FabricBlockSettings.copyOf(Blocks.RED_SANDSTONE).requiresTool());
    public static final Block SMOOTH_RED_SANDSTONE_FLUTED_FACADE = new FlutedFacadeBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_RED_SANDSTONE).requiresTool());
    public static final Block CHISELED_RED_SANDSTONE_FLUTED_FACADE = new FlutedFacadeBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_RED_SANDSTONE).requiresTool());
    public static final Block CUT_RED_SANDSTONE_FLUTED_FACADE = new FlutedFacadeBlock(FabricBlockSettings.copyOf(Blocks.CUT_RED_SANDSTONE).requiresTool());

    public static final Block GRANITE_FLUTED_FACADE = new FlutedFacadeBlock(FabricBlockSettings.copyOf(Blocks.GRANITE).requiresTool());
    public static final Block POLISHED_GRANITE_FLUTED_FACADE = new FlutedFacadeBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_GRANITE).requiresTool());
    public static final Block DIORITE_FLUTED_FACADE = new FlutedFacadeBlock(FabricBlockSettings.copyOf(Blocks.DIORITE).requiresTool());
    public static final Block POLISHED_DIORITE_FLUTED_FACADE = new FlutedFacadeBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_DIORITE).requiresTool());
    public static final Block ANDESITE_FLUTED_FACADE = new FlutedFacadeBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE).requiresTool());
    public static final Block POLISHED_ANDESITE_FLUTED_FACADE = new FlutedFacadeBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_ANDESITE).requiresTool());

    public static final Block BLACKSTONE_FLUTED_FACADE = new FlutedFacadeBlock(FabricBlockSettings.copyOf(Blocks.BLACKSTONE).requiresTool());
    public static final Block POLISHED_BLACKSTONE_FLUTED_FACADE = new FlutedFacadeBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE).requiresTool());
    public static final Block CHISELED_POLISHED_BLACKSTONE_FLUTED_FACADE = new FlutedFacadeBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_POLISHED_BLACKSTONE).requiresTool());
    public static final Block GILDED_BLACKSTONE_FLUTED_FACADE = new FlutedFacadeBlock(FabricBlockSettings.copyOf(Blocks.GILDED_BLACKSTONE).requiresTool());
    public static final Block POLISHED_BLACKSTONE_BRICKS_FLUTED_FACADE = new FlutedFacadeBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS).requiresTool());
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICKS_FLUTED_FACADE = new FlutedFacadeBlock(FabricBlockSettings.copyOf(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS).requiresTool());

    public static final Block DEEPSLATE_FLUTED_FACADE = new FlutedFacadeBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).requiresTool());
    public static final Block DEEPSLATE_BRICKS_FLUTED_FACADE = new FlutedFacadeBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS).requiresTool());
    public static final Block CRACKED_DEEPSLATE_BRICKS_FLUTED_FACADE = new FlutedFacadeBlock(FabricBlockSettings.copyOf(Blocks.CRACKED_DEEPSLATE_BRICKS).requiresTool());
    public static final Block COBBLED_DEEPSLATE_FLUTED_FACADE = new FlutedFacadeBlock(FabricBlockSettings.copyOf(Blocks.COBBLED_DEEPSLATE).requiresTool());
    public static final Block POLISHED_DEEPSLATE_FLUTED_FACADE = new FlutedFacadeBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_DEEPSLATE).requiresTool());
    public static final Block CHISELED_DEEPSLATE_FLUTED_FACADE = new FlutedFacadeBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_DEEPSLATE).requiresTool());
    public static final Block DEEPSLATE_TILES_FLUTED_FACADE = new FlutedFacadeBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_TILES).requiresTool());
    public static final Block CRACKED_DEEPSLATE_TILES_FLUTED_FACADE = new FlutedFacadeBlock(FabricBlockSettings.copyOf(Blocks.CRACKED_DEEPSLATE_TILES).requiresTool());

    // sill
    public static final Block STONE_SILL = new SillBlock(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool());
    public static final Block  SMOOTH_STONE_SILL = new SillBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE).requiresTool());
    public static final Block COBBLESTONE_SILL = new SillBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool());
    public static final Block MOSSY_COBBLESTONE_SILL = new SillBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_COBBLESTONE).requiresTool());
    public static final Block BRICKS_SILL = new SillBlock(FabricBlockSettings.copyOf(Blocks.BRICKS).requiresTool());
    public static final Block STONE_BRICKS_SILL = new SillBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool());
    public static final Block MOSSY_STONE_BRICKS_SILL = new SillBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICKS).requiresTool());
    public static final Block CRACKED_STONE_BRICKS_SILL = new SillBlock(FabricBlockSettings.copyOf(Blocks.CRACKED_STONE_BRICKS).requiresTool());
    public static final Block CHISELED_STONE_BRICKS_SILL = new SillBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_STONE_BRICKS).requiresTool());
    public static final Block OBSIDIAN_SILL = new SillBlock(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).requiresTool());

    public static final Block SANDSTONE_SILL = new SillBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE).requiresTool());
    public static final Block SMOOTH_SANDSTONE_SILL = new SillBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_SANDSTONE).requiresTool());
    public static final Block CHISELED_SANDSTONE_SILL = new SillBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_SANDSTONE).requiresTool());
    public static final Block CUT_SANDSTONE_SILL = new SillBlock(FabricBlockSettings.copyOf(Blocks.CUT_SANDSTONE).requiresTool());
    public static final Block RED_SANDSTONE_SILL = new SillBlock(FabricBlockSettings.copyOf(Blocks.RED_SANDSTONE).requiresTool());
    public static final Block SMOOTH_RED_SANDSTONE_SILL = new SillBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_RED_SANDSTONE).requiresTool());
    public static final Block CHISELED_RED_SANDSTONE_SILL = new SillBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_RED_SANDSTONE).requiresTool());
    public static final Block CUT_RED_SANDSTONE_SILL = new SillBlock(FabricBlockSettings.copyOf(Blocks.CUT_RED_SANDSTONE).requiresTool());

    public static final Block GRANITE_SILL = new SillBlock(FabricBlockSettings.copyOf(Blocks.GRANITE).requiresTool());
    public static final Block POLISHED_GRANITE_SILL = new SillBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_GRANITE).requiresTool());
    public static final Block DIORITE_SILL = new SillBlock(FabricBlockSettings.copyOf(Blocks.DIORITE).requiresTool());
    public static final Block POLISHED_DIORITE_SILL = new SillBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_DIORITE).requiresTool());
    public static final Block ANDESITE_SILL = new SillBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE).requiresTool());
    public static final Block POLISHED_ANDESITE_SILL = new SillBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_ANDESITE).requiresTool());

    public static final Block BLACKSTONE_SILL = new SillBlock(FabricBlockSettings.copyOf(Blocks.BLACKSTONE).requiresTool());
    public static final Block POLISHED_BLACKSTONE_SILL = new SillBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE).requiresTool());
    public static final Block CHISELED_POLISHED_BLACKSTONE_SILL = new SillBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_POLISHED_BLACKSTONE).requiresTool());
    public static final Block GILDED_BLACKSTONE_SILL = new SillBlock(FabricBlockSettings.copyOf(Blocks.GILDED_BLACKSTONE).requiresTool());
    public static final Block POLISHED_BLACKSTONE_BRICKS_SILL = new SillBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS).requiresTool());
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICKS_SILL = new SillBlock(FabricBlockSettings.copyOf(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS).requiresTool());

    public static final Block DEEPSLATE_SILL = new SillBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).requiresTool());
    public static final Block DEEPSLATE_BRICKS_SILL = new SillBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS).requiresTool());
    public static final Block CRACKED_DEEPSLATE_BRICKS_SILL = new SillBlock(FabricBlockSettings.copyOf(Blocks.CRACKED_DEEPSLATE_BRICKS).requiresTool());
    public static final Block COBBLED_DEEPSLATE_SILL = new SillBlock(FabricBlockSettings.copyOf(Blocks.COBBLED_DEEPSLATE).requiresTool());
    public static final Block POLISHED_DEEPSLATE_SILL = new SillBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_DEEPSLATE).requiresTool());
    public static final Block CHISELED_DEEPSLATE_SILL = new SillBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_DEEPSLATE).requiresTool());
    public static final Block DEEPSLATE_TILES_SILL = new SillBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_TILES).requiresTool());
    public static final Block CRACKED_DEEPSLATE_TILES_SILL = new SillBlock(FabricBlockSettings.copyOf(Blocks.CRACKED_DEEPSLATE_TILES).requiresTool());

    // double sill
    public static final Block STONE_DOUBLE_SILL = new DoubleSillBlock(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool());
    public static final Block  SMOOTH_STONE_DOUBLE_SILL = new DoubleSillBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE).requiresTool());
    public static final Block COBBLESTONE_DOUBLE_SILL = new DoubleSillBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool());
    public static final Block MOSSY_COBBLESTONE_DOUBLE_SILL = new DoubleSillBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_COBBLESTONE).requiresTool());
    public static final Block BRICKS_DOUBLE_SILL = new DoubleSillBlock(FabricBlockSettings.copyOf(Blocks.BRICKS).requiresTool());
    public static final Block STONE_BRICKS_DOUBLE_SILL = new DoubleSillBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool());
    public static final Block MOSSY_STONE_BRICKS_DOUBLE_SILL = new DoubleSillBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICKS).requiresTool());
    public static final Block CRACKED_STONE_BRICKS_DOUBLE_SILL = new DoubleSillBlock(FabricBlockSettings.copyOf(Blocks.CRACKED_STONE_BRICKS).requiresTool());
    public static final Block CHISELED_STONE_BRICKS_DOUBLE_SILL = new DoubleSillBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_STONE_BRICKS).requiresTool());
    public static final Block OBSIDIAN_DOUBLE_SILL = new DoubleSillBlock(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).requiresTool());

    public static final Block SANDSTONE_DOUBLE_SILL = new DoubleSillBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE).requiresTool());
    public static final Block SMOOTH_SANDSTONE_DOUBLE_SILL = new DoubleSillBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_SANDSTONE).requiresTool());
    public static final Block CHISELED_SANDSTONE_DOUBLE_SILL = new DoubleSillBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_SANDSTONE).requiresTool());
    public static final Block CUT_SANDSTONE_DOUBLE_SILL = new DoubleSillBlock(FabricBlockSettings.copyOf(Blocks.CUT_SANDSTONE).requiresTool());
    public static final Block RED_SANDSTONE_DOUBLE_SILL = new DoubleSillBlock(FabricBlockSettings.copyOf(Blocks.RED_SANDSTONE).requiresTool());
    public static final Block SMOOTH_RED_SANDSTONE_DOUBLE_SILL = new DoubleSillBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_RED_SANDSTONE).requiresTool());
    public static final Block CHISELED_RED_SANDSTONE_DOUBLE_SILL = new DoubleSillBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_RED_SANDSTONE).requiresTool());
    public static final Block CUT_RED_SANDSTONE_DOUBLE_SILL = new DoubleSillBlock(FabricBlockSettings.copyOf(Blocks.CUT_RED_SANDSTONE).requiresTool());

    public static final Block GRANITE_DOUBLE_SILL = new DoubleSillBlock(FabricBlockSettings.copyOf(Blocks.GRANITE).requiresTool());
    public static final Block POLISHED_GRANITE_DOUBLE_SILL = new DoubleSillBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_GRANITE).requiresTool());
    public static final Block DIORITE_DOUBLE_SILL = new DoubleSillBlock(FabricBlockSettings.copyOf(Blocks.DIORITE).requiresTool());
    public static final Block POLISHED_DIORITE_DOUBLE_SILL = new DoubleSillBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_DIORITE).requiresTool());
    public static final Block ANDESITE_DOUBLE_SILL = new DoubleSillBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE).requiresTool());
    public static final Block POLISHED_ANDESITE_DOUBLE_SILL = new DoubleSillBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_ANDESITE).requiresTool());

    public static final Block BLACKSTONE_DOUBLE_SILL = new DoubleSillBlock(FabricBlockSettings.copyOf(Blocks.BLACKSTONE).requiresTool());
    public static final Block POLISHED_BLACKSTONE_DOUBLE_SILL = new DoubleSillBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE).requiresTool());
    public static final Block CHISELED_POLISHED_BLACKSTONE_DOUBLE_SILL = new DoubleSillBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_POLISHED_BLACKSTONE).requiresTool());
    public static final Block GILDED_BLACKSTONE_DOUBLE_SILL = new DoubleSillBlock(FabricBlockSettings.copyOf(Blocks.GILDED_BLACKSTONE).requiresTool());
    public static final Block POLISHED_BLACKSTONE_BRICKS_DOUBLE_SILL = new DoubleSillBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS).requiresTool());
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICKS_DOUBLE_SILL = new DoubleSillBlock(FabricBlockSettings.copyOf(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS).requiresTool());

    public static final Block DEEPSLATE_DOUBLE_SILL = new DoubleSillBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).requiresTool());
    public static final Block DEEPSLATE_BRICKS_DOUBLE_SILL = new DoubleSillBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS).requiresTool());
    public static final Block CRACKED_DEEPSLATE_BRICKS_DOUBLE_SILL = new DoubleSillBlock(FabricBlockSettings.copyOf(Blocks.CRACKED_DEEPSLATE_BRICKS).requiresTool());
    public static final Block COBBLED_DEEPSLATE_DOUBLE_SILL = new DoubleSillBlock(FabricBlockSettings.copyOf(Blocks.COBBLED_DEEPSLATE).requiresTool());
    public static final Block POLISHED_DEEPSLATE_DOUBLE_SILL = new DoubleSillBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_DEEPSLATE).requiresTool());
    public static final Block CHISELED_DEEPSLATE_DOUBLE_SILL = new DoubleSillBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_DEEPSLATE).requiresTool());
    public static final Block DEEPSLATE_TILES_DOUBLE_SILL = new DoubleSillBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_TILES).requiresTool());
    public static final Block CRACKED_DEEPSLATE_TILES_DOUBLE_SILL = new DoubleSillBlock(FabricBlockSettings.copyOf(Blocks.CRACKED_DEEPSLATE_TILES).requiresTool());

    // cornice

    // crown molding

    // pillar base

    // pillar

    // wall sconce

    // grate

    /**
     *
     */
    public static void register() {

        /*
         * register blocks
         */
        // facade
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.STONE_FACADE), STONE_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.SMOOTH_STONE_FACADE), SMOOTH_STONE_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.COBBLESTONE_FACADE), COBBLESTONE_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.MOSSY_COBBLESTONE_FACADE), MOSSY_COBBLESTONE_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.BRICKS_FACADE), BRICKS_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.STONE_BRICKS_FACADE), STONE_BRICKS_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.MOSSY_STONE_BRICKS_FACADE), MOSSY_STONE_BRICKS_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CRACKED_STONE_BRICKS_FACADE), CRACKED_STONE_BRICKS_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_STONE_BRICKS_FACADE), CHISELED_STONE_BRICKS_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.OBSIDIAN_FACADE), OBSIDIAN_FACADE);

        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.SANDSTONE_FACADE), SANDSTONE_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.SMOOTH_SANDSTONE_FACADE), SMOOTH_SANDSTONE_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_SANDSTONE_FACADE), CHISELED_SANDSTONE_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CUT_SANDSTONE_FACADE), CUT_SANDSTONE_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.RED_SANDSTONE_FACADE), RED_SANDSTONE_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.SMOOTH_RED_SANDSTONE_FACADE), SMOOTH_RED_SANDSTONE_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_RED_SANDSTONE_FACADE), CHISELED_RED_SANDSTONE_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CUT_RED_SANDSTONE_FACADE), CUT_RED_SANDSTONE_FACADE);

        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.GRANITE_FACADE), GRANITE_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_GRANITE_FACADE), POLISHED_GRANITE_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.DIORITE_FACADE), DIORITE_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_DIORITE_FACADE), POLISHED_DIORITE_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.ANDESITE_FACADE), ANDESITE_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_ANDESITE_FACADE), POLISHED_ANDESITE_FACADE);

        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.BLACKSTONE_FACADE), BLACKSTONE_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_BLACKSTONE_FACADE), POLISHED_BLACKSTONE_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_POLISHED_BLACKSTONE_FACADE), CHISELED_POLISHED_BLACKSTONE_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.GILDED_BLACKSTONE_FACADE), GILDED_BLACKSTONE_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_BLACKSTONE_BRICKS_FACADE), POLISHED_BLACKSTONE_BRICKS_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CRACKED_POLISHED_BLACKSTONE_BRICKS_FACADE), CRACKED_POLISHED_BLACKSTONE_BRICKS_FACADE);

        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.DEEPSLATE_FACADE), DEEPSLATE_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.DEEPSLATE_BRICKS_FACADE), DEEPSLATE_BRICKS_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.DEEPSLATE_TILES_FACADE), DEEPSLATE_TILES_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_DEEPSLATE_FACADE), POLISHED_DEEPSLATE_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_DEEPSLATE_FACADE), CHISELED_DEEPSLATE_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CRACKED_DEEPSLATE_BRICKS_FACADE), CRACKED_DEEPSLATE_BRICKS_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CRACKED_DEEPSLATE_TILES_FACADE), CRACKED_DEEPSLATE_TILES_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.COBBLED_DEEPSLATE_FACADE), COBBLED_DEEPSLATE_FACADE);

        // quarter facade
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.STONE_QUARTER_FACADE), STONE_QUARTER_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.SMOOTH_STONE_QUARTER_FACADE), SMOOTH_STONE_QUARTER_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.COBBLESTONE_QUARTER_FACADE), COBBLESTONE_QUARTER_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.MOSSY_COBBLESTONE_QUARTER_FACADE), MOSSY_COBBLESTONE_QUARTER_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.BRICKS_QUARTER_FACADE), BRICKS_QUARTER_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.STONE_BRICKS_QUARTER_FACADE), STONE_BRICKS_QUARTER_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.MOSSY_STONE_BRICKS_QUARTER_FACADE), MOSSY_STONE_BRICKS_QUARTER_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CRACKED_STONE_BRICKS_QUARTER_FACADE), CRACKED_STONE_BRICKS_QUARTER_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_STONE_BRICKS_QUARTER_FACADE), CHISELED_STONE_BRICKS_QUARTER_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.OBSIDIAN_QUARTER_FACADE), OBSIDIAN_QUARTER_FACADE);

        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.SANDSTONE_QUARTER_FACADE), SANDSTONE_QUARTER_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.SMOOTH_SANDSTONE_QUARTER_FACADE), SMOOTH_SANDSTONE_QUARTER_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_SANDSTONE_QUARTER_FACADE), CHISELED_SANDSTONE_QUARTER_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CUT_SANDSTONE_QUARTER_FACADE), CUT_SANDSTONE_QUARTER_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.RED_SANDSTONE_QUARTER_FACADE), RED_SANDSTONE_QUARTER_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.SMOOTH_RED_SANDSTONE_QUARTER_FACADE), SMOOTH_RED_SANDSTONE_QUARTER_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_RED_SANDSTONE_QUARTER_FACADE), CHISELED_RED_SANDSTONE_QUARTER_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CUT_RED_SANDSTONE_QUARTER_FACADE), CUT_RED_SANDSTONE_QUARTER_FACADE);

        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.GRANITE_QUARTER_FACADE), GRANITE_QUARTER_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_GRANITE_QUARTER_FACADE), POLISHED_GRANITE_QUARTER_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.DIORITE_QUARTER_FACADE), DIORITE_QUARTER_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_DIORITE_QUARTER_FACADE), POLISHED_DIORITE_QUARTER_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.ANDESITE_QUARTER_FACADE), ANDESITE_QUARTER_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_ANDESITE_QUARTER_FACADE), POLISHED_ANDESITE_QUARTER_FACADE);

        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.BLACKSTONE_QUARTER_FACADE), BLACKSTONE_QUARTER_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_BLACKSTONE_QUARTER_FACADE), POLISHED_BLACKSTONE_QUARTER_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_POLISHED_BLACKSTONE_QUARTER_FACADE), CHISELED_POLISHED_BLACKSTONE_QUARTER_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.GILDED_BLACKSTONE_QUARTER_FACADE), GILDED_BLACKSTONE_QUARTER_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_BLACKSTONE_BRICKS_QUARTER_FACADE), POLISHED_BLACKSTONE_BRICKS_QUARTER_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CRACKED_POLISHED_BLACKSTONE_BRICKS_QUARTER_FACADE), CRACKED_POLISHED_BLACKSTONE_BRICKS_QUARTER_FACADE);

        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.DEEPSLATE_QUARTER_FACADE), DEEPSLATE_QUARTER_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.DEEPSLATE_BRICKS_QUARTER_FACADE), DEEPSLATE_BRICKS_QUARTER_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.DEEPSLATE_TILES_QUARTER_FACADE), DEEPSLATE_TILES_QUARTER_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_DEEPSLATE_QUARTER_FACADE), POLISHED_DEEPSLATE_QUARTER_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_DEEPSLATE_QUARTER_FACADE), CHISELED_DEEPSLATE_QUARTER_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CRACKED_DEEPSLATE_BRICKS_QUARTER_FACADE), CRACKED_DEEPSLATE_BRICKS_QUARTER_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CRACKED_DEEPSLATE_TILES_QUARTER_FACADE), CRACKED_DEEPSLATE_TILES_QUARTER_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.COBBLED_DEEPSLATE_QUARTER_FACADE), COBBLED_DEEPSLATE_QUARTER_FACADE);

        // fluted
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.STONE_FLUTED), STONE_FLUTED);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.SMOOTH_STONE_FLUTED), SMOOTH_STONE_FLUTED);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.COBBLESTONE_FLUTED), COBBLESTONE_FLUTED);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.MOSSY_COBBLESTONE_FLUTED), MOSSY_COBBLESTONE_FLUTED);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.BRICKS_FLUTED), BRICKS_FLUTED);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.STONE_BRICKS_FLUTED), STONE_BRICKS_FLUTED);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.MOSSY_STONE_BRICKS_FLUTED), MOSSY_STONE_BRICKS_FLUTED);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CRACKED_STONE_BRICKS_FLUTED), CRACKED_STONE_BRICKS_FLUTED);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_STONE_BRICKS_FLUTED), CHISELED_STONE_BRICKS_FLUTED);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.OBSIDIAN_FLUTED), OBSIDIAN_FLUTED);

        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.SANDSTONE_FLUTED), SANDSTONE_FLUTED);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.SMOOTH_SANDSTONE_FLUTED), SMOOTH_SANDSTONE_FLUTED);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_SANDSTONE_FLUTED), CHISELED_SANDSTONE_FLUTED);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CUT_SANDSTONE_FLUTED), CUT_SANDSTONE_FLUTED);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.RED_SANDSTONE_FLUTED), RED_SANDSTONE_FLUTED);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.SMOOTH_RED_SANDSTONE_FLUTED), SMOOTH_RED_SANDSTONE_FLUTED);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_RED_SANDSTONE_FLUTED), CHISELED_RED_SANDSTONE_FLUTED);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CUT_RED_SANDSTONE_FLUTED), CUT_RED_SANDSTONE_FLUTED);

        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.GRANITE_FLUTED), GRANITE_FLUTED);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_GRANITE_FLUTED), POLISHED_GRANITE_FLUTED);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.DIORITE_FLUTED), DIORITE_FLUTED);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_DIORITE_FLUTED), POLISHED_DIORITE_FLUTED);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.ANDESITE_FLUTED), ANDESITE_FLUTED);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_ANDESITE_FLUTED), POLISHED_ANDESITE_FLUTED);

        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.BLACKSTONE_FLUTED), BLACKSTONE_FLUTED);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_BLACKSTONE_FLUTED), POLISHED_BLACKSTONE_FLUTED);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_POLISHED_BLACKSTONE_FLUTED), CHISELED_POLISHED_BLACKSTONE_FLUTED);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.GILDED_BLACKSTONE_FLUTED), GILDED_BLACKSTONE_FLUTED);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_BLACKSTONE_BRICKS_FLUTED), POLISHED_BLACKSTONE_BRICKS_FLUTED);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CRACKED_POLISHED_BLACKSTONE_BRICKS_FLUTED), CRACKED_POLISHED_BLACKSTONE_BRICKS_FLUTED);

        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.DEEPSLATE_FLUTED), DEEPSLATE_FLUTED);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.DEEPSLATE_BRICKS_FLUTED), DEEPSLATE_BRICKS_FLUTED);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.DEEPSLATE_TILES_FLUTED), DEEPSLATE_TILES_FLUTED);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_DEEPSLATE_FLUTED), POLISHED_DEEPSLATE_FLUTED);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_DEEPSLATE_FLUTED), CHISELED_DEEPSLATE_FLUTED);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CRACKED_DEEPSLATE_BRICKS_FLUTED), CRACKED_DEEPSLATE_BRICKS_FLUTED);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CRACKED_DEEPSLATE_TILES_FLUTED), CRACKED_DEEPSLATE_TILES_FLUTED);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.COBBLED_DEEPSLATE_FLUTED), COBBLED_DEEPSLATE_FLUTED);

        // fluted facade
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.STONE_FLUTED_FACADE), STONE_FLUTED_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.SMOOTH_STONE_FLUTED_FACADE), SMOOTH_STONE_FLUTED_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.COBBLESTONE_FLUTED_FACADE), COBBLESTONE_FLUTED_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.MOSSY_COBBLESTONE_FLUTED_FACADE), MOSSY_COBBLESTONE_FLUTED_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.BRICKS_FLUTED_FACADE), BRICKS_FLUTED_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.STONE_BRICKS_FLUTED_FACADE), STONE_BRICKS_FLUTED_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.MOSSY_STONE_BRICKS_FLUTED_FACADE), MOSSY_STONE_BRICKS_FLUTED_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CRACKED_STONE_BRICKS_FLUTED_FACADE), CRACKED_STONE_BRICKS_FLUTED_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_STONE_BRICKS_FLUTED_FACADE), CHISELED_STONE_BRICKS_FLUTED_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.OBSIDIAN_FLUTED_FACADE), OBSIDIAN_FLUTED_FACADE);

        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.SANDSTONE_FLUTED_FACADE), SANDSTONE_FLUTED_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.SMOOTH_SANDSTONE_FLUTED_FACADE), SMOOTH_SANDSTONE_FLUTED_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_SANDSTONE_FLUTED_FACADE), CHISELED_SANDSTONE_FLUTED_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CUT_SANDSTONE_FLUTED_FACADE), CUT_SANDSTONE_FLUTED_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.RED_SANDSTONE_FLUTED_FACADE), RED_SANDSTONE_FLUTED_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.SMOOTH_RED_SANDSTONE_FLUTED_FACADE), SMOOTH_RED_SANDSTONE_FLUTED_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_RED_SANDSTONE_FLUTED_FACADE), CHISELED_RED_SANDSTONE_FLUTED_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CUT_RED_SANDSTONE_FLUTED_FACADE), CUT_RED_SANDSTONE_FLUTED_FACADE);

        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.GRANITE_FLUTED_FACADE), GRANITE_FLUTED_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_GRANITE_FLUTED_FACADE), POLISHED_GRANITE_FLUTED_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.DIORITE_FLUTED_FACADE), DIORITE_FLUTED_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_DIORITE_FLUTED_FACADE), POLISHED_DIORITE_FLUTED_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.ANDESITE_FLUTED_FACADE), ANDESITE_FLUTED_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_ANDESITE_FLUTED_FACADE), POLISHED_ANDESITE_FLUTED_FACADE);

        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.BLACKSTONE_FLUTED_FACADE), BLACKSTONE_FLUTED_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_BLACKSTONE_FLUTED_FACADE), POLISHED_BLACKSTONE_FLUTED_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_POLISHED_BLACKSTONE_FLUTED_FACADE), CHISELED_POLISHED_BLACKSTONE_FLUTED_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.GILDED_BLACKSTONE_FLUTED_FACADE), GILDED_BLACKSTONE_FLUTED_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_BLACKSTONE_BRICKS_FLUTED_FACADE), POLISHED_BLACKSTONE_BRICKS_FLUTED_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CRACKED_POLISHED_BLACKSTONE_BRICKS_FLUTED_FACADE), CRACKED_POLISHED_BLACKSTONE_BRICKS_FLUTED_FACADE);

        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.DEEPSLATE_FLUTED_FACADE), DEEPSLATE_FLUTED_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.DEEPSLATE_BRICKS_FLUTED_FACADE), DEEPSLATE_BRICKS_FLUTED_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.DEEPSLATE_TILES_FLUTED_FACADE), DEEPSLATE_TILES_FLUTED_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_DEEPSLATE_FLUTED_FACADE), POLISHED_DEEPSLATE_FLUTED_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_DEEPSLATE_FLUTED_FACADE), CHISELED_DEEPSLATE_FLUTED_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CRACKED_DEEPSLATE_BRICKS_FLUTED_FACADE), CRACKED_DEEPSLATE_BRICKS_FLUTED_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CRACKED_DEEPSLATE_TILES_FLUTED_FACADE), CRACKED_DEEPSLATE_TILES_FLUTED_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.COBBLED_DEEPSLATE_FLUTED_FACADE), COBBLED_DEEPSLATE_FLUTED_FACADE);

        // sill
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.STONE_SILL), STONE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.SMOOTH_STONE_SILL), SMOOTH_STONE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.COBBLESTONE_SILL), COBBLESTONE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.MOSSY_COBBLESTONE_SILL), MOSSY_COBBLESTONE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.BRICKS_SILL), BRICKS_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.STONE_BRICKS_SILL), STONE_BRICKS_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.MOSSY_STONE_BRICKS_SILL), MOSSY_STONE_BRICKS_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CRACKED_STONE_BRICKS_SILL), CRACKED_STONE_BRICKS_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_STONE_BRICKS_SILL), CHISELED_STONE_BRICKS_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.OBSIDIAN_SILL), OBSIDIAN_SILL);

        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.SANDSTONE_SILL), SANDSTONE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.SMOOTH_SANDSTONE_SILL), SMOOTH_SANDSTONE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_SANDSTONE_SILL), CHISELED_SANDSTONE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CUT_SANDSTONE_SILL), CUT_SANDSTONE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.RED_SANDSTONE_SILL), RED_SANDSTONE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.SMOOTH_RED_SANDSTONE_SILL), SMOOTH_RED_SANDSTONE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_RED_SANDSTONE_SILL), CHISELED_RED_SANDSTONE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CUT_RED_SANDSTONE_SILL), CUT_RED_SANDSTONE_SILL);

        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.GRANITE_SILL), GRANITE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_GRANITE_SILL), POLISHED_GRANITE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.DIORITE_SILL), DIORITE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_DIORITE_SILL), POLISHED_DIORITE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.ANDESITE_SILL), ANDESITE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_ANDESITE_SILL), POLISHED_ANDESITE_SILL);

        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.BLACKSTONE_SILL), BLACKSTONE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_BLACKSTONE_SILL), POLISHED_BLACKSTONE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_POLISHED_BLACKSTONE_SILL), CHISELED_POLISHED_BLACKSTONE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.GILDED_BLACKSTONE_SILL), GILDED_BLACKSTONE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_BLACKSTONE_BRICKS_SILL), POLISHED_BLACKSTONE_BRICKS_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CRACKED_POLISHED_BLACKSTONE_BRICKS_SILL), CRACKED_POLISHED_BLACKSTONE_BRICKS_SILL);

        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.DEEPSLATE_SILL), DEEPSLATE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.DEEPSLATE_BRICKS_SILL), DEEPSLATE_BRICKS_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.DEEPSLATE_TILES_SILL), DEEPSLATE_TILES_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_DEEPSLATE_SILL), POLISHED_DEEPSLATE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_DEEPSLATE_SILL), CHISELED_DEEPSLATE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CRACKED_DEEPSLATE_BRICKS_SILL), CRACKED_DEEPSLATE_BRICKS_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CRACKED_DEEPSLATE_TILES_SILL), CRACKED_DEEPSLATE_TILES_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.COBBLED_DEEPSLATE_SILL), COBBLED_DEEPSLATE_SILL);

        // double sill
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.STONE_DOUBLE_SILL), STONE_DOUBLE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.SMOOTH_STONE_DOUBLE_SILL), SMOOTH_STONE_DOUBLE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.COBBLESTONE_DOUBLE_SILL), COBBLESTONE_DOUBLE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.MOSSY_COBBLESTONE_DOUBLE_SILL), MOSSY_COBBLESTONE_DOUBLE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.BRICKS_DOUBLE_SILL), BRICKS_DOUBLE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.STONE_BRICKS_DOUBLE_SILL), STONE_BRICKS_DOUBLE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.MOSSY_STONE_BRICKS_DOUBLE_SILL), MOSSY_STONE_BRICKS_DOUBLE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CRACKED_STONE_BRICKS_DOUBLE_SILL), CRACKED_STONE_BRICKS_DOUBLE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_STONE_BRICKS_DOUBLE_SILL), CHISELED_STONE_BRICKS_DOUBLE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.OBSIDIAN_DOUBLE_SILL), OBSIDIAN_DOUBLE_SILL);

        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.SANDSTONE_DOUBLE_SILL), SANDSTONE_DOUBLE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.SMOOTH_SANDSTONE_DOUBLE_SILL), SMOOTH_SANDSTONE_DOUBLE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_SANDSTONE_DOUBLE_SILL), CHISELED_SANDSTONE_DOUBLE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CUT_SANDSTONE_DOUBLE_SILL), CUT_SANDSTONE_DOUBLE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.RED_SANDSTONE_DOUBLE_SILL), RED_SANDSTONE_DOUBLE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.SMOOTH_RED_SANDSTONE_DOUBLE_SILL), SMOOTH_RED_SANDSTONE_DOUBLE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_RED_SANDSTONE_DOUBLE_SILL), CHISELED_RED_SANDSTONE_DOUBLE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CUT_RED_SANDSTONE_DOUBLE_SILL), CUT_RED_SANDSTONE_DOUBLE_SILL);

        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.GRANITE_DOUBLE_SILL), GRANITE_DOUBLE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_GRANITE_DOUBLE_SILL), POLISHED_GRANITE_DOUBLE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.DIORITE_DOUBLE_SILL), DIORITE_DOUBLE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_DIORITE_DOUBLE_SILL), POLISHED_DIORITE_DOUBLE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.ANDESITE_DOUBLE_SILL), ANDESITE_DOUBLE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_ANDESITE_DOUBLE_SILL), POLISHED_ANDESITE_DOUBLE_SILL);

        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.BLACKSTONE_DOUBLE_SILL), BLACKSTONE_DOUBLE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_BLACKSTONE_DOUBLE_SILL), POLISHED_BLACKSTONE_DOUBLE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_POLISHED_BLACKSTONE_DOUBLE_SILL), CHISELED_POLISHED_BLACKSTONE_DOUBLE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.GILDED_BLACKSTONE_DOUBLE_SILL), GILDED_BLACKSTONE_DOUBLE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_BLACKSTONE_BRICKS_DOUBLE_SILL), POLISHED_BLACKSTONE_BRICKS_DOUBLE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CRACKED_POLISHED_BLACKSTONE_BRICKS_DOUBLE_SILL), CRACKED_POLISHED_BLACKSTONE_BRICKS_DOUBLE_SILL);

        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.DEEPSLATE_DOUBLE_SILL), DEEPSLATE_DOUBLE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.DEEPSLATE_BRICKS_DOUBLE_SILL), DEEPSLATE_BRICKS_DOUBLE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.DEEPSLATE_TILES_DOUBLE_SILL), DEEPSLATE_TILES_DOUBLE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_DEEPSLATE_DOUBLE_SILL), POLISHED_DEEPSLATE_DOUBLE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_DEEPSLATE_DOUBLE_SILL), CHISELED_DEEPSLATE_DOUBLE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CRACKED_DEEPSLATE_BRICKS_DOUBLE_SILL), CRACKED_DEEPSLATE_BRICKS_DOUBLE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.CRACKED_DEEPSLATE_TILES_DOUBLE_SILL), CRACKED_DEEPSLATE_TILES_DOUBLE_SILL);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, ID.COBBLED_DEEPSLATE_DOUBLE_SILL), COBBLED_DEEPSLATE_DOUBLE_SILL);

        // cornice

        // crown molding

        // pillar base

        // pillar

        // wall sconce

        // grate

        /*
         * register items
         */
        // facade
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.STONE_FACADE), new BlockItem(STONE_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.SMOOTH_STONE_FACADE), new BlockItem(SMOOTH_STONE_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.COBBLESTONE_FACADE), new BlockItem(COBBLESTONE_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.MOSSY_COBBLESTONE_FACADE), new BlockItem(MOSSY_COBBLESTONE_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.BRICKS_FACADE), new BlockItem(BRICKS_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.STONE_BRICKS_FACADE), new BlockItem(STONE_BRICKS_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.MOSSY_STONE_BRICKS_FACADE), new BlockItem(MOSSY_STONE_BRICKS_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CRACKED_STONE_BRICKS_FACADE), new BlockItem(CRACKED_STONE_BRICKS_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_STONE_BRICKS_FACADE), new BlockItem(CHISELED_STONE_BRICKS_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.OBSIDIAN_FACADE), new BlockItem(OBSIDIAN_FACADE, new FabricItemSettings().group(ITEM_GROUP)));

        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.SANDSTONE_FACADE), new BlockItem(SANDSTONE_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.SMOOTH_SANDSTONE_FACADE), new BlockItem(SMOOTH_SANDSTONE_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_SANDSTONE_FACADE), new BlockItem(CHISELED_SANDSTONE_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CUT_SANDSTONE_FACADE), new BlockItem(CUT_SANDSTONE_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.RED_SANDSTONE_FACADE), new BlockItem(RED_SANDSTONE_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.SMOOTH_RED_SANDSTONE_FACADE), new BlockItem(SMOOTH_RED_SANDSTONE_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_RED_SANDSTONE_FACADE), new BlockItem(CHISELED_RED_SANDSTONE_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CUT_RED_SANDSTONE_FACADE), new BlockItem(CUT_RED_SANDSTONE_FACADE, new FabricItemSettings().group(ITEM_GROUP)));

        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.GRANITE_FACADE), new BlockItem(GRANITE_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_GRANITE_FACADE), new BlockItem(POLISHED_GRANITE_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.DIORITE_FACADE), new BlockItem(DIORITE_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_DIORITE_FACADE), new BlockItem(POLISHED_DIORITE_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.ANDESITE_FACADE), new BlockItem(ANDESITE_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_ANDESITE_FACADE), new BlockItem(POLISHED_ANDESITE_FACADE, new FabricItemSettings().group(ITEM_GROUP)));

        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.BLACKSTONE_FACADE), new BlockItem(BLACKSTONE_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_BLACKSTONE_FACADE), new BlockItem(POLISHED_BLACKSTONE_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_POLISHED_BLACKSTONE_FACADE), new BlockItem(CHISELED_POLISHED_BLACKSTONE_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.GILDED_BLACKSTONE_FACADE), new BlockItem(GILDED_BLACKSTONE_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_BLACKSTONE_BRICKS_FACADE), new BlockItem(POLISHED_BLACKSTONE_BRICKS_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CRACKED_POLISHED_BLACKSTONE_BRICKS_FACADE), new BlockItem(CRACKED_POLISHED_BLACKSTONE_BRICKS_FACADE, new FabricItemSettings().group(ITEM_GROUP)));

        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.DEEPSLATE_FACADE), new BlockItem(DEEPSLATE_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.DEEPSLATE_BRICKS_FACADE), new BlockItem(DEEPSLATE_BRICKS_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.DEEPSLATE_TILES_FACADE), new BlockItem(DEEPSLATE_TILES_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_DEEPSLATE_FACADE), new BlockItem(POLISHED_DEEPSLATE_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_DEEPSLATE_FACADE), new BlockItem(CHISELED_DEEPSLATE_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CRACKED_DEEPSLATE_BRICKS_FACADE), new BlockItem(CRACKED_DEEPSLATE_BRICKS_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CRACKED_DEEPSLATE_TILES_FACADE), new BlockItem(CRACKED_DEEPSLATE_TILES_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.COBBLED_DEEPSLATE_FACADE), new BlockItem(COBBLED_DEEPSLATE_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
 
        // quarter facade
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.STONE_QUARTER_FACADE), new BlockItem(STONE_QUARTER_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.SMOOTH_STONE_QUARTER_FACADE), new BlockItem(SMOOTH_STONE_QUARTER_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.COBBLESTONE_QUARTER_FACADE), new BlockItem(COBBLESTONE_QUARTER_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.MOSSY_COBBLESTONE_QUARTER_FACADE), new BlockItem(MOSSY_COBBLESTONE_QUARTER_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.BRICKS_QUARTER_FACADE), new BlockItem(BRICKS_QUARTER_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.STONE_BRICKS_QUARTER_FACADE), new BlockItem(STONE_BRICKS_QUARTER_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.MOSSY_STONE_BRICKS_QUARTER_FACADE), new BlockItem(MOSSY_STONE_BRICKS_QUARTER_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CRACKED_STONE_BRICKS_QUARTER_FACADE), new BlockItem(CRACKED_STONE_BRICKS_QUARTER_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_STONE_BRICKS_QUARTER_FACADE), new BlockItem(CHISELED_STONE_BRICKS_QUARTER_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.OBSIDIAN_QUARTER_FACADE), new BlockItem(OBSIDIAN_QUARTER_FACADE, new FabricItemSettings().group(ITEM_GROUP)));

        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.SANDSTONE_QUARTER_FACADE), new BlockItem(SANDSTONE_QUARTER_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.SMOOTH_SANDSTONE_QUARTER_FACADE), new BlockItem(SMOOTH_SANDSTONE_QUARTER_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_SANDSTONE_QUARTER_FACADE), new BlockItem(CHISELED_SANDSTONE_QUARTER_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CUT_SANDSTONE_QUARTER_FACADE), new BlockItem(CUT_SANDSTONE_QUARTER_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.RED_SANDSTONE_QUARTER_FACADE), new BlockItem(RED_SANDSTONE_QUARTER_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.SMOOTH_RED_SANDSTONE_QUARTER_FACADE), new BlockItem(SMOOTH_RED_SANDSTONE_QUARTER_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_RED_SANDSTONE_QUARTER_FACADE), new BlockItem(CHISELED_RED_SANDSTONE_QUARTER_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CUT_RED_SANDSTONE_QUARTER_FACADE), new BlockItem(CUT_RED_SANDSTONE_QUARTER_FACADE, new FabricItemSettings().group(ITEM_GROUP)));

        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.GRANITE_QUARTER_FACADE), new BlockItem(GRANITE_QUARTER_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_GRANITE_QUARTER_FACADE), new BlockItem(POLISHED_GRANITE_QUARTER_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.DIORITE_QUARTER_FACADE), new BlockItem(DIORITE_QUARTER_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_DIORITE_QUARTER_FACADE), new BlockItem(POLISHED_DIORITE_QUARTER_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.ANDESITE_QUARTER_FACADE), new BlockItem(ANDESITE_QUARTER_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_ANDESITE_QUARTER_FACADE), new BlockItem(POLISHED_ANDESITE_QUARTER_FACADE, new FabricItemSettings().group(ITEM_GROUP)));

        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.BLACKSTONE_QUARTER_FACADE), new BlockItem(BLACKSTONE_QUARTER_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_BLACKSTONE_QUARTER_FACADE), new BlockItem(POLISHED_BLACKSTONE_QUARTER_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_POLISHED_BLACKSTONE_QUARTER_FACADE), new BlockItem(CHISELED_POLISHED_BLACKSTONE_QUARTER_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.GILDED_BLACKSTONE_QUARTER_FACADE), new BlockItem(GILDED_BLACKSTONE_QUARTER_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_BLACKSTONE_BRICKS_QUARTER_FACADE), new BlockItem(POLISHED_BLACKSTONE_BRICKS_QUARTER_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CRACKED_POLISHED_BLACKSTONE_BRICKS_QUARTER_FACADE), new BlockItem(CRACKED_POLISHED_BLACKSTONE_BRICKS_QUARTER_FACADE, new FabricItemSettings().group(ITEM_GROUP)));

        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.DEEPSLATE_QUARTER_FACADE), new BlockItem(DEEPSLATE_QUARTER_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.DEEPSLATE_BRICKS_QUARTER_FACADE), new BlockItem(DEEPSLATE_BRICKS_QUARTER_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.DEEPSLATE_TILES_QUARTER_FACADE), new BlockItem(DEEPSLATE_TILES_QUARTER_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_DEEPSLATE_QUARTER_FACADE), new BlockItem(POLISHED_DEEPSLATE_QUARTER_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_DEEPSLATE_QUARTER_FACADE), new BlockItem(CHISELED_DEEPSLATE_QUARTER_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CRACKED_DEEPSLATE_BRICKS_QUARTER_FACADE), new BlockItem(CRACKED_DEEPSLATE_BRICKS_QUARTER_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CRACKED_DEEPSLATE_TILES_QUARTER_FACADE), new BlockItem(CRACKED_DEEPSLATE_TILES_QUARTER_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.COBBLED_DEEPSLATE_QUARTER_FACADE), new BlockItem(COBBLED_DEEPSLATE_QUARTER_FACADE, new FabricItemSettings().group(ITEM_GROUP)));

        // fluted
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.STONE_FLUTED), new BlockItem(STONE_FLUTED, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.SMOOTH_STONE_FLUTED), new BlockItem(SMOOTH_STONE_FLUTED, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.COBBLESTONE_FLUTED), new BlockItem(COBBLESTONE_FLUTED, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.MOSSY_COBBLESTONE_FLUTED), new BlockItem(MOSSY_COBBLESTONE_FLUTED, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.BRICKS_FLUTED), new BlockItem(BRICKS_FLUTED, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.STONE_BRICKS_FLUTED), new BlockItem(STONE_BRICKS_FLUTED, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.MOSSY_STONE_BRICKS_FLUTED), new BlockItem(MOSSY_STONE_BRICKS_FLUTED, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CRACKED_STONE_BRICKS_FLUTED), new BlockItem(CRACKED_STONE_BRICKS_FLUTED, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_STONE_BRICKS_FLUTED), new BlockItem(CHISELED_STONE_BRICKS_FLUTED, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.OBSIDIAN_FLUTED), new BlockItem(OBSIDIAN_FLUTED, new FabricItemSettings().group(ITEM_GROUP)));

        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.SANDSTONE_FLUTED), new BlockItem(SANDSTONE_FLUTED, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.SMOOTH_SANDSTONE_FLUTED), new BlockItem(SMOOTH_SANDSTONE_FLUTED, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_SANDSTONE_FLUTED), new BlockItem(CHISELED_SANDSTONE_FLUTED, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CUT_SANDSTONE_FLUTED), new BlockItem(CUT_SANDSTONE_FLUTED, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.RED_SANDSTONE_FLUTED), new BlockItem(RED_SANDSTONE_FLUTED, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.SMOOTH_RED_SANDSTONE_FLUTED), new BlockItem(SMOOTH_RED_SANDSTONE_FLUTED, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_RED_SANDSTONE_FLUTED), new BlockItem(CHISELED_RED_SANDSTONE_FLUTED, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CUT_RED_SANDSTONE_FLUTED), new BlockItem(CUT_RED_SANDSTONE_FLUTED, new FabricItemSettings().group(ITEM_GROUP)));

        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.GRANITE_FLUTED), new BlockItem(GRANITE_FLUTED, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_GRANITE_FLUTED), new BlockItem(POLISHED_GRANITE_FLUTED, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.DIORITE_FLUTED), new BlockItem(DIORITE_FLUTED, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_DIORITE_FLUTED), new BlockItem(POLISHED_DIORITE_FLUTED, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.ANDESITE_FLUTED), new BlockItem(ANDESITE_FLUTED, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_ANDESITE_FLUTED), new BlockItem(POLISHED_ANDESITE_FLUTED, new FabricItemSettings().group(ITEM_GROUP)));

        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.BLACKSTONE_FLUTED), new BlockItem(BLACKSTONE_FLUTED, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_BLACKSTONE_FLUTED), new BlockItem(POLISHED_BLACKSTONE_FLUTED, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_POLISHED_BLACKSTONE_FLUTED), new BlockItem(CHISELED_POLISHED_BLACKSTONE_FLUTED, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.GILDED_BLACKSTONE_FLUTED), new BlockItem(GILDED_BLACKSTONE_FLUTED, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_BLACKSTONE_BRICKS_FLUTED), new BlockItem(POLISHED_BLACKSTONE_BRICKS_FLUTED, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CRACKED_POLISHED_BLACKSTONE_BRICKS_FLUTED), new BlockItem(CRACKED_POLISHED_BLACKSTONE_BRICKS_FLUTED, new FabricItemSettings().group(ITEM_GROUP)));

        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.DEEPSLATE_FLUTED), new BlockItem(DEEPSLATE_FLUTED, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.DEEPSLATE_BRICKS_FLUTED), new BlockItem(DEEPSLATE_BRICKS_FLUTED, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.DEEPSLATE_TILES_FLUTED), new BlockItem(DEEPSLATE_TILES_FLUTED, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_DEEPSLATE_FLUTED), new BlockItem(POLISHED_DEEPSLATE_FLUTED, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_DEEPSLATE_FLUTED), new BlockItem(CHISELED_DEEPSLATE_FLUTED, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CRACKED_DEEPSLATE_BRICKS_FLUTED), new BlockItem(CRACKED_DEEPSLATE_BRICKS_FLUTED, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CRACKED_DEEPSLATE_TILES_FLUTED), new BlockItem(CRACKED_DEEPSLATE_TILES_FLUTED, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.COBBLED_DEEPSLATE_FLUTED), new BlockItem(COBBLED_DEEPSLATE_FLUTED, new FabricItemSettings().group(ITEM_GROUP)));

        // fluted facade
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.STONE_FLUTED_FACADE), new BlockItem(STONE_FLUTED_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.SMOOTH_STONE_FLUTED_FACADE), new BlockItem(SMOOTH_STONE_FLUTED_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.COBBLESTONE_FLUTED_FACADE), new BlockItem(COBBLESTONE_FLUTED_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.MOSSY_COBBLESTONE_FLUTED_FACADE), new BlockItem(MOSSY_COBBLESTONE_FLUTED_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.BRICKS_FLUTED_FACADE), new BlockItem(BRICKS_FLUTED_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.STONE_BRICKS_FLUTED_FACADE), new BlockItem(STONE_BRICKS_FLUTED_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.MOSSY_STONE_BRICKS_FLUTED_FACADE), new BlockItem(MOSSY_STONE_BRICKS_FLUTED_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CRACKED_STONE_BRICKS_FLUTED_FACADE), new BlockItem(CRACKED_STONE_BRICKS_FLUTED_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_STONE_BRICKS_FLUTED_FACADE), new BlockItem(CHISELED_STONE_BRICKS_FLUTED_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.OBSIDIAN_FLUTED_FACADE), new BlockItem(OBSIDIAN_FLUTED_FACADE, new FabricItemSettings().group(ITEM_GROUP)));

        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.SANDSTONE_FLUTED_FACADE), new BlockItem(SANDSTONE_FLUTED_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.SMOOTH_SANDSTONE_FLUTED_FACADE), new BlockItem(SMOOTH_SANDSTONE_FLUTED_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_SANDSTONE_FLUTED_FACADE), new BlockItem(CHISELED_SANDSTONE_FLUTED_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CUT_SANDSTONE_FLUTED_FACADE), new BlockItem(CUT_SANDSTONE_FLUTED_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.RED_SANDSTONE_FLUTED_FACADE), new BlockItem(RED_SANDSTONE_FLUTED_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.SMOOTH_RED_SANDSTONE_FLUTED_FACADE), new BlockItem(SMOOTH_RED_SANDSTONE_FLUTED_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_RED_SANDSTONE_FLUTED_FACADE), new BlockItem(CHISELED_RED_SANDSTONE_FLUTED_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CUT_RED_SANDSTONE_FLUTED_FACADE), new BlockItem(CUT_RED_SANDSTONE_FLUTED_FACADE, new FabricItemSettings().group(ITEM_GROUP)));

        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.GRANITE_FLUTED_FACADE), new BlockItem(GRANITE_FLUTED_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_GRANITE_FLUTED_FACADE), new BlockItem(POLISHED_GRANITE_FLUTED_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.DIORITE_FLUTED_FACADE), new BlockItem(DIORITE_FLUTED_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_DIORITE_FLUTED_FACADE), new BlockItem(POLISHED_DIORITE_FLUTED_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.ANDESITE_FLUTED_FACADE), new BlockItem(ANDESITE_FLUTED_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_ANDESITE_FLUTED_FACADE), new BlockItem(POLISHED_ANDESITE_FLUTED_FACADE, new FabricItemSettings().group(ITEM_GROUP)));

        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.BLACKSTONE_FLUTED_FACADE), new BlockItem(BLACKSTONE_FLUTED_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_BLACKSTONE_FLUTED_FACADE), new BlockItem(POLISHED_BLACKSTONE_FLUTED_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_POLISHED_BLACKSTONE_FLUTED_FACADE), new BlockItem(CHISELED_POLISHED_BLACKSTONE_FLUTED_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.GILDED_BLACKSTONE_FLUTED_FACADE), new BlockItem(GILDED_BLACKSTONE_FLUTED_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_BLACKSTONE_BRICKS_FLUTED_FACADE), new BlockItem(POLISHED_BLACKSTONE_BRICKS_FLUTED_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CRACKED_POLISHED_BLACKSTONE_BRICKS_FLUTED_FACADE), new BlockItem(CRACKED_POLISHED_BLACKSTONE_BRICKS_FLUTED_FACADE, new FabricItemSettings().group(ITEM_GROUP)));

        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.DEEPSLATE_FLUTED_FACADE), new BlockItem(DEEPSLATE_FLUTED_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.DEEPSLATE_BRICKS_FLUTED_FACADE), new BlockItem(DEEPSLATE_BRICKS_FLUTED_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.DEEPSLATE_TILES_FLUTED_FACADE), new BlockItem(DEEPSLATE_TILES_FLUTED_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_DEEPSLATE_FLUTED_FACADE), new BlockItem(POLISHED_DEEPSLATE_FLUTED_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_DEEPSLATE_FLUTED_FACADE), new BlockItem(CHISELED_DEEPSLATE_FLUTED_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CRACKED_DEEPSLATE_BRICKS_FLUTED_FACADE), new BlockItem(CRACKED_DEEPSLATE_BRICKS_FLUTED_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CRACKED_DEEPSLATE_TILES_FLUTED_FACADE), new BlockItem(CRACKED_DEEPSLATE_TILES_FLUTED_FACADE, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.COBBLED_DEEPSLATE_FLUTED_FACADE), new BlockItem(COBBLED_DEEPSLATE_FLUTED_FACADE, new FabricItemSettings().group(ITEM_GROUP)));

        // sill
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.STONE_SILL), new BlockItem(STONE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.SMOOTH_STONE_SILL), new BlockItem(SMOOTH_STONE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.COBBLESTONE_SILL), new BlockItem(COBBLESTONE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.MOSSY_COBBLESTONE_SILL), new BlockItem(MOSSY_COBBLESTONE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.BRICKS_SILL), new BlockItem(BRICKS_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.STONE_BRICKS_SILL), new BlockItem(STONE_BRICKS_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.MOSSY_STONE_BRICKS_SILL), new BlockItem(MOSSY_STONE_BRICKS_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CRACKED_STONE_BRICKS_SILL), new BlockItem(CRACKED_STONE_BRICKS_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_STONE_BRICKS_SILL), new BlockItem(CHISELED_STONE_BRICKS_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.OBSIDIAN_SILL), new BlockItem(OBSIDIAN_SILL, new FabricItemSettings().group(ITEM_GROUP)));

        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.SANDSTONE_SILL), new BlockItem(SANDSTONE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.SMOOTH_SANDSTONE_SILL), new BlockItem(SMOOTH_SANDSTONE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_SANDSTONE_SILL), new BlockItem(CHISELED_SANDSTONE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CUT_SANDSTONE_SILL), new BlockItem(CUT_SANDSTONE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.RED_SANDSTONE_SILL), new BlockItem(RED_SANDSTONE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.SMOOTH_RED_SANDSTONE_SILL), new BlockItem(SMOOTH_RED_SANDSTONE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_RED_SANDSTONE_SILL), new BlockItem(CHISELED_RED_SANDSTONE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CUT_RED_SANDSTONE_SILL), new BlockItem(CUT_RED_SANDSTONE_SILL, new FabricItemSettings().group(ITEM_GROUP)));

        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.GRANITE_SILL), new BlockItem(GRANITE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_GRANITE_SILL), new BlockItem(POLISHED_GRANITE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.DIORITE_SILL), new BlockItem(DIORITE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_DIORITE_SILL), new BlockItem(POLISHED_DIORITE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.ANDESITE_SILL), new BlockItem(ANDESITE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_ANDESITE_SILL), new BlockItem(POLISHED_ANDESITE_SILL, new FabricItemSettings().group(ITEM_GROUP)));

        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.BLACKSTONE_SILL), new BlockItem(BLACKSTONE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_BLACKSTONE_SILL), new BlockItem(POLISHED_BLACKSTONE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_POLISHED_BLACKSTONE_SILL), new BlockItem(CHISELED_POLISHED_BLACKSTONE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.GILDED_BLACKSTONE_SILL), new BlockItem(GILDED_BLACKSTONE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_BLACKSTONE_BRICKS_SILL), new BlockItem(POLISHED_BLACKSTONE_BRICKS_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CRACKED_POLISHED_BLACKSTONE_BRICKS_SILL), new BlockItem(CRACKED_POLISHED_BLACKSTONE_BRICKS_SILL, new FabricItemSettings().group(ITEM_GROUP)));

        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.DEEPSLATE_SILL), new BlockItem(DEEPSLATE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.DEEPSLATE_BRICKS_SILL), new BlockItem(DEEPSLATE_BRICKS_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.DEEPSLATE_TILES_SILL), new BlockItem(DEEPSLATE_TILES_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_DEEPSLATE_SILL), new BlockItem(POLISHED_DEEPSLATE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_DEEPSLATE_SILL), new BlockItem(CHISELED_DEEPSLATE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CRACKED_DEEPSLATE_BRICKS_SILL), new BlockItem(CRACKED_DEEPSLATE_BRICKS_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CRACKED_DEEPSLATE_TILES_SILL), new BlockItem(CRACKED_DEEPSLATE_TILES_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.COBBLED_DEEPSLATE_SILL), new BlockItem(COBBLED_DEEPSLATE_SILL, new FabricItemSettings().group(ITEM_GROUP)));

        // double sill
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.STONE_DOUBLE_SILL), new BlockItem(STONE_DOUBLE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.SMOOTH_STONE_DOUBLE_SILL), new BlockItem(SMOOTH_STONE_DOUBLE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.COBBLESTONE_DOUBLE_SILL), new BlockItem(COBBLESTONE_DOUBLE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.MOSSY_COBBLESTONE_DOUBLE_SILL), new BlockItem(MOSSY_COBBLESTONE_DOUBLE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.BRICKS_DOUBLE_SILL), new BlockItem(BRICKS_DOUBLE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.STONE_BRICKS_DOUBLE_SILL), new BlockItem(STONE_BRICKS_DOUBLE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.MOSSY_STONE_BRICKS_DOUBLE_SILL), new BlockItem(MOSSY_STONE_BRICKS_DOUBLE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CRACKED_STONE_BRICKS_DOUBLE_SILL), new BlockItem(CRACKED_STONE_BRICKS_DOUBLE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_STONE_BRICKS_DOUBLE_SILL), new BlockItem(CHISELED_STONE_BRICKS_DOUBLE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.OBSIDIAN_DOUBLE_SILL), new BlockItem(OBSIDIAN_DOUBLE_SILL, new FabricItemSettings().group(ITEM_GROUP)));

        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.SANDSTONE_DOUBLE_SILL), new BlockItem(SANDSTONE_DOUBLE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.SMOOTH_SANDSTONE_DOUBLE_SILL), new BlockItem(SMOOTH_SANDSTONE_DOUBLE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_SANDSTONE_DOUBLE_SILL), new BlockItem(CHISELED_SANDSTONE_DOUBLE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CUT_SANDSTONE_DOUBLE_SILL), new BlockItem(CUT_SANDSTONE_DOUBLE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.RED_SANDSTONE_DOUBLE_SILL), new BlockItem(RED_SANDSTONE_DOUBLE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.SMOOTH_RED_SANDSTONE_DOUBLE_SILL), new BlockItem(SMOOTH_RED_SANDSTONE_DOUBLE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_RED_SANDSTONE_DOUBLE_SILL), new BlockItem(CHISELED_RED_SANDSTONE_DOUBLE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CUT_RED_SANDSTONE_DOUBLE_SILL), new BlockItem(CUT_RED_SANDSTONE_DOUBLE_SILL, new FabricItemSettings().group(ITEM_GROUP)));

        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.GRANITE_DOUBLE_SILL), new BlockItem(GRANITE_DOUBLE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_GRANITE_DOUBLE_SILL), new BlockItem(POLISHED_GRANITE_DOUBLE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.DIORITE_DOUBLE_SILL), new BlockItem(DIORITE_DOUBLE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_DIORITE_DOUBLE_SILL), new BlockItem(POLISHED_DIORITE_DOUBLE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.ANDESITE_DOUBLE_SILL), new BlockItem(ANDESITE_DOUBLE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_ANDESITE_DOUBLE_SILL), new BlockItem(POLISHED_ANDESITE_DOUBLE_SILL, new FabricItemSettings().group(ITEM_GROUP)));

        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.BLACKSTONE_DOUBLE_SILL), new BlockItem(BLACKSTONE_DOUBLE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_BLACKSTONE_DOUBLE_SILL), new BlockItem(POLISHED_BLACKSTONE_DOUBLE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_POLISHED_BLACKSTONE_DOUBLE_SILL), new BlockItem(CHISELED_POLISHED_BLACKSTONE_DOUBLE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.GILDED_BLACKSTONE_DOUBLE_SILL), new BlockItem(GILDED_BLACKSTONE_DOUBLE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_BLACKSTONE_BRICKS_DOUBLE_SILL), new BlockItem(POLISHED_BLACKSTONE_BRICKS_DOUBLE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CRACKED_POLISHED_BLACKSTONE_BRICKS_DOUBLE_SILL), new BlockItem(CRACKED_POLISHED_BLACKSTONE_BRICKS_DOUBLE_SILL, new FabricItemSettings().group(ITEM_GROUP)));

        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.DEEPSLATE_DOUBLE_SILL), new BlockItem(DEEPSLATE_DOUBLE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.DEEPSLATE_BRICKS_DOUBLE_SILL), new BlockItem(DEEPSLATE_BRICKS_DOUBLE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.DEEPSLATE_TILES_DOUBLE_SILL), new BlockItem(DEEPSLATE_TILES_DOUBLE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.POLISHED_DEEPSLATE_DOUBLE_SILL), new BlockItem(POLISHED_DEEPSLATE_DOUBLE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CHISELED_DEEPSLATE_DOUBLE_SILL), new BlockItem(CHISELED_DEEPSLATE_DOUBLE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CRACKED_DEEPSLATE_BRICKS_DOUBLE_SILL), new BlockItem(CRACKED_DEEPSLATE_BRICKS_DOUBLE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.CRACKED_DEEPSLATE_TILES_DOUBLE_SILL), new BlockItem(CRACKED_DEEPSLATE_TILES_DOUBLE_SILL, new FabricItemSettings().group(ITEM_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, ID.COBBLED_DEEPSLATE_DOUBLE_SILL), new BlockItem(COBBLED_DEEPSLATE_DOUBLE_SILL, new FabricItemSettings().group(ITEM_GROUP)));

        // cornice

        // crown molding

        // pillar base

        // pillar

        // wall sconce

        // grate
    }
}
