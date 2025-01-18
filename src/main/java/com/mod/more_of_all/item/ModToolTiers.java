package com.mod.more_of_all.item;

import com.mod.more_of_all.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModToolTiers {
    public static final Tier TERMINITE = new ForgeTier(1400, 7, 4f, 20,
            ModTags.Blocks.NEEDS_TERMINITE_TOOL, () -> Ingredient.of(modItems.TERMINITE.get()),
            ModTags.Blocks.INCORRECT_FOR_TERMINITE_TOOL);

    public static final Tier THALLIUM = new ForgeTier(1400, 6, 3.5f, 22,
            ModTags.Blocks.NEEDS_TERMINITE_TOOL, () -> Ingredient.of(modItems.TERMINITE.get()),
            ModTags.Blocks.INCORRECT_FOR_TERMINITE_TOOL);
}
