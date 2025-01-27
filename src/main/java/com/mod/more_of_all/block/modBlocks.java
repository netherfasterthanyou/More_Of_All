package com.mod.more_of_all.block;

import com.mod.more_of_all.ExampleMod;
import com.mod.more_of_all.block.custom.*;
import com.mod.more_of_all.item.modItems;
import com.mod.more_of_all.worldgen.tree.ModTreeGrowers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
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
            () -> new ButtonBlock(BlockSetType.IRON, 25, BlockBehaviour.Properties.of().strength(2f).noCollission()));

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
            () -> new ButtonBlock(BlockSetType.IRON, 25, BlockBehaviour.Properties.of().strength(2f).noCollission()));

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


    public static final RegistryObject<Block> CHILI_CROP = BLOCKS.register("chili_crop",
            () -> new ChiliCropBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POTATOES)));


    public static final RegistryObject<Block> BLUEBERRY_BUSH = BLOCKS.register("blue_berry_bush",
            () -> new BlueBerryBushBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SWEET_BERRY_BUSH)));

    public static final RegistryObject<RotatedPillarBlock> EUCALYPTUS_LOG = registryBlock("eucalyptus_log",
            () -> new  ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final RegistryObject<RotatedPillarBlock> EUCALYPTUS_WOOD = registryBlock("eucalyptus_wood",
            () -> new  ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final RegistryObject<RotatedPillarBlock> STRIPPED_EUCALYPTUS_LOG = registryBlock("stripped_eucalyptus_log",
            () -> new  ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<RotatedPillarBlock> STRIPPED_EUCALYPTUS_WOOD = registryBlock("stripped_eucalyptus_wood",
            () -> new  ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));

    public static final RegistryObject<Block> EUCALYPTUS_PLANKS = registryBlock("eucalyptus_planks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });
    public static final RegistryObject<Block> EUCALYPTUS_LEAVES = registryBlock("eucalyptus_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });
    public static final RegistryObject<Block> EUCALYPTUS_SAPLING = registryBlock("eucalyptus_sapling",
            () -> new SaplingBlock(ModTreeGrowers.EUCALYPTUS, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));


    public static final RegistryObject<RotatedPillarBlock> DRIFTWOOD_LOG = registryBlock("driftwood_log",
            () -> new  ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final RegistryObject<RotatedPillarBlock> DRIFTWOOD_WOOD = registryBlock("driftwood_wood",
            () -> new  ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final RegistryObject<RotatedPillarBlock> STRIPPED_DRIFTWOOD_LOG = registryBlock("stripped_driftwood_log",
            () -> new  ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<RotatedPillarBlock> STRIPPED_DRIFTWOOD_WOOD = registryBlock("stripped_driftwood_wood",
            () -> new  ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));

    public static final RegistryObject<Block> DRIFTWOOD_PLANKS = registryBlock("driftwood_planks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });
    public static final RegistryObject<Block> DRIFTWOOD_LEAVES = registryBlock("driftwood_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });
    public static final RegistryObject<Block> DRIFTWOOD_SAPLING = registryBlock("driftwood_sapling",
            () -> new SaplingBlock(ModTreeGrowers.DRIFTWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<RotatedPillarBlock> BLOODWOOD_LOG = registryBlock("bloodwood_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final RegistryObject<RotatedPillarBlock> BLOODWOOD_WOOD = registryBlock("bloodwood_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final RegistryObject<RotatedPillarBlock> STRIPPED_BLOODWOOD_LOG = registryBlock("stripped_bloodwood_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<RotatedPillarBlock> STRIPPED_BLOODWOOD_WOOD = registryBlock("stripped_bloodwood_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));

    public static final RegistryObject<Block> BLOODWOOD_PLANKS = registryBlock("bloodwood_planks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });
    public static final RegistryObject<Block> BLOODWOOD_LEAVES = registryBlock("bloodwood_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });
    public static final RegistryObject<Block> BLOODWOOD_SAPLING = registryBlock("bloodwood_sapling",
            () -> new SaplingBlock(ModTreeGrowers.BLOODWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));



    public static final RegistryObject<Block> BLOODWOOD_STAIRS = registryBlock("bloodwood_stairs",
            () -> new StairBlock(modBlocks.BLOODWOOD_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f)));
    public static final RegistryObject<Block> BLOODWOOD_SLAB = registryBlock("bloodwood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f)));

    public static final RegistryObject<Block> BLOODWOOD_PRESSURE_PLATE = registryBlock("bloodwood_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.CRIMSON, BlockBehaviour.Properties.of().strength(2f)));
    public static final RegistryObject<ButtonBlock> BLOODWOOD_BUTTON = registryBlock("bloodwood_button",
            () -> new ButtonBlock(BlockSetType.CRIMSON, 25, BlockBehaviour.Properties.of().strength(2f).noCollission()));

    public static final RegistryObject<FenceBlock> BLOODWOOD_FENCE = registryBlock("bloodwood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2f)));
    public static final RegistryObject<Block> BLOODWOOD_FENCE_GATE = registryBlock("bloodwood_fence_gate",
            () -> new FenceGateBlock(WoodType.ACACIA, BlockBehaviour.Properties.of().strength(2f)));
    public static final RegistryObject<WallBlock> BLOODWOOD_WALL = registryBlock("bloodwood_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f)));


    public static final RegistryObject<DoorBlock> BLOODWOOD_DOOR = registryBlock("bloodwood_door",
            () -> new DoorBlock(BlockSetType.ACACIA, BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final RegistryObject<Block> BLOODWOOD_TRAP_DOOR = registryBlock("bloodwood_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.ACACIA, BlockBehaviour.Properties.of().strength(2f).noOcclusion()));


    public static final RegistryObject<Block> DRIFTWOOD_STAIRS = registryBlock("driftwood_stairs",
            () -> new StairBlock(modBlocks.DRIFTWOOD_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f)));
    public static final RegistryObject<Block> DRIFTWOOD_SLAB = registryBlock("driftwood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f)));

    public static final RegistryObject<Block> DRIFTWOOD_PRESSURE_PLATE = registryBlock("driftwood_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.of().strength(2f)));
    public static final RegistryObject<ButtonBlock> DRIFTWOOD_BUTTON = registryBlock("driftwood_button",
            () -> new ButtonBlock(BlockSetType.OAK, 25, BlockBehaviour.Properties.of().strength(2f).noCollission()));

    public static final RegistryObject<FenceBlock> DRIFTWOOD_FENCE = registryBlock("driftwood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2f)));
    public static final RegistryObject<Block> DRIFTWOOD_FENCE_GATE = registryBlock("driftwood_fence_gate",
            () -> new FenceGateBlock(WoodType.ACACIA, BlockBehaviour.Properties.of().strength(2f)));
    public static final RegistryObject<WallBlock> DRIFTWOOD_WALL = registryBlock("driftwood_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f)));


    public static final RegistryObject<DoorBlock> DRIFTWOOD_DOOR = registryBlock("driftwood_door",
            () -> new DoorBlock(BlockSetType.ACACIA, BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final RegistryObject<Block> DRIFTWOOD_TRAP_DOOR = registryBlock("driftwood_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.ACACIA, BlockBehaviour.Properties.of().strength(2f).noOcclusion()));



    public static final RegistryObject<Block> EUCALYPTUS_STAIRS = registryBlock("eucalyptus_stairs",
            () -> new StairBlock(modBlocks.EUCALYPTUS_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f)));
    public static final RegistryObject<Block> EUCALYPTUS_SLAB = registryBlock("eucalyptus_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f)));

    public static final RegistryObject<Block> EUCALYPTUS_PRESSURE_PLATE = registryBlock("eucalyptus_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.of().strength(2f)));
    public static final RegistryObject<ButtonBlock> EUCALYPTUS_BUTTON = registryBlock("eucalyptus_button",
            () -> new ButtonBlock(BlockSetType.OAK, 25, BlockBehaviour.Properties.of().strength(2f).noCollission()));

    public static final RegistryObject<FenceBlock> EUCALYPTUS_FENCE = registryBlock("eucalyptus_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2f)));
    public static final RegistryObject<Block> EUCALYPTUS_FENCE_GATE = registryBlock("eucalyptus_fence_gate",
            () -> new FenceGateBlock(WoodType.ACACIA, BlockBehaviour.Properties.of().strength(2f)));
    public static final RegistryObject<WallBlock> EUCALYPTUS_WALL = registryBlock("eucalyptus_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f)));


    public static final RegistryObject<DoorBlock> EUCALYPTUS_DOOR = registryBlock("eucalyptus_door",
            () -> new DoorBlock(BlockSetType.ACACIA, BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final RegistryObject<Block> EUCALYPTUS_TRAP_DOOR = registryBlock("eucalyptus_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.ACACIA, BlockBehaviour.Properties.of().strength(2f).noOcclusion()));









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
