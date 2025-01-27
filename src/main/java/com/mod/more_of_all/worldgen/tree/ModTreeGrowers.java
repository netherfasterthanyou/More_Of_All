package com.mod.more_of_all.worldgen.tree;

import com.mod.more_of_all.ExampleMod;
import com.mod.more_of_all.worldgen.ModConfiguredFeatures;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraftforge.fml.common.Mod;

import java.util.Optional;

public class ModTreeGrowers {
    public static final TreeGrower EUCALYPTUS = new TreeGrower(ExampleMod.MOD_ID + ":eucalyptus",
            Optional.empty(), Optional.of(ModConfiguredFeatures.EUCALYPTUS_KEY), Optional.empty());
    public static final TreeGrower BLOODWOOD = new TreeGrower(ExampleMod.MOD_ID + ":bloodwood",
            Optional.empty(), Optional.of(ModConfiguredFeatures.BLOODWOOD_KEY), Optional.empty());
    public static final TreeGrower DRIFTWOOD = new TreeGrower(ExampleMod.MOD_ID + ":driftwood",
            Optional.empty(), Optional.of(ModConfiguredFeatures.DRIFTWOOD_KEY), Optional.empty());

}
