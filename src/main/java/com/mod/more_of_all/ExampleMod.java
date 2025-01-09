package com.mod.more_of_all;

import com.mod.more_of_all.block.modBlocks;
import com.mod.more_of_all.item.modItems;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
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
        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        context.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    // CREATIVE TAB!
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
        event.accept(modItems.THALLIUM);
        event.accept(modItems.TERMINITE);
        event.accept(modItems.RAW_TERMINITE);
        }

        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS){
            event.accept(modBlocks.THALLIUM_BLOCK);
            event.accept(modBlocks.TERMINITE_BLOCK);
            event.accept(modBlocks.RAW_TERMINITE_BLOCK);
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
