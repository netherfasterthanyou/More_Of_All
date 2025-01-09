package com.mod.more_of_all.item.custom;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.Map;

public class SandChiselItem extends Item {
    private static final Map<Block, Block> CHISEL_MAP =
            Map.of(
                    Blocks.SAND, Blocks.SANDSTONE,
                    Blocks.SANDSTONE, Blocks.CUT_SANDSTONE,
                    Blocks.CUT_SANDSTONE, Blocks.SMOOTH_SANDSTONE,
                    Blocks.SMOOTH_SANDSTONE, Blocks.CHISELED_SANDSTONE,
                    Blocks.CHISELED_SANDSTONE, Blocks.RED_SANDSTONE,
                    Blocks.RED_SANDSTONE, Blocks.SMOOTH_RED_SANDSTONE,
                    Blocks.SMOOTH_RED_SANDSTONE, Blocks.CUT_RED_SANDSTONE,
                    Blocks.CUT_RED_SANDSTONE, Blocks.CHISELED_RED_SANDSTONE,
                    Blocks.CHISELED_RED_SANDSTONE, Blocks.SAND,
                    Blocks.RED_SAND, Blocks.RED_SANDSTONE

            );

    public SandChiselItem(Properties pProperties){
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        Level level = pContext.getLevel();
        Block clickedBlock = level.getBlockState(pContext.getClickedPos()).getBlock();
        if (CHISEL_MAP.containsKey(clickedBlock)){
            if (!level.isClientSide()){
                level.setBlockAndUpdate(pContext.getClickedPos(), CHISEL_MAP.get(clickedBlock).defaultBlockState());

                level.playSound(null, pContext.getClickedPos(), SoundEvents.GRINDSTONE_USE, SoundSource.BLOCKS);
            }
        }
        return super.useOn(pContext);
    }
}
