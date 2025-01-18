package com.mod.more_of_all.util;

import com.mod.more_of_all.ExampleMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks{
        public static final TagKey<Block> NEEDS_TERMINITE_TOOL = createTag("needs_terminite_tool");
        public static final TagKey<Block> INCORRECT_FOR_TERMINITE_TOOL = createTag("incorrect_for_terminite_tool");

        public static final TagKey<Block> NEEDS_THALLIUM_TOOL = createTag("needs_thallium_tool");
        public static final TagKey<Block> INCORRECT_FOR_THALLIUM_TOOL = createTag("incorrect_for_thallium_tool");

        private static TagKey<Block> createTag(String name){
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID, name));
        }


    }
    public static class Items{
        public static final TagKey<Item> TRANSFORMABLE_ITEMS = createTag("transformable_items");

        private static TagKey<Item> createTag(String name){
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID, name));
        }
    }

}
