package com.mod.more_of_all.enchantment;

import com.mod.more_of_all.ExampleMod;
import com.mod.more_of_all.enchantment.custom.*;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.enchantment.effects.EnchantmentEntityEffect;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModEnchantmentEffect {
    public static final DeferredRegister<MapCodec<?extends EnchantmentEntityEffect>> ENTITY_ENCHANTMENT_EFFECTS =
            DeferredRegister.create(Registries.ENCHANTMENT_ENTITY_EFFECT_TYPE, ExampleMod.MOD_ID);

    public static final RegistryObject<MapCodec<?extends EnchantmentEntityEffect>> THUNDERING =
            ENTITY_ENCHANTMENT_EFFECTS.register("thundering", () -> LightningStrikeEnchantmentEffect.CODEC);
    public static final RegistryObject<MapCodec<?extends EnchantmentEntityEffect>> LIFE_STEAL =
            ENTITY_ENCHANTMENT_EFFECTS.register("life_steal", () -> LifeStealEnchant.CODEC);
    public static final RegistryObject<MapCodec<?extends EnchantmentEntityEffect>> FIREBALL =
            ENTITY_ENCHANTMENT_EFFECTS.register("fireball", () -> FireballShootEnchant.CODEC);
    public static final RegistryObject<MapCodec<?extends EnchantmentEntityEffect>> TNT_EXPLODE_EFFECT =
            ENTITY_ENCHANTMENT_EFFECTS.register("tnt_explode_effect", () -> TntExplode_effect.CODEC);



    public static void register(IEventBus eventBus){
        ENTITY_ENCHANTMENT_EFFECTS.register(eventBus);
    }

}
