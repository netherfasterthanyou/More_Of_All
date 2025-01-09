package com.mod.more_of_all.item;


import com.mod.more_of_all.ExampleMod;
import com.mod.more_of_all.item.custom.*;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.RegistryObject;


public class modItems {
  public static final DeferredRegister<Item> ITEMS =
          DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MOD_ID);

  public static final RegistryObject<Item> THALLIUM = ITEMS.register("thallium",
          () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> TERMINITE = ITEMS.register("terminite",
          () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> RAW_TERMINITE = ITEMS.register("raw_terminite",
          () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> CHISEL = ITEMS.register("chisel",
          () -> new ChiselItem(new Item.Properties()));

  public static final RegistryObject<Item> NETHER_BRICK_CHISEL = ITEMS.register("nether_brick_chisel",
          () -> new NetherBrickChiselItem(new Item.Properties()));

  public static final RegistryObject<Item> DEEPSLATE_CHISEL = ITEMS.register("deepslate_chisel",
          () -> new DeepslateChiselItem(new Item.Properties()));

  public static final RegistryObject<Item> TUFF_CHISEL = ITEMS.register("tuff_chisel",
          () -> new TuffChiselItem(new Item.Properties()));

  public static final RegistryObject<Item> BLACKSTONE_CHISEL = ITEMS.register("blackstone_chisel",
          () -> new BlackStoneChiselItem(new Item.Properties()));

  public static final RegistryObject<Item> PRISMARINE_CHISEL = ITEMS.register("prismarine_chisel",
          () -> new PrismarineChiselItem(new Item.Properties()));

  public static final RegistryObject<Item> SAND_CHISEL = ITEMS.register("sand_chisel",
          () -> new SandChiselItem(new Item.Properties()));

  public static void register(IEventBus eventBus){
    ITEMS.register(eventBus);
  }
}
