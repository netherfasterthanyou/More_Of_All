package com.mod.more_of_all.item;


import com.mod.more_of_all.ExampleMod;
import com.mod.more_of_all.item.custom.*;
import net.minecraft.world.item.*;
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

  public static final RegistryObject<Item> DORMANT_STARLIGHT = ITEMS.register("dormant_starlight",
          () -> new dormantStarlight(new Item.Properties(), 90000));

  public static final RegistryObject<Item> RAW_TERMINITE = ITEMS.register("raw_terminite",
          () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> CHISEL = ITEMS.register("chisel",
          () -> new ChiselItem(new Item.Properties().stacksTo(1)));

  public static final RegistryObject<Item> NETHER_BRICK_CHISEL = ITEMS.register("nether_brick_chisel",
          () -> new NetherBrickChiselItem(new Item.Properties().stacksTo(1)));

  public static final RegistryObject<Item> DEEPSLATE_CHISEL = ITEMS.register("deepslate_chisel",
          () -> new DeepslateChiselItem(new Item.Properties().stacksTo(1)));

  public static final RegistryObject<Item> TUFF_CHISEL = ITEMS.register("tuff_chisel",
          () -> new TuffChiselItem(new Item.Properties().stacksTo(1)));

  public static final RegistryObject<Item> BLACKSTONE_CHISEL = ITEMS.register("blackstone_chisel",
          () -> new BlackStoneChiselItem(new Item.Properties().stacksTo(1)));

  public static final RegistryObject<Item> PRISMARINE_CHISEL = ITEMS.register("prismarine_chisel",
          () -> new PrismarineChiselItem(new Item.Properties().stacksTo(1)));

  public static final RegistryObject<Item> SAND_CHISEL = ITEMS.register("sand_chisel",
          () -> new SandChiselItem(new Item.Properties().stacksTo(1)));

  public static final RegistryObject<Item> CHAINSAW = ITEMS.register("chainsaw",
          () -> new ChainSaw(new Item.Properties().durability(296).stacksTo(1)));

  public static final RegistryObject<Item> CHILI = ITEMS.register("chili",
          () -> new Item(new Item.Properties().food(FoodProperties.CHILI)));

  public static final RegistryObject<Item> RAYMINER = ITEMS.register("rayminer",
          () -> new rayminer(new Item.Properties().durability(1000001).stacksTo(1)));

  public static final RegistryObject<Item> TERMINITE_SWORD = ITEMS.register("terminite_sword",
          () -> new SwordItem(ModToolTiers.TERMINITE, new Item.Properties()
                  .attributes(SwordItem.createAttributes(ModToolTiers.TERMINITE, 3, (float) -2.4))));

  public static final RegistryObject<Item> TERMINITE_AXE = ITEMS.register("terminite_axe",
          () -> new AxeItem(ModToolTiers.TERMINITE, new Item.Properties()
                  .attributes(AxeItem.createAttributes(ModToolTiers.TERMINITE, 6, (float) -3.2))));

  public static final RegistryObject<Item> TERMINITE_SHOVEL = ITEMS.register("terminite_shovel",
          () -> new ShovelItem(ModToolTiers.TERMINITE, new Item.Properties()
                  .attributes(ShovelItem.createAttributes(ModToolTiers.TERMINITE, 1.5f, (float) -3.0))));

  public static final RegistryObject<Item> TERMINITE_PICKAXE = ITEMS.register("terminite_pickaxe",
          () -> new PickaxeItem(ModToolTiers.TERMINITE, new Item.Properties()
                  .attributes(PickaxeItem.createAttributes(ModToolTiers.TERMINITE, 1, (float) -2.8))));

  public static final RegistryObject<Item> TERMINITE_HOE = ITEMS.register("terminite_hoe",
          () -> new HoeItem(ModToolTiers.TERMINITE, new Item.Properties()
                  .attributes(HoeItem.createAttributes(ModToolTiers.TERMINITE, 0, (float) -3))));


  public static final RegistryObject<Item> THALLIUM_SWORD = ITEMS.register("thallium_sword",
          () -> new SwordItem(ModToolTiers.THALLIUM, new Item.Properties()
                  .attributes(SwordItem.createAttributes(ModToolTiers.THALLIUM, 3, (float) -2.4))));

  public static final RegistryObject<Item> THALLIUM_AXE = ITEMS.register("thallium_axe",
          () -> new AxeItem(ModToolTiers.THALLIUM, new Item.Properties()
                  .attributes(AxeItem.createAttributes(ModToolTiers.THALLIUM, 6, (float) -3.2))));

  public static final RegistryObject<Item> THALLIUM_SHOVEL = ITEMS.register("thallium_shovel",
          () -> new ShovelItem(ModToolTiers.THALLIUM, new Item.Properties()
                  .attributes(ShovelItem.createAttributes(ModToolTiers.THALLIUM, 1.5f, (float) -3.0))));

  public static final RegistryObject<Item> THALLIUM_PICKAXE = ITEMS.register("thallium_pickaxe",
          () -> new PickaxeItem(ModToolTiers.THALLIUM, new Item.Properties()
                  .attributes(PickaxeItem.createAttributes(ModToolTiers.THALLIUM, 1, (float) -2.8))));

  public static final RegistryObject<Item> THALLIUM_HOE = ITEMS.register("thallium_hoe",
          () -> new HoeItem(ModToolTiers.THALLIUM, new Item.Properties()
                  .attributes(HoeItem.createAttributes(ModToolTiers.THALLIUM, 0, (float) -3))));

  public static void register(IEventBus eventBus){
    ITEMS.register(eventBus);
  }
}
