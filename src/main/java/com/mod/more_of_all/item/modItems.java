package com.mod.more_of_all.item;


import com.mod.more_of_all.ExampleMod;
import com.mod.more_of_all.block.modBlocks;
import com.mod.more_of_all.entity.ModEntities;
import com.mod.more_of_all.item.custom.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
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
                  .attributes(SwordItem.createAttributes(ModToolTiers.TERMINITE,  2, (float) -2.4))));

  public static final RegistryObject<Item> TERMINITE_AXE = ITEMS.register("terminite_axe",
          () -> new AxeItem(ModToolTiers.TERMINITE, new Item.Properties()
                  .attributes(AxeItem.createAttributes(ModToolTiers.TERMINITE, 3.5f, (float) -3.2))));

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
                  .attributes(SwordItem.createAttributes(ModToolTiers.THALLIUM, 2, (float) -2.4))));

  public static final RegistryObject<Item> THALLIUM_AXE = ITEMS.register("thallium_axe",
          () -> new AxeItem(ModToolTiers.THALLIUM, new Item.Properties()
                  .attributes(AxeItem.createAttributes(ModToolTiers.THALLIUM, 3.5f, (float) -3.2))));

  public static final RegistryObject<Item> THALLIUM_SHOVEL = ITEMS.register("thallium_shovel",
          () -> new ShovelItem(ModToolTiers.THALLIUM, new Item.Properties()
                  .attributes(ShovelItem.createAttributes(ModToolTiers.THALLIUM, 1.5f, (float) -3.0))));

  public static final RegistryObject<Item> THALLIUM_PICKAXE = ITEMS.register("thallium_pickaxe",
          () -> new PickaxeItem(ModToolTiers.THALLIUM, new Item.Properties()
                  .attributes(PickaxeItem.createAttributes(ModToolTiers.THALLIUM, 1, (float) -2.8))));

  public static final RegistryObject<Item> THALLIUM_HOE = ITEMS.register("thallium_hoe",
          () -> new HoeItem(ModToolTiers.THALLIUM, new Item.Properties()
                  .attributes(HoeItem.createAttributes(ModToolTiers.THALLIUM, 0, (float) -1.6))));

  public static final RegistryObject<Item> HAMMER = ITEMS.register("hammer",
          () -> new HammerItem(ModToolTiers.HAMMER, new Item.Properties()
                  .attributes(AxeItem.createAttributes(ModToolTiers.HAMMER, 8, (float) -3.1))));

  public static final RegistryObject<Item> TERMINITE_HELMET = ITEMS.register("terminite_helmet",
          () -> new ModArmorItem(ModArmorMaterials.TERMINITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                  new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(25))));
  public static final RegistryObject<Item> TERMINITE_CHESTPLATE = ITEMS.register("terminite_chestplate",
          () -> new ArmorItem(ModArmorMaterials.TERMINITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                  new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(25))));
  public static final RegistryObject<Item> TERMINITE_LEGGINGS = ITEMS.register("terminite_leggings",
          () -> new ArmorItem(ModArmorMaterials.TERMINITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                  new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(25))));
  public static final RegistryObject<Item> TERMINITE_BOOTS = ITEMS.register("terminite_boots",
          () -> new ArmorItem(ModArmorMaterials.TERMINITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                  new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(25))));
  public static final RegistryObject<Item> PENGUIN_SPAWN_EGG = ITEMS.register("penguin_spawn_egg",
          () -> new ForgeSpawnEggItem(ModEntities.PENGUIN, 0xdebd47, 0xccbfbe,
                  new Item.Properties()));


  public static final RegistryObject<Item> CHILI_SEEDS = ITEMS.register("chili_seeds",
          () -> new ItemNameBlockItem(modBlocks.CHILI_CROP.get(), new Item.Properties()));
  public static final RegistryObject<Item> CAPYBARA_SPAWN_EGG = ITEMS.register("capybara_spawn_egg",
          () -> new ForgeSpawnEggItem(ModEntities.CAPYBARA,0x664216, 0xdeab1f,
                  new Item.Properties()));

  public static final RegistryObject<Item> GIRAFFE_SPAWN_EGG = ITEMS.register("giraffe_spawn_egg",
          () -> new ForgeSpawnEggItem(ModEntities.GIRAFFE,0x7e5b41, 0x7e5b41,
                  new Item.Properties()));


  public static final RegistryObject<Item> THALLIUM_HELMET = ITEMS.register("thallium_helmet",
          () -> new ModArmorItem(ModArmorMaterials.THALLIUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                  new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(23))));
  public static final RegistryObject<Item> THALLIUM_CHESTPLATE = ITEMS.register("thallium_chestplate",
          () -> new ArmorItem(ModArmorMaterials.THALLIUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                  new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(23))));
  public static final RegistryObject<Item> THALLIUM_LEGGINGS = ITEMS.register("thallium_leggings",
          () -> new ArmorItem(ModArmorMaterials.THALLIUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                  new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(23))));
  public static final RegistryObject<Item> THALLIUM_BOOTS = ITEMS.register("thallium_boots",
          () -> new ArmorItem(ModArmorMaterials.THALLIUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                  new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(23))));
  public static final RegistryObject<Item> BLUEBERRIES = ITEMS.register("blueberries",
          () -> new ItemNameBlockItem(modBlocks.BLUEBERRY_BUSH.get(), new Item.Properties().food(FoodProperties.BLUEBERRIES)));


  public static final RegistryObject<Item> TERMINITE_BOW = ITEMS.register("terminite_bow",
          () -> new BowItem(new Item.Properties().durability(783).stacksTo(1)));

  public static final RegistryObject<Item> THALLIUM_BOW = ITEMS.register("thallium_bow",
          () -> new BowItem(new Item.Properties().durability(723).stacksTo(1)));


  public static final RegistryObject<Item> TERMINITE_HORSE_ARMOR = ITEMS.register("terminite_horse_armor",
          () -> new AnimalArmorItem(ModArmorMaterials.TERMINITE_ARMOR_MATERIAL, AnimalArmorItem.BodyType.EQUESTRIAN,
                  false, new Item.Properties().stacksTo(1)));

  public static final RegistryObject<Item> THALLIUM_HORSE_ARMOR = ITEMS.register("thallium_horse_armor",
          () -> new AnimalArmorItem(ModArmorMaterials.THALLIUM_ARMOR_MATERIAL, AnimalArmorItem.BodyType.EQUESTRIAN,
                  false, new Item.Properties().stacksTo(1)));

  public static final RegistryObject<Item> TRACK_SMITHING_TEMPLATE = ITEMS.register("track_armor_trim_smithing_template",
          () -> SmithingTemplateItem.createArmorTrimTemplate(ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID, "track")));


  public static void register(IEventBus eventBus){
    ITEMS.register(eventBus);
  }
}
