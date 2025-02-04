package com.mod.more_of_all.entity;

import com.mod.more_of_all.ExampleMod;
import com.mod.more_of_all.entity.custom.CapybaraEntity;

import com.mod.more_of_all.entity.custom.GiraffeEntity;
import com.mod.more_of_all.entity.custom.PenguinEntity;


import com.mod.more_of_all.entity.custom.ThrowingAxeProjectileEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ExampleMod.MOD_ID);

    public static final RegistryObject<EntityType<CapybaraEntity>> CAPYBARA =
            ENTITY_TYPES.register("capybara", () -> EntityType.Builder.of(CapybaraEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 0.4f).build("capybara"));


    public static final RegistryObject<EntityType<ThrowingAxeProjectileEntity>> THROWING_AXE =
            ENTITY_TYPES.register("throwing_axe",
                    () -> EntityType.Builder.<ThrowingAxeProjectileEntity>of(ThrowingAxeProjectileEntity::new, MobCategory.MISC)
                    .sized(0.5f, 1.15f).build("throwing_axe"));

    public static final RegistryObject<EntityType<GiraffeEntity>> GIRAFFE =
            ENTITY_TYPES.register("giraffe", () -> EntityType.Builder.of(GiraffeEntity::new, MobCategory.CREATURE)
                    .sized(1.5f, 2.5f).build("giraffe"));
    public static final RegistryObject<EntityType<PenguinEntity>> PENGUIN =
            ENTITY_TYPES.register("penguin", () -> EntityType.Builder.of(PenguinEntity::new, MobCategory.CREATURE)
                    .sized(1.5f, 2.5f).build("penguin"));



    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}