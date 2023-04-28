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
package mod.gottsch.fabric.dungeonblocks.datagen;

import mod.gottsch.fabric.dungeonblocks.core.setup.Registration;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.RecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SingleItemRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Identifier;

import java.nio.file.Path;
import java.util.function.Consumer;

/**
 * Created by Mark Gottschling on 4/25/2023
 */
public class DataGeneration implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
//        fabricDataGenerator.addProvider(MyTagGenerator::new);
//        fabricDataGenerator.addProvider(MyModelGenerator::new);
        fabricDataGenerator.addProvider(MyModEnglishLangProvider::new);
        fabricDataGenerator.addProvider(MyRecipeGenerator::new);
        fabricDataGenerator.addProvider(MyBlockLootTables::new);
    }

    /**
     *
     */
//    private static class MyTagGenerator extends FabricTagProvider<Item> {
//        // We will create an item tag called "smelly_items".
//        private static final TagKey<Item> SMELLY_ITEMS = TagKey.of(Registry.ITEM_KEY, new Identifier(DungeonBlocks.MOD_ID, "smelly_items"));
//
//
//        public MyTagGenerator(FabricDataGenerator dataGenerator) {
//            super(dataGenerator, Registry.ITEM);  // for versions 1.19.2 and below, use Registry.ITEM
//        }
//
//        @Override
//        protected void generateTags() {
//            // This creates a tag builder, where we add slime balls, rotten flesh and everything in the minecraft:dirt item tag.
//            getOrCreateTagBuilder(SMELLY_ITEMS)
//                    .add(Items.SLIME_BALL)
//                    .add(Items.ROTTEN_FLESH)
//                    .addOptionalTag(ItemTags.DIRT);
//            // This will automatically generate "assets/tutorial/tags/items/smelly_items.json" in the "generated" folder.
//        }
//    }

    /**
     *
     */
//    private static class MyModelGenerator extends FabricModelProvider {
//        private MyModelGenerator(FabricDataGenerator generator) {
//            super(generator);
//        }
//
//        @Override
//        public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
////            blockStateModelGenerator.registerSimpleCubeAll(Registration.STONE_FACADE);
//            // why isn't this working?
//            blockStateModelGenerator.blockStateCollector.accept(
//                    MultipartBlockStateSupplier.create(Registration.STONE_FACADE)
//                    .with(When.create()
//                                    .set(Properties.FACING, Direction.NORTH)
//                                    .set(IFacadeShapeBlock.SHAPE, FacadeShape.STRAIGHT)
//                                    .set(Properties.WATERLOGGED, false),
//                            BlockStateVariant.create().put(VariantSettings.X, VariantSettings.Rotation.R90)));
//        }
//
//        @Override
//        public void generateItemModels(ItemModelGenerator itemModelGenerator) {
////            itemModelGenerator.register(Registration.STONE_FACADE_ITEM, Models.GENERATED);
//        }
//    }

    /**
     *
     */
    private static class MyModEnglishLangProvider extends FabricLanguageProvider {
        private MyModEnglishLangProvider(FabricDataGenerator dataGenerator) {
            // Specifying en_us is optional, by default is is en_us.
            super(dataGenerator, "en_us");
        }

        @Override
        public void generateTranslations(TranslationBuilder translationBuilder) {
            translationBuilder.add(Registration.ITEM_GROUP , "Dungeon Blocks");

            translationBuilder.add(Registration.STONE_FACADE , "Stone Facade");
            translationBuilder.add(Registration.SMOOTH_STONE_FACADE, "Smooth Stone Facade");
            translationBuilder.add(Registration.COBBLESTONE_FACADE, "Cobblestone Facade");
            translationBuilder.add(Registration.MOSSY_COBBLESTONE_FACADE, "Mossy Cobblestone Facade");
            translationBuilder.add(Registration.BRICKS_FACADE, "Bricks Facade");
            translationBuilder.add(Registration.STONE_BRICKS_FACADE, "Stone Bricks Facade");
            translationBuilder.add(Registration.MOSSY_STONE_BRICKS_FACADE, "Mossy Stone Bricks Facade");
            translationBuilder.add(Registration.CRACKED_STONE_BRICKS_FACADE, "Cracked Stone Bricks Facade");
            translationBuilder.add(Registration.CHISELED_STONE_BRICKS_FACADE, "Chiseled Stone Bricks Facade");
            translationBuilder.add(Registration.OBSIDIAN_FACADE, "Obsidian Facade");

            translationBuilder.add(Registration.SANDSTONE_FACADE, "Sandstone Facade");
            translationBuilder.add(Registration.SMOOTH_SANDSTONE_FACADE, "Smooth Sandstone Facade");
            translationBuilder.add(Registration.CHISELED_SANDSTONE_FACADE, "Chiseled Sandstone Facade");
            translationBuilder.add(Registration.CUT_SANDSTONE_FACADE, "Cut Sandstone Facade");
            translationBuilder.add(Registration.RED_SANDSTONE_FACADE, "Red Sandstone Facade");
            translationBuilder.add(Registration.SMOOTH_RED_SANDSTONE_FACADE, "Smooth Red Sandstone Facade");
            translationBuilder.add(Registration.CHISELED_RED_SANDSTONE_FACADE, "Chiseled Red Sandstone Facade");
            translationBuilder.add(Registration.CUT_RED_SANDSTONE_FACADE, "Cut Red Sandstone Facade");

            translationBuilder.add(Registration.GRANITE_FACADE, "Granite Facade");
            translationBuilder.add(Registration.POLISHED_GRANITE_FACADE, "Polished Granite Facade");
            translationBuilder.add(Registration.DIORITE_FACADE, "Diorite Facade");
            translationBuilder.add(Registration.POLISHED_DIORITE_FACADE, "Polished Diorite Facade");
            translationBuilder.add(Registration.ANDESITE_FACADE , "Andesite Facade");
            translationBuilder.add(Registration.POLISHED_ANDESITE_FACADE, "Polished Andesite Facade");

            translationBuilder.add(Registration.BLACKSTONE_FACADE, "Blackstone Facade");
            translationBuilder.add(Registration.POLISHED_BLACKSTONE_FACADE, "Polished Blackstone Facade");
            translationBuilder.add(Registration.CHISELED_POLISHED_BLACKSTONE_FACADE, "Chiseled Polished Blackstone Facade");
            translationBuilder.add(Registration.GILDED_BLACKSTONE_FACADE, "Gilded Blackstone Facade");
            translationBuilder.add(Registration.POLISHED_BLACKSTONE_BRICKS_FACADE, "Polished Blackstone Bricks Facade");
            translationBuilder.add(Registration.CRACKED_POLISHED_BLACKSTONE_BRICKS_FACADE, "Cracked Polished Blackstone Bricks Facade");

            translationBuilder.add(Registration.DEEPSLATE_FACADE, "Deepslate Facade");
            translationBuilder.add(Registration.DEEPSLATE_BRICKS_FACADE, "Deepslate Bricks Facade");
            translationBuilder.add(Registration.CRACKED_DEEPSLATE_BRICKS_FACADE, "Cracked Deepslate Bricks Facade");
            translationBuilder.add(Registration.COBBLED_DEEPSLATE_FACADE, "Cobbled Deepslate Facade");
            translationBuilder.add(Registration.POLISHED_DEEPSLATE_FACADE, "Polished Deepslate Facade");
            translationBuilder.add(Registration.CHISELED_DEEPSLATE_FACADE, "Chiseled Deepslate Facade");
            translationBuilder.add(Registration.DEEPSLATE_TILES_FACADE, "Deepslate Tiles Facade");
            translationBuilder.add(Registration.CRACKED_DEEPSLATE_TILES_FACADE, "Cracked Deepslate Tiles Facade");

            // quarter facade
            translationBuilder.add(Registration.STONE_QUARTER_FACADE , "Stone Quarter Facade");
            translationBuilder.add(Registration.SMOOTH_STONE_QUARTER_FACADE, "Smooth Stone Quarter Facade");
            translationBuilder.add(Registration.COBBLESTONE_QUARTER_FACADE, "Cobblestone Quarter Facade");
            translationBuilder.add(Registration.MOSSY_COBBLESTONE_QUARTER_FACADE, "Mossy Cobblestone Quarter Facade");
            translationBuilder.add(Registration.BRICKS_QUARTER_FACADE, "Bricks Quarter Facade");
            translationBuilder.add(Registration.STONE_BRICKS_QUARTER_FACADE, "Stone Bricks Quarter Facade");
            translationBuilder.add(Registration.MOSSY_STONE_BRICKS_QUARTER_FACADE, "Mossy Stone Bricks Quarter Facade");
            translationBuilder.add(Registration.CRACKED_STONE_BRICKS_QUARTER_FACADE, "Cracked Stone Bricks Quarter Facade");
            translationBuilder.add(Registration.CHISELED_STONE_BRICKS_QUARTER_FACADE, "Chiseled Stone Bricks Quarter Facade");
            translationBuilder.add(Registration.OBSIDIAN_QUARTER_FACADE, "Obsidian Quarter Facade");

            translationBuilder.add(Registration.SANDSTONE_QUARTER_FACADE, "Sandstone Quarter Facade");
            translationBuilder.add(Registration.SMOOTH_SANDSTONE_QUARTER_FACADE, "Smooth Sandstone Quarter Facade");
            translationBuilder.add(Registration.CHISELED_SANDSTONE_QUARTER_FACADE, "Chiseled Sandstone Quarter Facade");
            translationBuilder.add(Registration.CUT_SANDSTONE_QUARTER_FACADE, "Cut Sandstone Quarter Facade");
            translationBuilder.add(Registration.RED_SANDSTONE_QUARTER_FACADE, "Red Sandstone Quarter Facade");
            translationBuilder.add(Registration.SMOOTH_RED_SANDSTONE_QUARTER_FACADE, "Smooth Red Sandstone Quarter Facade");
            translationBuilder.add(Registration.CHISELED_RED_SANDSTONE_QUARTER_FACADE, "Chiseled Red Sandstone Quarter Facade");
            translationBuilder.add(Registration.CUT_RED_SANDSTONE_QUARTER_FACADE, "Cut Red Sandstone Quarter Facade");

            translationBuilder.add(Registration.GRANITE_QUARTER_FACADE, "Granite Quarter Facade");
            translationBuilder.add(Registration.POLISHED_GRANITE_QUARTER_FACADE, "Polished Granite Quarter Facade");
            translationBuilder.add(Registration.DIORITE_QUARTER_FACADE, "Diorite Quarter Facade");
            translationBuilder.add(Registration.POLISHED_DIORITE_QUARTER_FACADE, "Polished Diorite Quarter Facade");
            translationBuilder.add(Registration.ANDESITE_QUARTER_FACADE , "Andesite Quarter Facade");
            translationBuilder.add(Registration.POLISHED_ANDESITE_QUARTER_FACADE, "Polished Andesite Quarter Facade");

            translationBuilder.add(Registration.BLACKSTONE_QUARTER_FACADE, "Blackstone Quarter Facade");
            translationBuilder.add(Registration.POLISHED_BLACKSTONE_QUARTER_FACADE, "Polished Blackstone Quarter Facade");
            translationBuilder.add(Registration.CHISELED_POLISHED_BLACKSTONE_QUARTER_FACADE, "Chiseled Polished Blackstone Quarter Facade");
            translationBuilder.add(Registration.GILDED_BLACKSTONE_QUARTER_FACADE, "Gilded Blackstone Quarter Facade");
            translationBuilder.add(Registration.POLISHED_BLACKSTONE_BRICKS_QUARTER_FACADE, "Polished Blackstone Bricks Quarter Facade");
            translationBuilder.add(Registration.CRACKED_POLISHED_BLACKSTONE_BRICKS_QUARTER_FACADE, "Cracked Polished Blackstone Bricks Quarter Facade");

            translationBuilder.add(Registration.DEEPSLATE_QUARTER_FACADE, "Deepslate Quarter Facade");
            translationBuilder.add(Registration.DEEPSLATE_BRICKS_QUARTER_FACADE, "Deepslate Bricks Quarter Facade");
            translationBuilder.add(Registration.CRACKED_DEEPSLATE_BRICKS_QUARTER_FACADE, "Cracked Deepslate Bricks Quarter Facade");
            translationBuilder.add(Registration.COBBLED_DEEPSLATE_QUARTER_FACADE, "Cobbled Deepslate Quarter Facade");
            translationBuilder.add(Registration.POLISHED_DEEPSLATE_QUARTER_FACADE, "Polished Deepslate Quarter Facade");
            translationBuilder.add(Registration.CHISELED_DEEPSLATE_QUARTER_FACADE, "Chiseled Deepslate Quarter Facade");
            translationBuilder.add(Registration.DEEPSLATE_TILES_QUARTER_FACADE, "Deepslate Tiles Quarter Facade");
            translationBuilder.add(Registration.CRACKED_DEEPSLATE_TILES_QUARTER_FACADE, "Cracked Deepslate Tiles Quarter Facade");
            
            // fluted
            translationBuilder.add(Registration.STONE_FLUTED , "Stone Fluted");
            translationBuilder.add(Registration.SMOOTH_STONE_FLUTED, "Smooth Stone Fluted");
            translationBuilder.add(Registration.COBBLESTONE_FLUTED, "Cobblestone Fluted");
            translationBuilder.add(Registration.MOSSY_COBBLESTONE_FLUTED, "Mossy Cobblestone Fluted");
            translationBuilder.add(Registration.BRICKS_FLUTED, "Bricks Fluted");
            translationBuilder.add(Registration.STONE_BRICKS_FLUTED, "Stone Bricks Fluted");
            translationBuilder.add(Registration.MOSSY_STONE_BRICKS_FLUTED, "Mossy Stone Bricks Fluted");
            translationBuilder.add(Registration.CRACKED_STONE_BRICKS_FLUTED, "Cracked Stone Bricks Fluted");
            translationBuilder.add(Registration.CHISELED_STONE_BRICKS_FLUTED, "Chiseled Stone Bricks Fluted");
            translationBuilder.add(Registration.OBSIDIAN_FLUTED, "Obsidian Fluted");

            translationBuilder.add(Registration.SANDSTONE_FLUTED, "Sandstone Fluted");
            translationBuilder.add(Registration.SMOOTH_SANDSTONE_FLUTED, "Smooth Sandstone Fluted");
            translationBuilder.add(Registration.CHISELED_SANDSTONE_FLUTED, "Chiseled Sandstone Fluted");
            translationBuilder.add(Registration.CUT_SANDSTONE_FLUTED, "Cut Sandstone Fluted");
            translationBuilder.add(Registration.RED_SANDSTONE_FLUTED, "Red Sandstone Fluted");
            translationBuilder.add(Registration.SMOOTH_RED_SANDSTONE_FLUTED, "Smooth Red Sandstone Fluted");
            translationBuilder.add(Registration.CHISELED_RED_SANDSTONE_FLUTED, "Chiseled Red Sandstone Fluted");
            translationBuilder.add(Registration.CUT_RED_SANDSTONE_FLUTED, "Cut Red Sandstone Fluted");

            translationBuilder.add(Registration.GRANITE_FLUTED, "Granite Fluted");
            translationBuilder.add(Registration.POLISHED_GRANITE_FLUTED, "Polished Granite Fluted");
            translationBuilder.add(Registration.DIORITE_FLUTED, "Diorite Fluted");
            translationBuilder.add(Registration.POLISHED_DIORITE_FLUTED, "Polished Diorite Fluted");
            translationBuilder.add(Registration.ANDESITE_FLUTED , "Andesite Fluted");
            translationBuilder.add(Registration.POLISHED_ANDESITE_FLUTED, "Polished Andesite Fluted");

            translationBuilder.add(Registration.BLACKSTONE_FLUTED, "Blackstone Fluted");
            translationBuilder.add(Registration.POLISHED_BLACKSTONE_FLUTED, "Polished Blackstone Fluted");
            translationBuilder.add(Registration.CHISELED_POLISHED_BLACKSTONE_FLUTED, "Chiseled Polished Blackstone Fluted");
            translationBuilder.add(Registration.GILDED_BLACKSTONE_FLUTED, "Gilded Blackstone Fluted");
            translationBuilder.add(Registration.POLISHED_BLACKSTONE_BRICKS_FLUTED, "Polished Blackstone Bricks Fluted");
            translationBuilder.add(Registration.CRACKED_POLISHED_BLACKSTONE_BRICKS_FLUTED, "Cracked Polished Blackstone Bricks Fluted");

            translationBuilder.add(Registration.DEEPSLATE_FLUTED, "Deepslate Fluted");
            translationBuilder.add(Registration.DEEPSLATE_BRICKS_FLUTED, "Deepslate Bricks Fluted");
            translationBuilder.add(Registration.CRACKED_DEEPSLATE_BRICKS_FLUTED, "Cracked Deepslate Bricks Fluted");
            translationBuilder.add(Registration.COBBLED_DEEPSLATE_FLUTED, "Cobbled Deepslate Fluted");
            translationBuilder.add(Registration.POLISHED_DEEPSLATE_FLUTED, "Polished Deepslate Fluted");
            translationBuilder.add(Registration.CHISELED_DEEPSLATE_FLUTED, "Chiseled Deepslate Fluted");
            translationBuilder.add(Registration.DEEPSLATE_TILES_FLUTED, "Deepslate Tiles Fluted");
            translationBuilder.add(Registration.CRACKED_DEEPSLATE_TILES_FLUTED, "Cracked Deepslate Tiles Fluted");
            
            // fluted facade
            translationBuilder.add(Registration.STONE_FLUTED_FACADE , "Stone Fluted Facade");
            translationBuilder.add(Registration.SMOOTH_STONE_FLUTED_FACADE, "Smooth Stone Fluted Facade");
            translationBuilder.add(Registration.COBBLESTONE_FLUTED_FACADE, "Cobblestone Fluted Facade");
            translationBuilder.add(Registration.MOSSY_COBBLESTONE_FLUTED_FACADE, "Mossy Cobblestone Fluted Facade");
            translationBuilder.add(Registration.BRICKS_FLUTED_FACADE, "Bricks Fluted Facade");
            translationBuilder.add(Registration.STONE_BRICKS_FLUTED_FACADE, "Stone Bricks Fluted Facade");
            translationBuilder.add(Registration.MOSSY_STONE_BRICKS_FLUTED_FACADE, "Mossy Stone Bricks Fluted Facade");
            translationBuilder.add(Registration.CRACKED_STONE_BRICKS_FLUTED_FACADE, "Cracked Stone Bricks Fluted Facade");
            translationBuilder.add(Registration.CHISELED_STONE_BRICKS_FLUTED_FACADE, "Chiseled Stone Bricks Fluted Facade");
            translationBuilder.add(Registration.OBSIDIAN_FLUTED_FACADE, "Obsidian Fluted Facade");

            translationBuilder.add(Registration.SANDSTONE_FLUTED_FACADE, "Sandstone Fluted Facade");
            translationBuilder.add(Registration.SMOOTH_SANDSTONE_FLUTED_FACADE, "Smooth Sandstone Fluted Facade");
            translationBuilder.add(Registration.CHISELED_SANDSTONE_FLUTED_FACADE, "Chiseled Sandstone Fluted Facade");
            translationBuilder.add(Registration.CUT_SANDSTONE_FLUTED_FACADE, "Cut Sandstone Fluted Facade");
            translationBuilder.add(Registration.RED_SANDSTONE_FLUTED_FACADE, "Red Sandstone Fluted Facade");
            translationBuilder.add(Registration.SMOOTH_RED_SANDSTONE_FLUTED_FACADE, "Smooth Red Sandstone Fluted Facade");
            translationBuilder.add(Registration.CHISELED_RED_SANDSTONE_FLUTED_FACADE, "Chiseled Red Sandstone Fluted Facade");
            translationBuilder.add(Registration.CUT_RED_SANDSTONE_FLUTED_FACADE, "Cut Red Sandstone Fluted Facade");

            translationBuilder.add(Registration.GRANITE_FLUTED_FACADE, "Granite Fluted Facade");
            translationBuilder.add(Registration.POLISHED_GRANITE_FLUTED_FACADE, "Polished Granite Fluted Facade");
            translationBuilder.add(Registration.DIORITE_FLUTED_FACADE, "Diorite Fluted Facade");
            translationBuilder.add(Registration.POLISHED_DIORITE_FLUTED_FACADE, "Polished Diorite Fluted Facade");
            translationBuilder.add(Registration.ANDESITE_FLUTED_FACADE , "Andesite Fluted Facade");
            translationBuilder.add(Registration.POLISHED_ANDESITE_FLUTED_FACADE, "Polished Andesite Fluted Facade");

            translationBuilder.add(Registration.BLACKSTONE_FLUTED_FACADE, "Blackstone Fluted Facade");
            translationBuilder.add(Registration.POLISHED_BLACKSTONE_FLUTED_FACADE, "Polished Blackstone Fluted Facade");
            translationBuilder.add(Registration.CHISELED_POLISHED_BLACKSTONE_FLUTED_FACADE, "Chiseled Polished Blackstone Fluted Facade");
            translationBuilder.add(Registration.GILDED_BLACKSTONE_FLUTED_FACADE, "Gilded Blackstone Fluted Facade");
            translationBuilder.add(Registration.POLISHED_BLACKSTONE_BRICKS_FLUTED_FACADE, "Polished Blackstone Bricks Fluted Facade");
            translationBuilder.add(Registration.CRACKED_POLISHED_BLACKSTONE_BRICKS_FLUTED_FACADE, "Cracked Polished Blackstone Bricks Fluted Facade");

            translationBuilder.add(Registration.DEEPSLATE_FLUTED_FACADE, "Deepslate Fluted Facade");
            translationBuilder.add(Registration.DEEPSLATE_BRICKS_FLUTED_FACADE, "Deepslate Bricks Fluted Facade");
            translationBuilder.add(Registration.CRACKED_DEEPSLATE_BRICKS_FLUTED_FACADE, "Cracked Deepslate Bricks Fluted Facade");
            translationBuilder.add(Registration.COBBLED_DEEPSLATE_FLUTED_FACADE, "Cobbled Deepslate Fluted Facade");
            translationBuilder.add(Registration.POLISHED_DEEPSLATE_FLUTED_FACADE, "Polished Deepslate Fluted Facade");
            translationBuilder.add(Registration.CHISELED_DEEPSLATE_FLUTED_FACADE, "Chiseled Deepslate Fluted Facade");
            translationBuilder.add(Registration.DEEPSLATE_TILES_FLUTED_FACADE, "Deepslate Tiles Fluted Facade");
            translationBuilder.add(Registration.CRACKED_DEEPSLATE_TILES_FLUTED_FACADE, "Cracked Deepslate Tiles Fluted Facade");
            
            // sill
            translationBuilder.add(Registration.STONE_SILL , "Stone Sill");
            translationBuilder.add(Registration.SMOOTH_STONE_SILL, "Smooth Stone Sill");
            translationBuilder.add(Registration.COBBLESTONE_SILL, "Cobblestone Sill");
            translationBuilder.add(Registration.MOSSY_COBBLESTONE_SILL, "Mossy Cobblestone Sill");
            translationBuilder.add(Registration.BRICKS_SILL, "Bricks Sill");
            translationBuilder.add(Registration.STONE_BRICKS_SILL, "Stone Bricks Sill");
            translationBuilder.add(Registration.MOSSY_STONE_BRICKS_SILL, "Mossy Stone Bricks Sill");
            translationBuilder.add(Registration.CRACKED_STONE_BRICKS_SILL, "Cracked Stone Bricks Sill");
            translationBuilder.add(Registration.CHISELED_STONE_BRICKS_SILL, "Chiseled Stone Bricks Sill");
            translationBuilder.add(Registration.OBSIDIAN_SILL, "Obsidian Sill");

            translationBuilder.add(Registration.SANDSTONE_SILL, "Sandstone Sill");
            translationBuilder.add(Registration.SMOOTH_SANDSTONE_SILL, "Smooth Sandstone Sill");
            translationBuilder.add(Registration.CHISELED_SANDSTONE_SILL, "Chiseled Sandstone Sill");
            translationBuilder.add(Registration.CUT_SANDSTONE_SILL, "Cut Sandstone Sill");
            translationBuilder.add(Registration.RED_SANDSTONE_SILL, "Red Sandstone Sill");
            translationBuilder.add(Registration.SMOOTH_RED_SANDSTONE_SILL, "Smooth Red Sandstone Sill");
            translationBuilder.add(Registration.CHISELED_RED_SANDSTONE_SILL, "Chiseled Red Sandstone Sill");
            translationBuilder.add(Registration.CUT_RED_SANDSTONE_SILL, "Cut Red Sandstone Sill");

            translationBuilder.add(Registration.GRANITE_SILL, "Granite Sill");
            translationBuilder.add(Registration.POLISHED_GRANITE_SILL, "Polished Granite Sill");
            translationBuilder.add(Registration.DIORITE_SILL, "Diorite Sill");
            translationBuilder.add(Registration.POLISHED_DIORITE_SILL, "Polished Diorite Sill");
            translationBuilder.add(Registration.ANDESITE_SILL , "Andesite Sill");
            translationBuilder.add(Registration.POLISHED_ANDESITE_SILL, "Polished Andesite Sill");

            translationBuilder.add(Registration.BLACKSTONE_SILL, "Blackstone Sill");
            translationBuilder.add(Registration.POLISHED_BLACKSTONE_SILL, "Polished Blackstone Sill");
            translationBuilder.add(Registration.CHISELED_POLISHED_BLACKSTONE_SILL, "Chiseled Polished Blackstone Sill");
            translationBuilder.add(Registration.GILDED_BLACKSTONE_SILL, "Gilded Blackstone Sill");
            translationBuilder.add(Registration.POLISHED_BLACKSTONE_BRICKS_SILL, "Polished Blackstone Bricks Sill");
            translationBuilder.add(Registration.CRACKED_POLISHED_BLACKSTONE_BRICKS_SILL, "Cracked Polished Blackstone Bricks Sill");

            translationBuilder.add(Registration.DEEPSLATE_SILL, "Deepslate Sill");
            translationBuilder.add(Registration.DEEPSLATE_BRICKS_SILL, "Deepslate Bricks Sill");
            translationBuilder.add(Registration.CRACKED_DEEPSLATE_BRICKS_SILL, "Cracked Deepslate Bricks Sill");
            translationBuilder.add(Registration.COBBLED_DEEPSLATE_SILL, "Cobbled Deepslate Sill");
            translationBuilder.add(Registration.POLISHED_DEEPSLATE_SILL, "Polished Deepslate Sill");
            translationBuilder.add(Registration.CHISELED_DEEPSLATE_SILL, "Chiseled Deepslate Sill");
            translationBuilder.add(Registration.DEEPSLATE_TILES_SILL, "Deepslate Tiles Sill");
            translationBuilder.add(Registration.CRACKED_DEEPSLATE_TILES_SILL, "Cracked Deepslate Tiles Sill");
            
            // double sill
            translationBuilder.add(Registration.STONE_DOUBLE_SILL , "Stone Double Sill");
            translationBuilder.add(Registration.SMOOTH_STONE_DOUBLE_SILL, "Smooth Stone Double Sill");
            translationBuilder.add(Registration.COBBLESTONE_DOUBLE_SILL, "Cobblestone Double Sill");
            translationBuilder.add(Registration.MOSSY_COBBLESTONE_DOUBLE_SILL, "Mossy Cobblestone Double Sill");
            translationBuilder.add(Registration.BRICKS_DOUBLE_SILL, "Bricks Double Sill");
            translationBuilder.add(Registration.STONE_BRICKS_DOUBLE_SILL, "Stone Bricks Double Sill");
            translationBuilder.add(Registration.MOSSY_STONE_BRICKS_DOUBLE_SILL, "Mossy Stone Bricks Double Sill");
            translationBuilder.add(Registration.CRACKED_STONE_BRICKS_DOUBLE_SILL, "Cracked Stone Bricks Double Sill");
            translationBuilder.add(Registration.CHISELED_STONE_BRICKS_DOUBLE_SILL, "Chiseled Stone Bricks Double Sill");
            translationBuilder.add(Registration.OBSIDIAN_DOUBLE_SILL, "Obsidian Double Sill");

            translationBuilder.add(Registration.SANDSTONE_DOUBLE_SILL, "Sandstone Double Sill");
            translationBuilder.add(Registration.SMOOTH_SANDSTONE_DOUBLE_SILL, "Smooth Sandstone Double Sill");
            translationBuilder.add(Registration.CHISELED_SANDSTONE_DOUBLE_SILL, "Chiseled Sandstone Double Sill");
            translationBuilder.add(Registration.CUT_SANDSTONE_DOUBLE_SILL, "Cut Sandstone Double Sill");
            translationBuilder.add(Registration.RED_SANDSTONE_DOUBLE_SILL, "Red Sandstone Double Sill");
            translationBuilder.add(Registration.SMOOTH_RED_SANDSTONE_DOUBLE_SILL, "Smooth Red Sandstone Double Sill");
            translationBuilder.add(Registration.CHISELED_RED_SANDSTONE_DOUBLE_SILL, "Chiseled Red Sandstone Double Sill");
            translationBuilder.add(Registration.CUT_RED_SANDSTONE_DOUBLE_SILL, "Cut Red Sandstone Double Sill");

            translationBuilder.add(Registration.GRANITE_DOUBLE_SILL, "Granite Double Sill");
            translationBuilder.add(Registration.POLISHED_GRANITE_DOUBLE_SILL, "Polished Granite Double Sill");
            translationBuilder.add(Registration.DIORITE_DOUBLE_SILL, "Diorite Double Sill");
            translationBuilder.add(Registration.POLISHED_DIORITE_DOUBLE_SILL, "Polished Diorite Double Sill");
            translationBuilder.add(Registration.ANDESITE_DOUBLE_SILL , "Andesite Double Sill");
            translationBuilder.add(Registration.POLISHED_ANDESITE_DOUBLE_SILL, "Polished Andesite Double Sill");

            translationBuilder.add(Registration.BLACKSTONE_DOUBLE_SILL, "Blackstone Double Sill");
            translationBuilder.add(Registration.POLISHED_BLACKSTONE_DOUBLE_SILL, "Polished Blackstone Double Sill");
            translationBuilder.add(Registration.CHISELED_POLISHED_BLACKSTONE_DOUBLE_SILL, "Chiseled Polished Blackstone Double Sill");
            translationBuilder.add(Registration.GILDED_BLACKSTONE_DOUBLE_SILL, "Gilded Blackstone Double Sill");
            translationBuilder.add(Registration.POLISHED_BLACKSTONE_BRICKS_DOUBLE_SILL, "Polished Blackstone Bricks Double Sill");
            translationBuilder.add(Registration.CRACKED_POLISHED_BLACKSTONE_BRICKS_DOUBLE_SILL, "Cracked Polished Blackstone Bricks Double Sill");

            translationBuilder.add(Registration.DEEPSLATE_DOUBLE_SILL, "Deepslate Double Sill");
            translationBuilder.add(Registration.DEEPSLATE_BRICKS_DOUBLE_SILL, "Deepslate Bricks Double Sill");
            translationBuilder.add(Registration.CRACKED_DEEPSLATE_BRICKS_DOUBLE_SILL, "Cracked Deepslate Bricks Double Sill");
            translationBuilder.add(Registration.COBBLED_DEEPSLATE_DOUBLE_SILL, "Cobbled Deepslate Double Sill");
            translationBuilder.add(Registration.POLISHED_DEEPSLATE_DOUBLE_SILL, "Polished Deepslate Double Sill");
            translationBuilder.add(Registration.CHISELED_DEEPSLATE_DOUBLE_SILL, "Chiseled Deepslate Double Sill");
            translationBuilder.add(Registration.DEEPSLATE_TILES_DOUBLE_SILL, "Deepslate Tiles Double Sill");
            translationBuilder.add(Registration.CRACKED_DEEPSLATE_TILES_DOUBLE_SILL, "Cracked Deepslate Tiles Double Sill");
            
            // cornice
            translationBuilder.add(Registration.STONE_CORNICE , "Stone Cornice");
            translationBuilder.add(Registration.SMOOTH_STONE_CORNICE, "Smooth Stone Cornice");
            translationBuilder.add(Registration.COBBLESTONE_CORNICE, "Cobblestone Cornice");
            translationBuilder.add(Registration.MOSSY_COBBLESTONE_CORNICE, "Mossy Cobblestone Cornice");
            translationBuilder.add(Registration.BRICKS_CORNICE, "Bricks Cornice");
            translationBuilder.add(Registration.STONE_BRICKS_CORNICE, "Stone Bricks Cornice");
            translationBuilder.add(Registration.MOSSY_STONE_BRICKS_CORNICE, "Mossy Stone Bricks Cornice");
            translationBuilder.add(Registration.CRACKED_STONE_BRICKS_CORNICE, "Cracked Stone Bricks Cornice");
            translationBuilder.add(Registration.CHISELED_STONE_BRICKS_CORNICE, "Chiseled Stone Bricks Cornice");
            translationBuilder.add(Registration.OBSIDIAN_CORNICE, "Obsidian Cornice");

            translationBuilder.add(Registration.SANDSTONE_CORNICE, "Sandstone Cornice");
            translationBuilder.add(Registration.SMOOTH_SANDSTONE_CORNICE, "Smooth Sandstone Cornice");
            translationBuilder.add(Registration.CHISELED_SANDSTONE_CORNICE, "Chiseled Sandstone Cornice");
            translationBuilder.add(Registration.CUT_SANDSTONE_CORNICE, "Cut Sandstone Cornice");
            translationBuilder.add(Registration.RED_SANDSTONE_CORNICE, "Red Sandstone Cornice");
            translationBuilder.add(Registration.SMOOTH_RED_SANDSTONE_CORNICE, "Smooth Red Sandstone Cornice");
            translationBuilder.add(Registration.CHISELED_RED_SANDSTONE_CORNICE, "Chiseled Red Sandstone Cornice");
            translationBuilder.add(Registration.CUT_RED_SANDSTONE_CORNICE, "Cut Red Sandstone Cornice");

            translationBuilder.add(Registration.GRANITE_CORNICE, "Granite Cornice");
            translationBuilder.add(Registration.POLISHED_GRANITE_CORNICE, "Polished Granite Cornice");
            translationBuilder.add(Registration.DIORITE_CORNICE, "Diorite Cornice");
            translationBuilder.add(Registration.POLISHED_DIORITE_CORNICE, "Polished Diorite Cornice");
            translationBuilder.add(Registration.ANDESITE_CORNICE , "Andesite Cornice");
            translationBuilder.add(Registration.POLISHED_ANDESITE_CORNICE, "Polished Andesite Cornice");

            translationBuilder.add(Registration.BLACKSTONE_CORNICE, "Blackstone Cornice");
            translationBuilder.add(Registration.POLISHED_BLACKSTONE_CORNICE, "Polished Blackstone Cornice");
            translationBuilder.add(Registration.CHISELED_POLISHED_BLACKSTONE_CORNICE, "Chiseled Polished Blackstone Cornice");
            translationBuilder.add(Registration.GILDED_BLACKSTONE_CORNICE, "Gilded Blackstone Cornice");
            translationBuilder.add(Registration.POLISHED_BLACKSTONE_BRICKS_CORNICE, "Polished Blackstone Bricks Cornice");
            translationBuilder.add(Registration.CRACKED_POLISHED_BLACKSTONE_BRICKS_CORNICE, "Cracked Polished Blackstone Bricks Cornice");

            translationBuilder.add(Registration.DEEPSLATE_CORNICE, "Deepslate Cornice");
            translationBuilder.add(Registration.DEEPSLATE_BRICKS_CORNICE, "Deepslate Bricks Cornice");
            translationBuilder.add(Registration.CRACKED_DEEPSLATE_BRICKS_CORNICE, "Cracked Deepslate Bricks Cornice");
            translationBuilder.add(Registration.COBBLED_DEEPSLATE_CORNICE, "Cobbled Deepslate Cornice");
            translationBuilder.add(Registration.POLISHED_DEEPSLATE_CORNICE, "Polished Deepslate Cornice");
            translationBuilder.add(Registration.CHISELED_DEEPSLATE_CORNICE, "Chiseled Deepslate Cornice");
            translationBuilder.add(Registration.DEEPSLATE_TILES_CORNICE, "Deepslate Tiles Cornice");
            translationBuilder.add(Registration.CRACKED_DEEPSLATE_TILES_CORNICE, "Cracked Deepslate Tiles Cornice");
            
            // crown molding
            translationBuilder.add(Registration.STONE_CROWN_MOLDING , "Stone Crown Molding");
            translationBuilder.add(Registration.SMOOTH_STONE_CROWN_MOLDING, "Smooth Stone Crown Molding");
            translationBuilder.add(Registration.COBBLESTONE_CROWN_MOLDING, "Cobblestone Crown Molding");
            translationBuilder.add(Registration.MOSSY_COBBLESTONE_CROWN_MOLDING, "Mossy Cobblestone Crown Molding");
            translationBuilder.add(Registration.BRICKS_CROWN_MOLDING, "Bricks Crown Molding");
            translationBuilder.add(Registration.STONE_BRICKS_CROWN_MOLDING, "Stone Bricks Crown Molding");
            translationBuilder.add(Registration.MOSSY_STONE_BRICKS_CROWN_MOLDING, "Mossy Stone Bricks Crown Molding");
            translationBuilder.add(Registration.CRACKED_STONE_BRICKS_CROWN_MOLDING, "Cracked Stone Bricks Crown Molding");
            translationBuilder.add(Registration.CHISELED_STONE_BRICKS_CROWN_MOLDING, "Chiseled Stone Bricks Crown Molding");
            translationBuilder.add(Registration.OBSIDIAN_CROWN_MOLDING, "Obsidian Crown Molding");

            translationBuilder.add(Registration.SANDSTONE_CROWN_MOLDING, "Sandstone Crown Molding");
            translationBuilder.add(Registration.SMOOTH_SANDSTONE_CROWN_MOLDING, "Smooth Sandstone Crown Molding");
            translationBuilder.add(Registration.CHISELED_SANDSTONE_CROWN_MOLDING, "Chiseled Sandstone Crown Molding");
            translationBuilder.add(Registration.CUT_SANDSTONE_CROWN_MOLDING, "Cut Sandstone Crown Molding");
            translationBuilder.add(Registration.RED_SANDSTONE_CROWN_MOLDING, "Red Sandstone Crown Molding");
            translationBuilder.add(Registration.SMOOTH_RED_SANDSTONE_CROWN_MOLDING, "Smooth Red Sandstone Crown Molding");
            translationBuilder.add(Registration.CHISELED_RED_SANDSTONE_CROWN_MOLDING, "Chiseled Red Sandstone Crown Molding");
            translationBuilder.add(Registration.CUT_RED_SANDSTONE_CROWN_MOLDING, "Cut Red Sandstone Crown Molding");

            translationBuilder.add(Registration.GRANITE_CROWN_MOLDING, "Granite Crown Molding");
            translationBuilder.add(Registration.POLISHED_GRANITE_CROWN_MOLDING, "Polished Granite Crown Molding");
            translationBuilder.add(Registration.DIORITE_CROWN_MOLDING, "Diorite Crown Molding");
            translationBuilder.add(Registration.POLISHED_DIORITE_CROWN_MOLDING, "Polished Diorite Crown Molding");
            translationBuilder.add(Registration.ANDESITE_CROWN_MOLDING , "Andesite Crown Molding");
            translationBuilder.add(Registration.POLISHED_ANDESITE_CROWN_MOLDING, "Polished Andesite Crown Molding");

            translationBuilder.add(Registration.BLACKSTONE_CROWN_MOLDING, "Blackstone Crown Molding");
            translationBuilder.add(Registration.POLISHED_BLACKSTONE_CROWN_MOLDING, "Polished Blackstone Crown Molding");
            translationBuilder.add(Registration.CHISELED_POLISHED_BLACKSTONE_CROWN_MOLDING, "Chiseled Polished Blackstone Crown Molding");
            translationBuilder.add(Registration.GILDED_BLACKSTONE_CROWN_MOLDING, "Gilded Blackstone Crown Molding");
            translationBuilder.add(Registration.POLISHED_BLACKSTONE_BRICKS_CROWN_MOLDING, "Polished Blackstone Bricks Crown Molding");
            translationBuilder.add(Registration.CRACKED_POLISHED_BLACKSTONE_BRICKS_CROWN_MOLDING, "Cracked Polished Blackstone Bricks Crown Molding");

            translationBuilder.add(Registration.DEEPSLATE_CROWN_MOLDING, "Deepslate Crown Molding");
            translationBuilder.add(Registration.DEEPSLATE_BRICKS_CROWN_MOLDING, "Deepslate Bricks Crown Molding");
            translationBuilder.add(Registration.CRACKED_DEEPSLATE_BRICKS_CROWN_MOLDING, "Cracked Deepslate Bricks Crown Molding");
            translationBuilder.add(Registration.COBBLED_DEEPSLATE_CROWN_MOLDING, "Cobbled Deepslate Crown Molding");
            translationBuilder.add(Registration.POLISHED_DEEPSLATE_CROWN_MOLDING, "Polished Deepslate Crown Molding");
            translationBuilder.add(Registration.CHISELED_DEEPSLATE_CROWN_MOLDING, "Chiseled Deepslate Crown Molding");
            translationBuilder.add(Registration.DEEPSLATE_TILES_CROWN_MOLDING, "Deepslate Tiles Crown Molding");
            translationBuilder.add(Registration.CRACKED_DEEPSLATE_TILES_CROWN_MOLDING, "Cracked Deepslate Tiles Crown Molding");
            
            // pillar base
            translationBuilder.add(Registration.STONE_PILLAR_BASE , "Stone Pillar Base");
            translationBuilder.add(Registration.SMOOTH_STONE_PILLAR_BASE, "Smooth Stone Pillar Base");
            translationBuilder.add(Registration.COBBLESTONE_PILLAR_BASE, "Cobblestone Pillar Base");
            translationBuilder.add(Registration.MOSSY_COBBLESTONE_PILLAR_BASE, "Mossy Cobblestone Pillar Base");
            translationBuilder.add(Registration.BRICKS_PILLAR_BASE, "Bricks Pillar Base");
            translationBuilder.add(Registration.STONE_BRICKS_PILLAR_BASE, "Stone Bricks Pillar Base");
            translationBuilder.add(Registration.MOSSY_STONE_BRICKS_PILLAR_BASE, "Mossy Stone Bricks Pillar Base");
            translationBuilder.add(Registration.CRACKED_STONE_BRICKS_PILLAR_BASE, "Cracked Stone Bricks Pillar Base");
            translationBuilder.add(Registration.CHISELED_STONE_BRICKS_PILLAR_BASE, "Chiseled Stone Bricks Pillar Base");
            translationBuilder.add(Registration.OBSIDIAN_PILLAR_BASE, "Obsidian Pillar Base");

            translationBuilder.add(Registration.SANDSTONE_PILLAR_BASE, "Sandstone Pillar Base");
            translationBuilder.add(Registration.SMOOTH_SANDSTONE_PILLAR_BASE, "Smooth Sandstone Pillar Base");
            translationBuilder.add(Registration.CHISELED_SANDSTONE_PILLAR_BASE, "Chiseled Sandstone Pillar Base");
            translationBuilder.add(Registration.CUT_SANDSTONE_PILLAR_BASE, "Cut Sandstone Pillar Base");
            translationBuilder.add(Registration.RED_SANDSTONE_PILLAR_BASE, "Red Sandstone Pillar Base");
            translationBuilder.add(Registration.SMOOTH_RED_SANDSTONE_PILLAR_BASE, "Smooth Red Sandstone Pillar Base");
            translationBuilder.add(Registration.CHISELED_RED_SANDSTONE_PILLAR_BASE, "Chiseled Red Sandstone Pillar Base");
            translationBuilder.add(Registration.CUT_RED_SANDSTONE_PILLAR_BASE, "Cut Red Sandstone Pillar Base");

            translationBuilder.add(Registration.GRANITE_PILLAR_BASE, "Granite Pillar Base");
            translationBuilder.add(Registration.POLISHED_GRANITE_PILLAR_BASE, "Polished Granite Pillar Base");
            translationBuilder.add(Registration.DIORITE_PILLAR_BASE, "Diorite Pillar Base");
            translationBuilder.add(Registration.POLISHED_DIORITE_PILLAR_BASE, "Polished Diorite Pillar Base");
            translationBuilder.add(Registration.ANDESITE_PILLAR_BASE , "Andesite Pillar Base");
            translationBuilder.add(Registration.POLISHED_ANDESITE_PILLAR_BASE, "Polished Andesite Pillar Base");

            translationBuilder.add(Registration.BLACKSTONE_PILLAR_BASE, "Blackstone Pillar Base");
            translationBuilder.add(Registration.POLISHED_BLACKSTONE_PILLAR_BASE, "Polished Blackstone Pillar Base");
            translationBuilder.add(Registration.CHISELED_POLISHED_BLACKSTONE_PILLAR_BASE, "Chiseled Polished Blackstone Pillar Base");
            translationBuilder.add(Registration.GILDED_BLACKSTONE_PILLAR_BASE, "Gilded Blackstone Pillar Base");
            translationBuilder.add(Registration.POLISHED_BLACKSTONE_BRICKS_PILLAR_BASE, "Polished Blackstone Bricks Pillar Base");
            translationBuilder.add(Registration.CRACKED_POLISHED_BLACKSTONE_BRICKS_PILLAR_BASE, "Cracked Polished Blackstone Bricks Pillar Base");

            translationBuilder.add(Registration.DEEPSLATE_PILLAR_BASE, "Deepslate Pillar Base");
            translationBuilder.add(Registration.DEEPSLATE_BRICKS_PILLAR_BASE, "Deepslate Bricks Pillar Base");
            translationBuilder.add(Registration.CRACKED_DEEPSLATE_BRICKS_PILLAR_BASE, "Cracked Deepslate Bricks Pillar Base");
            translationBuilder.add(Registration.COBBLED_DEEPSLATE_PILLAR_BASE, "Cobbled Deepslate Pillar Base");
            translationBuilder.add(Registration.POLISHED_DEEPSLATE_PILLAR_BASE, "Polished Deepslate Pillar Base");
            translationBuilder.add(Registration.CHISELED_DEEPSLATE_PILLAR_BASE, "Chiseled Deepslate Pillar Base");
            translationBuilder.add(Registration.DEEPSLATE_TILES_PILLAR_BASE, "Deepslate Tiles Pillar Base");
            translationBuilder.add(Registration.CRACKED_DEEPSLATE_TILES_PILLAR_BASE, "Cracked Deepslate Tiles Pillar Base");
            
            // pillar
            translationBuilder.add(Registration.STONE_PILLAR , "Stone Pillar");
            translationBuilder.add(Registration.SMOOTH_STONE_PILLAR, "Smooth Stone Pillar");
            translationBuilder.add(Registration.COBBLESTONE_PILLAR, "Cobblestone Pillar");
            translationBuilder.add(Registration.MOSSY_COBBLESTONE_PILLAR, "Mossy Cobblestone Pillar");
            translationBuilder.add(Registration.BRICKS_PILLAR, "Bricks Pillar");
            translationBuilder.add(Registration.STONE_BRICKS_PILLAR, "Stone Bricks Pillar");
            translationBuilder.add(Registration.MOSSY_STONE_BRICKS_PILLAR, "Mossy Stone Bricks Pillar");
            translationBuilder.add(Registration.CRACKED_STONE_BRICKS_PILLAR, "Cracked Stone Bricks Pillar");
            translationBuilder.add(Registration.CHISELED_STONE_BRICKS_PILLAR, "Chiseled Stone Bricks Pillar");
            translationBuilder.add(Registration.OBSIDIAN_PILLAR, "Obsidian Pillar");

            translationBuilder.add(Registration.SANDSTONE_PILLAR, "Sandstone Pillar");
            translationBuilder.add(Registration.SMOOTH_SANDSTONE_PILLAR, "Smooth Sandstone Pillar");
            translationBuilder.add(Registration.CHISELED_SANDSTONE_PILLAR, "Chiseled Sandstone Pillar");
            translationBuilder.add(Registration.CUT_SANDSTONE_PILLAR, "Cut Sandstone Pillar");
            translationBuilder.add(Registration.RED_SANDSTONE_PILLAR, "Red Sandstone Pillar");
            translationBuilder.add(Registration.SMOOTH_RED_SANDSTONE_PILLAR, "Smooth Red Sandstone Pillar");
            translationBuilder.add(Registration.CHISELED_RED_SANDSTONE_PILLAR, "Chiseled Red Sandstone Pillar");
            translationBuilder.add(Registration.CUT_RED_SANDSTONE_PILLAR, "Cut Red Sandstone Pillar");

            translationBuilder.add(Registration.GRANITE_PILLAR, "Granite Pillar");
            translationBuilder.add(Registration.POLISHED_GRANITE_PILLAR, "Polished Granite Pillar");
            translationBuilder.add(Registration.DIORITE_PILLAR, "Diorite Pillar");
            translationBuilder.add(Registration.POLISHED_DIORITE_PILLAR, "Polished Diorite Pillar");
            translationBuilder.add(Registration.ANDESITE_PILLAR , "Andesite Pillar");
            translationBuilder.add(Registration.POLISHED_ANDESITE_PILLAR, "Polished Andesite Pillar");

            translationBuilder.add(Registration.BLACKSTONE_PILLAR, "Blackstone Pillar");
            translationBuilder.add(Registration.POLISHED_BLACKSTONE_PILLAR, "Polished Blackstone Pillar");
            translationBuilder.add(Registration.CHISELED_POLISHED_BLACKSTONE_PILLAR, "Chiseled Polished Blackstone Pillar");
            translationBuilder.add(Registration.GILDED_BLACKSTONE_PILLAR, "Gilded Blackstone Pillar");
            translationBuilder.add(Registration.POLISHED_BLACKSTONE_BRICKS_PILLAR, "Polished Blackstone Bricks Pillar");
            translationBuilder.add(Registration.CRACKED_POLISHED_BLACKSTONE_BRICKS_PILLAR, "Cracked Polished Blackstone Bricks Pillar");

            translationBuilder.add(Registration.DEEPSLATE_PILLAR, "Deepslate Pillar");
            translationBuilder.add(Registration.DEEPSLATE_BRICKS_PILLAR, "Deepslate Bricks Pillar");
            translationBuilder.add(Registration.CRACKED_DEEPSLATE_BRICKS_PILLAR, "Cracked Deepslate Bricks Pillar");
            translationBuilder.add(Registration.COBBLED_DEEPSLATE_PILLAR, "Cobbled Deepslate Pillar");
            translationBuilder.add(Registration.POLISHED_DEEPSLATE_PILLAR, "Polished Deepslate Pillar");
            translationBuilder.add(Registration.CHISELED_DEEPSLATE_PILLAR, "Chiseled Deepslate Pillar");
            translationBuilder.add(Registration.DEEPSLATE_TILES_PILLAR, "Deepslate Tiles Pillar");
            translationBuilder.add(Registration.CRACKED_DEEPSLATE_TILES_PILLAR, "Cracked Deepslate Tiles Pillar");

            // wall sconce
            translationBuilder.add(Registration.STONE_WALL_SCONCE , "Stone Wall Sconce");
            translationBuilder.add(Registration.SMOOTH_STONE_WALL_SCONCE, "Smooth Stone Wall Sconce");
            translationBuilder.add(Registration.COBBLESTONE_WALL_SCONCE, "Cobblestone Wall Sconce");
            translationBuilder.add(Registration.MOSSY_COBBLESTONE_WALL_SCONCE, "Mossy Cobblestone Wall Sconce");
            translationBuilder.add(Registration.BRICKS_WALL_SCONCE, "Bricks Wall Sconce");
            translationBuilder.add(Registration.STONE_BRICKS_WALL_SCONCE, "Stone Bricks Wall Sconce");
            translationBuilder.add(Registration.MOSSY_STONE_BRICKS_WALL_SCONCE, "Mossy Stone Bricks Wall Sconce");
            translationBuilder.add(Registration.CRACKED_STONE_BRICKS_WALL_SCONCE, "Cracked Stone Bricks Wall Sconce");
            translationBuilder.add(Registration.CHISELED_STONE_BRICKS_WALL_SCONCE, "Chiseled Stone Bricks Wall Sconce");
            translationBuilder.add(Registration.OBSIDIAN_WALL_SCONCE, "Obsidian Wall Sconce");

            translationBuilder.add(Registration.SANDSTONE_WALL_SCONCE, "Sandstone Wall Sconce");
            translationBuilder.add(Registration.SMOOTH_SANDSTONE_WALL_SCONCE, "Smooth Sandstone Wall Sconce");
            translationBuilder.add(Registration.CHISELED_SANDSTONE_WALL_SCONCE, "Chiseled Sandstone Wall Sconce");
            translationBuilder.add(Registration.CUT_SANDSTONE_WALL_SCONCE, "Cut Sandstone Wall Sconce");
            translationBuilder.add(Registration.RED_SANDSTONE_WALL_SCONCE, "Red Sandstone Wall Sconce");
            translationBuilder.add(Registration.SMOOTH_RED_SANDSTONE_WALL_SCONCE, "Smooth Red Sandstone Wall Sconce");
            translationBuilder.add(Registration.CHISELED_RED_SANDSTONE_WALL_SCONCE, "Chiseled Red Sandstone Wall Sconce");
            translationBuilder.add(Registration.CUT_RED_SANDSTONE_WALL_SCONCE, "Cut Red Sandstone Wall Sconce");

            translationBuilder.add(Registration.GRANITE_WALL_SCONCE, "Granite Wall Sconce");
            translationBuilder.add(Registration.POLISHED_GRANITE_WALL_SCONCE, "Polished Granite Wall Sconce");
            translationBuilder.add(Registration.DIORITE_WALL_SCONCE, "Diorite Wall Sconce");
            translationBuilder.add(Registration.POLISHED_DIORITE_WALL_SCONCE, "Polished Diorite Wall Sconce");
            translationBuilder.add(Registration.ANDESITE_WALL_SCONCE , "Andesite Wall Sconce");
            translationBuilder.add(Registration.POLISHED_ANDESITE_WALL_SCONCE, "Polished Andesite Wall Sconce");

            translationBuilder.add(Registration.BLACKSTONE_WALL_SCONCE, "Blackstone Wall Sconce");
            translationBuilder.add(Registration.POLISHED_BLACKSTONE_WALL_SCONCE, "Polished Blackstone Wall Sconce");
            translationBuilder.add(Registration.CHISELED_POLISHED_BLACKSTONE_WALL_SCONCE, "Chiseled Polished Blackstone Wall Sconce");
            translationBuilder.add(Registration.GILDED_BLACKSTONE_WALL_SCONCE, "Gilded Blackstone Wall Sconce");
            translationBuilder.add(Registration.POLISHED_BLACKSTONE_BRICKS_WALL_SCONCE, "Polished Blackstone Bricks Wall Sconce");
            translationBuilder.add(Registration.CRACKED_POLISHED_BLACKSTONE_BRICKS_WALL_SCONCE, "Cracked Polished Blackstone Bricks Wall Sconce");

            translationBuilder.add(Registration.DEEPSLATE_WALL_SCONCE, "Deepslate Wall Sconce");
            translationBuilder.add(Registration.DEEPSLATE_BRICKS_WALL_SCONCE, "Deepslate Bricks Wall Sconce");
            translationBuilder.add(Registration.CRACKED_DEEPSLATE_BRICKS_WALL_SCONCE, "Cracked Deepslate Bricks Wall Sconce");
            translationBuilder.add(Registration.COBBLED_DEEPSLATE_WALL_SCONCE, "Cobbled Deepslate Wall Sconce");
            translationBuilder.add(Registration.POLISHED_DEEPSLATE_WALL_SCONCE, "Polished Deepslate Wall Sconce");
            translationBuilder.add(Registration.CHISELED_DEEPSLATE_WALL_SCONCE, "Chiseled Deepslate Wall Sconce");
            translationBuilder.add(Registration.DEEPSLATE_TILES_WALL_SCONCE, "Deepslate Tiles Wall Sconce");
            translationBuilder.add(Registration.CRACKED_DEEPSLATE_TILES_WALL_SCONCE, "Cracked Deepslate Tiles Wall Sconce");

            // grate
            translationBuilder.add(Registration.GRATE, "Grate");

            // Load an existing language file.
            try {
                Path existingFilePath = dataGenerator.getModContainer().findPath("assets/dungeonblocks/lang/empty_en_us.json").get();
                translationBuilder.add(existingFilePath);
            } catch (Exception e) {
                throw new RuntimeException("Failed to add existing language file!", e);
            }
        }
    }

    /**
     *
     */
    private static class MyRecipeGenerator extends FabricRecipeProvider {

        private MyRecipeGenerator(FabricDataGenerator generator) {
            super(generator);
        }

        public static void offerMyStonecuttingRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input, int count) {
            SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(input), output, count).criterion(RecipeProvider.hasItem(input), RecipeProvider.conditionsFromItem(input))
                    .offerTo(exporter, RecipeProvider.getItemPath(output));
        }

        @Override
        protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {
            // facade
            offerStonecuttingRecipe(exporter, Registration.STONE_FACADE, Blocks.STONE, 2);
            offerStonecuttingRecipe(exporter, Registration.SMOOTH_STONE_FACADE, Blocks.SMOOTH_STONE,2);
            offerStonecuttingRecipe(exporter, Registration.COBBLESTONE_FACADE, Blocks.COBBLESTONE, 2);
            offerStonecuttingRecipe(exporter, Registration.MOSSY_COBBLESTONE_FACADE, Blocks.MOSSY_COBBLESTONE,2);
            offerStonecuttingRecipe(exporter, Registration.BRICKS_FACADE, Blocks.BRICKS, 2);
            offerStonecuttingRecipe(exporter, Registration.STONE_BRICKS_FACADE, Blocks.STONE_BRICKS,2);
            offerStonecuttingRecipe(exporter, Registration.MOSSY_STONE_BRICKS_FACADE, Blocks.MOSSY_STONE_BRICKS,2);
            offerStonecuttingRecipe(exporter, Registration.CRACKED_STONE_BRICKS_FACADE, Blocks.CRACKED_STONE_BRICKS,2);
            offerStonecuttingRecipe(exporter, Registration.CHISELED_STONE_BRICKS_FACADE, Blocks.CHISELED_STONE_BRICKS,2);
            offerStonecuttingRecipe(exporter, Registration.OBSIDIAN_FACADE, Blocks.OBSIDIAN,2);

            offerStonecuttingRecipe(exporter, Registration.SANDSTONE_FACADE, Blocks.SANDSTONE,2);
            offerStonecuttingRecipe(exporter, Registration.SMOOTH_SANDSTONE_FACADE, Blocks.SMOOTH_SANDSTONE,2);
            offerStonecuttingRecipe(exporter, Registration.CHISELED_SANDSTONE_FACADE, Blocks.CHISELED_SANDSTONE,2);
            offerStonecuttingRecipe(exporter, Registration.CUT_SANDSTONE_FACADE, Blocks.CUT_SANDSTONE,2);
            offerStonecuttingRecipe(exporter, Registration.RED_SANDSTONE_FACADE, Blocks.RED_SANDSTONE,2);
            offerStonecuttingRecipe(exporter, Registration.SMOOTH_RED_SANDSTONE_FACADE, Blocks.SMOOTH_RED_SANDSTONE,2);
            offerStonecuttingRecipe(exporter, Registration.CHISELED_RED_SANDSTONE_FACADE, Blocks.CHISELED_RED_SANDSTONE,2);
            offerStonecuttingRecipe(exporter, Registration.CUT_RED_SANDSTONE_FACADE, Blocks.CUT_RED_SANDSTONE,2);

            offerStonecuttingRecipe(exporter, Registration.GRANITE_FACADE, Blocks.GRANITE,2);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_GRANITE_FACADE, Blocks.POLISHED_GRANITE,2);
            offerStonecuttingRecipe(exporter, Registration.DIORITE_FACADE, Blocks.DIORITE,2);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_DIORITE_FACADE, Blocks.POLISHED_DIORITE,2);
            offerStonecuttingRecipe(exporter, Registration.ANDESITE_FACADE, Blocks.ANDESITE,2);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_ANDESITE_FACADE, Blocks.POLISHED_ANDESITE,2);

            offerStonecuttingRecipe(exporter, Registration.BLACKSTONE_FACADE, Blocks.BLACKSTONE,2);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_BLACKSTONE_FACADE, Blocks.POLISHED_BLACKSTONE,2);
            offerStonecuttingRecipe(exporter, Registration.CHISELED_POLISHED_BLACKSTONE_FACADE, Blocks.CHISELED_POLISHED_BLACKSTONE,2);
            offerStonecuttingRecipe(exporter, Registration.GILDED_BLACKSTONE_FACADE, Blocks.GILDED_BLACKSTONE,2);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_BLACKSTONE_BRICKS_FACADE, Blocks.POLISHED_BLACKSTONE_BRICKS,2);
            offerStonecuttingRecipe(exporter, Registration.CRACKED_POLISHED_BLACKSTONE_BRICKS_FACADE, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS,2);

            offerStonecuttingRecipe(exporter, Registration.DEEPSLATE_FACADE, Blocks.DEEPSLATE,2);
            offerStonecuttingRecipe(exporter, Registration.DEEPSLATE_BRICKS_FACADE, Blocks.DEEPSLATE_BRICKS,2);
            offerStonecuttingRecipe(exporter, Registration.CRACKED_DEEPSLATE_BRICKS_FACADE, Blocks.CRACKED_DEEPSLATE_BRICKS,2);
            offerStonecuttingRecipe(exporter, Registration.COBBLED_DEEPSLATE_FACADE, Blocks.COBBLED_DEEPSLATE,2);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_DEEPSLATE_FACADE, Blocks.POLISHED_DEEPSLATE,2);
            offerStonecuttingRecipe(exporter, Registration.CHISELED_DEEPSLATE_FACADE, Blocks.CHISELED_DEEPSLATE,2);
            offerStonecuttingRecipe(exporter, Registration.DEEPSLATE_TILES_FACADE, Blocks.DEEPSLATE_TILES,2);
            offerStonecuttingRecipe(exporter, Registration.CRACKED_DEEPSLATE_TILES_FACADE, Blocks.CRACKED_DEEPSLATE_TILES,2);

            // quarter facade
            offerStonecuttingRecipe(exporter, Registration.STONE_QUARTER_FACADE, Blocks.STONE, 2);
            offerStonecuttingRecipe(exporter, Registration.SMOOTH_STONE_QUARTER_FACADE, Blocks.SMOOTH_STONE,2);
            offerStonecuttingRecipe(exporter, Registration.COBBLESTONE_QUARTER_FACADE, Blocks.COBBLESTONE, 2);
            offerStonecuttingRecipe(exporter, Registration.MOSSY_COBBLESTONE_QUARTER_FACADE, Blocks.MOSSY_COBBLESTONE,2);
            offerStonecuttingRecipe(exporter, Registration.BRICKS_QUARTER_FACADE, Blocks.BRICKS, 2);
            offerStonecuttingRecipe(exporter, Registration.STONE_BRICKS_QUARTER_FACADE, Blocks.STONE_BRICKS,2);
            offerStonecuttingRecipe(exporter, Registration.MOSSY_STONE_BRICKS_QUARTER_FACADE, Blocks.MOSSY_STONE_BRICKS,2);
            offerStonecuttingRecipe(exporter, Registration.CRACKED_STONE_BRICKS_QUARTER_FACADE, Blocks.CRACKED_STONE_BRICKS,2);
            offerStonecuttingRecipe(exporter, Registration.CHISELED_STONE_BRICKS_QUARTER_FACADE, Blocks.CHISELED_STONE_BRICKS,2);
            offerStonecuttingRecipe(exporter, Registration.OBSIDIAN_QUARTER_FACADE, Blocks.OBSIDIAN,2);

            offerStonecuttingRecipe(exporter, Registration.SANDSTONE_QUARTER_FACADE, Blocks.SANDSTONE,2);
            offerStonecuttingRecipe(exporter, Registration.SMOOTH_SANDSTONE_QUARTER_FACADE, Blocks.SMOOTH_SANDSTONE,2);
            offerStonecuttingRecipe(exporter, Registration.CHISELED_SANDSTONE_QUARTER_FACADE, Blocks.CHISELED_SANDSTONE,2);
            offerStonecuttingRecipe(exporter, Registration.CUT_SANDSTONE_QUARTER_FACADE, Blocks.CUT_SANDSTONE,2);
            offerStonecuttingRecipe(exporter, Registration.RED_SANDSTONE_QUARTER_FACADE, Blocks.RED_SANDSTONE,2);
            offerStonecuttingRecipe(exporter, Registration.SMOOTH_RED_SANDSTONE_QUARTER_FACADE, Blocks.SMOOTH_RED_SANDSTONE,2);
            offerStonecuttingRecipe(exporter, Registration.CHISELED_RED_SANDSTONE_QUARTER_FACADE, Blocks.CHISELED_RED_SANDSTONE,2);
            offerStonecuttingRecipe(exporter, Registration.CUT_RED_SANDSTONE_QUARTER_FACADE, Blocks.CUT_RED_SANDSTONE,2);

            offerStonecuttingRecipe(exporter, Registration.GRANITE_QUARTER_FACADE, Blocks.GRANITE,2);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_GRANITE_QUARTER_FACADE, Blocks.POLISHED_GRANITE,2);
            offerStonecuttingRecipe(exporter, Registration.DIORITE_QUARTER_FACADE, Blocks.DIORITE,2);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_DIORITE_QUARTER_FACADE, Blocks.POLISHED_DIORITE,2);
            offerStonecuttingRecipe(exporter, Registration.ANDESITE_QUARTER_FACADE, Blocks.ANDESITE,2);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_ANDESITE_QUARTER_FACADE, Blocks.POLISHED_ANDESITE,2);

            offerStonecuttingRecipe(exporter, Registration.BLACKSTONE_QUARTER_FACADE, Blocks.BLACKSTONE,2);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_BLACKSTONE_QUARTER_FACADE, Blocks.POLISHED_BLACKSTONE,2);
            offerStonecuttingRecipe(exporter, Registration.CHISELED_POLISHED_BLACKSTONE_QUARTER_FACADE, Blocks.CHISELED_POLISHED_BLACKSTONE,2);
            offerStonecuttingRecipe(exporter, Registration.GILDED_BLACKSTONE_QUARTER_FACADE, Blocks.GILDED_BLACKSTONE,2);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_BLACKSTONE_BRICKS_QUARTER_FACADE, Blocks.POLISHED_BLACKSTONE_BRICKS,2);
            offerStonecuttingRecipe(exporter, Registration.CRACKED_POLISHED_BLACKSTONE_BRICKS_QUARTER_FACADE, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS,2);

            offerStonecuttingRecipe(exporter, Registration.DEEPSLATE_QUARTER_FACADE, Blocks.DEEPSLATE,2);
            offerStonecuttingRecipe(exporter, Registration.DEEPSLATE_BRICKS_QUARTER_FACADE, Blocks.DEEPSLATE_BRICKS,2);
            offerStonecuttingRecipe(exporter, Registration.CRACKED_DEEPSLATE_BRICKS_QUARTER_FACADE, Blocks.CRACKED_DEEPSLATE_BRICKS,2);
            offerStonecuttingRecipe(exporter, Registration.COBBLED_DEEPSLATE_QUARTER_FACADE, Blocks.COBBLED_DEEPSLATE,2);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_DEEPSLATE_QUARTER_FACADE, Blocks.POLISHED_DEEPSLATE,2);
            offerStonecuttingRecipe(exporter, Registration.CHISELED_DEEPSLATE_QUARTER_FACADE, Blocks.CHISELED_DEEPSLATE,2);
            offerStonecuttingRecipe(exporter, Registration.DEEPSLATE_TILES_QUARTER_FACADE, Blocks.DEEPSLATE_TILES,2);
            offerStonecuttingRecipe(exporter, Registration.CRACKED_DEEPSLATE_TILES_QUARTER_FACADE, Blocks.CRACKED_DEEPSLATE_TILES,2);

            // fluted
            offerStonecuttingRecipe(exporter, Registration.STONE_FLUTED, Blocks.STONE, 1);
            offerStonecuttingRecipe(exporter, Registration.SMOOTH_STONE_FLUTED, Blocks.SMOOTH_STONE,1);
            offerStonecuttingRecipe(exporter, Registration.COBBLESTONE_FLUTED, Blocks.COBBLESTONE, 1);
            offerStonecuttingRecipe(exporter, Registration.MOSSY_COBBLESTONE_FLUTED, Blocks.MOSSY_COBBLESTONE,1);
            offerStonecuttingRecipe(exporter, Registration.BRICKS_FLUTED, Blocks.BRICKS, 1);
            offerStonecuttingRecipe(exporter, Registration.STONE_BRICKS_FLUTED, Blocks.STONE_BRICKS,1);
            offerStonecuttingRecipe(exporter, Registration.MOSSY_STONE_BRICKS_FLUTED, Blocks.MOSSY_STONE_BRICKS,1);
            offerStonecuttingRecipe(exporter, Registration.CRACKED_STONE_BRICKS_FLUTED, Blocks.CRACKED_STONE_BRICKS,1);
            offerStonecuttingRecipe(exporter, Registration.CHISELED_STONE_BRICKS_FLUTED, Blocks.CHISELED_STONE_BRICKS,1);
            offerStonecuttingRecipe(exporter, Registration.OBSIDIAN_FLUTED, Blocks.OBSIDIAN,1);

            offerStonecuttingRecipe(exporter, Registration.SANDSTONE_FLUTED, Blocks.SANDSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.SMOOTH_SANDSTONE_FLUTED, Blocks.SMOOTH_SANDSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.CHISELED_SANDSTONE_FLUTED, Blocks.CHISELED_SANDSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.CUT_SANDSTONE_FLUTED, Blocks.CUT_SANDSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.RED_SANDSTONE_FLUTED, Blocks.RED_SANDSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.SMOOTH_RED_SANDSTONE_FLUTED, Blocks.SMOOTH_RED_SANDSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.CHISELED_RED_SANDSTONE_FLUTED, Blocks.CHISELED_RED_SANDSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.CUT_RED_SANDSTONE_FLUTED, Blocks.CUT_RED_SANDSTONE,1);

            offerStonecuttingRecipe(exporter, Registration.GRANITE_FLUTED, Blocks.GRANITE,1);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_GRANITE_FLUTED, Blocks.POLISHED_GRANITE,1);
            offerStonecuttingRecipe(exporter, Registration.DIORITE_FLUTED, Blocks.DIORITE,1);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_DIORITE_FLUTED, Blocks.POLISHED_DIORITE,1);
            offerStonecuttingRecipe(exporter, Registration.ANDESITE_FLUTED, Blocks.ANDESITE,1);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_ANDESITE_FLUTED, Blocks.POLISHED_ANDESITE,1);

            offerStonecuttingRecipe(exporter, Registration.BLACKSTONE_FLUTED, Blocks.BLACKSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_BLACKSTONE_FLUTED, Blocks.POLISHED_BLACKSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.CHISELED_POLISHED_BLACKSTONE_FLUTED, Blocks.CHISELED_POLISHED_BLACKSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.GILDED_BLACKSTONE_FLUTED, Blocks.GILDED_BLACKSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_BLACKSTONE_BRICKS_FLUTED, Blocks.POLISHED_BLACKSTONE_BRICKS,1);
            offerStonecuttingRecipe(exporter, Registration.CRACKED_POLISHED_BLACKSTONE_BRICKS_FLUTED, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS,1);

            offerStonecuttingRecipe(exporter, Registration.DEEPSLATE_FLUTED, Blocks.DEEPSLATE,1);
            offerStonecuttingRecipe(exporter, Registration.DEEPSLATE_BRICKS_FLUTED, Blocks.DEEPSLATE_BRICKS,1);
            offerStonecuttingRecipe(exporter, Registration.CRACKED_DEEPSLATE_BRICKS_FLUTED, Blocks.CRACKED_DEEPSLATE_BRICKS,1);
            offerStonecuttingRecipe(exporter, Registration.COBBLED_DEEPSLATE_FLUTED, Blocks.COBBLED_DEEPSLATE,1);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_DEEPSLATE_FLUTED, Blocks.POLISHED_DEEPSLATE,1);
            offerStonecuttingRecipe(exporter, Registration.CHISELED_DEEPSLATE_FLUTED, Blocks.CHISELED_DEEPSLATE,1);
            offerStonecuttingRecipe(exporter, Registration.DEEPSLATE_TILES_FLUTED, Blocks.DEEPSLATE_TILES,1);
            offerStonecuttingRecipe(exporter, Registration.CRACKED_DEEPSLATE_TILES_FLUTED, Blocks.CRACKED_DEEPSLATE_TILES,1);
            
            // fluted facade
            offerStonecuttingRecipe(exporter, Registration.STONE_FLUTED_FACADE, Blocks.STONE, 2);
            offerStonecuttingRecipe(exporter, Registration.SMOOTH_STONE_FLUTED_FACADE, Blocks.SMOOTH_STONE,2);
            offerStonecuttingRecipe(exporter, Registration.COBBLESTONE_FLUTED_FACADE, Blocks.COBBLESTONE, 2);
            offerStonecuttingRecipe(exporter, Registration.MOSSY_COBBLESTONE_FLUTED_FACADE, Blocks.MOSSY_COBBLESTONE,2);
            offerStonecuttingRecipe(exporter, Registration.BRICKS_FLUTED_FACADE, Blocks.BRICKS, 2);
            offerStonecuttingRecipe(exporter, Registration.STONE_BRICKS_FLUTED_FACADE, Blocks.STONE_BRICKS,2);
            offerStonecuttingRecipe(exporter, Registration.MOSSY_STONE_BRICKS_FLUTED_FACADE, Blocks.MOSSY_STONE_BRICKS,2);
            offerStonecuttingRecipe(exporter, Registration.CRACKED_STONE_BRICKS_FLUTED_FACADE, Blocks.CRACKED_STONE_BRICKS,2);
            offerStonecuttingRecipe(exporter, Registration.CHISELED_STONE_BRICKS_FLUTED_FACADE, Blocks.CHISELED_STONE_BRICKS,2);
            offerStonecuttingRecipe(exporter, Registration.OBSIDIAN_FLUTED_FACADE, Blocks.OBSIDIAN,2);

            offerStonecuttingRecipe(exporter, Registration.SANDSTONE_FLUTED_FACADE, Blocks.SANDSTONE,2);
            offerStonecuttingRecipe(exporter, Registration.SMOOTH_SANDSTONE_FLUTED_FACADE, Blocks.SMOOTH_SANDSTONE,2);
            offerStonecuttingRecipe(exporter, Registration.CHISELED_SANDSTONE_FLUTED_FACADE, Blocks.CHISELED_SANDSTONE,2);
            offerStonecuttingRecipe(exporter, Registration.CUT_SANDSTONE_FLUTED_FACADE, Blocks.CUT_SANDSTONE,2);
            offerStonecuttingRecipe(exporter, Registration.RED_SANDSTONE_FLUTED_FACADE, Blocks.RED_SANDSTONE,2);
            offerStonecuttingRecipe(exporter, Registration.SMOOTH_RED_SANDSTONE_FLUTED_FACADE, Blocks.SMOOTH_RED_SANDSTONE,2);
            offerStonecuttingRecipe(exporter, Registration.CHISELED_RED_SANDSTONE_FLUTED_FACADE, Blocks.CHISELED_RED_SANDSTONE,2);
            offerStonecuttingRecipe(exporter, Registration.CUT_RED_SANDSTONE_FLUTED_FACADE, Blocks.CUT_RED_SANDSTONE,2);

            offerStonecuttingRecipe(exporter, Registration.GRANITE_FLUTED_FACADE, Blocks.GRANITE,2);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_GRANITE_FLUTED_FACADE, Blocks.POLISHED_GRANITE,2);
            offerStonecuttingRecipe(exporter, Registration.DIORITE_FLUTED_FACADE, Blocks.DIORITE,2);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_DIORITE_FLUTED_FACADE, Blocks.POLISHED_DIORITE,2);
            offerStonecuttingRecipe(exporter, Registration.ANDESITE_FLUTED_FACADE, Blocks.ANDESITE,2);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_ANDESITE_FLUTED_FACADE, Blocks.POLISHED_ANDESITE,2);

            offerStonecuttingRecipe(exporter, Registration.BLACKSTONE_FLUTED_FACADE, Blocks.BLACKSTONE,2);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_BLACKSTONE_FLUTED_FACADE, Blocks.POLISHED_BLACKSTONE,2);
            offerStonecuttingRecipe(exporter, Registration.CHISELED_POLISHED_BLACKSTONE_FLUTED_FACADE, Blocks.CHISELED_POLISHED_BLACKSTONE,2);
            offerStonecuttingRecipe(exporter, Registration.GILDED_BLACKSTONE_FLUTED_FACADE, Blocks.GILDED_BLACKSTONE,2);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_BLACKSTONE_BRICKS_FLUTED_FACADE, Blocks.POLISHED_BLACKSTONE_BRICKS,2);
            offerStonecuttingRecipe(exporter, Registration.CRACKED_POLISHED_BLACKSTONE_BRICKS_FLUTED_FACADE, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS,2);

            offerStonecuttingRecipe(exporter, Registration.DEEPSLATE_FLUTED_FACADE, Blocks.DEEPSLATE,2);
            offerStonecuttingRecipe(exporter, Registration.DEEPSLATE_BRICKS_FLUTED_FACADE, Blocks.DEEPSLATE_BRICKS,2);
            offerStonecuttingRecipe(exporter, Registration.CRACKED_DEEPSLATE_BRICKS_FLUTED_FACADE, Blocks.CRACKED_DEEPSLATE_BRICKS,2);
            offerStonecuttingRecipe(exporter, Registration.COBBLED_DEEPSLATE_FLUTED_FACADE, Blocks.COBBLED_DEEPSLATE,2);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_DEEPSLATE_FLUTED_FACADE, Blocks.POLISHED_DEEPSLATE,2);
            offerStonecuttingRecipe(exporter, Registration.CHISELED_DEEPSLATE_FLUTED_FACADE, Blocks.CHISELED_DEEPSLATE,2);
            offerStonecuttingRecipe(exporter, Registration.DEEPSLATE_TILES_FLUTED_FACADE, Blocks.DEEPSLATE_TILES,2);
            offerStonecuttingRecipe(exporter, Registration.CRACKED_DEEPSLATE_TILES_FLUTED_FACADE, Blocks.CRACKED_DEEPSLATE_TILES,2);
            
            // sill
            offerStonecuttingRecipe(exporter, Registration.STONE_SILL, Blocks.STONE, 1);
            offerStonecuttingRecipe(exporter, Registration.SMOOTH_STONE_SILL, Blocks.SMOOTH_STONE,1);
            offerStonecuttingRecipe(exporter, Registration.COBBLESTONE_SILL, Blocks.COBBLESTONE, 1);
            offerStonecuttingRecipe(exporter, Registration.MOSSY_COBBLESTONE_SILL, Blocks.MOSSY_COBBLESTONE,1);
            offerStonecuttingRecipe(exporter, Registration.BRICKS_SILL, Blocks.BRICKS, 1);
            offerStonecuttingRecipe(exporter, Registration.STONE_BRICKS_SILL, Blocks.STONE_BRICKS,1);
            offerStonecuttingRecipe(exporter, Registration.MOSSY_STONE_BRICKS_SILL, Blocks.MOSSY_STONE_BRICKS,1);
            offerStonecuttingRecipe(exporter, Registration.CRACKED_STONE_BRICKS_SILL, Blocks.CRACKED_STONE_BRICKS,1);
            offerStonecuttingRecipe(exporter, Registration.CHISELED_STONE_BRICKS_SILL, Blocks.CHISELED_STONE_BRICKS,1);
            offerStonecuttingRecipe(exporter, Registration.OBSIDIAN_SILL, Blocks.OBSIDIAN,1);

            offerStonecuttingRecipe(exporter, Registration.SANDSTONE_SILL, Blocks.SANDSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.SMOOTH_SANDSTONE_SILL, Blocks.SMOOTH_SANDSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.CHISELED_SANDSTONE_SILL, Blocks.CHISELED_SANDSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.CUT_SANDSTONE_SILL, Blocks.CUT_SANDSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.RED_SANDSTONE_SILL, Blocks.RED_SANDSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.SMOOTH_RED_SANDSTONE_SILL, Blocks.SMOOTH_RED_SANDSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.CHISELED_RED_SANDSTONE_SILL, Blocks.CHISELED_RED_SANDSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.CUT_RED_SANDSTONE_SILL, Blocks.CUT_RED_SANDSTONE,1);

            offerStonecuttingRecipe(exporter, Registration.GRANITE_SILL, Blocks.GRANITE,1);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_GRANITE_SILL, Blocks.POLISHED_GRANITE,1);
            offerStonecuttingRecipe(exporter, Registration.DIORITE_SILL, Blocks.DIORITE,1);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_DIORITE_SILL, Blocks.POLISHED_DIORITE,1);
            offerStonecuttingRecipe(exporter, Registration.ANDESITE_SILL, Blocks.ANDESITE,1);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_ANDESITE_SILL, Blocks.POLISHED_ANDESITE,1);

            offerStonecuttingRecipe(exporter, Registration.BLACKSTONE_SILL, Blocks.BLACKSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_BLACKSTONE_SILL, Blocks.POLISHED_BLACKSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.CHISELED_POLISHED_BLACKSTONE_SILL, Blocks.CHISELED_POLISHED_BLACKSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.GILDED_BLACKSTONE_SILL, Blocks.GILDED_BLACKSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_BLACKSTONE_BRICKS_SILL, Blocks.POLISHED_BLACKSTONE_BRICKS,1);
            offerStonecuttingRecipe(exporter, Registration.CRACKED_POLISHED_BLACKSTONE_BRICKS_SILL, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS,1);

            offerStonecuttingRecipe(exporter, Registration.DEEPSLATE_SILL, Blocks.DEEPSLATE,1);
            offerStonecuttingRecipe(exporter, Registration.DEEPSLATE_BRICKS_SILL, Blocks.DEEPSLATE_BRICKS,1);
            offerStonecuttingRecipe(exporter, Registration.CRACKED_DEEPSLATE_BRICKS_SILL, Blocks.CRACKED_DEEPSLATE_BRICKS,1);
            offerStonecuttingRecipe(exporter, Registration.COBBLED_DEEPSLATE_SILL, Blocks.COBBLED_DEEPSLATE,1);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_DEEPSLATE_SILL, Blocks.POLISHED_DEEPSLATE,1);
            offerStonecuttingRecipe(exporter, Registration.CHISELED_DEEPSLATE_SILL, Blocks.CHISELED_DEEPSLATE,1);
            offerStonecuttingRecipe(exporter, Registration.DEEPSLATE_TILES_SILL, Blocks.DEEPSLATE_TILES,1);
            offerStonecuttingRecipe(exporter, Registration.CRACKED_DEEPSLATE_TILES_SILL, Blocks.CRACKED_DEEPSLATE_TILES,1);
            
            // double sill
            offerStonecuttingRecipe(exporter, Registration.STONE_DOUBLE_SILL, Blocks.STONE, 1);
            offerStonecuttingRecipe(exporter, Registration.SMOOTH_STONE_DOUBLE_SILL, Blocks.SMOOTH_STONE,1);
            offerStonecuttingRecipe(exporter, Registration.COBBLESTONE_DOUBLE_SILL, Blocks.COBBLESTONE, 1);
            offerStonecuttingRecipe(exporter, Registration.MOSSY_COBBLESTONE_DOUBLE_SILL, Blocks.MOSSY_COBBLESTONE,1);
            offerStonecuttingRecipe(exporter, Registration.BRICKS_DOUBLE_SILL, Blocks.BRICKS, 1);
            offerStonecuttingRecipe(exporter, Registration.STONE_BRICKS_DOUBLE_SILL, Blocks.STONE_BRICKS,1);
            offerStonecuttingRecipe(exporter, Registration.MOSSY_STONE_BRICKS_DOUBLE_SILL, Blocks.MOSSY_STONE_BRICKS,1);
            offerStonecuttingRecipe(exporter, Registration.CRACKED_STONE_BRICKS_DOUBLE_SILL, Blocks.CRACKED_STONE_BRICKS,1);
            offerStonecuttingRecipe(exporter, Registration.CHISELED_STONE_BRICKS_DOUBLE_SILL, Blocks.CHISELED_STONE_BRICKS,1);
            offerStonecuttingRecipe(exporter, Registration.OBSIDIAN_DOUBLE_SILL, Blocks.OBSIDIAN,1);

            offerStonecuttingRecipe(exporter, Registration.SANDSTONE_DOUBLE_SILL, Blocks.SANDSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.SMOOTH_SANDSTONE_DOUBLE_SILL, Blocks.SMOOTH_SANDSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.CHISELED_SANDSTONE_DOUBLE_SILL, Blocks.CHISELED_SANDSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.CUT_SANDSTONE_DOUBLE_SILL, Blocks.CUT_SANDSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.RED_SANDSTONE_DOUBLE_SILL, Blocks.RED_SANDSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.SMOOTH_RED_SANDSTONE_DOUBLE_SILL, Blocks.SMOOTH_RED_SANDSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.CHISELED_RED_SANDSTONE_DOUBLE_SILL, Blocks.CHISELED_RED_SANDSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.CUT_RED_SANDSTONE_DOUBLE_SILL, Blocks.CUT_RED_SANDSTONE,1);

            offerStonecuttingRecipe(exporter, Registration.GRANITE_DOUBLE_SILL, Blocks.GRANITE,1);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_GRANITE_DOUBLE_SILL, Blocks.POLISHED_GRANITE,1);
            offerStonecuttingRecipe(exporter, Registration.DIORITE_DOUBLE_SILL, Blocks.DIORITE,1);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_DIORITE_DOUBLE_SILL, Blocks.POLISHED_DIORITE,1);
            offerStonecuttingRecipe(exporter, Registration.ANDESITE_DOUBLE_SILL, Blocks.ANDESITE,1);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_ANDESITE_DOUBLE_SILL, Blocks.POLISHED_ANDESITE,1);

            offerStonecuttingRecipe(exporter, Registration.BLACKSTONE_DOUBLE_SILL, Blocks.BLACKSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_BLACKSTONE_DOUBLE_SILL, Blocks.POLISHED_BLACKSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.CHISELED_POLISHED_BLACKSTONE_DOUBLE_SILL, Blocks.CHISELED_POLISHED_BLACKSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.GILDED_BLACKSTONE_DOUBLE_SILL, Blocks.GILDED_BLACKSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_BLACKSTONE_BRICKS_DOUBLE_SILL, Blocks.POLISHED_BLACKSTONE_BRICKS,1);
            offerStonecuttingRecipe(exporter, Registration.CRACKED_POLISHED_BLACKSTONE_BRICKS_DOUBLE_SILL, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS,1);

            offerStonecuttingRecipe(exporter, Registration.DEEPSLATE_DOUBLE_SILL, Blocks.DEEPSLATE,1);
            offerStonecuttingRecipe(exporter, Registration.DEEPSLATE_BRICKS_DOUBLE_SILL, Blocks.DEEPSLATE_BRICKS,1);
            offerStonecuttingRecipe(exporter, Registration.CRACKED_DEEPSLATE_BRICKS_DOUBLE_SILL, Blocks.CRACKED_DEEPSLATE_BRICKS,1);
            offerStonecuttingRecipe(exporter, Registration.COBBLED_DEEPSLATE_DOUBLE_SILL, Blocks.COBBLED_DEEPSLATE,1);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_DEEPSLATE_DOUBLE_SILL, Blocks.POLISHED_DEEPSLATE,1);
            offerStonecuttingRecipe(exporter, Registration.CHISELED_DEEPSLATE_DOUBLE_SILL, Blocks.CHISELED_DEEPSLATE,1);
            offerStonecuttingRecipe(exporter, Registration.DEEPSLATE_TILES_DOUBLE_SILL, Blocks.DEEPSLATE_TILES,1);
            offerStonecuttingRecipe(exporter, Registration.CRACKED_DEEPSLATE_TILES_DOUBLE_SILL, Blocks.CRACKED_DEEPSLATE_TILES,1);
            
            // cornice
            offerStonecuttingRecipe(exporter, Registration.STONE_CORNICE, Blocks.STONE, 1);
            offerStonecuttingRecipe(exporter, Registration.SMOOTH_STONE_CORNICE, Blocks.SMOOTH_STONE,1);
            offerStonecuttingRecipe(exporter, Registration.COBBLESTONE_CORNICE, Blocks.COBBLESTONE, 1);
            offerStonecuttingRecipe(exporter, Registration.MOSSY_COBBLESTONE_CORNICE, Blocks.MOSSY_COBBLESTONE,1);
            offerStonecuttingRecipe(exporter, Registration.BRICKS_CORNICE, Blocks.BRICKS, 1);
            offerStonecuttingRecipe(exporter, Registration.STONE_BRICKS_CORNICE, Blocks.STONE_BRICKS,1);
            offerStonecuttingRecipe(exporter, Registration.MOSSY_STONE_BRICKS_CORNICE, Blocks.MOSSY_STONE_BRICKS,1);
            offerStonecuttingRecipe(exporter, Registration.CRACKED_STONE_BRICKS_CORNICE, Blocks.CRACKED_STONE_BRICKS,1);
            offerStonecuttingRecipe(exporter, Registration.CHISELED_STONE_BRICKS_CORNICE, Blocks.CHISELED_STONE_BRICKS,1);
            offerStonecuttingRecipe(exporter, Registration.OBSIDIAN_CORNICE, Blocks.OBSIDIAN,1);

            offerStonecuttingRecipe(exporter, Registration.SANDSTONE_CORNICE, Blocks.SANDSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.SMOOTH_SANDSTONE_CORNICE, Blocks.SMOOTH_SANDSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.CHISELED_SANDSTONE_CORNICE, Blocks.CHISELED_SANDSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.CUT_SANDSTONE_CORNICE, Blocks.CUT_SANDSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.RED_SANDSTONE_CORNICE, Blocks.RED_SANDSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.SMOOTH_RED_SANDSTONE_CORNICE, Blocks.SMOOTH_RED_SANDSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.CHISELED_RED_SANDSTONE_CORNICE, Blocks.CHISELED_RED_SANDSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.CUT_RED_SANDSTONE_CORNICE, Blocks.CUT_RED_SANDSTONE,1);

            offerStonecuttingRecipe(exporter, Registration.GRANITE_CORNICE, Blocks.GRANITE,1);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_GRANITE_CORNICE, Blocks.POLISHED_GRANITE,1);
            offerStonecuttingRecipe(exporter, Registration.DIORITE_CORNICE, Blocks.DIORITE,1);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_DIORITE_CORNICE, Blocks.POLISHED_DIORITE,1);
            offerStonecuttingRecipe(exporter, Registration.ANDESITE_CORNICE, Blocks.ANDESITE,1);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_ANDESITE_CORNICE, Blocks.POLISHED_ANDESITE,1);

            offerStonecuttingRecipe(exporter, Registration.BLACKSTONE_CORNICE, Blocks.BLACKSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_BLACKSTONE_CORNICE, Blocks.POLISHED_BLACKSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.CHISELED_POLISHED_BLACKSTONE_CORNICE, Blocks.CHISELED_POLISHED_BLACKSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.GILDED_BLACKSTONE_CORNICE, Blocks.GILDED_BLACKSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_BLACKSTONE_BRICKS_CORNICE, Blocks.POLISHED_BLACKSTONE_BRICKS,1);
            offerStonecuttingRecipe(exporter, Registration.CRACKED_POLISHED_BLACKSTONE_BRICKS_CORNICE, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS,1);

            offerStonecuttingRecipe(exporter, Registration.DEEPSLATE_CORNICE, Blocks.DEEPSLATE,1);
            offerStonecuttingRecipe(exporter, Registration.DEEPSLATE_BRICKS_CORNICE, Blocks.DEEPSLATE_BRICKS,1);
            offerStonecuttingRecipe(exporter, Registration.CRACKED_DEEPSLATE_BRICKS_CORNICE, Blocks.CRACKED_DEEPSLATE_BRICKS,1);
            offerStonecuttingRecipe(exporter, Registration.COBBLED_DEEPSLATE_CORNICE, Blocks.COBBLED_DEEPSLATE,1);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_DEEPSLATE_CORNICE, Blocks.POLISHED_DEEPSLATE,1);
            offerStonecuttingRecipe(exporter, Registration.CHISELED_DEEPSLATE_CORNICE, Blocks.CHISELED_DEEPSLATE,1);
            offerStonecuttingRecipe(exporter, Registration.DEEPSLATE_TILES_CORNICE, Blocks.DEEPSLATE_TILES,1);
            offerStonecuttingRecipe(exporter, Registration.CRACKED_DEEPSLATE_TILES_CORNICE, Blocks.CRACKED_DEEPSLATE_TILES,1);
            
            // crown molding
            offerStonecuttingRecipe(exporter, Registration.STONE_CROWN_MOLDING, Blocks.STONE, 2);
            offerStonecuttingRecipe(exporter, Registration.SMOOTH_STONE_CROWN_MOLDING, Blocks.SMOOTH_STONE,2);
            offerStonecuttingRecipe(exporter, Registration.COBBLESTONE_CROWN_MOLDING, Blocks.COBBLESTONE, 2);
            offerStonecuttingRecipe(exporter, Registration.MOSSY_COBBLESTONE_CROWN_MOLDING, Blocks.MOSSY_COBBLESTONE,2);
            offerStonecuttingRecipe(exporter, Registration.BRICKS_CROWN_MOLDING, Blocks.BRICKS, 2);
            offerStonecuttingRecipe(exporter, Registration.STONE_BRICKS_CROWN_MOLDING, Blocks.STONE_BRICKS,2);
            offerStonecuttingRecipe(exporter, Registration.MOSSY_STONE_BRICKS_CROWN_MOLDING, Blocks.MOSSY_STONE_BRICKS,2);
            offerStonecuttingRecipe(exporter, Registration.CRACKED_STONE_BRICKS_CROWN_MOLDING, Blocks.CRACKED_STONE_BRICKS,2);
            offerStonecuttingRecipe(exporter, Registration.CHISELED_STONE_BRICKS_CROWN_MOLDING, Blocks.CHISELED_STONE_BRICKS,2);
            offerStonecuttingRecipe(exporter, Registration.OBSIDIAN_CROWN_MOLDING, Blocks.OBSIDIAN,2);

            offerStonecuttingRecipe(exporter, Registration.SANDSTONE_CROWN_MOLDING, Blocks.SANDSTONE,2);
            offerStonecuttingRecipe(exporter, Registration.SMOOTH_SANDSTONE_CROWN_MOLDING, Blocks.SMOOTH_SANDSTONE,2);
            offerStonecuttingRecipe(exporter, Registration.CHISELED_SANDSTONE_CROWN_MOLDING, Blocks.CHISELED_SANDSTONE,2);
            offerStonecuttingRecipe(exporter, Registration.CUT_SANDSTONE_CROWN_MOLDING, Blocks.CUT_SANDSTONE,2);
            offerStonecuttingRecipe(exporter, Registration.RED_SANDSTONE_CROWN_MOLDING, Blocks.RED_SANDSTONE,2);
            offerStonecuttingRecipe(exporter, Registration.SMOOTH_RED_SANDSTONE_CROWN_MOLDING, Blocks.SMOOTH_RED_SANDSTONE,2);
            offerStonecuttingRecipe(exporter, Registration.CHISELED_RED_SANDSTONE_CROWN_MOLDING, Blocks.CHISELED_RED_SANDSTONE,2);
            offerStonecuttingRecipe(exporter, Registration.CUT_RED_SANDSTONE_CROWN_MOLDING, Blocks.CUT_RED_SANDSTONE,2);

            offerStonecuttingRecipe(exporter, Registration.GRANITE_CROWN_MOLDING, Blocks.GRANITE,2);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_GRANITE_CROWN_MOLDING, Blocks.POLISHED_GRANITE,2);
            offerStonecuttingRecipe(exporter, Registration.DIORITE_CROWN_MOLDING, Blocks.DIORITE,2);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_DIORITE_CROWN_MOLDING, Blocks.POLISHED_DIORITE,2);
            offerStonecuttingRecipe(exporter, Registration.ANDESITE_CROWN_MOLDING, Blocks.ANDESITE,2);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_ANDESITE_CROWN_MOLDING, Blocks.POLISHED_ANDESITE,2);

            offerStonecuttingRecipe(exporter, Registration.BLACKSTONE_CROWN_MOLDING, Blocks.BLACKSTONE,2);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_BLACKSTONE_CROWN_MOLDING, Blocks.POLISHED_BLACKSTONE,2);
            offerStonecuttingRecipe(exporter, Registration.CHISELED_POLISHED_BLACKSTONE_CROWN_MOLDING, Blocks.CHISELED_POLISHED_BLACKSTONE,2);
            offerStonecuttingRecipe(exporter, Registration.GILDED_BLACKSTONE_CROWN_MOLDING, Blocks.GILDED_BLACKSTONE,2);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_BLACKSTONE_BRICKS_CROWN_MOLDING, Blocks.POLISHED_BLACKSTONE_BRICKS,2);
            offerStonecuttingRecipe(exporter, Registration.CRACKED_POLISHED_BLACKSTONE_BRICKS_CROWN_MOLDING, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS,2);

            offerStonecuttingRecipe(exporter, Registration.DEEPSLATE_CROWN_MOLDING, Blocks.DEEPSLATE,2);
            offerStonecuttingRecipe(exporter, Registration.DEEPSLATE_BRICKS_CROWN_MOLDING, Blocks.DEEPSLATE_BRICKS,2);
            offerStonecuttingRecipe(exporter, Registration.CRACKED_DEEPSLATE_BRICKS_CROWN_MOLDING, Blocks.CRACKED_DEEPSLATE_BRICKS,2);
            offerStonecuttingRecipe(exporter, Registration.COBBLED_DEEPSLATE_CROWN_MOLDING, Blocks.COBBLED_DEEPSLATE,2);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_DEEPSLATE_CROWN_MOLDING, Blocks.POLISHED_DEEPSLATE,2);
            offerStonecuttingRecipe(exporter, Registration.CHISELED_DEEPSLATE_CROWN_MOLDING, Blocks.CHISELED_DEEPSLATE,2);
            offerStonecuttingRecipe(exporter, Registration.DEEPSLATE_TILES_CROWN_MOLDING, Blocks.DEEPSLATE_TILES,2);
            offerStonecuttingRecipe(exporter, Registration.CRACKED_DEEPSLATE_TILES_CROWN_MOLDING, Blocks.CRACKED_DEEPSLATE_TILES,2);

            // pillar base
            offerStonecuttingRecipe(exporter, Registration.STONE_PILLAR_BASE, Blocks.STONE, 1);
            offerStonecuttingRecipe(exporter, Registration.SMOOTH_STONE_PILLAR_BASE, Blocks.SMOOTH_STONE,1);
            offerStonecuttingRecipe(exporter, Registration.COBBLESTONE_PILLAR_BASE, Blocks.COBBLESTONE, 1);
            offerStonecuttingRecipe(exporter, Registration.MOSSY_COBBLESTONE_PILLAR_BASE, Blocks.MOSSY_COBBLESTONE,1);
            offerStonecuttingRecipe(exporter, Registration.BRICKS_PILLAR_BASE, Blocks.BRICKS, 1);
            offerStonecuttingRecipe(exporter, Registration.STONE_BRICKS_PILLAR_BASE, Blocks.STONE_BRICKS,1);
            offerStonecuttingRecipe(exporter, Registration.MOSSY_STONE_BRICKS_PILLAR_BASE, Blocks.MOSSY_STONE_BRICKS,1);
            offerStonecuttingRecipe(exporter, Registration.CRACKED_STONE_BRICKS_PILLAR_BASE, Blocks.CRACKED_STONE_BRICKS,1);
            offerStonecuttingRecipe(exporter, Registration.CHISELED_STONE_BRICKS_PILLAR_BASE, Blocks.CHISELED_STONE_BRICKS,1);
            offerStonecuttingRecipe(exporter, Registration.OBSIDIAN_PILLAR_BASE, Blocks.OBSIDIAN,1);

            offerStonecuttingRecipe(exporter, Registration.SANDSTONE_PILLAR_BASE, Blocks.SANDSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.SMOOTH_SANDSTONE_PILLAR_BASE, Blocks.SMOOTH_SANDSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.CHISELED_SANDSTONE_PILLAR_BASE, Blocks.CHISELED_SANDSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.CUT_SANDSTONE_PILLAR_BASE, Blocks.CUT_SANDSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.RED_SANDSTONE_PILLAR_BASE, Blocks.RED_SANDSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.SMOOTH_RED_SANDSTONE_PILLAR_BASE, Blocks.SMOOTH_RED_SANDSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.CHISELED_RED_SANDSTONE_PILLAR_BASE, Blocks.CHISELED_RED_SANDSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.CUT_RED_SANDSTONE_PILLAR_BASE, Blocks.CUT_RED_SANDSTONE,1);

            offerStonecuttingRecipe(exporter, Registration.GRANITE_PILLAR_BASE, Blocks.GRANITE,1);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_GRANITE_PILLAR_BASE, Blocks.POLISHED_GRANITE,1);
            offerStonecuttingRecipe(exporter, Registration.DIORITE_PILLAR_BASE, Blocks.DIORITE,1);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_DIORITE_PILLAR_BASE, Blocks.POLISHED_DIORITE,1);
            offerStonecuttingRecipe(exporter, Registration.ANDESITE_PILLAR_BASE, Blocks.ANDESITE,1);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_ANDESITE_PILLAR_BASE, Blocks.POLISHED_ANDESITE,1);

            offerStonecuttingRecipe(exporter, Registration.BLACKSTONE_PILLAR_BASE, Blocks.BLACKSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_BLACKSTONE_PILLAR_BASE, Blocks.POLISHED_BLACKSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.CHISELED_POLISHED_BLACKSTONE_PILLAR_BASE, Blocks.CHISELED_POLISHED_BLACKSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.GILDED_BLACKSTONE_PILLAR_BASE, Blocks.GILDED_BLACKSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_BLACKSTONE_BRICKS_PILLAR_BASE, Blocks.POLISHED_BLACKSTONE_BRICKS,1);
            offerStonecuttingRecipe(exporter, Registration.CRACKED_POLISHED_BLACKSTONE_BRICKS_PILLAR_BASE, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS,1);

            offerStonecuttingRecipe(exporter, Registration.DEEPSLATE_PILLAR_BASE, Blocks.DEEPSLATE,1);
            offerStonecuttingRecipe(exporter, Registration.DEEPSLATE_BRICKS_PILLAR_BASE, Blocks.DEEPSLATE_BRICKS,1);
            offerStonecuttingRecipe(exporter, Registration.CRACKED_DEEPSLATE_BRICKS_PILLAR_BASE, Blocks.CRACKED_DEEPSLATE_BRICKS,1);
            offerStonecuttingRecipe(exporter, Registration.COBBLED_DEEPSLATE_PILLAR_BASE, Blocks.COBBLED_DEEPSLATE,1);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_DEEPSLATE_PILLAR_BASE, Blocks.POLISHED_DEEPSLATE,1);
            offerStonecuttingRecipe(exporter, Registration.CHISELED_DEEPSLATE_PILLAR_BASE, Blocks.CHISELED_DEEPSLATE,1);
            offerStonecuttingRecipe(exporter, Registration.DEEPSLATE_TILES_PILLAR_BASE, Blocks.DEEPSLATE_TILES,1);
            offerStonecuttingRecipe(exporter, Registration.CRACKED_DEEPSLATE_TILES_PILLAR_BASE, Blocks.CRACKED_DEEPSLATE_TILES,1);
            
            // pillar
            offerStonecuttingRecipe(exporter, Registration.STONE_PILLAR, Blocks.STONE, 1);
            offerStonecuttingRecipe(exporter, Registration.SMOOTH_STONE_PILLAR, Blocks.SMOOTH_STONE,1);
            offerStonecuttingRecipe(exporter, Registration.COBBLESTONE_PILLAR, Blocks.COBBLESTONE, 1);
            offerStonecuttingRecipe(exporter, Registration.MOSSY_COBBLESTONE_PILLAR, Blocks.MOSSY_COBBLESTONE,1);
            offerStonecuttingRecipe(exporter, Registration.BRICKS_PILLAR, Blocks.BRICKS, 1);
            offerStonecuttingRecipe(exporter, Registration.STONE_BRICKS_PILLAR, Blocks.STONE_BRICKS,1);
            offerStonecuttingRecipe(exporter, Registration.MOSSY_STONE_BRICKS_PILLAR, Blocks.MOSSY_STONE_BRICKS,1);
            offerStonecuttingRecipe(exporter, Registration.CRACKED_STONE_BRICKS_PILLAR, Blocks.CRACKED_STONE_BRICKS,1);
            offerStonecuttingRecipe(exporter, Registration.CHISELED_STONE_BRICKS_PILLAR, Blocks.CHISELED_STONE_BRICKS,1);
            offerStonecuttingRecipe(exporter, Registration.OBSIDIAN_PILLAR, Blocks.OBSIDIAN,1);

            offerStonecuttingRecipe(exporter, Registration.SANDSTONE_PILLAR, Blocks.SANDSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.SMOOTH_SANDSTONE_PILLAR, Blocks.SMOOTH_SANDSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.CHISELED_SANDSTONE_PILLAR, Blocks.CHISELED_SANDSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.CUT_SANDSTONE_PILLAR, Blocks.CUT_SANDSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.RED_SANDSTONE_PILLAR, Blocks.RED_SANDSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.SMOOTH_RED_SANDSTONE_PILLAR, Blocks.SMOOTH_RED_SANDSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.CHISELED_RED_SANDSTONE_PILLAR, Blocks.CHISELED_RED_SANDSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.CUT_RED_SANDSTONE_PILLAR, Blocks.CUT_RED_SANDSTONE,1);

            offerStonecuttingRecipe(exporter, Registration.GRANITE_PILLAR, Blocks.GRANITE,1);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_GRANITE_PILLAR, Blocks.POLISHED_GRANITE,1);
            offerStonecuttingRecipe(exporter, Registration.DIORITE_PILLAR, Blocks.DIORITE,1);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_DIORITE_PILLAR, Blocks.POLISHED_DIORITE,1);
            offerStonecuttingRecipe(exporter, Registration.ANDESITE_PILLAR, Blocks.ANDESITE,1);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_ANDESITE_PILLAR, Blocks.POLISHED_ANDESITE,1);

            offerStonecuttingRecipe(exporter, Registration.BLACKSTONE_PILLAR, Blocks.BLACKSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_BLACKSTONE_PILLAR, Blocks.POLISHED_BLACKSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.CHISELED_POLISHED_BLACKSTONE_PILLAR, Blocks.CHISELED_POLISHED_BLACKSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.GILDED_BLACKSTONE_PILLAR, Blocks.GILDED_BLACKSTONE,1);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_BLACKSTONE_BRICKS_PILLAR, Blocks.POLISHED_BLACKSTONE_BRICKS,1);
            offerStonecuttingRecipe(exporter, Registration.CRACKED_POLISHED_BLACKSTONE_BRICKS_PILLAR, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS,1);

            offerStonecuttingRecipe(exporter, Registration.DEEPSLATE_PILLAR, Blocks.DEEPSLATE,1);
            offerStonecuttingRecipe(exporter, Registration.DEEPSLATE_BRICKS_PILLAR, Blocks.DEEPSLATE_BRICKS,1);
            offerStonecuttingRecipe(exporter, Registration.CRACKED_DEEPSLATE_BRICKS_PILLAR, Blocks.CRACKED_DEEPSLATE_BRICKS,1);
            offerStonecuttingRecipe(exporter, Registration.COBBLED_DEEPSLATE_PILLAR, Blocks.COBBLED_DEEPSLATE,1);
            offerStonecuttingRecipe(exporter, Registration.POLISHED_DEEPSLATE_PILLAR, Blocks.POLISHED_DEEPSLATE,1);
            offerStonecuttingRecipe(exporter, Registration.CHISELED_DEEPSLATE_PILLAR, Blocks.CHISELED_DEEPSLATE,1);
            offerStonecuttingRecipe(exporter, Registration.DEEPSLATE_TILES_PILLAR, Blocks.DEEPSLATE_TILES,1);
            offerStonecuttingRecipe(exporter, Registration.CRACKED_DEEPSLATE_TILES_PILLAR, Blocks.CRACKED_DEEPSLATE_TILES,1);

            // wall sconce
            ShapedRecipeJsonBuilder.create(Registration.STONE_WALL_SCONCE, 3)
                    .pattern("###").pattern(" i ").pattern(" S ")
                    .input('#', Items.TORCH).input('i', Items.IRON_INGOT).input('S', Items.STONE)
                    .criterion(RecipeProvider.hasItem(Items.TORCH), RecipeProvider.conditionsFromItem(Items.TORCH))
                    .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Registration.STONE_WALL_SCONCE)));

            ShapedRecipeJsonBuilder.create(Registration.SMOOTH_STONE_WALL_SCONCE, 3)
                    .pattern("###").pattern(" i ").pattern(" S ")
                    .input('#', Items.TORCH).input('i', Items.IRON_INGOT).input('S', Items.SMOOTH_STONE)
                    .criterion(RecipeProvider.hasItem(Items.TORCH), RecipeProvider.conditionsFromItem(Items.TORCH))
                    .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Registration.SMOOTH_STONE_WALL_SCONCE)));

            ShapedRecipeJsonBuilder.create(Registration.COBBLESTONE_WALL_SCONCE, 3)
                    .pattern("###").pattern(" i ").pattern(" S ")
                    .input('#', Items.TORCH).input('i', Items.IRON_INGOT).input('S', Items.COBBLESTONE)
                    .criterion(RecipeProvider.hasItem(Items.TORCH), RecipeProvider.conditionsFromItem(Items.TORCH))
                    .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Registration.COBBLESTONE_WALL_SCONCE)));

            ShapedRecipeJsonBuilder.create(Registration.MOSSY_COBBLESTONE_WALL_SCONCE, 3)
                    .pattern("###").pattern(" i ").pattern(" S ")
                    .input('#', Items.TORCH).input('i', Items.IRON_INGOT).input('S', Items.MOSSY_COBBLESTONE)
                    .criterion(RecipeProvider.hasItem(Items.TORCH), RecipeProvider.conditionsFromItem(Items.TORCH))
                    .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Registration.MOSSY_COBBLESTONE_WALL_SCONCE)));

            ShapedRecipeJsonBuilder.create(Registration.BRICKS_WALL_SCONCE, 3)
                    .pattern("###").pattern(" i ").pattern(" S ")
                    .input('#', Items.TORCH).input('i', Items.IRON_INGOT).input('S', Items.BRICKS)
                    .criterion(RecipeProvider.hasItem(Items.TORCH), RecipeProvider.conditionsFromItem(Items.TORCH))
                    .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Registration.BRICKS_WALL_SCONCE)));

            ShapedRecipeJsonBuilder.create(Registration.STONE_BRICKS_WALL_SCONCE, 3)
                    .pattern("###").pattern(" i ").pattern(" S ")
                    .input('#', Items.TORCH).input('i', Items.IRON_INGOT).input('S', Items.STONE_BRICKS)
                    .criterion(RecipeProvider.hasItem(Items.TORCH), RecipeProvider.conditionsFromItem(Items.TORCH))
                    .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Registration.STONE_BRICKS_WALL_SCONCE)));

            ShapedRecipeJsonBuilder.create(Registration.MOSSY_STONE_BRICKS_WALL_SCONCE, 3)
                    .pattern("###").pattern(" i ").pattern(" S ")
                    .input('#', Items.TORCH).input('i', Items.IRON_INGOT).input('S', Items.MOSSY_STONE_BRICKS)
                    .criterion(RecipeProvider.hasItem(Items.TORCH), RecipeProvider.conditionsFromItem(Items.TORCH))
                    .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Registration.MOSSY_STONE_BRICKS_WALL_SCONCE)));

            ShapedRecipeJsonBuilder.create(Registration.CRACKED_STONE_BRICKS_WALL_SCONCE, 3)
                    .pattern("###").pattern(" i ").pattern(" S ")
                    .input('#', Items.TORCH).input('i', Items.IRON_INGOT).input('S', Items.CRACKED_STONE_BRICKS)
                    .criterion(RecipeProvider.hasItem(Items.TORCH), RecipeProvider.conditionsFromItem(Items.TORCH))
                    .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Registration.CRACKED_STONE_BRICKS_WALL_SCONCE)));

            ShapedRecipeJsonBuilder.create(Registration.CHISELED_STONE_BRICKS_WALL_SCONCE, 3)
                    .pattern("###").pattern(" i ").pattern(" S ")
                    .input('#', Items.TORCH).input('i', Items.IRON_INGOT).input('S', Items.CHISELED_STONE_BRICKS)
                    .criterion(RecipeProvider.hasItem(Items.TORCH), RecipeProvider.conditionsFromItem(Items.TORCH))
                    .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Registration.CHISELED_STONE_BRICKS_WALL_SCONCE)));

            ShapedRecipeJsonBuilder.create(Registration.OBSIDIAN_WALL_SCONCE, 3)
                    .pattern("###").pattern(" i ").pattern(" S ")
                    .input('#', Items.TORCH).input('i', Items.IRON_INGOT).input('S', Items.OBSIDIAN)
                    .criterion(RecipeProvider.hasItem(Items.TORCH), RecipeProvider.conditionsFromItem(Items.TORCH))
                    .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Registration.OBSIDIAN_WALL_SCONCE)));

            ShapedRecipeJsonBuilder.create(Registration.SANDSTONE_WALL_SCONCE, 3)
                    .pattern("###").pattern(" i ").pattern(" S ")
                    .input('#', Items.TORCH).input('i', Items.IRON_INGOT).input('S', Items.SANDSTONE)
                    .criterion(RecipeProvider.hasItem(Items.TORCH), RecipeProvider.conditionsFromItem(Items.TORCH))
                    .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Registration.SANDSTONE_WALL_SCONCE)));

            ShapedRecipeJsonBuilder.create(Registration.SMOOTH_SANDSTONE_WALL_SCONCE, 3)
                    .pattern("###").pattern(" i ").pattern(" S ")
                    .input('#', Items.TORCH).input('i', Items.IRON_INGOT).input('S', Items.SMOOTH_SANDSTONE)
                    .criterion(RecipeProvider.hasItem(Items.TORCH), RecipeProvider.conditionsFromItem(Items.TORCH))
                    .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Registration.SMOOTH_SANDSTONE_WALL_SCONCE)));

            ShapedRecipeJsonBuilder.create(Registration.CHISELED_SANDSTONE_WALL_SCONCE, 3)
                    .pattern("###").pattern(" i ").pattern(" S ")
                    .input('#', Items.TORCH).input('i', Items.IRON_INGOT).input('S', Items.CHISELED_SANDSTONE)
                    .criterion(RecipeProvider.hasItem(Items.TORCH), RecipeProvider.conditionsFromItem(Items.TORCH))
                    .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Registration.CHISELED_SANDSTONE_WALL_SCONCE)));

            ShapedRecipeJsonBuilder.create(Registration.CUT_SANDSTONE_WALL_SCONCE, 3)
                    .pattern("###").pattern(" i ").pattern(" S ")
                    .input('#', Items.TORCH).input('i', Items.IRON_INGOT).input('S', Items.CUT_SANDSTONE)
                    .criterion(RecipeProvider.hasItem(Items.TORCH), RecipeProvider.conditionsFromItem(Items.TORCH))
                    .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Registration.CUT_SANDSTONE_WALL_SCONCE)));

            ShapedRecipeJsonBuilder.create(Registration.RED_SANDSTONE_WALL_SCONCE, 3)
                    .pattern("###").pattern(" i ").pattern(" S ")
                    .input('#', Items.TORCH).input('i', Items.IRON_INGOT).input('S', Items.RED_SANDSTONE)
                    .criterion(RecipeProvider.hasItem(Items.TORCH), RecipeProvider.conditionsFromItem(Items.TORCH))
                    .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Registration.RED_SANDSTONE_WALL_SCONCE)));

            ShapedRecipeJsonBuilder.create(Registration.SMOOTH_RED_SANDSTONE_WALL_SCONCE, 3)
                    .pattern("###").pattern(" i ").pattern(" S ")
                    .input('#', Items.TORCH).input('i', Items.IRON_INGOT).input('S', Items.SMOOTH_RED_SANDSTONE)
                    .criterion(RecipeProvider.hasItem(Items.TORCH), RecipeProvider.conditionsFromItem(Items.TORCH))
                    .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Registration.SMOOTH_RED_SANDSTONE_WALL_SCONCE)));

            ShapedRecipeJsonBuilder.create(Registration.CHISELED_RED_SANDSTONE_WALL_SCONCE, 3)
                    .pattern("###").pattern(" i ").pattern(" S ")
                    .input('#', Items.TORCH).input('i', Items.IRON_INGOT).input('S', Items.CHISELED_RED_SANDSTONE)
                    .criterion(RecipeProvider.hasItem(Items.TORCH), RecipeProvider.conditionsFromItem(Items.TORCH))
                    .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Registration.CHISELED_RED_SANDSTONE_WALL_SCONCE)));

            ShapedRecipeJsonBuilder.create(Registration.CUT_RED_SANDSTONE_WALL_SCONCE, 3)
                    .pattern("###").pattern(" i ").pattern(" S ")
                    .input('#', Items.TORCH).input('i', Items.IRON_INGOT).input('S', Items.CUT_RED_SANDSTONE)
                    .criterion(RecipeProvider.hasItem(Items.TORCH), RecipeProvider.conditionsFromItem(Items.TORCH))
                    .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Registration.CUT_RED_SANDSTONE_WALL_SCONCE)));

            ShapedRecipeJsonBuilder.create(Registration.GRANITE_WALL_SCONCE, 3)
                    .pattern("###").pattern(" i ").pattern(" S ")
                    .input('#', Items.TORCH).input('i', Items.IRON_INGOT).input('S', Items.GRANITE)
                    .criterion(RecipeProvider.hasItem(Items.TORCH), RecipeProvider.conditionsFromItem(Items.TORCH))
                    .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Registration.GRANITE_WALL_SCONCE)));

            ShapedRecipeJsonBuilder.create(Registration.POLISHED_GRANITE_WALL_SCONCE, 3)
                    .pattern("###").pattern(" i ").pattern(" S ")
                    .input('#', Items.TORCH).input('i', Items.IRON_INGOT).input('S', Items.POLISHED_GRANITE)
                    .criterion(RecipeProvider.hasItem(Items.TORCH), RecipeProvider.conditionsFromItem(Items.TORCH))
                    .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Registration.POLISHED_GRANITE_WALL_SCONCE)));

            ShapedRecipeJsonBuilder.create(Registration.DIORITE_WALL_SCONCE, 3)
                    .pattern("###").pattern(" i ").pattern(" S ")
                    .input('#', Items.TORCH).input('i', Items.IRON_INGOT).input('S', Items.DIORITE)
                    .criterion(RecipeProvider.hasItem(Items.TORCH), RecipeProvider.conditionsFromItem(Items.TORCH))
                    .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Registration.DIORITE_WALL_SCONCE)));

            ShapedRecipeJsonBuilder.create(Registration.POLISHED_DIORITE_WALL_SCONCE, 3)
                    .pattern("###").pattern(" i ").pattern(" S ")
                    .input('#', Items.TORCH).input('i', Items.IRON_INGOT).input('S', Items.POLISHED_DIORITE)
                    .criterion(RecipeProvider.hasItem(Items.TORCH), RecipeProvider.conditionsFromItem(Items.TORCH))
                    .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Registration.POLISHED_DIORITE_WALL_SCONCE)));

            ShapedRecipeJsonBuilder.create(Registration.ANDESITE_WALL_SCONCE, 3)
                    .pattern("###").pattern(" i ").pattern(" S ")
                    .input('#', Items.TORCH).input('i', Items.IRON_INGOT).input('S', Items.ANDESITE)
                    .criterion(RecipeProvider.hasItem(Items.TORCH), RecipeProvider.conditionsFromItem(Items.TORCH))
                    .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Registration.ANDESITE_WALL_SCONCE)));

            ShapedRecipeJsonBuilder.create(Registration.POLISHED_ANDESITE_WALL_SCONCE, 3)
                    .pattern("###").pattern(" i ").pattern(" S ")
                    .input('#', Items.TORCH).input('i', Items.IRON_INGOT).input('S', Items.POLISHED_ANDESITE)
                    .criterion(RecipeProvider.hasItem(Items.TORCH), RecipeProvider.conditionsFromItem(Items.TORCH))
                    .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Registration.POLISHED_ANDESITE_WALL_SCONCE)));

            ShapedRecipeJsonBuilder.create(Registration.BLACKSTONE_WALL_SCONCE, 3)
                    .pattern("###").pattern(" i ").pattern(" S ")
                    .input('#', Items.TORCH).input('i', Items.IRON_INGOT).input('S', Items.BLACKSTONE)
                    .criterion(RecipeProvider.hasItem(Items.TORCH), RecipeProvider.conditionsFromItem(Items.TORCH))
                    .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Registration.BLACKSTONE_WALL_SCONCE)));

            ShapedRecipeJsonBuilder.create(Registration.POLISHED_BLACKSTONE_WALL_SCONCE, 3)
                    .pattern("###").pattern(" i ").pattern(" S ")
                    .input('#', Items.TORCH).input('i', Items.IRON_INGOT).input('S', Items.POLISHED_BLACKSTONE)
                    .criterion(RecipeProvider.hasItem(Items.TORCH), RecipeProvider.conditionsFromItem(Items.TORCH))
                    .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Registration.POLISHED_BLACKSTONE_WALL_SCONCE)));

            ShapedRecipeJsonBuilder.create(Registration.CHISELED_POLISHED_BLACKSTONE_WALL_SCONCE, 3)
                    .pattern("###").pattern(" i ").pattern(" S ")
                    .input('#', Items.TORCH).input('i', Items.IRON_INGOT).input('S', Items.CHISELED_POLISHED_BLACKSTONE)
                    .criterion(RecipeProvider.hasItem(Items.TORCH), RecipeProvider.conditionsFromItem(Items.TORCH))
                    .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Registration.CHISELED_POLISHED_BLACKSTONE_WALL_SCONCE)));

            ShapedRecipeJsonBuilder.create(Registration.GILDED_BLACKSTONE_WALL_SCONCE, 3)
                    .pattern("###").pattern(" i ").pattern(" S ")
                    .input('#', Items.TORCH).input('i', Items.IRON_INGOT).input('S', Items.GILDED_BLACKSTONE)
                    .criterion(RecipeProvider.hasItem(Items.TORCH), RecipeProvider.conditionsFromItem(Items.TORCH))
                    .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Registration.GILDED_BLACKSTONE_WALL_SCONCE)));

            ShapedRecipeJsonBuilder.create(Registration.POLISHED_BLACKSTONE_BRICKS_WALL_SCONCE, 3)
                    .pattern("###").pattern(" i ").pattern(" S ")
                    .input('#', Items.TORCH).input('i', Items.IRON_INGOT).input('S', Items.POLISHED_BLACKSTONE_BRICKS)
                    .criterion(RecipeProvider.hasItem(Items.TORCH), RecipeProvider.conditionsFromItem(Items.TORCH))
                    .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Registration.POLISHED_BLACKSTONE_BRICKS_WALL_SCONCE)));

            ShapedRecipeJsonBuilder.create(Registration.CRACKED_POLISHED_BLACKSTONE_BRICKS_WALL_SCONCE, 3)
                    .pattern("###").pattern(" i ").pattern(" S ")
                    .input('#', Items.TORCH).input('i', Items.IRON_INGOT).input('S', Items.CRACKED_POLISHED_BLACKSTONE_BRICKS)
                    .criterion(RecipeProvider.hasItem(Items.TORCH), RecipeProvider.conditionsFromItem(Items.TORCH))
                    .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Registration.CRACKED_POLISHED_BLACKSTONE_BRICKS_WALL_SCONCE)));

            ShapedRecipeJsonBuilder.create(Registration.DEEPSLATE_WALL_SCONCE, 3)
                    .pattern("###").pattern(" i ").pattern(" S ")
                    .input('#', Items.TORCH).input('i', Items.IRON_INGOT).input('S', Items.DEEPSLATE)
                    .criterion(RecipeProvider.hasItem(Items.TORCH), RecipeProvider.conditionsFromItem(Items.TORCH))
                    .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Registration.DEEPSLATE_WALL_SCONCE)));

            ShapedRecipeJsonBuilder.create(Registration.DEEPSLATE_BRICKS_WALL_SCONCE, 3)
                    .pattern("###").pattern(" i ").pattern(" S ")
                    .input('#', Items.TORCH).input('i', Items.IRON_INGOT).input('S', Items.DEEPSLATE_BRICKS)
                    .criterion(RecipeProvider.hasItem(Items.TORCH), RecipeProvider.conditionsFromItem(Items.TORCH))
                    .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Registration.DEEPSLATE_BRICKS_WALL_SCONCE)));

            ShapedRecipeJsonBuilder.create(Registration.CRACKED_DEEPSLATE_BRICKS_WALL_SCONCE, 3)
                    .pattern("###").pattern(" i ").pattern(" S ")
                    .input('#', Items.TORCH).input('i', Items.IRON_INGOT).input('S', Items.CRACKED_DEEPSLATE_BRICKS)
                    .criterion(RecipeProvider.hasItem(Items.TORCH), RecipeProvider.conditionsFromItem(Items.TORCH))
                    .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Registration.CRACKED_DEEPSLATE_BRICKS_WALL_SCONCE)));

            ShapedRecipeJsonBuilder.create(Registration.COBBLED_DEEPSLATE_WALL_SCONCE, 3)
                    .pattern("###").pattern(" i ").pattern(" S ")
                    .input('#', Items.TORCH).input('i', Items.IRON_INGOT).input('S', Items.COBBLED_DEEPSLATE)
                    .criterion(RecipeProvider.hasItem(Items.TORCH), RecipeProvider.conditionsFromItem(Items.TORCH))
                    .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Registration.COBBLED_DEEPSLATE_WALL_SCONCE)));

            ShapedRecipeJsonBuilder.create(Registration.CHISELED_DEEPSLATE_WALL_SCONCE, 3)
                    .pattern("###").pattern(" i ").pattern(" S ")
                    .input('#', Items.TORCH).input('i', Items.IRON_INGOT).input('S', Items.CHISELED_DEEPSLATE)
                    .criterion(RecipeProvider.hasItem(Items.TORCH), RecipeProvider.conditionsFromItem(Items.TORCH))
                    .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Registration.CHISELED_DEEPSLATE_WALL_SCONCE)));

            ShapedRecipeJsonBuilder.create(Registration.POLISHED_DEEPSLATE_WALL_SCONCE, 3)
                    .pattern("###").pattern(" i ").pattern(" S ")
                    .input('#', Items.TORCH).input('i', Items.IRON_INGOT).input('S', Items.POLISHED_DEEPSLATE)
                    .criterion(RecipeProvider.hasItem(Items.TORCH), RecipeProvider.conditionsFromItem(Items.TORCH))
                    .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Registration.POLISHED_DEEPSLATE_WALL_SCONCE)));

            ShapedRecipeJsonBuilder.create(Registration.DEEPSLATE_TILES_WALL_SCONCE, 3)
                    .pattern("###").pattern(" i ").pattern(" S ")
                    .input('#', Items.TORCH).input('i', Items.IRON_INGOT).input('S', Items.DEEPSLATE_TILES)
                    .criterion(RecipeProvider.hasItem(Items.TORCH), RecipeProvider.conditionsFromItem(Items.TORCH))
                    .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Registration.DEEPSLATE_TILES_WALL_SCONCE)));

            ShapedRecipeJsonBuilder.create(Registration.CRACKED_DEEPSLATE_TILES_WALL_SCONCE, 3)
                    .pattern("###").pattern(" i ").pattern(" S ")
                    .input('#', Items.TORCH).input('i', Items.IRON_INGOT).input('S', Items.CRACKED_DEEPSLATE_TILES)
                    .criterion(RecipeProvider.hasItem(Items.TORCH), RecipeProvider.conditionsFromItem(Items.TORCH))
                    .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Registration.CRACKED_DEEPSLATE_TILES_WALL_SCONCE)));

            // grate
            ShapedRecipeJsonBuilder.create(Registration.GRATE)
                    .pattern("xnx")
                    .pattern("nnn")
                    .pattern("xnx")
                    .input('x', Items.IRON_INGOT)
                    .input('n', Items.IRON_NUGGET)
                      .criterion(RecipeProvider.hasItem(Items.IRON_INGOT), RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                    .criterion(RecipeProvider.hasItem(Items.IRON_NUGGET), RecipeProvider.conditionsFromItem(Items.IRON_NUGGET))
                    .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Registration.GRATE)));
        }
    }

    /**
     *
     */
    private static class MyBlockLootTables extends FabricBlockLootTableProvider {
        public MyBlockLootTables(FabricDataGenerator dataGenerator) {
            super(dataGenerator);
        }

        @Override
        protected void generateBlockLootTables() {
            // facade
            addDrop(Registration.STONE_FACADE, drops(Registration.STONE_FACADE));
            addDrop(Registration.SMOOTH_STONE_FACADE, drops(Registration.SMOOTH_STONE_FACADE));
            addDrop(Registration.COBBLESTONE_FACADE, drops(Registration.COBBLESTONE_FACADE));
            addDrop(Registration.MOSSY_COBBLESTONE_FACADE, drops(Registration.MOSSY_COBBLESTONE_FACADE));
            addDrop(Registration.BRICKS_FACADE, drops(Registration.BRICKS_FACADE));
            addDrop(Registration.STONE_BRICKS_FACADE, drops(Registration.STONE_BRICKS_FACADE));
            addDrop(Registration.MOSSY_STONE_BRICKS_FACADE, drops(Registration.MOSSY_STONE_BRICKS_FACADE));
            addDrop(Registration.CRACKED_STONE_BRICKS_FACADE, drops(Registration.CRACKED_STONE_BRICKS_FACADE));
            addDrop(Registration.CHISELED_STONE_BRICKS_FACADE, drops(Registration.CHISELED_STONE_BRICKS_FACADE));
            addDrop(Registration.OBSIDIAN_FACADE, drops(Registration.OBSIDIAN_FACADE));

            addDrop(Registration.SANDSTONE_FACADE, drops(Registration.SANDSTONE_FACADE));
            addDrop(Registration.SMOOTH_SANDSTONE_FACADE, drops(Registration.SMOOTH_SANDSTONE_FACADE));
            addDrop(Registration.CHISELED_SANDSTONE_FACADE, drops(Registration.CHISELED_SANDSTONE_FACADE));
            addDrop(Registration.CUT_SANDSTONE_FACADE, drops(Registration.CUT_SANDSTONE_FACADE));
            addDrop(Registration.RED_SANDSTONE_FACADE, drops(Registration.RED_SANDSTONE_FACADE));
            addDrop(Registration.SMOOTH_RED_SANDSTONE_FACADE, drops(Registration.SMOOTH_RED_SANDSTONE_FACADE));
            addDrop(Registration.CHISELED_RED_SANDSTONE_FACADE, drops(Registration.CHISELED_RED_SANDSTONE_FACADE));
            addDrop(Registration.CUT_RED_SANDSTONE_FACADE, drops(Registration.CUT_RED_SANDSTONE_FACADE));

            addDrop(Registration.BLACKSTONE_FACADE, drops(Registration.BLACKSTONE_FACADE));
            addDrop(Registration.POLISHED_BLACKSTONE_FACADE, drops(Registration.POLISHED_BLACKSTONE_FACADE));
            addDrop(Registration.CHISELED_POLISHED_BLACKSTONE_FACADE, drops(Registration.CHISELED_POLISHED_BLACKSTONE_FACADE));
            addDrop(Registration.GILDED_BLACKSTONE_FACADE, drops(Registration.GILDED_BLACKSTONE_FACADE));
            addDrop(Registration.POLISHED_BLACKSTONE_BRICKS_FACADE, drops(Registration.POLISHED_BLACKSTONE_BRICKS_FACADE));
            addDrop(Registration.CRACKED_POLISHED_BLACKSTONE_BRICKS_FACADE, drops(Registration.CRACKED_POLISHED_BLACKSTONE_BRICKS_FACADE));

            addDrop(Registration.DEEPSLATE_FACADE, drops(Registration.DEEPSLATE_FACADE));
            addDrop(Registration.DEEPSLATE_BRICKS_FACADE, drops(Registration.DEEPSLATE_BRICKS_FACADE));
            addDrop(Registration.CRACKED_DEEPSLATE_BRICKS_FACADE, drops(Registration.CRACKED_DEEPSLATE_BRICKS_FACADE));
            addDrop(Registration.COBBLED_DEEPSLATE_FACADE, drops(Registration.COBBLED_DEEPSLATE_FACADE));
            addDrop(Registration.POLISHED_DEEPSLATE_FACADE, drops(Registration.POLISHED_DEEPSLATE_FACADE));
            addDrop(Registration.CHISELED_DEEPSLATE_FACADE, drops(Registration.CHISELED_DEEPSLATE_FACADE));
            addDrop(Registration.DEEPSLATE_TILES_FACADE, drops(Registration.DEEPSLATE_TILES_FACADE));
            addDrop(Registration.CRACKED_DEEPSLATE_TILES_FACADE, drops(Registration.CRACKED_DEEPSLATE_TILES_FACADE));

            // quarter facade
            addDrop(Registration.STONE_QUARTER_FACADE, drops(Registration.STONE_QUARTER_FACADE));
            addDrop(Registration.SMOOTH_STONE_QUARTER_FACADE, drops(Registration.SMOOTH_STONE_QUARTER_FACADE));
            addDrop(Registration.COBBLESTONE_QUARTER_FACADE, drops(Registration.COBBLESTONE_QUARTER_FACADE));
            addDrop(Registration.MOSSY_COBBLESTONE_QUARTER_FACADE, drops(Registration.MOSSY_COBBLESTONE_QUARTER_FACADE));
            addDrop(Registration.BRICKS_QUARTER_FACADE, drops(Registration.BRICKS_QUARTER_FACADE));
            addDrop(Registration.STONE_BRICKS_QUARTER_FACADE, drops(Registration.STONE_BRICKS_QUARTER_FACADE));
            addDrop(Registration.MOSSY_STONE_BRICKS_QUARTER_FACADE, drops(Registration.MOSSY_STONE_BRICKS_QUARTER_FACADE));
            addDrop(Registration.CRACKED_STONE_BRICKS_QUARTER_FACADE, drops(Registration.CRACKED_STONE_BRICKS_QUARTER_FACADE));
            addDrop(Registration.CHISELED_STONE_BRICKS_QUARTER_FACADE, drops(Registration.CHISELED_STONE_BRICKS_QUARTER_FACADE));
            addDrop(Registration.OBSIDIAN_QUARTER_FACADE, drops(Registration.OBSIDIAN_QUARTER_FACADE));

            addDrop(Registration.SANDSTONE_QUARTER_FACADE, drops(Registration.SANDSTONE_QUARTER_FACADE));
            addDrop(Registration.SMOOTH_SANDSTONE_QUARTER_FACADE, drops(Registration.SMOOTH_SANDSTONE_QUARTER_FACADE));
            addDrop(Registration.CHISELED_SANDSTONE_QUARTER_FACADE, drops(Registration.CHISELED_SANDSTONE_QUARTER_FACADE));
            addDrop(Registration.CUT_SANDSTONE_QUARTER_FACADE, drops(Registration.CUT_SANDSTONE_QUARTER_FACADE));
            addDrop(Registration.RED_SANDSTONE_QUARTER_FACADE, drops(Registration.RED_SANDSTONE_QUARTER_FACADE));
            addDrop(Registration.SMOOTH_RED_SANDSTONE_QUARTER_FACADE, drops(Registration.SMOOTH_RED_SANDSTONE_QUARTER_FACADE));
            addDrop(Registration.CHISELED_RED_SANDSTONE_QUARTER_FACADE, drops(Registration.CHISELED_RED_SANDSTONE_QUARTER_FACADE));
            addDrop(Registration.CUT_RED_SANDSTONE_QUARTER_FACADE, drops(Registration.CUT_RED_SANDSTONE_QUARTER_FACADE));

            addDrop(Registration.BLACKSTONE_QUARTER_FACADE, drops(Registration.BLACKSTONE_QUARTER_FACADE));
            addDrop(Registration.POLISHED_BLACKSTONE_QUARTER_FACADE, drops(Registration.POLISHED_BLACKSTONE_QUARTER_FACADE));
            addDrop(Registration.CHISELED_POLISHED_BLACKSTONE_QUARTER_FACADE, drops(Registration.CHISELED_POLISHED_BLACKSTONE_QUARTER_FACADE));
            addDrop(Registration.GILDED_BLACKSTONE_QUARTER_FACADE, drops(Registration.GILDED_BLACKSTONE_QUARTER_FACADE));
            addDrop(Registration.POLISHED_BLACKSTONE_BRICKS_QUARTER_FACADE, drops(Registration.POLISHED_BLACKSTONE_BRICKS_QUARTER_FACADE));
            addDrop(Registration.CRACKED_POLISHED_BLACKSTONE_BRICKS_QUARTER_FACADE, drops(Registration.CRACKED_POLISHED_BLACKSTONE_BRICKS_QUARTER_FACADE));

            addDrop(Registration.DEEPSLATE_QUARTER_FACADE, drops(Registration.DEEPSLATE_QUARTER_FACADE));
            addDrop(Registration.DEEPSLATE_BRICKS_QUARTER_FACADE, drops(Registration.DEEPSLATE_BRICKS_QUARTER_FACADE));
            addDrop(Registration.CRACKED_DEEPSLATE_BRICKS_QUARTER_FACADE, drops(Registration.CRACKED_DEEPSLATE_BRICKS_QUARTER_FACADE));
            addDrop(Registration.COBBLED_DEEPSLATE_QUARTER_FACADE, drops(Registration.COBBLED_DEEPSLATE_QUARTER_FACADE));
            addDrop(Registration.POLISHED_DEEPSLATE_QUARTER_FACADE, drops(Registration.POLISHED_DEEPSLATE_QUARTER_FACADE));
            addDrop(Registration.CHISELED_DEEPSLATE_QUARTER_FACADE, drops(Registration.CHISELED_DEEPSLATE_QUARTER_FACADE));
            addDrop(Registration.DEEPSLATE_TILES_QUARTER_FACADE, drops(Registration.DEEPSLATE_TILES_QUARTER_FACADE));
            addDrop(Registration.CRACKED_DEEPSLATE_TILES_QUARTER_FACADE, drops(Registration.CRACKED_DEEPSLATE_TILES_QUARTER_FACADE));

            // fluted
            addDrop(Registration.STONE_FLUTED, drops(Registration.STONE_FLUTED));
            addDrop(Registration.SMOOTH_STONE_FLUTED, drops(Registration.SMOOTH_STONE_FLUTED));
            addDrop(Registration.COBBLESTONE_FLUTED, drops(Registration.COBBLESTONE_FLUTED));
            addDrop(Registration.MOSSY_COBBLESTONE_FLUTED, drops(Registration.MOSSY_COBBLESTONE_FLUTED));
            addDrop(Registration.BRICKS_FLUTED, drops(Registration.BRICKS_FLUTED));
            addDrop(Registration.STONE_BRICKS_FLUTED, drops(Registration.STONE_BRICKS_FLUTED));
            addDrop(Registration.MOSSY_STONE_BRICKS_FLUTED, drops(Registration.MOSSY_STONE_BRICKS_FLUTED));
            addDrop(Registration.CRACKED_STONE_BRICKS_FLUTED, drops(Registration.CRACKED_STONE_BRICKS_FLUTED));
            addDrop(Registration.CHISELED_STONE_BRICKS_FLUTED, drops(Registration.CHISELED_STONE_BRICKS_FLUTED));
            addDrop(Registration.OBSIDIAN_FLUTED, drops(Registration.OBSIDIAN_FLUTED));

            addDrop(Registration.SANDSTONE_FLUTED, drops(Registration.SANDSTONE_FLUTED));
            addDrop(Registration.SMOOTH_SANDSTONE_FLUTED, drops(Registration.SMOOTH_SANDSTONE_FLUTED));
            addDrop(Registration.CHISELED_SANDSTONE_FLUTED, drops(Registration.CHISELED_SANDSTONE_FLUTED));
            addDrop(Registration.CUT_SANDSTONE_FLUTED, drops(Registration.CUT_SANDSTONE_FLUTED));
            addDrop(Registration.RED_SANDSTONE_FLUTED, drops(Registration.RED_SANDSTONE_FLUTED));
            addDrop(Registration.SMOOTH_RED_SANDSTONE_FLUTED, drops(Registration.SMOOTH_RED_SANDSTONE_FLUTED));
            addDrop(Registration.CHISELED_RED_SANDSTONE_FLUTED, drops(Registration.CHISELED_RED_SANDSTONE_FLUTED));
            addDrop(Registration.CUT_RED_SANDSTONE_FLUTED, drops(Registration.CUT_RED_SANDSTONE_FLUTED));

            addDrop(Registration.BLACKSTONE_FLUTED, drops(Registration.BLACKSTONE_FLUTED));
            addDrop(Registration.POLISHED_BLACKSTONE_FLUTED, drops(Registration.POLISHED_BLACKSTONE_FLUTED));
            addDrop(Registration.CHISELED_POLISHED_BLACKSTONE_FLUTED, drops(Registration.CHISELED_POLISHED_BLACKSTONE_FLUTED));
            addDrop(Registration.GILDED_BLACKSTONE_FLUTED, drops(Registration.GILDED_BLACKSTONE_FLUTED));
            addDrop(Registration.POLISHED_BLACKSTONE_BRICKS_FLUTED, drops(Registration.POLISHED_BLACKSTONE_BRICKS_FLUTED));
            addDrop(Registration.CRACKED_POLISHED_BLACKSTONE_BRICKS_FLUTED, drops(Registration.CRACKED_POLISHED_BLACKSTONE_BRICKS_FLUTED));

            addDrop(Registration.DEEPSLATE_FLUTED, drops(Registration.DEEPSLATE_FLUTED));
            addDrop(Registration.DEEPSLATE_BRICKS_FLUTED, drops(Registration.DEEPSLATE_BRICKS_FLUTED));
            addDrop(Registration.CRACKED_DEEPSLATE_BRICKS_FLUTED, drops(Registration.CRACKED_DEEPSLATE_BRICKS_FLUTED));
            addDrop(Registration.COBBLED_DEEPSLATE_FLUTED, drops(Registration.COBBLED_DEEPSLATE_FLUTED));
            addDrop(Registration.POLISHED_DEEPSLATE_FLUTED, drops(Registration.POLISHED_DEEPSLATE_FLUTED));
            addDrop(Registration.CHISELED_DEEPSLATE_FLUTED, drops(Registration.CHISELED_DEEPSLATE_FLUTED));
            addDrop(Registration.DEEPSLATE_TILES_FLUTED, drops(Registration.DEEPSLATE_TILES_FLUTED));
            addDrop(Registration.CRACKED_DEEPSLATE_TILES_FLUTED, drops(Registration.CRACKED_DEEPSLATE_TILES_FLUTED));
            
            // fluted facade
            addDrop(Registration.STONE_FLUTED_FACADE, drops(Registration.STONE_FLUTED_FACADE));
            addDrop(Registration.SMOOTH_STONE_FLUTED_FACADE, drops(Registration.SMOOTH_STONE_FLUTED_FACADE));
            addDrop(Registration.COBBLESTONE_FLUTED_FACADE, drops(Registration.COBBLESTONE_FLUTED_FACADE));
            addDrop(Registration.MOSSY_COBBLESTONE_FLUTED_FACADE, drops(Registration.MOSSY_COBBLESTONE_FLUTED_FACADE));
            addDrop(Registration.BRICKS_FLUTED_FACADE, drops(Registration.BRICKS_FLUTED_FACADE));
            addDrop(Registration.STONE_BRICKS_FLUTED_FACADE, drops(Registration.STONE_BRICKS_FLUTED_FACADE));
            addDrop(Registration.MOSSY_STONE_BRICKS_FLUTED_FACADE, drops(Registration.MOSSY_STONE_BRICKS_FLUTED_FACADE));
            addDrop(Registration.CRACKED_STONE_BRICKS_FLUTED_FACADE, drops(Registration.CRACKED_STONE_BRICKS_FLUTED_FACADE));
            addDrop(Registration.CHISELED_STONE_BRICKS_FLUTED_FACADE, drops(Registration.CHISELED_STONE_BRICKS_FLUTED_FACADE));
            addDrop(Registration.OBSIDIAN_FLUTED_FACADE, drops(Registration.OBSIDIAN_FLUTED_FACADE));

            addDrop(Registration.SANDSTONE_FLUTED_FACADE, drops(Registration.SANDSTONE_FLUTED_FACADE));
            addDrop(Registration.SMOOTH_SANDSTONE_FLUTED_FACADE, drops(Registration.SMOOTH_SANDSTONE_FLUTED_FACADE));
            addDrop(Registration.CHISELED_SANDSTONE_FLUTED_FACADE, drops(Registration.CHISELED_SANDSTONE_FLUTED_FACADE));
            addDrop(Registration.CUT_SANDSTONE_FLUTED_FACADE, drops(Registration.CUT_SANDSTONE_FLUTED_FACADE));
            addDrop(Registration.RED_SANDSTONE_FLUTED_FACADE, drops(Registration.RED_SANDSTONE_FLUTED_FACADE));
            addDrop(Registration.SMOOTH_RED_SANDSTONE_FLUTED_FACADE, drops(Registration.SMOOTH_RED_SANDSTONE_FLUTED_FACADE));
            addDrop(Registration.CHISELED_RED_SANDSTONE_FLUTED_FACADE, drops(Registration.CHISELED_RED_SANDSTONE_FLUTED_FACADE));
            addDrop(Registration.CUT_RED_SANDSTONE_FLUTED_FACADE, drops(Registration.CUT_RED_SANDSTONE_FLUTED_FACADE));

            addDrop(Registration.BLACKSTONE_FLUTED_FACADE, drops(Registration.BLACKSTONE_FLUTED_FACADE));
            addDrop(Registration.POLISHED_BLACKSTONE_FLUTED_FACADE, drops(Registration.POLISHED_BLACKSTONE_FLUTED_FACADE));
            addDrop(Registration.CHISELED_POLISHED_BLACKSTONE_FLUTED_FACADE, drops(Registration.CHISELED_POLISHED_BLACKSTONE_FLUTED_FACADE));
            addDrop(Registration.GILDED_BLACKSTONE_FLUTED_FACADE, drops(Registration.GILDED_BLACKSTONE_FLUTED_FACADE));
            addDrop(Registration.POLISHED_BLACKSTONE_BRICKS_FLUTED_FACADE, drops(Registration.POLISHED_BLACKSTONE_BRICKS_FLUTED_FACADE));
            addDrop(Registration.CRACKED_POLISHED_BLACKSTONE_BRICKS_FLUTED_FACADE, drops(Registration.CRACKED_POLISHED_BLACKSTONE_BRICKS_FLUTED_FACADE));

            addDrop(Registration.DEEPSLATE_FLUTED_FACADE, drops(Registration.DEEPSLATE_FLUTED_FACADE));
            addDrop(Registration.DEEPSLATE_BRICKS_FLUTED_FACADE, drops(Registration.DEEPSLATE_BRICKS_FLUTED_FACADE));
            addDrop(Registration.CRACKED_DEEPSLATE_BRICKS_FLUTED_FACADE, drops(Registration.CRACKED_DEEPSLATE_BRICKS_FLUTED_FACADE));
            addDrop(Registration.COBBLED_DEEPSLATE_FLUTED_FACADE, drops(Registration.COBBLED_DEEPSLATE_FLUTED_FACADE));
            addDrop(Registration.POLISHED_DEEPSLATE_FLUTED_FACADE, drops(Registration.POLISHED_DEEPSLATE_FLUTED_FACADE));
            addDrop(Registration.CHISELED_DEEPSLATE_FLUTED_FACADE, drops(Registration.CHISELED_DEEPSLATE_FLUTED_FACADE));
            addDrop(Registration.DEEPSLATE_TILES_FLUTED_FACADE, drops(Registration.DEEPSLATE_TILES_FLUTED_FACADE));
            addDrop(Registration.CRACKED_DEEPSLATE_TILES_FLUTED_FACADE, drops(Registration.CRACKED_DEEPSLATE_TILES_FLUTED_FACADE));
            
            // sill
            addDrop(Registration.STONE_SILL, drops(Registration.STONE_SILL));
            addDrop(Registration.SMOOTH_STONE_SILL, drops(Registration.SMOOTH_STONE_SILL));
            addDrop(Registration.COBBLESTONE_SILL, drops(Registration.COBBLESTONE_SILL));
            addDrop(Registration.MOSSY_COBBLESTONE_SILL, drops(Registration.MOSSY_COBBLESTONE_SILL));
            addDrop(Registration.BRICKS_SILL, drops(Registration.BRICKS_SILL));
            addDrop(Registration.STONE_BRICKS_SILL, drops(Registration.STONE_BRICKS_SILL));
            addDrop(Registration.MOSSY_STONE_BRICKS_SILL, drops(Registration.MOSSY_STONE_BRICKS_SILL));
            addDrop(Registration.CRACKED_STONE_BRICKS_SILL, drops(Registration.CRACKED_STONE_BRICKS_SILL));
            addDrop(Registration.CHISELED_STONE_BRICKS_SILL, drops(Registration.CHISELED_STONE_BRICKS_SILL));
            addDrop(Registration.OBSIDIAN_SILL, drops(Registration.OBSIDIAN_SILL));

            addDrop(Registration.SANDSTONE_SILL, drops(Registration.SANDSTONE_SILL));
            addDrop(Registration.SMOOTH_SANDSTONE_SILL, drops(Registration.SMOOTH_SANDSTONE_SILL));
            addDrop(Registration.CHISELED_SANDSTONE_SILL, drops(Registration.CHISELED_SANDSTONE_SILL));
            addDrop(Registration.CUT_SANDSTONE_SILL, drops(Registration.CUT_SANDSTONE_SILL));
            addDrop(Registration.RED_SANDSTONE_SILL, drops(Registration.RED_SANDSTONE_SILL));
            addDrop(Registration.SMOOTH_RED_SANDSTONE_SILL, drops(Registration.SMOOTH_RED_SANDSTONE_SILL));
            addDrop(Registration.CHISELED_RED_SANDSTONE_SILL, drops(Registration.CHISELED_RED_SANDSTONE_SILL));
            addDrop(Registration.CUT_RED_SANDSTONE_SILL, drops(Registration.CUT_RED_SANDSTONE_SILL));

            addDrop(Registration.BLACKSTONE_SILL, drops(Registration.BLACKSTONE_SILL));
            addDrop(Registration.POLISHED_BLACKSTONE_SILL, drops(Registration.POLISHED_BLACKSTONE_SILL));
            addDrop(Registration.CHISELED_POLISHED_BLACKSTONE_SILL, drops(Registration.CHISELED_POLISHED_BLACKSTONE_SILL));
            addDrop(Registration.GILDED_BLACKSTONE_SILL, drops(Registration.GILDED_BLACKSTONE_SILL));
            addDrop(Registration.POLISHED_BLACKSTONE_BRICKS_SILL, drops(Registration.POLISHED_BLACKSTONE_BRICKS_SILL));
            addDrop(Registration.CRACKED_POLISHED_BLACKSTONE_BRICKS_SILL, drops(Registration.CRACKED_POLISHED_BLACKSTONE_BRICKS_SILL));

            addDrop(Registration.DEEPSLATE_SILL, drops(Registration.DEEPSLATE_SILL));
            addDrop(Registration.DEEPSLATE_BRICKS_SILL, drops(Registration.DEEPSLATE_BRICKS_SILL));
            addDrop(Registration.CRACKED_DEEPSLATE_BRICKS_SILL, drops(Registration.CRACKED_DEEPSLATE_BRICKS_SILL));
            addDrop(Registration.COBBLED_DEEPSLATE_SILL, drops(Registration.COBBLED_DEEPSLATE_SILL));
            addDrop(Registration.POLISHED_DEEPSLATE_SILL, drops(Registration.POLISHED_DEEPSLATE_SILL));
            addDrop(Registration.CHISELED_DEEPSLATE_SILL, drops(Registration.CHISELED_DEEPSLATE_SILL));
            addDrop(Registration.DEEPSLATE_TILES_SILL, drops(Registration.DEEPSLATE_TILES_SILL));
            addDrop(Registration.CRACKED_DEEPSLATE_TILES_SILL, drops(Registration.CRACKED_DEEPSLATE_TILES_SILL));
            
            // double sill
            addDrop(Registration.STONE_DOUBLE_SILL, drops(Registration.STONE_DOUBLE_SILL));
            addDrop(Registration.SMOOTH_STONE_DOUBLE_SILL, drops(Registration.SMOOTH_STONE_DOUBLE_SILL));
            addDrop(Registration.COBBLESTONE_DOUBLE_SILL, drops(Registration.COBBLESTONE_DOUBLE_SILL));
            addDrop(Registration.MOSSY_COBBLESTONE_DOUBLE_SILL, drops(Registration.MOSSY_COBBLESTONE_DOUBLE_SILL));
            addDrop(Registration.BRICKS_DOUBLE_SILL, drops(Registration.BRICKS_DOUBLE_SILL));
            addDrop(Registration.STONE_BRICKS_DOUBLE_SILL, drops(Registration.STONE_BRICKS_DOUBLE_SILL));
            addDrop(Registration.MOSSY_STONE_BRICKS_DOUBLE_SILL, drops(Registration.MOSSY_STONE_BRICKS_DOUBLE_SILL));
            addDrop(Registration.CRACKED_STONE_BRICKS_DOUBLE_SILL, drops(Registration.CRACKED_STONE_BRICKS_DOUBLE_SILL));
            addDrop(Registration.CHISELED_STONE_BRICKS_DOUBLE_SILL, drops(Registration.CHISELED_STONE_BRICKS_DOUBLE_SILL));
            addDrop(Registration.OBSIDIAN_DOUBLE_SILL, drops(Registration.OBSIDIAN_DOUBLE_SILL));

            addDrop(Registration.SANDSTONE_DOUBLE_SILL, drops(Registration.SANDSTONE_DOUBLE_SILL));
            addDrop(Registration.SMOOTH_SANDSTONE_DOUBLE_SILL, drops(Registration.SMOOTH_SANDSTONE_DOUBLE_SILL));
            addDrop(Registration.CHISELED_SANDSTONE_DOUBLE_SILL, drops(Registration.CHISELED_SANDSTONE_DOUBLE_SILL));
            addDrop(Registration.CUT_SANDSTONE_DOUBLE_SILL, drops(Registration.CUT_SANDSTONE_DOUBLE_SILL));
            addDrop(Registration.RED_SANDSTONE_DOUBLE_SILL, drops(Registration.RED_SANDSTONE_DOUBLE_SILL));
            addDrop(Registration.SMOOTH_RED_SANDSTONE_DOUBLE_SILL, drops(Registration.SMOOTH_RED_SANDSTONE_DOUBLE_SILL));
            addDrop(Registration.CHISELED_RED_SANDSTONE_DOUBLE_SILL, drops(Registration.CHISELED_RED_SANDSTONE_DOUBLE_SILL));
            addDrop(Registration.CUT_RED_SANDSTONE_DOUBLE_SILL, drops(Registration.CUT_RED_SANDSTONE_DOUBLE_SILL));

            addDrop(Registration.BLACKSTONE_DOUBLE_SILL, drops(Registration.BLACKSTONE_DOUBLE_SILL));
            addDrop(Registration.POLISHED_BLACKSTONE_DOUBLE_SILL, drops(Registration.POLISHED_BLACKSTONE_DOUBLE_SILL));
            addDrop(Registration.CHISELED_POLISHED_BLACKSTONE_DOUBLE_SILL, drops(Registration.CHISELED_POLISHED_BLACKSTONE_DOUBLE_SILL));
            addDrop(Registration.GILDED_BLACKSTONE_DOUBLE_SILL, drops(Registration.GILDED_BLACKSTONE_DOUBLE_SILL));
            addDrop(Registration.POLISHED_BLACKSTONE_BRICKS_DOUBLE_SILL, drops(Registration.POLISHED_BLACKSTONE_BRICKS_DOUBLE_SILL));
            addDrop(Registration.CRACKED_POLISHED_BLACKSTONE_BRICKS_DOUBLE_SILL, drops(Registration.CRACKED_POLISHED_BLACKSTONE_BRICKS_DOUBLE_SILL));

            addDrop(Registration.DEEPSLATE_DOUBLE_SILL, drops(Registration.DEEPSLATE_DOUBLE_SILL));
            addDrop(Registration.DEEPSLATE_BRICKS_DOUBLE_SILL, drops(Registration.DEEPSLATE_BRICKS_DOUBLE_SILL));
            addDrop(Registration.CRACKED_DEEPSLATE_BRICKS_DOUBLE_SILL, drops(Registration.CRACKED_DEEPSLATE_BRICKS_DOUBLE_SILL));
            addDrop(Registration.COBBLED_DEEPSLATE_DOUBLE_SILL, drops(Registration.COBBLED_DEEPSLATE_DOUBLE_SILL));
            addDrop(Registration.POLISHED_DEEPSLATE_DOUBLE_SILL, drops(Registration.POLISHED_DEEPSLATE_DOUBLE_SILL));
            addDrop(Registration.CHISELED_DEEPSLATE_DOUBLE_SILL, drops(Registration.CHISELED_DEEPSLATE_DOUBLE_SILL));
            addDrop(Registration.DEEPSLATE_TILES_DOUBLE_SILL, drops(Registration.DEEPSLATE_TILES_DOUBLE_SILL));
            addDrop(Registration.CRACKED_DEEPSLATE_TILES_DOUBLE_SILL, drops(Registration.CRACKED_DEEPSLATE_TILES_DOUBLE_SILL));
            
            // cornice
            addDrop(Registration.STONE_CORNICE, drops(Registration.STONE_CORNICE));
            addDrop(Registration.SMOOTH_STONE_CORNICE, drops(Registration.SMOOTH_STONE_CORNICE));
            addDrop(Registration.COBBLESTONE_CORNICE, drops(Registration.COBBLESTONE_CORNICE));
            addDrop(Registration.MOSSY_COBBLESTONE_CORNICE, drops(Registration.MOSSY_COBBLESTONE_CORNICE));
            addDrop(Registration.BRICKS_CORNICE, drops(Registration.BRICKS_CORNICE));
            addDrop(Registration.STONE_BRICKS_CORNICE, drops(Registration.STONE_BRICKS_CORNICE));
            addDrop(Registration.MOSSY_STONE_BRICKS_CORNICE, drops(Registration.MOSSY_STONE_BRICKS_CORNICE));
            addDrop(Registration.CRACKED_STONE_BRICKS_CORNICE, drops(Registration.CRACKED_STONE_BRICKS_CORNICE));
            addDrop(Registration.CHISELED_STONE_BRICKS_CORNICE, drops(Registration.CHISELED_STONE_BRICKS_CORNICE));
            addDrop(Registration.OBSIDIAN_CORNICE, drops(Registration.OBSIDIAN_CORNICE));

            addDrop(Registration.SANDSTONE_CORNICE, drops(Registration.SANDSTONE_CORNICE));
            addDrop(Registration.SMOOTH_SANDSTONE_CORNICE, drops(Registration.SMOOTH_SANDSTONE_CORNICE));
            addDrop(Registration.CHISELED_SANDSTONE_CORNICE, drops(Registration.CHISELED_SANDSTONE_CORNICE));
            addDrop(Registration.CUT_SANDSTONE_CORNICE, drops(Registration.CUT_SANDSTONE_CORNICE));
            addDrop(Registration.RED_SANDSTONE_CORNICE, drops(Registration.RED_SANDSTONE_CORNICE));
            addDrop(Registration.SMOOTH_RED_SANDSTONE_CORNICE, drops(Registration.SMOOTH_RED_SANDSTONE_CORNICE));
            addDrop(Registration.CHISELED_RED_SANDSTONE_CORNICE, drops(Registration.CHISELED_RED_SANDSTONE_CORNICE));
            addDrop(Registration.CUT_RED_SANDSTONE_CORNICE, drops(Registration.CUT_RED_SANDSTONE_CORNICE));

            addDrop(Registration.BLACKSTONE_CORNICE, drops(Registration.BLACKSTONE_CORNICE));
            addDrop(Registration.POLISHED_BLACKSTONE_CORNICE, drops(Registration.POLISHED_BLACKSTONE_CORNICE));
            addDrop(Registration.CHISELED_POLISHED_BLACKSTONE_CORNICE, drops(Registration.CHISELED_POLISHED_BLACKSTONE_CORNICE));
            addDrop(Registration.GILDED_BLACKSTONE_CORNICE, drops(Registration.GILDED_BLACKSTONE_CORNICE));
            addDrop(Registration.POLISHED_BLACKSTONE_BRICKS_CORNICE, drops(Registration.POLISHED_BLACKSTONE_BRICKS_CORNICE));
            addDrop(Registration.CRACKED_POLISHED_BLACKSTONE_BRICKS_CORNICE, drops(Registration.CRACKED_POLISHED_BLACKSTONE_BRICKS_CORNICE));

            addDrop(Registration.DEEPSLATE_CORNICE, drops(Registration.DEEPSLATE_CORNICE));
            addDrop(Registration.DEEPSLATE_BRICKS_CORNICE, drops(Registration.DEEPSLATE_BRICKS_CORNICE));
            addDrop(Registration.CRACKED_DEEPSLATE_BRICKS_CORNICE, drops(Registration.CRACKED_DEEPSLATE_BRICKS_CORNICE));
            addDrop(Registration.COBBLED_DEEPSLATE_CORNICE, drops(Registration.COBBLED_DEEPSLATE_CORNICE));
            addDrop(Registration.POLISHED_DEEPSLATE_CORNICE, drops(Registration.POLISHED_DEEPSLATE_CORNICE));
            addDrop(Registration.CHISELED_DEEPSLATE_CORNICE, drops(Registration.CHISELED_DEEPSLATE_CORNICE));
            addDrop(Registration.DEEPSLATE_TILES_CORNICE, drops(Registration.DEEPSLATE_TILES_CORNICE));
            addDrop(Registration.CRACKED_DEEPSLATE_TILES_CORNICE, drops(Registration.CRACKED_DEEPSLATE_TILES_CORNICE));
            
            // crown molding
            addDrop(Registration.STONE_CROWN_MOLDING, drops(Registration.STONE_CROWN_MOLDING));
            addDrop(Registration.SMOOTH_STONE_CROWN_MOLDING, drops(Registration.SMOOTH_STONE_CROWN_MOLDING));
            addDrop(Registration.COBBLESTONE_CROWN_MOLDING, drops(Registration.COBBLESTONE_CROWN_MOLDING));
            addDrop(Registration.MOSSY_COBBLESTONE_CROWN_MOLDING, drops(Registration.MOSSY_COBBLESTONE_CROWN_MOLDING));
            addDrop(Registration.BRICKS_CROWN_MOLDING, drops(Registration.BRICKS_CROWN_MOLDING));
            addDrop(Registration.STONE_BRICKS_CROWN_MOLDING, drops(Registration.STONE_BRICKS_CROWN_MOLDING));
            addDrop(Registration.MOSSY_STONE_BRICKS_CROWN_MOLDING, drops(Registration.MOSSY_STONE_BRICKS_CROWN_MOLDING));
            addDrop(Registration.CRACKED_STONE_BRICKS_CROWN_MOLDING, drops(Registration.CRACKED_STONE_BRICKS_CROWN_MOLDING));
            addDrop(Registration.CHISELED_STONE_BRICKS_CROWN_MOLDING, drops(Registration.CHISELED_STONE_BRICKS_CROWN_MOLDING));
            addDrop(Registration.OBSIDIAN_CROWN_MOLDING, drops(Registration.OBSIDIAN_CROWN_MOLDING));

            addDrop(Registration.SANDSTONE_CROWN_MOLDING, drops(Registration.SANDSTONE_CROWN_MOLDING));
            addDrop(Registration.SMOOTH_SANDSTONE_CROWN_MOLDING, drops(Registration.SMOOTH_SANDSTONE_CROWN_MOLDING));
            addDrop(Registration.CHISELED_SANDSTONE_CROWN_MOLDING, drops(Registration.CHISELED_SANDSTONE_CROWN_MOLDING));
            addDrop(Registration.CUT_SANDSTONE_CROWN_MOLDING, drops(Registration.CUT_SANDSTONE_CROWN_MOLDING));
            addDrop(Registration.RED_SANDSTONE_CROWN_MOLDING, drops(Registration.RED_SANDSTONE_CROWN_MOLDING));
            addDrop(Registration.SMOOTH_RED_SANDSTONE_CROWN_MOLDING, drops(Registration.SMOOTH_RED_SANDSTONE_CROWN_MOLDING));
            addDrop(Registration.CHISELED_RED_SANDSTONE_CROWN_MOLDING, drops(Registration.CHISELED_RED_SANDSTONE_CROWN_MOLDING));
            addDrop(Registration.CUT_RED_SANDSTONE_CROWN_MOLDING, drops(Registration.CUT_RED_SANDSTONE_CROWN_MOLDING));

            addDrop(Registration.BLACKSTONE_CROWN_MOLDING, drops(Registration.BLACKSTONE_CROWN_MOLDING));
            addDrop(Registration.POLISHED_BLACKSTONE_CROWN_MOLDING, drops(Registration.POLISHED_BLACKSTONE_CROWN_MOLDING));
            addDrop(Registration.CHISELED_POLISHED_BLACKSTONE_CROWN_MOLDING, drops(Registration.CHISELED_POLISHED_BLACKSTONE_CROWN_MOLDING));
            addDrop(Registration.GILDED_BLACKSTONE_CROWN_MOLDING, drops(Registration.GILDED_BLACKSTONE_CROWN_MOLDING));
            addDrop(Registration.POLISHED_BLACKSTONE_BRICKS_CROWN_MOLDING, drops(Registration.POLISHED_BLACKSTONE_BRICKS_CROWN_MOLDING));
            addDrop(Registration.CRACKED_POLISHED_BLACKSTONE_BRICKS_CROWN_MOLDING, drops(Registration.CRACKED_POLISHED_BLACKSTONE_BRICKS_CROWN_MOLDING));

            addDrop(Registration.DEEPSLATE_CROWN_MOLDING, drops(Registration.DEEPSLATE_CROWN_MOLDING));
            addDrop(Registration.DEEPSLATE_BRICKS_CROWN_MOLDING, drops(Registration.DEEPSLATE_BRICKS_CROWN_MOLDING));
            addDrop(Registration.CRACKED_DEEPSLATE_BRICKS_CROWN_MOLDING, drops(Registration.CRACKED_DEEPSLATE_BRICKS_CROWN_MOLDING));
            addDrop(Registration.COBBLED_DEEPSLATE_CROWN_MOLDING, drops(Registration.COBBLED_DEEPSLATE_CROWN_MOLDING));
            addDrop(Registration.POLISHED_DEEPSLATE_CROWN_MOLDING, drops(Registration.POLISHED_DEEPSLATE_CROWN_MOLDING));
            addDrop(Registration.CHISELED_DEEPSLATE_CROWN_MOLDING, drops(Registration.CHISELED_DEEPSLATE_CROWN_MOLDING));
            addDrop(Registration.DEEPSLATE_TILES_CROWN_MOLDING, drops(Registration.DEEPSLATE_TILES_CROWN_MOLDING));
            addDrop(Registration.CRACKED_DEEPSLATE_TILES_CROWN_MOLDING, drops(Registration.CRACKED_DEEPSLATE_TILES_CROWN_MOLDING));
            
            // pillar base
            addDrop(Registration.STONE_PILLAR_BASE, drops(Registration.STONE_PILLAR_BASE));
            addDrop(Registration.SMOOTH_STONE_PILLAR_BASE, drops(Registration.SMOOTH_STONE_PILLAR_BASE));
            addDrop(Registration.COBBLESTONE_PILLAR_BASE, drops(Registration.COBBLESTONE_PILLAR_BASE));
            addDrop(Registration.MOSSY_COBBLESTONE_PILLAR_BASE, drops(Registration.MOSSY_COBBLESTONE_PILLAR_BASE));
            addDrop(Registration.BRICKS_PILLAR_BASE, drops(Registration.BRICKS_PILLAR_BASE));
            addDrop(Registration.STONE_BRICKS_PILLAR_BASE, drops(Registration.STONE_BRICKS_PILLAR_BASE));
            addDrop(Registration.MOSSY_STONE_BRICKS_PILLAR_BASE, drops(Registration.MOSSY_STONE_BRICKS_PILLAR_BASE));
            addDrop(Registration.CRACKED_STONE_BRICKS_PILLAR_BASE, drops(Registration.CRACKED_STONE_BRICKS_PILLAR_BASE));
            addDrop(Registration.CHISELED_STONE_BRICKS_PILLAR_BASE, drops(Registration.CHISELED_STONE_BRICKS_PILLAR_BASE));
            addDrop(Registration.OBSIDIAN_PILLAR_BASE, drops(Registration.OBSIDIAN_PILLAR_BASE));

            addDrop(Registration.SANDSTONE_PILLAR_BASE, drops(Registration.SANDSTONE_PILLAR_BASE));
            addDrop(Registration.SMOOTH_SANDSTONE_PILLAR_BASE, drops(Registration.SMOOTH_SANDSTONE_PILLAR_BASE));
            addDrop(Registration.CHISELED_SANDSTONE_PILLAR_BASE, drops(Registration.CHISELED_SANDSTONE_PILLAR_BASE));
            addDrop(Registration.CUT_SANDSTONE_PILLAR_BASE, drops(Registration.CUT_SANDSTONE_PILLAR_BASE));
            addDrop(Registration.RED_SANDSTONE_PILLAR_BASE, drops(Registration.RED_SANDSTONE_PILLAR_BASE));
            addDrop(Registration.SMOOTH_RED_SANDSTONE_PILLAR_BASE, drops(Registration.SMOOTH_RED_SANDSTONE_PILLAR_BASE));
            addDrop(Registration.CHISELED_RED_SANDSTONE_PILLAR_BASE, drops(Registration.CHISELED_RED_SANDSTONE_PILLAR_BASE));
            addDrop(Registration.CUT_RED_SANDSTONE_PILLAR_BASE, drops(Registration.CUT_RED_SANDSTONE_PILLAR_BASE));

            addDrop(Registration.BLACKSTONE_PILLAR_BASE, drops(Registration.BLACKSTONE_PILLAR_BASE));
            addDrop(Registration.POLISHED_BLACKSTONE_PILLAR_BASE, drops(Registration.POLISHED_BLACKSTONE_PILLAR_BASE));
            addDrop(Registration.CHISELED_POLISHED_BLACKSTONE_PILLAR_BASE, drops(Registration.CHISELED_POLISHED_BLACKSTONE_PILLAR_BASE));
            addDrop(Registration.GILDED_BLACKSTONE_PILLAR_BASE, drops(Registration.GILDED_BLACKSTONE_PILLAR_BASE));
            addDrop(Registration.POLISHED_BLACKSTONE_BRICKS_PILLAR_BASE, drops(Registration.POLISHED_BLACKSTONE_BRICKS_PILLAR_BASE));
            addDrop(Registration.CRACKED_POLISHED_BLACKSTONE_BRICKS_PILLAR_BASE, drops(Registration.CRACKED_POLISHED_BLACKSTONE_BRICKS_PILLAR_BASE));

            addDrop(Registration.DEEPSLATE_PILLAR_BASE, drops(Registration.DEEPSLATE_PILLAR_BASE));
            addDrop(Registration.DEEPSLATE_BRICKS_PILLAR_BASE, drops(Registration.DEEPSLATE_BRICKS_PILLAR_BASE));
            addDrop(Registration.CRACKED_DEEPSLATE_BRICKS_PILLAR_BASE, drops(Registration.CRACKED_DEEPSLATE_BRICKS_PILLAR_BASE));
            addDrop(Registration.COBBLED_DEEPSLATE_PILLAR_BASE, drops(Registration.COBBLED_DEEPSLATE_PILLAR_BASE));
            addDrop(Registration.POLISHED_DEEPSLATE_PILLAR_BASE, drops(Registration.POLISHED_DEEPSLATE_PILLAR_BASE));
            addDrop(Registration.CHISELED_DEEPSLATE_PILLAR_BASE, drops(Registration.CHISELED_DEEPSLATE_PILLAR_BASE));
            addDrop(Registration.DEEPSLATE_TILES_PILLAR_BASE, drops(Registration.DEEPSLATE_TILES_PILLAR_BASE));
            addDrop(Registration.CRACKED_DEEPSLATE_TILES_PILLAR_BASE, drops(Registration.CRACKED_DEEPSLATE_TILES_PILLAR_BASE));
            
            // pillar
            addDrop(Registration.STONE_PILLAR, drops(Registration.STONE_PILLAR));
            addDrop(Registration.SMOOTH_STONE_PILLAR, drops(Registration.SMOOTH_STONE_PILLAR));
            addDrop(Registration.COBBLESTONE_PILLAR, drops(Registration.COBBLESTONE_PILLAR));
            addDrop(Registration.MOSSY_COBBLESTONE_PILLAR, drops(Registration.MOSSY_COBBLESTONE_PILLAR));
            addDrop(Registration.BRICKS_PILLAR, drops(Registration.BRICKS_PILLAR));
            addDrop(Registration.STONE_BRICKS_PILLAR, drops(Registration.STONE_BRICKS_PILLAR));
            addDrop(Registration.MOSSY_STONE_BRICKS_PILLAR, drops(Registration.MOSSY_STONE_BRICKS_PILLAR));
            addDrop(Registration.CRACKED_STONE_BRICKS_PILLAR, drops(Registration.CRACKED_STONE_BRICKS_PILLAR));
            addDrop(Registration.CHISELED_STONE_BRICKS_PILLAR, drops(Registration.CHISELED_STONE_BRICKS_PILLAR));
            addDrop(Registration.OBSIDIAN_PILLAR, drops(Registration.OBSIDIAN_PILLAR));

            addDrop(Registration.SANDSTONE_PILLAR, drops(Registration.SANDSTONE_PILLAR));
            addDrop(Registration.SMOOTH_SANDSTONE_PILLAR, drops(Registration.SMOOTH_SANDSTONE_PILLAR));
            addDrop(Registration.CHISELED_SANDSTONE_PILLAR, drops(Registration.CHISELED_SANDSTONE_PILLAR));
            addDrop(Registration.CUT_SANDSTONE_PILLAR, drops(Registration.CUT_SANDSTONE_PILLAR));
            addDrop(Registration.RED_SANDSTONE_PILLAR, drops(Registration.RED_SANDSTONE_PILLAR));
            addDrop(Registration.SMOOTH_RED_SANDSTONE_PILLAR, drops(Registration.SMOOTH_RED_SANDSTONE_PILLAR));
            addDrop(Registration.CHISELED_RED_SANDSTONE_PILLAR, drops(Registration.CHISELED_RED_SANDSTONE_PILLAR));
            addDrop(Registration.CUT_RED_SANDSTONE_PILLAR, drops(Registration.CUT_RED_SANDSTONE_PILLAR));

            addDrop(Registration.BLACKSTONE_PILLAR, drops(Registration.BLACKSTONE_PILLAR));
            addDrop(Registration.POLISHED_BLACKSTONE_PILLAR, drops(Registration.POLISHED_BLACKSTONE_PILLAR));
            addDrop(Registration.CHISELED_POLISHED_BLACKSTONE_PILLAR, drops(Registration.CHISELED_POLISHED_BLACKSTONE_PILLAR));
            addDrop(Registration.GILDED_BLACKSTONE_PILLAR, drops(Registration.GILDED_BLACKSTONE_PILLAR));
            addDrop(Registration.POLISHED_BLACKSTONE_BRICKS_PILLAR, drops(Registration.POLISHED_BLACKSTONE_BRICKS_PILLAR));
            addDrop(Registration.CRACKED_POLISHED_BLACKSTONE_BRICKS_PILLAR, drops(Registration.CRACKED_POLISHED_BLACKSTONE_BRICKS_PILLAR));

            addDrop(Registration.DEEPSLATE_PILLAR, drops(Registration.DEEPSLATE_PILLAR));
            addDrop(Registration.DEEPSLATE_BRICKS_PILLAR, drops(Registration.DEEPSLATE_BRICKS_PILLAR));
            addDrop(Registration.CRACKED_DEEPSLATE_BRICKS_PILLAR, drops(Registration.CRACKED_DEEPSLATE_BRICKS_PILLAR));
            addDrop(Registration.COBBLED_DEEPSLATE_PILLAR, drops(Registration.COBBLED_DEEPSLATE_PILLAR));
            addDrop(Registration.POLISHED_DEEPSLATE_PILLAR, drops(Registration.POLISHED_DEEPSLATE_PILLAR));
            addDrop(Registration.CHISELED_DEEPSLATE_PILLAR, drops(Registration.CHISELED_DEEPSLATE_PILLAR));
            addDrop(Registration.DEEPSLATE_TILES_PILLAR, drops(Registration.DEEPSLATE_TILES_PILLAR));
            addDrop(Registration.CRACKED_DEEPSLATE_TILES_PILLAR, drops(Registration.CRACKED_DEEPSLATE_TILES_PILLAR));
            
            // wall sconce
            addDrop(Registration.STONE_WALL_SCONCE, drops(Registration.STONE_WALL_SCONCE));
            addDrop(Registration.SMOOTH_STONE_WALL_SCONCE, drops(Registration.SMOOTH_STONE_WALL_SCONCE));
            addDrop(Registration.COBBLESTONE_WALL_SCONCE, drops(Registration.COBBLESTONE_WALL_SCONCE));
            addDrop(Registration.MOSSY_COBBLESTONE_WALL_SCONCE, drops(Registration.MOSSY_COBBLESTONE_WALL_SCONCE));
            addDrop(Registration.BRICKS_WALL_SCONCE, drops(Registration.BRICKS_WALL_SCONCE));
            addDrop(Registration.STONE_BRICKS_WALL_SCONCE, drops(Registration.STONE_BRICKS_WALL_SCONCE));
            addDrop(Registration.MOSSY_STONE_BRICKS_WALL_SCONCE, drops(Registration.MOSSY_STONE_BRICKS_WALL_SCONCE));
            addDrop(Registration.CRACKED_STONE_BRICKS_WALL_SCONCE, drops(Registration.CRACKED_STONE_BRICKS_WALL_SCONCE));
            addDrop(Registration.CHISELED_STONE_BRICKS_WALL_SCONCE, drops(Registration.CHISELED_STONE_BRICKS_WALL_SCONCE));
            addDrop(Registration.OBSIDIAN_WALL_SCONCE, drops(Registration.OBSIDIAN_WALL_SCONCE));

            addDrop(Registration.SANDSTONE_WALL_SCONCE, drops(Registration.SANDSTONE_WALL_SCONCE));
            addDrop(Registration.SMOOTH_SANDSTONE_WALL_SCONCE, drops(Registration.SMOOTH_SANDSTONE_WALL_SCONCE));
            addDrop(Registration.CHISELED_SANDSTONE_WALL_SCONCE, drops(Registration.CHISELED_SANDSTONE_WALL_SCONCE));
            addDrop(Registration.CUT_SANDSTONE_WALL_SCONCE, drops(Registration.CUT_SANDSTONE_WALL_SCONCE));
            addDrop(Registration.RED_SANDSTONE_WALL_SCONCE, drops(Registration.RED_SANDSTONE_WALL_SCONCE));
            addDrop(Registration.SMOOTH_RED_SANDSTONE_WALL_SCONCE, drops(Registration.SMOOTH_RED_SANDSTONE_WALL_SCONCE));
            addDrop(Registration.CHISELED_RED_SANDSTONE_WALL_SCONCE, drops(Registration.CHISELED_RED_SANDSTONE_WALL_SCONCE));
            addDrop(Registration.CUT_RED_SANDSTONE_WALL_SCONCE, drops(Registration.CUT_RED_SANDSTONE_WALL_SCONCE));

            addDrop(Registration.BLACKSTONE_WALL_SCONCE, drops(Registration.BLACKSTONE_WALL_SCONCE));
            addDrop(Registration.POLISHED_BLACKSTONE_WALL_SCONCE, drops(Registration.POLISHED_BLACKSTONE_WALL_SCONCE));
            addDrop(Registration.CHISELED_POLISHED_BLACKSTONE_WALL_SCONCE, drops(Registration.CHISELED_POLISHED_BLACKSTONE_WALL_SCONCE));
            addDrop(Registration.GILDED_BLACKSTONE_WALL_SCONCE, drops(Registration.GILDED_BLACKSTONE_WALL_SCONCE));
            addDrop(Registration.POLISHED_BLACKSTONE_BRICKS_WALL_SCONCE, drops(Registration.POLISHED_BLACKSTONE_BRICKS_WALL_SCONCE));
            addDrop(Registration.CRACKED_POLISHED_BLACKSTONE_BRICKS_WALL_SCONCE, drops(Registration.CRACKED_POLISHED_BLACKSTONE_BRICKS_WALL_SCONCE));

            addDrop(Registration.DEEPSLATE_WALL_SCONCE, drops(Registration.DEEPSLATE_WALL_SCONCE));
            addDrop(Registration.DEEPSLATE_BRICKS_WALL_SCONCE, drops(Registration.DEEPSLATE_BRICKS_WALL_SCONCE));
            addDrop(Registration.CRACKED_DEEPSLATE_BRICKS_WALL_SCONCE, drops(Registration.CRACKED_DEEPSLATE_BRICKS_WALL_SCONCE));
            addDrop(Registration.COBBLED_DEEPSLATE_WALL_SCONCE, drops(Registration.COBBLED_DEEPSLATE_WALL_SCONCE));
            addDrop(Registration.POLISHED_DEEPSLATE_WALL_SCONCE, drops(Registration.POLISHED_DEEPSLATE_WALL_SCONCE));
            addDrop(Registration.CHISELED_DEEPSLATE_WALL_SCONCE, drops(Registration.CHISELED_DEEPSLATE_WALL_SCONCE));
            addDrop(Registration.DEEPSLATE_TILES_WALL_SCONCE, drops(Registration.DEEPSLATE_TILES_WALL_SCONCE));
            addDrop(Registration.CRACKED_DEEPSLATE_TILES_WALL_SCONCE, drops(Registration.CRACKED_DEEPSLATE_TILES_WALL_SCONCE));
            
            // grate
            addDrop(Registration.GRATE, drops(Registration.GRATE));
        }
    }
}

