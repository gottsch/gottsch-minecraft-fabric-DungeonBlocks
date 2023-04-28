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

import mod.gottsch.fabric.dungeonblocks.core.DungeonBlocks;
import mod.gottsch.fabric.dungeonblocks.core.block.IFacadeShapeBlock;
import mod.gottsch.fabric.dungeonblocks.core.setup.Registration;
import mod.gottsch.fabric.dungeonblocks.core.state.properties.FacadeShape;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.*;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.data.server.RecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.state.property.Properties;
import net.minecraft.tag.ItemTags;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.minecraft.util.registry.Registry;

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
            translationBuilder.add(Registration.ITEM_GROUP , "DungeonBlocks");

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

        @Override
        protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {
            // facade
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.STONE_FACADE, Blocks.STONE, 2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.SMOOTH_STONE_FACADE, Blocks.SMOOTH_STONE,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.COBBLESTONE_FACADE, Blocks.COBBLESTONE, 2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.MOSSY_COBBLESTONE_FACADE, Blocks.MOSSY_COBBLESTONE,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.BRICKS_FACADE, Blocks.BRICKS, 2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.STONE_BRICKS_FACADE, Blocks.STONE_BRICKS,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.MOSSY_STONE_BRICKS_FACADE, Blocks.MOSSY_STONE_BRICKS,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.CRACKED_STONE_BRICKS_FACADE, Blocks.CRACKED_STONE_BRICKS,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.CHISELED_STONE_BRICKS_FACADE, Blocks.CHISELED_STONE_BRICKS,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.OBSIDIAN_FACADE, Blocks.OBSIDIAN,2);

            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.SANDSTONE_FACADE, Blocks.SANDSTONE,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.SMOOTH_SANDSTONE_FACADE, Blocks.SMOOTH_SANDSTONE,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.CHISELED_SANDSTONE_FACADE, Blocks.CHISELED_SANDSTONE,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.CUT_SANDSTONE_FACADE, Blocks.CUT_SANDSTONE,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.RED_SANDSTONE_FACADE, Blocks.RED_SANDSTONE,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.SMOOTH_RED_SANDSTONE_FACADE, Blocks.SMOOTH_RED_SANDSTONE,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.CHISELED_RED_SANDSTONE_FACADE, Blocks.CHISELED_RED_SANDSTONE,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.CUT_RED_SANDSTONE_FACADE, Blocks.CUT_RED_SANDSTONE,2);

            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.GRANITE_FACADE, Blocks.GRANITE,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.POLISHED_GRANITE_FACADE, Blocks.POLISHED_GRANITE,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.DIORITE_FACADE, Blocks.DIORITE,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.POLISHED_DIORITE_FACADE, Blocks.POLISHED_DIORITE,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.ANDESITE_FACADE, Blocks.ANDESITE,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.POLISHED_ANDESITE_FACADE, Blocks.POLISHED_ANDESITE,2);

            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.BLACKSTONE_FACADE, Blocks.BLACKSTONE,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.POLISHED_BLACKSTONE_FACADE, Blocks.POLISHED_BLACKSTONE,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.CHISELED_POLISHED_BLACKSTONE_FACADE, Blocks.CHISELED_POLISHED_BLACKSTONE,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.GILDED_BLACKSTONE_FACADE, Blocks.GILDED_BLACKSTONE,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.POLISHED_BLACKSTONE_BRICKS_FACADE, Blocks.POLISHED_BLACKSTONE_BRICKS,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.CRACKED_POLISHED_BLACKSTONE_BRICKS_FACADE, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS,2);

            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.DEEPSLATE_FACADE, Blocks.DEEPSLATE,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.DEEPSLATE_BRICKS_FACADE, Blocks.DEEPSLATE_BRICKS,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.CRACKED_DEEPSLATE_BRICKS_FACADE, Blocks.CRACKED_DEEPSLATE_BRICKS,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.COBBLED_DEEPSLATE_FACADE, Blocks.COBBLED_DEEPSLATE,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.POLISHED_DEEPSLATE_FACADE, Blocks.POLISHED_DEEPSLATE,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.CHISELED_DEEPSLATE_FACADE, Blocks.CHISELED_DEEPSLATE,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.DEEPSLATE_TILES_FACADE, Blocks.DEEPSLATE_TILES,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.CRACKED_DEEPSLATE_TILES_FACADE, Blocks.CRACKED_DEEPSLATE_TILES,2);

            // quarter facade
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.STONE_QUARTER_FACADE, Blocks.STONE, 2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.SMOOTH_STONE_QUARTER_FACADE, Blocks.SMOOTH_STONE,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.COBBLESTONE_QUARTER_FACADE, Blocks.COBBLESTONE, 2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.MOSSY_COBBLESTONE_QUARTER_FACADE, Blocks.MOSSY_COBBLESTONE,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.BRICKS_QUARTER_FACADE, Blocks.BRICKS, 2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.STONE_BRICKS_QUARTER_FACADE, Blocks.STONE_BRICKS,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.MOSSY_STONE_BRICKS_QUARTER_FACADE, Blocks.MOSSY_STONE_BRICKS,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.CRACKED_STONE_BRICKS_QUARTER_FACADE, Blocks.CRACKED_STONE_BRICKS,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.CHISELED_STONE_BRICKS_QUARTER_FACADE, Blocks.CHISELED_STONE_BRICKS,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.OBSIDIAN_QUARTER_FACADE, Blocks.OBSIDIAN,2);

            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.SANDSTONE_QUARTER_FACADE, Blocks.SANDSTONE,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.SMOOTH_SANDSTONE_QUARTER_FACADE, Blocks.SMOOTH_SANDSTONE,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.CHISELED_SANDSTONE_QUARTER_FACADE, Blocks.CHISELED_SANDSTONE,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.CUT_SANDSTONE_QUARTER_FACADE, Blocks.CUT_SANDSTONE,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.RED_SANDSTONE_QUARTER_FACADE, Blocks.RED_SANDSTONE,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.SMOOTH_RED_SANDSTONE_QUARTER_FACADE, Blocks.SMOOTH_RED_SANDSTONE,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.CHISELED_RED_SANDSTONE_QUARTER_FACADE, Blocks.CHISELED_RED_SANDSTONE,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.CUT_RED_SANDSTONE_QUARTER_FACADE, Blocks.CUT_RED_SANDSTONE,2);

            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.GRANITE_QUARTER_FACADE, Blocks.GRANITE,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.POLISHED_GRANITE_QUARTER_FACADE, Blocks.POLISHED_GRANITE,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.DIORITE_QUARTER_FACADE, Blocks.DIORITE,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.POLISHED_DIORITE_QUARTER_FACADE, Blocks.POLISHED_DIORITE,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.ANDESITE_QUARTER_FACADE, Blocks.ANDESITE,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.POLISHED_ANDESITE_QUARTER_FACADE, Blocks.POLISHED_ANDESITE,2);

            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.BLACKSTONE_QUARTER_FACADE, Blocks.BLACKSTONE,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.POLISHED_BLACKSTONE_QUARTER_FACADE, Blocks.POLISHED_BLACKSTONE,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.CHISELED_POLISHED_BLACKSTONE_QUARTER_FACADE, Blocks.CHISELED_POLISHED_BLACKSTONE,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.GILDED_BLACKSTONE_QUARTER_FACADE, Blocks.GILDED_BLACKSTONE,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.POLISHED_BLACKSTONE_BRICKS_QUARTER_FACADE, Blocks.POLISHED_BLACKSTONE_BRICKS,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.CRACKED_POLISHED_BLACKSTONE_BRICKS_QUARTER_FACADE, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS,2);

            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.DEEPSLATE_QUARTER_FACADE, Blocks.DEEPSLATE,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.DEEPSLATE_BRICKS_QUARTER_FACADE, Blocks.DEEPSLATE_BRICKS,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.CRACKED_DEEPSLATE_BRICKS_QUARTER_FACADE, Blocks.CRACKED_DEEPSLATE_BRICKS,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.COBBLED_DEEPSLATE_QUARTER_FACADE, Blocks.COBBLED_DEEPSLATE,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.POLISHED_DEEPSLATE_QUARTER_FACADE, Blocks.POLISHED_DEEPSLATE,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.CHISELED_DEEPSLATE_QUARTER_FACADE, Blocks.CHISELED_DEEPSLATE,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.DEEPSLATE_TILES_QUARTER_FACADE, Blocks.DEEPSLATE_TILES,2);
            RecipeProvider.offerStonecuttingRecipe(exporter, Registration.CRACKED_DEEPSLATE_TILES_QUARTER_FACADE, Blocks.CRACKED_DEEPSLATE_TILES,2);

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

        }
    }
}

