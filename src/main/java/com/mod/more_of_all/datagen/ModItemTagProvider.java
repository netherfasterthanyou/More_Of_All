package com.mod.more_of_all.datagen;

import com.mod.more_of_all.ExampleMod;
import com.mod.more_of_all.item.modItems;
import com.mod.more_of_all.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider,
                              CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, ExampleMod.MOD_ID, existingFileHelper);
    }
    // Tags for the salvager block
    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(ModTags.Items.TRANSFORMABLE_ITEMS)
                .add(modItems.THALLIUM_SWORD.get())
                .add(modItems.THALLIUM_PICKAXE.get())
                .add(modItems.THALLIUM_AXE.get())
                .add(modItems.THALLIUM_SHOVEL.get())
                .add(modItems.THALLIUM_HOE.get())

                .add(modItems.TERMINITE_SHOVEL.get())
                .add(modItems.TERMINITE_SWORD.get())
                .add(modItems.TERMINITE_AXE.get())
                .add(modItems.TERMINITE_PICKAXE.get())
                .add(modItems.TERMINITE_HOE.get())
                .add(modItems.HAMMER.get());


        tag(ItemTags.TRIMMABLE_ARMOR)
                .add(modItems.TERMINITE_HELMET.get())
                .add(modItems.TERMINITE_CHESTPLATE.get())
                .add(modItems.TERMINITE_LEGGINGS.get())
                .add(modItems.TERMINITE_BOOTS.get())
                .add(modItems.THALLIUM_HELMET.get())
                .add(modItems.THALLIUM_CHESTPLATE.get())
                .add(modItems.THALLIUM_LEGGINGS.get())
                .add(modItems.THALLIUM_BOOTS.get());

        tag(ItemTags.ARMOR_ENCHANTABLE)
                .add(modItems.TERMINITE_HELMET.get())
                .add(modItems.TERMINITE_CHESTPLATE.get())
                .add(modItems.TERMINITE_LEGGINGS.get())
                .add(modItems.TERMINITE_BOOTS.get())
                .add(modItems.THALLIUM_HELMET.get())
                .add(modItems.THALLIUM_CHESTPLATE.get())
                .add(modItems.THALLIUM_LEGGINGS.get())
                .add(modItems.THALLIUM_BOOTS.get());


        tag(ItemTags.SWORD_ENCHANTABLE)
                .add(modItems.TERMINITE_SWORD.get())
                .add(modItems.THALLIUM_SWORD.get())
                .add(modItems.HAMMER.get());
        tag(ItemTags.SHARP_WEAPON_ENCHANTABLE)
                .add(modItems.THALLIUM_AXE.get())
                .add(modItems.TERMINITE_AXE.get());
        tag(ItemTags.MINING_ENCHANTABLE)

                .add(modItems.THALLIUM_PICKAXE.get())
                .add(modItems.THALLIUM_AXE.get())
                .add(modItems.THALLIUM_SHOVEL.get())
                .add(modItems.THALLIUM_HOE.get())

                .add(modItems.TERMINITE_SHOVEL.get())
                .add(modItems.TERMINITE_AXE.get())
                .add(modItems.TERMINITE_PICKAXE.get())
                .add(modItems.TERMINITE_HOE.get())
                .add(modItems.HAMMER.get());


        tag(ItemTags.TRIM_MATERIALS)
                .add(modItems.TERMINITE.get())
                .add(modItems.THALLIUM.get());


        tag(ItemTags.TRIM_TEMPLATES)
                .add(modItems.TRACK_SMITHING_TEMPLATE.get());
    }






}
