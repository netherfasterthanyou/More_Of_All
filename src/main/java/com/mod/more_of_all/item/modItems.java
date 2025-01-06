package com.mod.more_of_all.item;


import com.mod.more_of_all.ExampleMod;
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

  public static void register(IEventBus eventBus){
    ITEMS.register(eventBus);
  }
}
