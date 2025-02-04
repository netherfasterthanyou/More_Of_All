package com.mod.more_of_all.enchantment;

import com.mod.more_of_all.ExampleMod;
import com.mod.more_of_all.enchantment.custom.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.EnchantmentTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentEffectComponents;
import net.minecraft.world.item.enchantment.EnchantmentTarget;

public class ModEnchantments {
    public static final ResourceKey<Enchantment> THUNDERING = ResourceKey.create(Registries.ENCHANTMENT,
            ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID, "thundering"));
    public static final ResourceKey<Enchantment> LIFE_STEAL = ResourceKey.create(Registries.ENCHANTMENT,
            ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID, "life_steal"));
    public static final ResourceKey<Enchantment> FIREBALL = ResourceKey.create(Registries.ENCHANTMENT,
            ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID, "fireball"));
    public static final ResourceKey<Enchantment> TNT_EXPLODE_EFFECT = ResourceKey.create(Registries.ENCHANTMENT,
            ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID, "tnt_explode_effect"));
    public static final ResourceKey<Enchantment> ARROW_RAIN = ResourceKey.create(Registries.ENCHANTMENT,
            ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID, "arrow_rain"));


    public static void bootstrap(BootstrapContext<Enchantment> context){
        var enchantments = context.lookup(Registries.ENCHANTMENT);
        var items = context.lookup(Registries.ITEM);

        register(context, THUNDERING, Enchantment.enchantment(Enchantment.definition(

                        items.getOrThrow(ItemTags.BOW_ENCHANTABLE),

                        6,
                        5,
                        Enchantment.dynamicCost(5, 8),
                        Enchantment.dynamicCost(25, 8),
                        2,
                        EquipmentSlotGroup.MAINHAND))
                .exclusiveWith(enchantments.getOrThrow(EnchantmentTags.DAMAGE_EXCLUSIVE))
                .withEffect(EnchantmentEffectComponents.POST_ATTACK, EnchantmentTarget.ATTACKER,
                        EnchantmentTarget.VICTIM, new LightningStrikeEnchantmentEffect()));


        register(context, ARROW_RAIN, Enchantment.enchantment(Enchantment.definition(

                        items.getOrThrow(ItemTags.BOW_ENCHANTABLE),

                        2,
                        5,
                        Enchantment.dynamicCost(5, 8),
                        Enchantment.dynamicCost(25, 8),
                        2,
                        EquipmentSlotGroup.MAINHAND))
                .exclusiveWith(enchantments.getOrThrow(EnchantmentTags.DAMAGE_EXCLUSIVE))
                .withEffect(EnchantmentEffectComponents.POST_ATTACK, EnchantmentTarget.ATTACKER,
                        EnchantmentTarget.VICTIM, new ArrowRainEnchantmentEffect()));


        register(context, TNT_EXPLODE_EFFECT, Enchantment.enchantment(Enchantment.definition(

                        items.getOrThrow(ItemTags.BOW_ENCHANTABLE),

                        6,
                        5,
                        Enchantment.dynamicCost(5, 8),
                        Enchantment.dynamicCost(25, 8),
                        3,
                        EquipmentSlotGroup.MAINHAND))
                .exclusiveWith(enchantments.getOrThrow(EnchantmentTags.DAMAGE_EXCLUSIVE))
                .withEffect(EnchantmentEffectComponents.POST_ATTACK, EnchantmentTarget.ATTACKER,
                        EnchantmentTarget.VICTIM, new TntExplode_effect()));

        register(context, LIFE_STEAL, Enchantment.enchantment(Enchantment.definition(
                        items.getOrThrow(ItemTags.WEAPON_ENCHANTABLE),
                        items.getOrThrow(ItemTags.SWORD_ENCHANTABLE),
                        7,
                        3,
                        Enchantment.dynamicCost(5, 8),
                        Enchantment.dynamicCost(20, 8),
                        2,
                        EquipmentSlotGroup.MAINHAND))
                .exclusiveWith(enchantments.getOrThrow(EnchantmentTags.DAMAGE_EXCLUSIVE))
                .withEffect(EnchantmentEffectComponents.POST_ATTACK, EnchantmentTarget.ATTACKER,
                        EnchantmentTarget.VICTIM, new LifeStealEnchant()));

        register(context, FIREBALL, Enchantment.enchantment(Enchantment.definition(
                        items.getOrThrow(ItemTags.WEAPON_ENCHANTABLE),
                        items.getOrThrow(ItemTags.SWORD_ENCHANTABLE),
                        7,
                        5,
                        Enchantment.dynamicCost(5, 8),
                        Enchantment.dynamicCost(25, 8),
                        2,
                        EquipmentSlotGroup.MAINHAND))
                .exclusiveWith(enchantments.getOrThrow(EnchantmentTags.DAMAGE_EXCLUSIVE))
                .withEffect(EnchantmentEffectComponents.POST_ATTACK, EnchantmentTarget.ATTACKER,
                        EnchantmentTarget.VICTIM, new FireballShootEnchant()));

    }


    private static void register(BootstrapContext<Enchantment> registry, ResourceKey<Enchantment> key, Enchantment.Builder builder){
        registry.register(key, builder.build(key.location()));
    }

}
