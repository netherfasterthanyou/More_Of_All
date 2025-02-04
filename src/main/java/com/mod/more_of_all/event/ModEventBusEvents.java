package com.mod.more_of_all.event;


import com.mod.more_of_all.ExampleMod;
import com.mod.more_of_all.entity.ModEntities;
import com.mod.more_of_all.entity.client.*;
import com.mod.more_of_all.entity.custom.CapybaraEntity;
import com.mod.more_of_all.entity.custom.GiraffeEntity;
import com.mod.more_of_all.entity.custom.PenguinEntity;
import net.minecraft.world.entity.SpawnPlacementTypes;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.SpawnPlacementRegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ExampleMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(CapybaraModel.LAYER_LOCATION, CapybaraModel::createBodyLayer);

        event.registerLayerDefinition(ModModelLayers.GIRAFFE, GiraffeModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.PENGUIN, PenguinModel::createBodyLayer);
        event.registerLayerDefinition(ThrowingAxeProjectileModel.LAYER_LOCATION, ThrowingAxeProjectileModel::createBodyLayer);


    }

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.CAPYBARA.get(), CapybaraEntity.createAttributes().build());

        event.put(ModEntities.GIRAFFE.get(), GiraffeEntity.createAttributes().build());
        event.put(ModEntities.PENGUIN.get(), PenguinEntity.createAttributes().build());


    }
    @SubscribeEvent
    public  static  void  registerSpawnPlacements(SpawnPlacementRegisterEvent event) {
        event.register(ModEntities.GIRAFFE.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(ModEntities.PENGUIN.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(ModEntities.CAPYBARA.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
    }

}