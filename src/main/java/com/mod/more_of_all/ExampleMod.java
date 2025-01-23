package com.mod.more_of_all;

import com.mod.more_of_all.block.modBlocks;
import com.mod.more_of_all.effect.ModEffects;
import com.mod.more_of_all.enchantment.ModEnchantmentEffect;
import com.mod.more_of_all.item.modItems;
import com.mod.more_of_all.potion.ModPotions;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file






@Mod(ExampleMod.MOD_ID)
public class ExampleMod
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "more_of_all";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    public ExampleMod(FMLJavaModLoadingContext context)
    {
        IEventBus modEventBus = context.getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // REGISTER HERE
        MinecraftForge.EVENT_BUS.register(this);


        modItems.register(modEventBus);

        modBlocks.register(modEventBus);

        ModEffects.register(modEventBus);
        ModPotions.register(modEventBus);
        ModEnchantmentEffect.register(modEventBus);
        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        context.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ComposterBlock.COMPOSTABLES.put(modItems.CHILI.get(), 0.4f);
            ComposterBlock.COMPOSTABLES.put(modItems.CHILI_SEEDS.get(), 0.15f);
            ComposterBlock.COMPOSTABLES.put(modItems.BLUEBERRIES.get(), 0.15f);
        });
    }

    // CREATIVE TAB!
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
        event.accept(modItems.THALLIUM);
        event.accept(modItems.TERMINITE);
        event.accept(modItems.RAW_TERMINITE);
        event.accept(modItems.DORMANT_STARLIGHT);
        event.accept(modItems.TRACK_SMITHING_TEMPLATE);
        }

        if (event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.accept(modItems.CHILI);
            event.accept(modItems.BLUEBERRIES);
            event.accept(modItems.CHILI_SEEDS);

        }





        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS){
            event.accept(modBlocks.THALLIUM_BLOCK);
            event.accept(modBlocks.TERMINITE_BLOCK);
            event.accept(modBlocks.RAW_TERMINITE_BLOCK);
            event.accept(modBlocks.TERMINITE_BUTTON);
            event.accept(modBlocks.TERMINITE_DOOR);
            event.accept(modBlocks.TERMINITE_SLAB);
            event.accept(modBlocks.TERMINITE_FENCE_GATE);
            event.accept(modBlocks.TERMINITE_WALL);
            event.accept(modBlocks.TERMINITE_FENCE);
            event.accept(modBlocks.TERMINITE_PRESSURE_PLATE);
            event.accept(modBlocks.TERMINITE_TRAP_DOOR);
            event.accept(modBlocks.TERMINITE_STAIRS);

            event.accept(modBlocks.THALLIUM_FENCE);
            event.accept(modBlocks.THALLIUM_DOOR);
            event.accept(modBlocks.THALLIUM_BUTTON);
            event.accept(modBlocks.THALLIUM_SLAB);
            event.accept(modBlocks.THALLIUM_FENCE_GATE);
            event.accept(modBlocks.THALLIUM_WALL);
            event.accept(modBlocks.THALLIUM_PRESSURE_PLATE);
            event.accept(modBlocks.THALLIUM_TRAP_DOOR);
            event.accept(modBlocks.THALLIUM_STAIRS);

            event.accept(modBlocks.TERMINITE_LAMP);
            event.accept(modBlocks.THALLIUM_LAMP);


        }
        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES){
            event.accept(modItems.CHISEL);
            event.accept(modItems.BLACKSTONE_CHISEL);
            event.accept(modItems.DEEPSLATE_CHISEL);
            event.accept(modItems.PRISMARINE_CHISEL);
            event.accept(modItems.SAND_CHISEL);
            event.accept(modItems.TUFF_CHISEL);
            event.accept(modItems.NETHER_BRICK_CHISEL);
            event.accept(modBlocks.SALVAGER);
            event.accept(modItems.CHAINSAW);
            event.accept(modItems.RAYMINER);
            event.accept(modItems.TERMINITE_SHOVEL);
            event.accept(modItems.TERMINITE_PICKAXE);
            event.accept(modItems.TERMINITE_HOE);
            event.accept(modItems.THALLIUM_HOE);
            event.accept(modItems.THALLIUM_SHOVEL);
            event.accept(modItems.THALLIUM_PICKAXE);
            event.accept(modItems.HAMMER);
        }
        if (event.getTabKey() == CreativeModeTabs.COMBAT){
            event.accept(modItems.TERMINITE_SWORD);
            event.accept(modItems.TERMINITE_AXE);
            event.accept(modItems.THALLIUM_SWORD);
            event.accept(modItems.THALLIUM_AXE);
            event.accept(modItems.HAMMER);
            event.accept(modItems.THALLIUM_CHESTPLATE);
            event.accept(modItems.THALLIUM_LEGGINGS);
            event.accept(modItems.THALLIUM_HELMET);
            event.accept(modItems.THALLIUM_BOOTS);

            event.accept(modItems.TERMINITE_HELMET);
            event.accept(modItems.TERMINITE_CHESTPLATE);
            event.accept(modItems.TERMINITE_LEGGINGS);
            event.accept(modItems.TERMINITE_BOOTS);

            event.accept(modItems.TERMINITE_HORSE_ARMOR);
            event.accept(modItems.THALLIUM_HORSE_ARMOR);



        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
