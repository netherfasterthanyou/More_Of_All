package com.mod.more_of_all.datagen;

import com.mod.more_of_all.ExampleMod;
import com.mod.more_of_all.block.modBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {

    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ExampleMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(modBlocks.SALVAGER.get())
                .add(modBlocks.RAW_TERMINITE_BLOCK.get())
                .add(modBlocks.TERMINITE_BLOCK.get())
                .add(modBlocks.THALLIUM_BLOCK.get())
                .add(modBlocks.TERMINITE_ORE.get())
                .add(modBlocks.THALLIUM_ORE.get())
                .add(modBlocks.DEEPSLATE_THALLIUM_ORE.get())
                .add(modBlocks.DEEPSLATE_TERMINITE_ORE.get());
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(modBlocks.DEEPSLATE_TERMINITE_ORE.get())
                .add(modBlocks.DEEPSLATE_THALLIUM_ORE.get())
                .add(modBlocks.THALLIUM_ORE.get())
                .add(modBlocks.TERMINITE_ORE.get());

    }
}
