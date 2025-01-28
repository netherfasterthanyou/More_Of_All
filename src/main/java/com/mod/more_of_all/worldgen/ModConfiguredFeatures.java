package com.mod.more_of_all.worldgen;

import com.mod.more_of_all.ExampleMod;
import com.mod.more_of_all.block.modBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_TERMINITE_ORE_KEY = registerKey("overworld_terminite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_THALLIUM_ORE_KEY = registerKey("overworld_thallium_ore");

    public static final ResourceKey<ConfiguredFeature<?,?>> EUCALYPTUS_KEY = registerKey("eucalyptus");
    public static final ResourceKey<ConfiguredFeature<?,?>> BLOODWOOD_KEY = registerKey("bloodwood");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DRIFTWOOD_KEY = registerKey("driftwood");


    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);


        List<OreConfiguration.TargetBlockState> overworldTerminiteOres = List.of(
                OreConfiguration.target(stoneReplaceables, modBlocks.TERMINITE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, modBlocks.DEEPSLATE_TERMINITE_ORE.get().defaultBlockState())
        );
        List<OreConfiguration.TargetBlockState> overworldThalliumOres = List.of(
                OreConfiguration.target(stoneReplaceables, modBlocks.THALLIUM_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, modBlocks.DEEPSLATE_THALLIUM_ORE.get().defaultBlockState())
        );

        register(context, OVERWORLD_TERMINITE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldTerminiteOres, 4));
        register(context, OVERWORLD_THALLIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldThalliumOres, 6));


        register(context, EUCALYPTUS_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(modBlocks.EUCALYPTUS_LOG.get()),
                new ForkingTrunkPlacer(4, 4, 3),
                BlockStateProvider.simple(modBlocks.EUCALYPTUS_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 3),

                new TwoLayersFeatureSize(1, 0, 2)).build()
        );

        register(context, BLOODWOOD_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(modBlocks.BLOODWOOD_LOG.get()),
                new ForkingTrunkPlacer(5, 2, 2),
                BlockStateProvider.simple(modBlocks.BLOODWOOD_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1))
                .dirt(BlockStateProvider.simple(Blocks.NETHERRACK))
                .dirt(BlockStateProvider.simple(Blocks.SOUL_SAND))
                .dirt(BlockStateProvider.simple(Blocks.SOUL_SOIL))
                .forceDirt()
                .ignoreVines()
                .build()
        );



        register(context, DRIFTWOOD_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(modBlocks.DRIFTWOOD_LOG.get()),
                new ForkingTrunkPlacer(5, 2, 2),
                BlockStateProvider.simple(modBlocks.DRIFTWOOD_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1))
                .dirt(BlockStateProvider.simple(Blocks.END_STONE))
                .forceDirt()
                .build()
        );


    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}