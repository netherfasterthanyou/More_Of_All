package com.mod.more_of_all.datagen;

import com.mod.more_of_all.ExampleMod;
import com.mod.more_of_all.block.custom.Terminite_Lamp;
import com.mod.more_of_all.block.custom.Thallium_Lamp;
import com.mod.more_of_all.block.modBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
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


        stairsBlock((StairBlock) modBlocks.TERMINITE_STAIRS.get(), blockTexture(modBlocks.TERMINITE_BLOCK.get()));
        slabBlock((SlabBlock) modBlocks.TERMINITE_SLAB.get(), blockTexture(modBlocks.TERMINITE_BLOCK.get()), blockTexture(modBlocks.TERMINITE_BLOCK.get()));

        buttonBlock(modBlocks.TERMINITE_BUTTON.get(), blockTexture(modBlocks.TERMINITE_BLOCK.get()));
        pressurePlateBlock((PressurePlateBlock) modBlocks.TERMINITE_PRESSURE_PLATE.get(), blockTexture(modBlocks.TERMINITE_BLOCK.get()));

        fenceBlock(modBlocks.TERMINITE_FENCE.get(), blockTexture(modBlocks.TERMINITE_BLOCK.get()));
        fenceGateBlock((FenceGateBlock) modBlocks.TERMINITE_FENCE_GATE.get(), blockTexture(modBlocks.TERMINITE_BLOCK.get()));
        wallBlock(modBlocks.TERMINITE_WALL.get(), blockTexture(modBlocks.TERMINITE_BLOCK.get()));

        doorBlockWithRenderType(modBlocks.TERMINITE_DOOR.get(), modLoc("block/terminite_door_bottom"), modLoc("block/terminite_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) modBlocks.TERMINITE_TRAP_DOOR.get(), modLoc("block/terminite_trapdoor"), true, "cutout");

        blockItem(modBlocks.TERMINITE_STAIRS);
        blockItem(modBlocks.TERMINITE_SLAB);
        blockItem(modBlocks.TERMINITE_FENCE_GATE);
        blockItem(modBlocks.TERMINITE_PRESSURE_PLATE);
        blockItem(modBlocks.TERMINITE_TRAP_DOOR, "bottom");



        stairsBlock((StairBlock) modBlocks.THALLIUM_STAIRS.get(), blockTexture(modBlocks.THALLIUM_BLOCK.get()));
        slabBlock((SlabBlock) modBlocks.THALLIUM_SLAB.get(), blockTexture(modBlocks.THALLIUM_BLOCK.get()), blockTexture(modBlocks.THALLIUM_BLOCK.get()));

        buttonBlock(modBlocks.THALLIUM_BUTTON.get(), blockTexture(modBlocks.THALLIUM_BLOCK.get()));
        pressurePlateBlock((PressurePlateBlock) modBlocks.THALLIUM_PRESSURE_PLATE.get(), blockTexture(modBlocks.THALLIUM_BLOCK.get()));

        fenceBlock(modBlocks.THALLIUM_FENCE.get(), blockTexture(modBlocks.THALLIUM_BLOCK.get()));
        fenceGateBlock((FenceGateBlock) modBlocks.THALLIUM_FENCE_GATE.get(), blockTexture(modBlocks.THALLIUM_BLOCK.get()));
        wallBlock(modBlocks.THALLIUM_WALL.get(), blockTexture(modBlocks.THALLIUM_BLOCK.get()));

        doorBlockWithRenderType(modBlocks.THALLIUM_DOOR.get(), modLoc("block/thallium_door_bottom"), modLoc("block/thallium_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) modBlocks.THALLIUM_TRAP_DOOR.get(), modLoc("block/thallium_trapdoor"), true, "cutout");

        blockItem(modBlocks.THALLIUM_STAIRS);
        blockItem(modBlocks.THALLIUM_SLAB);
        blockItem(modBlocks.THALLIUM_FENCE_GATE);
        blockItem(modBlocks.THALLIUM_PRESSURE_PLATE);
        blockItem(modBlocks.THALLIUM_TRAP_DOOR, "bottom");

        customLamp();
    }

    private void customLamp(){
        getVariantBuilder(modBlocks.TERMINITE_LAMP.get()).forAllStates(state -> {
           if (state.getValue(Terminite_Lamp.CLICKED)){
               return new ConfiguredModel[]{new ConfiguredModel(models().cubeAll("terminite_lamp_on",
                       ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID, "block/" + "terminite_lamp_on")))};
           } else {
               return  new ConfiguredModel[]{new ConfiguredModel(models().cubeAll("terminite_lamp_off",
                       ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID, "block/" + "terminite_lamp_off")))};

           }
        });
        simpleBlockItem(modBlocks.TERMINITE_LAMP.get(), models().cubeAll("terminite_lamp_on",
                ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID, "block/" + "terminite_lamp_on")));

        getVariantBuilder(modBlocks.THALLIUM_LAMP.get()).forAllStates(state -> {
            if (state.getValue(Thallium_Lamp.CLICKED)){
                return new ConfiguredModel[]{new ConfiguredModel(models().cubeAll("thallium_lamp_on",
                        ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID, "block/" + "thallium_lamp_on")))};
            } else {
                return  new ConfiguredModel[]{new ConfiguredModel(models().cubeAll("thallium_lamp_off",
                        ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID, "block/" + "thallium_lamp_off")))};

            }
        });
        simpleBlockItem(modBlocks.THALLIUM_LAMP.get(), models().cubeAll("thallium_lamp_on",
                ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID, "block/" + "thallium_lamp_on")));
    }



    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
    private void blockItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("more_of_all:block/" +
                ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }
    private void blockItem(RegistryObject<Block> blockRegistryObject, String appendix){
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("more_of_all:block/" +
                ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath() + appendix));
    }
}
