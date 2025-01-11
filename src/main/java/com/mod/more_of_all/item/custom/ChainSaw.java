package com.mod.more_of_all.item.custom;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;

import java.util.List;
import java.util.Objects;

public class ChainSaw extends Item {
    public ChainSaw(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();

        if (!level.isClientSide()) {
            if (level.getBlockState(context.getClickedPos()).is(BlockTags.LOGS)) {
                level.destroyBlock(context.getClickedPos(), true, context.getPlayer());

                context.getItemInHand().hurtAndBreak(1, ((ServerLevel) level),
                        ((ServerPlayer) context.getPlayer()), item ->
                                Objects.requireNonNull(context.getPlayer()).onEquippedItemBroken(item, EquipmentSlot.MAINHAND));
            }
            if (level.getBlockState(context.getClickedPos()).is(BlockTags.LEAVES)) {
                level.destroyBlock(context.getClickedPos(), true, context.getPlayer());

                context.getItemInHand().hurtAndBreak(1, ((ServerLevel) level),
                        ((ServerPlayer) context.getPlayer()), item ->
                                Objects.requireNonNull(context.getPlayer()).onEquippedItemBroken(item, EquipmentSlot.MAINHAND));
            }
            if (level.getBlockState(context.getClickedPos()).is(Blocks.VINE)) {
                level.destroyBlock(context.getClickedPos(), true, context.getPlayer());

                context.getItemInHand().hurtAndBreak(1, ((ServerLevel) level),
                        ((ServerPlayer) context.getPlayer()), item ->
                                Objects.requireNonNull(context.getPlayer()).onEquippedItemBroken(item, EquipmentSlot.MAINHAND));
            }

        }

        return InteractionResult.CONSUME;
    }
    @Override
    public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
        pTooltipComponents.add(Component.translatable("tooltip.more_of_all.chainsaw.tooltip"));

        super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
    }
}