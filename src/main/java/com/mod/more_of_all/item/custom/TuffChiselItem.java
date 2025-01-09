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

public class TuffChiselItem extends Item {
    private static final Map<Block, Block> CHISEL_MAP =
            Map.of(
                    Blocks.TUFF, Blocks.TUFF_BRICKS,
                    Blocks.TUFF_BRICKS, Blocks.POLISHED_TUFF,
                    Blocks.POLISHED_TUFF, Blocks.CHISELED_TUFF,
                    Blocks.CHISELED_TUFF, Blocks.CHISELED_TUFF_BRICKS,
                    Blocks.CHISELED_TUFF_BRICKS, Blocks.TUFF

            );

    public TuffChiselItem(Properties pProperties){
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
