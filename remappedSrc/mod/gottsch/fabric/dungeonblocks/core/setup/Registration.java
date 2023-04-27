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

import mod.gottsch.fabric.dungeonblocks.core.DungeonBlocks;
import mod.gottsch.fabric.dungeonblocks.core.block.FacadeBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

/**
 * Created by Mark Gottschling on 4/25/2023
 */
public class Registration {

    /*
     * Blocks
     */

    // facade
    private static final Block STONE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.STONE));
    private static final Block  SMOOTH_STONE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE));
    private static final Block COBBLESTONE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE));
    private static final Block MOSSY_COBBLESTONE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_COBBLESTONE));
    private static final Block BRICKS_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.BRICKS));
    private static final Block STONE_BRICKS_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS));
    private static final Block MOSSY_STONE_BRICKS_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICKS));
    private static final Block CRACKED_STONE_BRICKS_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.CRACKED_STONE_BRICKS));
    private static final Block CHISELED_STONE_BRICKS_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_STONE_BRICKS));
    private static final Block OBSIDIAN_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.OBSIDIAN));

    private static final Block SANDSTONE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE));
    private static final Block SMOOTH_SANDSTONE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_SANDSTONE));
    private static final Block CHISELED_SANDSTONE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_SANDSTONE));
    private static final Block CUT_SANDSTONE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.CUT_SANDSTONE));
    private static final Block RED_SANDSTONE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.RED_SANDSTONE));
    private static final Block SMOOTH_RED_SANDSTONE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_RED_SANDSTONE));
    private static final Block CHISELED_RED_SANDSTONE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_RED_SANDSTONE));
    private static final Block CUT_RED_SANDSTONE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.CUT_RED_SANDSTONE));

    private static final Block GRANITE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.GRANITE));
    private static final Block POLISHED_GRANITE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_GRANITE));
    private static final Block DIORITE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.DIORITE));
    private static final Block POLISHED_DIORITE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_DIORITE));
    private static final Block ANDESITE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE));
    private static final Block POLISHED_ANDESITE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_ANDESITE));

    private static final Block BLACKSTONE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.BLACKSTONE));
    private static final Block POLISHED_BLACKSTONE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE));
    private static final Block CHISELED_POLISHED_BLACKSTONE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_POLISHED_BLACKSTONE));
    private static final Block GILDED_BLACKSTONE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.GILDED_BLACKSTONE));
    private static final Block POLISHED_BLACKSTONE_BRICKS_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_BLACKSTONE_BRICKS));
    private static final Block CRACKED_POLISHED_BLACKSTONE_BRICKS_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS));

    private static final Block DEEPSLATE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE));
    private static final Block DEEPSLATE_BRICKS_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS));
    private static final Block CRACKED_DEEPSLATE_BRICKS_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.CRACKED_DEEPSLATE_BRICKS));
    private static final Block COBBLED_DEEPSLATE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.COBBLED_DEEPSLATE));
    private static final Block POLISHED_DEEPSLATE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_DEEPSLATE));
    private static final Block CHISELED_DEEPSLATE_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_DEEPSLATE));
    private static final Block DEEPSLATE_TILES_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_TILES));
    private static final Block CRACKED_DEEPSLATE_TILES_FACADE = new FacadeBlock(FabricBlockSettings.copyOf(Blocks.CRACKED_DEEPSLATE_TILES));
    
    /**
     *
     */
    public static void register() {
        /*
         * register blocks
         */
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, "stone_facade_block"), STONE_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, "smooth_stone_facade_block"), SMOOTH_STONE_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, "cobblestone_facade_block"), COBBLESTONE_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, "mossy_cobblestone_facade_block"), MOSSY_COBBLESTONE_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, "bricks_facade_block"), BRICKS_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, "stone_bricks_facade_block"), STONE_BRICKS_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, "mossy_stone_bricks_facade_block"), MOSSY_STONE_BRICKS_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, "cracked_stone_bricks_facade_block"), CRACKED_STONE_BRICKS_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, "chiseled_stone_bricks_facade_block"), CHISELED_STONE_BRICKS_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, "obsidian_facade_block"), OBSIDIAN_FACADE);

        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, "sandstone_facade_block"), SANDSTONE_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, "smooth_sandstone_facade_block"), SMOOTH_SANDSTONE_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, "chiseled_sandstone_facade_block"), CHISELED_SANDSTONE_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, "cut_sandstone_facade_block"), CUT_SANDSTONE_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, "red_sandstone_facade_block"), RED_SANDSTONE_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, "smooth_red_sandstone_facade_block"), SMOOTH_RED_SANDSTONE_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, "chiseled_red_sandstone_facade_block"), CHISELED_RED_SANDSTONE_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, "cut_red_sandstone_facade_block"), CUT_RED_SANDSTONE_FACADE);

        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, "granite_facade_block"), GRANITE_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, "polished_granite_facade_block"), POLISHED_GRANITE_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, "diorite_facade_block"), DIORITE_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, "polished_diorite_facade_block"), POLISHED_DIORITE_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, "andesite_facade_block"), ANDESITE_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, "polished_andesite_facade_block"), POLISHED_ANDESITE_FACADE);

        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, "blackstone_facade_block"), BLACKSTONE_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, "polished_blackstone_facade_block"), POLISHED_BLACKSTONE_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, "chiseled_polished_blackstone_facade_block"), CHISELED_POLISHED_BLACKSTONE_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, "gilded_blackstone_facade_block"), GILDED_BLACKSTONE_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, "polished_blackstone_bricks_facade_block"), POLISHED_BLACKSTONE_BRICKS_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, "cracked_polished_blackstone_facade_block"), CRACKED_POLISHED_BLACKSTONE_BRICKS_FACADE);

        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, "deepslate_facade_block"), DEEPSLATE_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, "deepslate_bricks_facade_block"), DEEPSLATE_BRICKS_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, "deepslate_tiles_facade_block"), DEEPSLATE_TILES_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, "polished_deepslate_facade_block"), POLISHED_DEEPSLATE_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, "chiseled_deepslate_facade_block"), CHISELED_DEEPSLATE_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, "cracked_deepslate_bricks_facade_block"), CRACKED_DEEPSLATE_BRICKS_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, "cracked_deepslate_tiles_facade_block"), CRACKED_DEEPSLATE_TILES_FACADE);
        Registry.register(Registry.BLOCK, new Identifier(DungeonBlocks.MOD_ID, "cobbled_deepslate_facade_block"), COBBLED_DEEPSLATE_FACADE);

        /*
         * register items
         */
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, "stone_facade_block"), new BlockItem(STONE_FACADE, new FabricItemSettings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, "smooth_stone_facade_block"), new BlockItem(SMOOTH_STONE_FACADE, new FabricItemSettings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, "cobblestone_facade_block"), new BlockItem(COBBLESTONE_FACADE, new FabricItemSettings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, "mossy_cobblestone_facade_block"), new BlockItem(MOSSY_COBBLESTONE_FACADE, new FabricItemSettings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, "bricks_facade_block"), new BlockItem(BRICKS_FACADE, new FabricItemSettings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, "stone_bricks_facade_block"), new BlockItem(STONE_BRICKS_FACADE, new FabricItemSettings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, "mossy_stone_bricks_facade_block"), new BlockItem(MOSSY_STONE_BRICKS_FACADE, new FabricItemSettings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, "cracked_stone_bricks_facade_block"), new BlockItem(CRACKED_STONE_BRICKS_FACADE, new FabricItemSettings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, "chiseled_stone_bricks_facade_block"), new BlockItem(CHISELED_STONE_BRICKS_FACADE, new FabricItemSettings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, "obsidian_facade_block"), new BlockItem(OBSIDIAN_FACADE, new FabricItemSettings().group(ItemGroup.MISC)));

        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, "sandstone_facade_block"), new BlockItem(SANDSTONE_FACADE, new FabricItemSettings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, "smooth_sandstone_facade_block"), new BlockItem(SMOOTH_SANDSTONE_FACADE, new FabricItemSettings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, "chiseled_sandstone_facade_block"), new BlockItem(CHISELED_SANDSTONE_FACADE, new FabricItemSettings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, "cut_sandstone_facade_block"), new BlockItem(CUT_SANDSTONE_FACADE, new FabricItemSettings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, "red_sandstone_facade_block"), new BlockItem(RED_SANDSTONE_FACADE, new FabricItemSettings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, "smooth_red_sandstone_facade_block"), new BlockItem(SMOOTH_RED_SANDSTONE_FACADE, new FabricItemSettings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, "chiseled_red_sandstone_facade_block"), new BlockItem(CHISELED_RED_SANDSTONE_FACADE, new FabricItemSettings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, "cut_red_sandstone_facade_block"), new BlockItem(CUT_RED_SANDSTONE_FACADE, new FabricItemSettings().group(ItemGroup.MISC)));

        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, "granite_facade_block"), new BlockItem(GRANITE_FACADE, new FabricItemSettings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, "polished_granite_facade_block"), new BlockItem(POLISHED_GRANITE_FACADE, new FabricItemSettings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, "diorite_facade_block"), new BlockItem(DIORITE_FACADE, new FabricItemSettings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, "polished_diorite_facade_block"), new BlockItem(POLISHED_DIORITE_FACADE, new FabricItemSettings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, "andesite_facade_block"), new BlockItem(ANDESITE_FACADE, new FabricItemSettings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, "polished_andesite_facade_block"), new BlockItem(POLISHED_ANDESITE_FACADE, new FabricItemSettings().group(ItemGroup.MISC)));

        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, "blackstone_facade_block"), new BlockItem(BLACKSTONE_FACADE, new FabricItemSettings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, "polished_blackstone_facade_block"), new BlockItem(POLISHED_BLACKSTONE_FACADE, new FabricItemSettings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, "chiseled_polished_blackstone_facade_block"), new BlockItem(CHISELED_POLISHED_BLACKSTONE_FACADE, new FabricItemSettings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, "gilded_blackstone_facade_block"), new BlockItem(GILDED_BLACKSTONE_FACADE, new FabricItemSettings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, "polished_blackstone_bricks_facade_block"), new BlockItem(POLISHED_BLACKSTONE_BRICKS_FACADE, new FabricItemSettings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, "cracked_polished_blackstone_bricks_facade_block"), new BlockItem(CRACKED_POLISHED_BLACKSTONE_BRICKS_FACADE, new FabricItemSettings().group(ItemGroup.MISC)));

        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, "deepslate_facade_block"), new BlockItem(DEEPSLATE_FACADE, new FabricItemSettings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, "deepslate_bricks_facade_block"), new BlockItem(DEEPSLATE_BRICKS_FACADE, new FabricItemSettings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, "deepslate_tiles_facade_block"), new BlockItem(DEEPSLATE_TILES_FACADE, new FabricItemSettings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, "polished_deepslate_facade_block"), new BlockItem(POLISHED_DEEPSLATE_FACADE, new FabricItemSettings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, "chiseled_deepslate_facade_block"), new BlockItem(CHISELED_DEEPSLATE_FACADE, new FabricItemSettings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, "cracked_deepslate_bricks_facade_block"), new BlockItem(CRACKED_DEEPSLATE_BRICKS_FACADE, new FabricItemSettings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, "cracked_deepslate_tiles_facade_block"), new BlockItem(CRACKED_DEEPSLATE_TILES_FACADE, new FabricItemSettings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier(DungeonBlocks.MOD_ID, "cobbled_deepslate_facade_block"), new BlockItem(COBBLED_DEEPSLATE_FACADE, new FabricItemSettings().group(ItemGroup.MISC)));

//        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
//            content.addAfter(Items.OAK_DOOR, CUSTOM_ITEM);
//        });
    }


}
