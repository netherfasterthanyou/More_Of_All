package com.mod.more_of_all.block;

import com.mod.more_of_all.ExampleMod;
import com.mod.more_of_all.block.custom.Terminite_Lamp;
import com.mod.more_of_all.block.custom.Thallium_Lamp;
import com.mod.more_of_all.block.custom.salvager;
import com.mod.more_of_all.item.modItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class modBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ExampleMod.MOD_ID);



    public static final RegistryObject<Block> THALLIUM_BLOCK = registryBlock("thallium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.NETHERITE_BLOCK)));


    public static final RegistryObject<Block> TERMINITE_BLOCK = registryBlock("terminite_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.LARGE_AMETHYST_BUD)));


    public static final RegistryObject<Block> RAW_TERMINITE_BLOCK = registryBlock("raw_terminite_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3f).requiresCorrectToolForDrops().sound(SoundType.LARGE_AMETHYST_BUD)));



    public static final RegistryObject<Block> THALLIUM_ORE = registryBlock("thallium_ore",
            () -> new DropExperienceBlock(UniformInt.of(1,1), BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops()));


    public static final RegistryObject<Block> TERMINITE_ORE = registryBlock("terminite_ore",
            () -> new DropExperienceBlock(UniformInt.of(1,1), BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops()));


    public static final RegistryObject<Block> DEEPSLATE_TERMINITE_ORE = registryBlock("deepslate_terminite_ore",
            () -> new DropExperienceBlock(UniformInt.of(1,1), BlockBehaviour.Properties.of()
                    .strength(5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DEEPSLATE_THALLIUM_ORE = registryBlock("deepslate_thallium_ore",
            () -> new DropExperienceBlock(UniformInt.of(1,1), BlockBehaviour.Properties.of()
                    .strength(5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SALVAGER = registryBlock("salvager",
            () -> new salvager( BlockBehaviour.Properties.of()
                    .strength(2f)));
    //Terminite building blocks
    public static final RegistryObject<Block> TERMINITE_STAIRS = registryBlock("terminite_stairs",
            () -> new StairBlock(modBlocks.TERMINITE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f)));
    public static final RegistryObject<Block> TERMINITE_SLAB = registryBlock("terminite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f)));

    public static final RegistryObject<Block> TERMINITE_PRESSURE_PLATE = registryBlock("terminite_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(2f)));
    public static final RegistryObject<ButtonBlock> TERMINITE_BUTTON = registryBlock("terminite_button",
            () -> new ButtonBlock(BlockSetType.IRON, 20, BlockBehaviour.Properties.of().strength(2f).noCollission()));

    public static final RegistryObject<FenceBlock> TERMINITE_FENCE = registryBlock("terminite_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2f)));
    public static final RegistryObject<Block> TERMINITE_FENCE_GATE = registryBlock("terminite_fence_gate",
            () -> new FenceGateBlock(WoodType.ACACIA, BlockBehaviour.Properties.of().strength(2f)));
    public static final RegistryObject<WallBlock> TERMINITE_WALL = registryBlock("terminite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f)));


    public static final RegistryObject<DoorBlock> TERMINITE_DOOR = registryBlock("terminite_door",
            () -> new DoorBlock(BlockSetType.ACACIA, BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final RegistryObject<Block> TERMINITE_TRAP_DOOR = registryBlock("terminite_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.ACACIA, BlockBehaviour.Properties.of().strength(2f).noOcclusion()));

    //thallium building blocks

    public static final RegistryObject<Block> THALLIUM_STAIRS = registryBlock("thallium_stairs",
            () -> new StairBlock(modBlocks.THALLIUM_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f)));
    public static final RegistryObject<Block> THALLIUM_SLAB = registryBlock("thallium_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f)));

    public static final RegistryObject<Block> THALLIUM_PRESSURE_PLATE = registryBlock("thallium_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().strength(2f)));
    public static final RegistryObject<ButtonBlock> THALLIUM_BUTTON = registryBlock("thallium_button",
            () -> new ButtonBlock(BlockSetType.IRON, 20, BlockBehaviour.Properties.of().strength(2f).noCollission()));

    public static final RegistryObject<FenceBlock> THALLIUM_FENCE = registryBlock("thallium_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2f)));
    public static final RegistryObject<Block> THALLIUM_FENCE_GATE = registryBlock("thallium_fence_gate",
            () -> new FenceGateBlock(WoodType.ACACIA, BlockBehaviour.Properties.of().strength(2f)));
    public static final RegistryObject<WallBlock> THALLIUM_WALL = registryBlock("thallium_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f)));


    public static final RegistryObject<DoorBlock> THALLIUM_DOOR = registryBlock("thallium_door",
            () -> new DoorBlock(BlockSetType.ACACIA, BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final RegistryObject<Block> THALLIUM_TRAP_DOOR = registryBlock("thallium_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.ACACIA, BlockBehaviour.Properties.of().strength(2f).noOcclusion()));


    public static final RegistryObject<Block> TERMINITE_LAMP = registryBlock("terminite_lamp",
            () -> new Terminite_Lamp(BlockBehaviour.Properties.of().strength(3)
                    .lightLevel(state -> state.getValue(Terminite_Lamp.CLICKED)? 15:0)));

    public static final RegistryObject<Block> THALLIUM_LAMP = registryBlock("thallium_lamp",
            () -> new Thallium_Lamp(BlockBehaviour.Properties.of().strength(3)
                    .lightLevel(state -> state.getValue(Thallium_Lamp.CLICKED)? 15:0)));






    private static <T extends Block> RegistryObject<T> registryBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }


    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block){
        modItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }


    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

}
