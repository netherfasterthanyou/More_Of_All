package com.mod.more_of_all.trim;


import com.mod.more_of_all.ExampleMod;
import com.mod.more_of_all.item.modItems;
import net.minecraft.Util;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;

import java.util.Map;

public class ModTrimMaterials {
    public static final ResourceKey<TrimMaterial> TERMINITE =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID, "terminite"));
    public static final ResourceKey<TrimMaterial> THALLIUM =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID, "thallium"));


    public static void bootstrap(BootstrapContext<TrimMaterial> context) {
        register(context, TERMINITE, modItems.TERMINITE.get(), Style.EMPTY.withColor(TextColor.parseColor("#031cfc").getOrThrow()), 0.9F);
        register(context, THALLIUM, modItems.THALLIUM.get(), Style.EMPTY.withColor(TextColor.parseColor("#031cfc").getOrThrow()), 0.8F);

    }







    private static void register(BootstrapContext<TrimMaterial> context, ResourceKey<TrimMaterial> trimKey, Item item,
                                 Style style, float itemModelIndex) {
        TrimMaterial trimmaterial = TrimMaterial.create(trimKey.location().getPath(), item, itemModelIndex,
                Component.translatable(Util.makeDescriptionId("trim_material", trimKey.location())).withStyle(style), Map.of());
        context.register(trimKey, trimmaterial);
    }
}