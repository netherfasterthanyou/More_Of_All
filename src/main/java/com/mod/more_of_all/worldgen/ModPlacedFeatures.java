package com.mod.more_of_all.worldgen;

import com.mod.more_of_all.ExampleMod;
import com.mod.more_of_all.block.modBlocks;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> TERMINITE_ORE_PLACED_KEY = registerKey("terminite_ore_placed");
    public static final ResourceKey<PlacedFeature> THALLIUM_ORE_PLACED_KEY = registerKey("thallium_ore_placed");
    public static final ResourceKey<PlacedFeature> BLOODWOOD_PLACED_KEY = registerKey("bloodwood_placed");

    public static final ResourceKey<PlacedFeature> DRIFTWOOD_PLACED_KEY = registerKey("driftwood_placed");
    public static final ResourceKey<PlacedFeature> EUCALYPTUS_PLACED_KEY = registerKey("eucalyptus_placed");






    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, BLOODWOOD_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLOODWOOD_KEY),
                List.of(
                        CountPlacement.of(6),
                        InSquarePlacement.spread(),
                        PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT,
                        EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.solid(), BlockPredicate.ONLY_IN_AIR_PREDICATE, 12),
                        RandomOffsetPlacement.vertical(ConstantInt.of(1)),
                        BiomeFilter.biome()
                )
        );





        register(context, DRIFTWOOD_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.DRIFTWOOD_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(2, 0.1f, 1),
                        modBlocks.DRIFTWOOD_SAPLING.get()));


        register(context, EUCALYPTUS_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.EUCALYPTUS_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 1),
                        modBlocks.EUCALYPTUS_SAPLING.get()));


        register(context, TERMINITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_TERMINITE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(3,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(20))));


        register(context, THALLIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_THALLIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(5,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(25))));

    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}