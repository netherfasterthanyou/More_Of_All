package com.mod.more_of_all.entity.custom;

import com.mod.more_of_all.entity.ModEntities;
import com.mod.more_of_all.item.modItems;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;

import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.horse.AbstractHorse;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;

public class GiraffeEntity extends AbstractHorse {
    public final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;

    public GiraffeEntity(EntityType<? extends AbstractHorse> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Animal.createLivingAttributes().add(Attributes.MAX_HEALTH, 35D)
                .add(Attributes.MOVEMENT_SPEED, 0.4)
                .add(Attributes.ATTACK_DAMAGE, 2f)
                .add(Attributes.FOLLOW_RANGE, 24D)
                .add(Attributes.JUMP_STRENGTH, 0.7f);
    }

    @Override
    public boolean isFood(ItemStack pStack) {
        return pStack.is(modItems.CHILI.get());
    }





    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel serverLevel, AgeableMob ageableMob) {
        return ModEntities.GIRAFFE.get().create(serverLevel);
    }


    private void setupAnimationStates() {
        if (this.idleAnimationTimeout <= 0) {
            this.idleAnimationTimeout = 30;
            this.idleAnimationState.start(this.tickCount);
        } else {
            --this.idleAnimationTimeout;
        }
    }

    @Override
    public void tick() {
        super.tick();

        if (this.level().isClientSide()) {
            this.setupAnimationStates();
        }
    }


    @Override
    public boolean canUseSlot(EquipmentSlot slot) {
        return true;
    }

    @Override
    public InteractionResult mobInteract(Player pPlayer, InteractionHand pHand) {
        boolean flag = !this.isBaby() && this.isTamed() && pPlayer.isSecondaryUseActive();
        if (!this.isVehicle() && !flag) {
            ItemStack itemstack = pPlayer.getItemInHand(pHand);
            if (!itemstack.isEmpty()) {
                if (this.isFood(itemstack)) {
                    return this.fedFood(pPlayer, itemstack);
                }

                if (!this.isTamed()) {
                    this.makeMad();
                    return InteractionResult.sidedSuccess(this.level().isClientSide);
                }
            }

            return super.mobInteract(pPlayer, pHand);
        } else {
            return super.mobInteract(pPlayer, pHand);
        }
    }

    @Override
    protected Vec3 getPassengerAttachmentPoint(Entity entity, EntityDimensions dimensions, float partialTick) {
        return super.getPassengerAttachmentPoint(entity, dimensions, partialTick)
                .add(new Vec3(0.0, 0.65 * (double)partialTick, -0.5 * (double)partialTick)
                        .yRot(-this.getYRot() * (float) (Math.PI / 180.0)));
    }
    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.CAMEL_AMBIENT;
    }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource pDamageSource) {
        return SoundEvents.LLAMA_HURT;
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.ZOMBIE_HORSE_DEATH;
    }
}
