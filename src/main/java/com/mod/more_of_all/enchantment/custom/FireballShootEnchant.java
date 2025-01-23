package com.mod.more_of_all.enchantment.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.item.enchantment.EnchantedItemInUse;
import net.minecraft.world.item.enchantment.effects.EnchantmentEntityEffect;
import net.minecraft.world.phys.Vec3;

public record FireballShootEnchant() implements EnchantmentEntityEffect {
    public static final MapCodec<FireballShootEnchant> CODEC = MapCodec.unit(FireballShootEnchant::new);

    @Override
    public void apply(ServerLevel pLevel, int pEnchantmentLevel, EnchantedItemInUse pItem, Entity pEntity, Vec3 pOrigin) {
        if (pEnchantmentLevel == 1){
            EntityType.FIREBALL.spawn(pLevel, pEntity.getOnPos().above(1), MobSpawnType.TRIGGERED);
        }
        if (pEnchantmentLevel == 2){
            EntityType.FIREBALL.spawn(pLevel, pEntity.getOnPos().above(1), MobSpawnType.TRIGGERED);
            EntityType.FIREBALL.spawn(pLevel, pEntity.getOnPos().above(1), MobSpawnType.TRIGGERED);
        }
        if (pEnchantmentLevel == 3){
            EntityType.FIREBALL.spawn(pLevel, pEntity.getOnPos().above(1), MobSpawnType.TRIGGERED);
            EntityType.FIREBALL.spawn(pLevel, pEntity.getOnPos().above(1), MobSpawnType.TRIGGERED);
            EntityType.FIREBALL.spawn(pLevel, pEntity.getOnPos().above(1), MobSpawnType.TRIGGERED);
        }
        if (pEnchantmentLevel == 4){
            EntityType.FIREBALL.spawn(pLevel, pEntity.getOnPos().above(1), MobSpawnType.TRIGGERED);
            EntityType.FIREBALL.spawn(pLevel, pEntity.getOnPos().above(1), MobSpawnType.TRIGGERED);
            EntityType.FIREBALL.spawn(pLevel, pEntity.getOnPos().above(1), MobSpawnType.TRIGGERED);
            EntityType.FIREBALL.spawn(pLevel, pEntity.getOnPos().above(1), MobSpawnType.TRIGGERED);
        }
        if (pEnchantmentLevel == 5){
            EntityType.FIREBALL.spawn(pLevel, pEntity.getOnPos().above(1), MobSpawnType.TRIGGERED);
            EntityType.FIREBALL.spawn(pLevel, pEntity.getOnPos().above(1), MobSpawnType.TRIGGERED);
            EntityType.FIREBALL.spawn(pLevel, pEntity.getOnPos().above(1), MobSpawnType.TRIGGERED);
            EntityType.FIREBALL.spawn(pLevel, pEntity.getOnPos().above(1), MobSpawnType.TRIGGERED);
            EntityType.FIREBALL.spawn(pLevel, pEntity.getOnPos().above(1), MobSpawnType.TRIGGERED);
            EntityType.FIREBALL.spawn(pLevel, pEntity.getOnPos().above(1), MobSpawnType.TRIGGERED);
        }
    }

    @Override
    public MapCodec<? extends EnchantmentEntityEffect> codec() {
        return CODEC;
    }
}
