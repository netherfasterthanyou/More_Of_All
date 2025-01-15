package com.mod.more_of_all.datagen;

import com.mod.more_of_all.ExampleMod;
import com.mod.more_of_all.block.modBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper){
        super(output, ExampleMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(modBlocks.RAW_TERMINITE_BLOCK);
        blockWithItem(modBlocks.TERMINITE_BLOCK);
        blockWithItem(modBlocks.THALLIUM_BLOCK);
        blockWithItem(modBlocks.THALLIUM_ORE);
        blockWithItem(modBlocks.DEEPSLATE_TERMINITE_ORE);
        blockWithItem(modBlocks.DEEPSLATE_THALLIUM_ORE);
        blockWithItem(modBlocks.TERMINITE_ORE);
        blockWithItem(modBlocks.SALVAGER);
    }
    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

}
