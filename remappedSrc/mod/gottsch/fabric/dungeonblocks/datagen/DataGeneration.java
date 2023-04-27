package mod.gottsch.fabric.dungeonblocks.datagen;

import mod.gottsch.fabric.dungeonblocks.core.DungeonBlocks;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.impl.biome.modification.BuiltInRegistryKeys;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.tag.ItemTags;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

/**
 * Created by Mark Gottschling on 4/25/2023
 */
public class DataGeneration implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        fabricDataGenerator.addProvider(MyTagGenerator::new);
    }

    private static class MyTagGenerator extends FabricTagProvider<Item> {
        // We will create an item tag called "smelly_items".
        private static final TagKey<Item> SMELLY_ITEMS = TagKey.of(Registry.ITEM_KEY, new Identifier(DungeonBlocks.MOD_ID, "smelly_items"));


        public MyTagGenerator(FabricDataGenerator dataGenerator) {
            super(dataGenerator, Registry.ITEM);  // for versions 1.19.2 and below, use Registry.ITEM
        }

        @Override
        protected void generateTags() {
            // This creates a tag builder, where we add slime balls, rotten flesh and everything in the minecraft:dirt item tag.
            getOrCreateTagBuilder(SMELLY_ITEMS)
                    .add(Items.SLIME_BALL)
                    .add(Items.ROTTEN_FLESH)
                    .addOptionalTag(ItemTags.DIRT);
            // This will automatically generate "assets/tutorial/tags/items/smelly_items.json" in the "generated" folder.
        }
    }
}

