package com.mod.more_of_all.datagen;

import com.mod.more_of_all.ExampleMod;
import com.mod.more_of_all.block.custom.BlueBerryBushBlock;
import com.mod.more_of_all.block.custom.ChiliCropBlock;
import com.mod.more_of_all.block.custom.Terminite_Lamp;
import com.mod.more_of_all.block.custom.Thallium_Lamp;
import com.mod.more_of_all.block.modBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;

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
        blockItem(modBlocks.TERMINITE_TRAP_DOOR, "_bottom");



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
        blockItem(modBlocks.THALLIUM_TRAP_DOOR, "_bottom");





















        logBlock(modBlocks.EUCALYPTUS_LOG.get());
        logBlock( modBlocks.STRIPPED_EUCALYPTUS_LOG.get());
        axisBlock( modBlocks.EUCALYPTUS_WOOD.get(), blockTexture(modBlocks.EUCALYPTUS_LOG.get()), blockTexture(modBlocks.EUCALYPTUS_LOG.get()));
        axisBlock( modBlocks.STRIPPED_EUCALYPTUS_WOOD.get(), blockTexture(modBlocks.STRIPPED_EUCALYPTUS_LOG.get()), blockTexture(modBlocks.STRIPPED_EUCALYPTUS_LOG.get()));

        blockItem(modBlocks.STRIPPED_EUCALYPTUS_WOOD);
        blockItem(modBlocks.EUCALYPTUS_WOOD);

        blockItem(modBlocks.EUCALYPTUS_LOG);

        blockItem(modBlocks.STRIPPED_EUCALYPTUS_LOG);
        blockWithItem(modBlocks.EUCALYPTUS_PLANKS);



        leavesBlock(modBlocks.EUCALYPTUS_LEAVES);
        saplingBlock(modBlocks.EUCALYPTUS_SAPLING);

        logBlock( modBlocks.DRIFTWOOD_LOG.get());
        logBlock( modBlocks.STRIPPED_DRIFTWOOD_LOG.get());
        axisBlock(modBlocks.DRIFTWOOD_WOOD.get(), blockTexture(modBlocks.DRIFTWOOD_LOG.get()), blockTexture(modBlocks.DRIFTWOOD_LOG.get()));
        axisBlock( modBlocks.STRIPPED_DRIFTWOOD_WOOD.get(), blockTexture(modBlocks.STRIPPED_DRIFTWOOD_LOG.get()), blockTexture(modBlocks.STRIPPED_DRIFTWOOD_LOG.get()));

        blockItem(modBlocks.STRIPPED_DRIFTWOOD_WOOD);
        blockItem(modBlocks.DRIFTWOOD_WOOD);

        blockItem(modBlocks.DRIFTWOOD_LOG);

        blockItem(modBlocks.STRIPPED_DRIFTWOOD_LOG);
        blockWithItem(modBlocks.DRIFTWOOD_PLANKS);



        leavesBlock(modBlocks.DRIFTWOOD_LEAVES);
        saplingBlock(modBlocks.DRIFTWOOD_SAPLING);

        logBlock(modBlocks.BLOODWOOD_LOG.get());
        axisBlock(modBlocks.BLOODWOOD_WOOD.get(), blockTexture(modBlocks.BLOODWOOD_LOG.get()), blockTexture(modBlocks.BLOODWOOD_LOG.get()));
        logBlock(modBlocks.STRIPPED_BLOODWOOD_LOG.get());
        axisBlock(modBlocks.STRIPPED_BLOODWOOD_WOOD.get(), blockTexture(modBlocks.STRIPPED_BLOODWOOD_LOG.get()), blockTexture(modBlocks.STRIPPED_BLOODWOOD_LOG.get()));

        blockItem(modBlocks.BLOODWOOD_LOG);
        blockItem(modBlocks.BLOODWOOD_WOOD);
        blockItem(modBlocks.STRIPPED_BLOODWOOD_LOG);
        blockItem(modBlocks.STRIPPED_BLOODWOOD_WOOD);

        blockWithItem(modBlocks.BLOODWOOD_PLANKS);

        leavesBlock(modBlocks.BLOODWOOD_LEAVES);
        saplingBlock(modBlocks.BLOODWOOD_SAPLING);


        stairsBlock((StairBlock) modBlocks.BLOODWOOD_STAIRS.get(), blockTexture(modBlocks.BLOODWOOD_PLANKS.get()));
        slabBlock((SlabBlock) modBlocks.BLOODWOOD_SLAB.get(), blockTexture(modBlocks.BLOODWOOD_PLANKS.get()), blockTexture(modBlocks.BLOODWOOD_PLANKS.get()));

        buttonBlock(modBlocks.BLOODWOOD_BUTTON.get(), blockTexture(modBlocks.BLOODWOOD_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) modBlocks.BLOODWOOD_PRESSURE_PLATE.get(), blockTexture(modBlocks.BLOODWOOD_PLANKS.get()));

        fenceBlock(modBlocks.BLOODWOOD_FENCE.get(), blockTexture(modBlocks.BLOODWOOD_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) modBlocks.BLOODWOOD_FENCE_GATE.get(), blockTexture(modBlocks.BLOODWOOD_PLANKS.get()));
        wallBlock(modBlocks.BLOODWOOD_WALL.get(), blockTexture(modBlocks.BLOODWOOD_PLANKS.get()));

        doorBlockWithRenderType(modBlocks.BLOODWOOD_DOOR.get(), modLoc("block/bloodwood_door_bottom"), modLoc("block/bloodwood_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) modBlocks.BLOODWOOD_TRAP_DOOR.get(), modLoc("block/bloodwood_trapdoor"), true, "cutout");

        blockItem(modBlocks.BLOODWOOD_STAIRS);
        blockItem(modBlocks.BLOODWOOD_SLAB);
        blockItem(modBlocks.BLOODWOOD_FENCE_GATE);
        blockItem(modBlocks.BLOODWOOD_PRESSURE_PLATE);
        blockItem(modBlocks.BLOODWOOD_TRAP_DOOR, "_bottom");



        stairsBlock((StairBlock) modBlocks.DRIFTWOOD_STAIRS.get(), blockTexture(modBlocks.DRIFTWOOD_PLANKS.get()));
        slabBlock((SlabBlock) modBlocks.DRIFTWOOD_SLAB.get(), blockTexture(modBlocks.DRIFTWOOD_PLANKS.get()), blockTexture(modBlocks.DRIFTWOOD_PLANKS.get()));

        buttonBlock(modBlocks.DRIFTWOOD_BUTTON.get(), blockTexture(modBlocks.DRIFTWOOD_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) modBlocks.DRIFTWOOD_PRESSURE_PLATE.get(), blockTexture(modBlocks.DRIFTWOOD_PLANKS.get()));

        fenceBlock(modBlocks.DRIFTWOOD_FENCE.get(), blockTexture(modBlocks.DRIFTWOOD_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) modBlocks.DRIFTWOOD_FENCE_GATE.get(), blockTexture(modBlocks.DRIFTWOOD_PLANKS.get()));
        wallBlock(modBlocks.DRIFTWOOD_WALL.get(), blockTexture(modBlocks.DRIFTWOOD_PLANKS.get()));

        doorBlockWithRenderType(modBlocks.DRIFTWOOD_DOOR.get(), modLoc("block/driftwood_door_bottom"), modLoc("block/driftwood_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) modBlocks.DRIFTWOOD_TRAP_DOOR.get(), modLoc("block/driftwood_trapdoor"), true, "cutout");

        blockItem(modBlocks.DRIFTWOOD_STAIRS);
        blockItem(modBlocks.DRIFTWOOD_SLAB);
        blockItem(modBlocks.DRIFTWOOD_FENCE_GATE);
        blockItem(modBlocks.DRIFTWOOD_PRESSURE_PLATE);
        blockItem(modBlocks.DRIFTWOOD_TRAP_DOOR, "_bottom");



        stairsBlock((StairBlock) modBlocks.EUCALYPTUS_STAIRS.get(), blockTexture(modBlocks.EUCALYPTUS_PLANKS.get()));
        slabBlock((SlabBlock) modBlocks.EUCALYPTUS_SLAB.get(), blockTexture(modBlocks.EUCALYPTUS_PLANKS.get()), blockTexture(modBlocks.EUCALYPTUS_PLANKS.get()));

        buttonBlock(modBlocks.EUCALYPTUS_BUTTON.get(), blockTexture(modBlocks.EUCALYPTUS_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) modBlocks.EUCALYPTUS_PRESSURE_PLATE.get(), blockTexture(modBlocks.EUCALYPTUS_PLANKS.get()));

        fenceBlock(modBlocks.EUCALYPTUS_FENCE.get(), blockTexture(modBlocks.EUCALYPTUS_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) modBlocks.EUCALYPTUS_FENCE_GATE.get(), blockTexture(modBlocks.EUCALYPTUS_PLANKS.get()));
        wallBlock(modBlocks.EUCALYPTUS_WALL.get(), blockTexture(modBlocks.EUCALYPTUS_PLANKS.get()));

        doorBlockWithRenderType(modBlocks.EUCALYPTUS_DOOR.get(), modLoc("block/eucalyptus_door_bottom"), modLoc("block/eucalyptus_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) modBlocks.EUCALYPTUS_TRAP_DOOR.get(), modLoc("block/eucalyptus_trapdoor"), true, "cutout");

        blockItem(modBlocks.EUCALYPTUS_STAIRS);
        blockItem(modBlocks.EUCALYPTUS_SLAB);
        blockItem(modBlocks.EUCALYPTUS_FENCE_GATE);
        blockItem(modBlocks.EUCALYPTUS_PRESSURE_PLATE);
        blockItem(modBlocks.EUCALYPTUS_TRAP_DOOR, "_bottom");






        customLamp();


        makeCrop(((CropBlock) modBlocks.CHILI_CROP.get()), "chili_crop_stage", "chili_crop_stage");
        makeBush(((SweetBerryBushBlock) modBlocks.BLUEBERRY_BUSH.get()), "blueberry_bush_stage", "blueberry_bush_stage");
    }




    private void saplingBlock(RegistryObject<Block> blockRegistryObject){
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), ResourceLocation.parse("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    public void makeCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> states(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] states(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((ChiliCropBlock) block).getAgeProperty()),
                ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID, "block/" + textureName + state.getValue(((ChiliCropBlock) block).getAgeProperty()))).renderType("cutout"));

        return models;
    }


    public void makeBush(SweetBerryBushBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> states(state, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] states(BlockState state, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().cross(modelName + state.getValue(BlueBerryBushBlock.AGE),
                ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID, "block/" + textureName + state.getValue(BlueBerryBushBlock.AGE))).renderType("cutout"));

        return models;
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
    private void blockItem(RegistryObject<? extends Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("more_of_all:block/" +
                ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject, String appendix){
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("more_of_all:block/" +
                ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath() + appendix));
    }
}
