package com.mod.more_of_all.block;

import com.mod.more_of_all.ExampleMod;
import com.mod.more_of_all.item.modItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
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
