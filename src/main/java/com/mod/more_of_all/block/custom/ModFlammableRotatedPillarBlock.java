package com.mod.more_of_all.block.custom;

import com.mod.more_of_all.block.modBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import org.jetbrains.annotations.Nullable;

public class ModFlammableRotatedPillarBlock extends RotatedPillarBlock {
    public ModFlammableRotatedPillarBlock(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return true;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 5;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 5;
    }

    @Override
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
        if (context.getItemInHand().getItem() instanceof AxeItem) {
            if (state.is(modBlocks.EUCALYPTUS_LOG.get())){
                return modBlocks.STRIPPED_EUCALYPTUS_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if (state.is(modBlocks.EUCALYPTUS_WOOD.get())){
                return modBlocks.STRIPPED_EUCALYPTUS_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if (state.is(modBlocks.DRIFTWOOD_LOG.get())){
                return modBlocks.STRIPPED_DRIFTWOOD_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if (state.is(modBlocks.DRIFTWOOD_WOOD.get())){
                return modBlocks.STRIPPED_DRIFTWOOD_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(modBlocks.BLOODWOOD_LOG.get())){
                return modBlocks.STRIPPED_BLOODWOOD_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if (state.is(modBlocks.BLOODWOOD_WOOD.get())){
                return modBlocks.STRIPPED_BLOODWOOD_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }


        }


        return super.getToolModifiedState(state, context, toolAction, simulate);

    }
}
