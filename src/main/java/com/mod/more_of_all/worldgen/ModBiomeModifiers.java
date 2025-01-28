package com.mod.more_of_all.worldgen;

import com.mod.more_of_all.ExampleMod;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBiomeModifiers {
    public static final ResourceKey<BiomeModifier> ADD_TERMINITE_ORE = registerKey("add_terminite_ore");
    public static final ResourceKey<BiomeModifier> ADD_THALLIUM_ORE = registerKey("add_thallium_ore");
    public static final ResourceKey<BiomeModifier> ADD_BLOODWOOD_TREE = registerKey("add_bloodwood_tree");
    public static final ResourceKey<BiomeModifier> ADD_DRIFTWOOD_TREE = registerKey("add_driftwood_tree");
    public static final ResourceKey<BiomeModifier> ADD_EUCALYPTUS_TREE = registerKey("add_eucalyptus_tree");

    public static void bootstrap(BootstrapContext<BiomeModifier> context) {
        var placedFeature = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ADD_TERMINITE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeature.getOrThrow(ModPlacedFeatures.TERMINITE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_THALLIUM_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeature.getOrThrow(ModPlacedFeatures.THALLIUM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_BLOODWOOD_TREE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.NETHER_WASTES), biomes.getOrThrow(Biomes.SOUL_SAND_VALLEY)),
                HolderSet.direct(placedFeature.getOrThrow(ModPlacedFeatures.BLOODWOOD_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION
        ));


        context.register(ADD_DRIFTWOOD_TREE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.END_MIDLANDS)),
                HolderSet.direct(placedFeature.getOrThrow(ModPlacedFeatures.DRIFTWOOD_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_EUCALYPTUS_TREE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.FOREST), biomes.getOrThrow(Biomes.SPARSE_JUNGLE)),
                HolderSet.direct(placedFeature.getOrThrow(ModPlacedFeatures.EUCALYPTUS_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));




    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID, name));
    }
}