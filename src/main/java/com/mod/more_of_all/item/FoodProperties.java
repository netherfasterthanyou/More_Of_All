package com.mod.more_of_all.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;

public class FoodProperties {
    public static final net.minecraft.world.food.FoodProperties CHILI = new net.minecraft.world.food.FoodProperties.Builder().nutrition(3).saturationModifier(0.25f)
            .effect(new MobEffectInstance(MobEffects.LUCK, 4000), 0.1f)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3000), 0.7f).build();

}