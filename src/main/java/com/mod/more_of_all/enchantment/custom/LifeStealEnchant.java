package com.mod.more_of_all.enchantment.custom;

import com.mod.more_of_all.enchantment.ModEnchantments;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantedItemInUse;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.effects.EnchantmentEntityEffect;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "more_of_all", bus = Mod.EventBusSubscriber.Bus.FORGE)
public record LifeStealEnchant() implements EnchantmentEntityEffect {
    public static final MapCodec<LifeStealEnchant> CODEC = MapCodec.unit(LifeStealEnchant::new);

    @Override
    public void apply(ServerLevel pLevel, int pEnchantmentLevel, EnchantedItemInUse pItem, Entity pEntity, Vec3 pOrigin) {
        // This method is not used for the life steal effect
    }

    @SubscribeEvent
    public static void onLivingHurt(LivingHurtEvent event) {
        if (event.getSource().getDirectEntity() instanceof Player player) {
            ItemStack weapon = player.getMainHandItem();


            Registry<Enchantment> enchantmentRegistry = player.level().registryAccess().registryOrThrow(Registries.ENCHANTMENT);


            Holder<Enchantment> lifeStealHolder = enchantmentRegistry.getHolder(ModEnchantments.LIFE_STEAL).orElseThrow();


            int level = EnchantmentHelper.getItemEnchantmentLevel(lifeStealHolder, weapon);

            if (level > 0) {
                float damage = event.getAmount();
                float healAmount = damage * 0.1f * level;
                player.heal(healAmount);
            }
        }
    }


    @Override
    public MapCodec<? extends EnchantmentEntityEffect> codec() {
        return CODEC;
    }
}
