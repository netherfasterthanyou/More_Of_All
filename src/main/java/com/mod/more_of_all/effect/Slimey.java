package com.mod.more_of_all.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.Vec3;

public class Slimey extends MobEffect {


    public Slimey(MobEffectCategory pCategory, int pColor) {
        super(pCategory, pColor);
    }

    @Override
    public boolean applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        if (pLivingEntity.horizontalCollision){
            Vec3 initialVec = pLivingEntity.getDeltaMovement();
            Vec3 climbVec = new Vec3(initialVec.x, 0.2, initialVec.z);
            pLivingEntity.setDeltaMovement(climbVec.scale(0.97D));
            return true;
        }
        if (pLivingEntity.verticalCollision){
            Vec3 initialVec = pLivingEntity.getDeltaMovement();
            Vec3 moveVec = new Vec3(initialVec.x, 0.0, initialVec.z);
            pLivingEntity.setDeltaMovement(moveVec.scale(0.3D));
            return true;
        }





        return super.applyEffectTick(pLivingEntity, pAmplifier);
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int pDuration, int pAmplifier) {
        return true;
    }
}
