package com.mod.more_of_all.enchantment.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.item.enchantment.EnchantedItemInUse;
import net.minecraft.world.item.enchantment.effects.EnchantmentEntityEffect;
import net.minecraft.world.phys.Vec3;

public record ArrowRainEnchantmentEffect() implements EnchantmentEntityEffect {
    public static final MapCodec<ArrowRainEnchantmentEffect> CODEC = MapCodec.unit(ArrowRainEnchantmentEffect::new);

    @Override
    public void apply(ServerLevel pLevel, int pEnchantmentLevel, EnchantedItemInUse pItem, Entity pEntity, Vec3 pOrigin) {
        if (pEnchantmentLevel == 1){

            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().west(1).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().east(1).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().north(1).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().south(1).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().west(1).north(1).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().east(1).south(1).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().north(1).east(1).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().south(1).west(1).above(20), MobSpawnType.TRIGGERED);
        }
        if (pEnchantmentLevel == 2){
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().west(1).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().east(1).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().north(1).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().south(1).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().above(11), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().west(2).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().east(2).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().north(2).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().south(2).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().above(11), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().west(2).north(2).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().east(2).south(2).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().north(2).east(2).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().south(2).west(2).above(20), MobSpawnType.TRIGGERED);

            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().west(1).east(1).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().east(1).west(1).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().north(1).south(1).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().south(1).north(1).above(20), MobSpawnType.TRIGGERED);

        }
        if (pEnchantmentLevel == 3){
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().west(1).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().east(1).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().north(1).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().south(1).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().above(11), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().west(2).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().east(2).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().north(2).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().south(2).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().above(11), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().west(3).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().east(3).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().north(3).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().south(3).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().west(2).north(2).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().east(2).south(2).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().north(2).east(2).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().south(2).west(2).above(20), MobSpawnType.TRIGGERED);

            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().west(1).east(1).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().east(1).west(1).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().north(1).south(1).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().south(1).north(1).above(20), MobSpawnType.TRIGGERED);


            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().west(3).east(3).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().east(3).west(3).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().north(3).south(3).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().south(3).north(3).above(20), MobSpawnType.TRIGGERED);

        }
        if (pEnchantmentLevel == 4){
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().west(1).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().east(1).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().north(1).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().south(1).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().above(11), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().west(2).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().east(2).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().north(2).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().south(2).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().above(11), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().west(3).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().east(3).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().north(3).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().south(3).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().above(11), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().west(4).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().east(4).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().north(4).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().south(4).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().above(4), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().west(2).north(2).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().east(2).south(2).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().north(2).east(2).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().south(2).west(2).above(20), MobSpawnType.TRIGGERED);

            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().west(1).east(1).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().east(1).west(1).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().north(1).south(1).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().south(1).north(1).above(20), MobSpawnType.TRIGGERED);

            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().west(4).east(4).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().east(4).west(4).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().north(4).south(4).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().south(4).north(4).above(20), MobSpawnType.TRIGGERED);


            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().west(3).east(3).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().east(3).west(3).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().north(3).south(3).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().south(3).north(3).above(20), MobSpawnType.TRIGGERED);


        }
        if (pEnchantmentLevel == 5){
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().west(1).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().east(1).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().north(1).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().south(1).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().above(11), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().west(2).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().east(2).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().north(2).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().south(2).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().above(11), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().west(3).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().east(3).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().north(3).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().south(3).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().above(11), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().west(4).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().east(4).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().north(4).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().south(4).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().west(5).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().east(5).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().north(5).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().south(5).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().above(20), MobSpawnType.TRIGGERED);




            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().west(2).north(2).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().east(2).south(2).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().north(2).east(2).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().south(2).west(2).above(20), MobSpawnType.TRIGGERED);

            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().west(1).east(1).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().east(1).west(1).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().north(1).south(1).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().south(1).north(1).above(20), MobSpawnType.TRIGGERED);

            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().west(5).east(5).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().east(5).west(5).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().north(5).south(5).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().south(5).north(5).above(20), MobSpawnType.TRIGGERED);


            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().west(4).east(4).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().east(4).west(4).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().north(4).south(4).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().south(4).north(4).above(20), MobSpawnType.TRIGGERED);


            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().west(3).east(3).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().east(3).west(3).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().north(3).south(3).above(20), MobSpawnType.TRIGGERED);
            EntityType.ARROW.spawn(pLevel, pEntity.getOnPos().south(3).north(3).above(20), MobSpawnType.TRIGGERED);


        }
    }

    @Override
    public MapCodec<? extends EnchantmentEntityEffect> codec() {
        return CODEC;
    }
}
