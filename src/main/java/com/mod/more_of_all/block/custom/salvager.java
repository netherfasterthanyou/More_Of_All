package com.mod.more_of_all.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class salvager extends Block {
    public salvager(Properties properties) {
        super(properties);
    }


    @Override
    protected InteractionResult useWithoutItem(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, BlockHitResult pHitResult) {

        pLevel.playSound(pPlayer, pPos, SoundEvents.AMETHYST_BLOCK_CHIME, SoundSource.BLOCKS, 1f, 1f);
        return super.useWithoutItem(pState, pLevel, pPos, pPlayer, pHitResult);
    }

    @Override
    public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity) {
        if (pEntity instanceof ItemEntity itemEntity){
            if (itemEntity.getItem().getItem() == Items.DIAMOND_AXE){
                itemEntity.setItem(new ItemStack(Items.DIAMOND, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.DIAMOND_PICKAXE) {
                itemEntity.setItem(new ItemStack(Items.DIAMOND, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.DIAMOND_SHOVEL) {
                itemEntity.setItem(new ItemStack(Items.DIAMOND, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.DIAMOND_SWORD) {
                itemEntity.setItem(new ItemStack(Items.DIAMOND, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.DIAMOND_BOOTS) {
                itemEntity.setItem(new ItemStack(Items.DIAMOND, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.DIAMOND_HELMET) {
                itemEntity.setItem(new ItemStack(Items.DIAMOND, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.DIAMOND_CHESTPLATE) {
                itemEntity.setItem(new ItemStack(Items.DIAMOND, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.DIAMOND_LEGGINGS) {
                itemEntity.setItem(new ItemStack(Items.DIAMOND, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.DIAMOND_HORSE_ARMOR) {
                itemEntity.setItem(new ItemStack(Items.DIAMOND, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.DIAMOND_AXE){
                itemEntity.setItem(new ItemStack(Items.DIAMOND, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.DIAMOND_HOE){
                itemEntity.setItem(new ItemStack(Items.DIAMOND, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.DIAMOND_HOE){
                itemEntity.setItem(new ItemStack(Items.DIAMOND, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.DIAMOND_PICKAXE) {
                itemEntity.setItem(new ItemStack(Items.DIAMOND, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.DIAMOND_SWORD) {
                itemEntity.setItem(new ItemStack(Items.DIAMOND, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.DIAMOND_BOOTS) {
                itemEntity.setItem(new ItemStack(Items.DIAMOND, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.DIAMOND_HELMET) {
                itemEntity.setItem(new ItemStack(Items.DIAMOND, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.DIAMOND_CHESTPLATE) {
                itemEntity.setItem(new ItemStack(Items.DIAMOND, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.DIAMOND_LEGGINGS) {
                itemEntity.setItem(new ItemStack(Items.DIAMOND, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.DIAMOND_HORSE_ARMOR) {
                itemEntity.setItem(new ItemStack(Items.DIAMOND, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.DIAMOND_AXE){
                itemEntity.setItem(new ItemStack(Items.DIAMOND, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.DIAMOND_PICKAXE) {
                itemEntity.setItem(new ItemStack(Items.DIAMOND, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.DIAMOND_SHOVEL) {
                itemEntity.setItem(new ItemStack(Items.DIAMOND, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.DIAMOND_BOOTS) {
                itemEntity.setItem(new ItemStack(Items.DIAMOND, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.DIAMOND_HELMET) {
                itemEntity.setItem(new ItemStack(Items.DIAMOND, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.DIAMOND_CHESTPLATE) {
                itemEntity.setItem(new ItemStack(Items.DIAMOND, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.DIAMOND_LEGGINGS) {
                itemEntity.setItem(new ItemStack(Items.DIAMOND, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.DIAMOND_HORSE_ARMOR) {
                itemEntity.setItem(new ItemStack(Items.DIAMOND, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.NETHERITE_AXE) {
                itemEntity.setItem(new ItemStack(Items.NETHERITE_INGOT, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.NETHERITE_BOOTS) {
                itemEntity.setItem(new ItemStack(Items.NETHERITE_INGOT, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.NETHERITE_HOE) {
                itemEntity.setItem(new ItemStack(Items.NETHERITE_INGOT, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.NETHERITE_PICKAXE) {
                itemEntity.setItem(new ItemStack(Items.NETHERITE_INGOT, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.NETHERITE_SWORD) {
                itemEntity.setItem(new ItemStack(Items.NETHERITE_INGOT, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.NETHERITE_SHOVEL) {
                itemEntity.setItem(new ItemStack(Items.NETHERITE_INGOT, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.NETHERITE_CHESTPLATE) {
                itemEntity.setItem(new ItemStack(Items.NETHERITE_INGOT, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.NETHERITE_LEGGINGS) {
                itemEntity.setItem(new ItemStack(Items.NETHERITE_INGOT, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.NETHERITE_HELMET) {
                itemEntity.setItem(new ItemStack(Items.NETHERITE_INGOT, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.IRON_AXE) {
                itemEntity.setItem(new ItemStack(Items.IRON_INGOT, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.IRON_SHOVEL) {
                itemEntity.setItem(new ItemStack(Items.IRON_INGOT, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.IRON_SWORD) {
                itemEntity.setItem(new ItemStack(Items.IRON_INGOT, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.IRON_PICKAXE) {
                itemEntity.setItem(new ItemStack(Items.IRON_INGOT, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.IRON_HOE) {
                itemEntity.setItem(new ItemStack(Items.IRON_INGOT, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.IRON_HORSE_ARMOR) {
                itemEntity.setItem(new ItemStack(Items.IRON_INGOT, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.IRON_HELMET) {
                itemEntity.setItem(new ItemStack(Items.IRON_INGOT, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.IRON_CHESTPLATE) {
                itemEntity.setItem(new ItemStack(Items.IRON_INGOT, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.IRON_LEGGINGS) {
                itemEntity.setItem(new ItemStack(Items.IRON_INGOT, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.IRON_BOOTS) {
                itemEntity.setItem(new ItemStack(Items.DIAMOND, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.IRON_AXE) {
                itemEntity.setItem(new ItemStack(Items.IRON_INGOT, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.IRON_SHOVEL) {
                itemEntity.setItem(new ItemStack(Items.IRON_INGOT, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.IRON_SWORD) {
                itemEntity.setItem(new ItemStack(Items.IRON_INGOT, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.IRON_PICKAXE) {
                itemEntity.setItem(new ItemStack(Items.IRON_INGOT, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.IRON_HOE) {
                itemEntity.setItem(new ItemStack(Items.IRON_INGOT, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.IRON_HORSE_ARMOR) {
                itemEntity.setItem(new ItemStack(Items.IRON_INGOT, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.IRON_HELMET) {
                itemEntity.setItem(new ItemStack(Items.IRON_INGOT, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.IRON_CHESTPLATE) {
                itemEntity.setItem(new ItemStack(Items.IRON_INGOT, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.IRON_LEGGINGS) {
                itemEntity.setItem(new ItemStack(Items.IRON_INGOT, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.IRON_BOOTS) {
                itemEntity.setItem(new ItemStack(Items.DIAMOND, itemEntity.getItem().getCount()));
            }
            if (itemEntity.getItem().getItem() == Items.GOLDEN_HORSE_ARMOR) {
                itemEntity.setItem(new ItemStack(Items.GOLD_INGOT, itemEntity.getItem().getCount()));
            }
        }
        super.stepOn(pLevel, pPos, pState, pEntity);
    }
}
