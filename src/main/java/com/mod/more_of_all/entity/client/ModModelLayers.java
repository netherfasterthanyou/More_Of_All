package com.mod.more_of_all.entity.client;

import com.mod.more_of_all.ExampleMod;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

public class ModModelLayers {
    public static final ModelLayerLocation CAPYBARA = new ModelLayerLocation(
            ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID, "capybara"),"main");
    public static final ModelLayerLocation SNOW_CAPYBARA = new ModelLayerLocation(
            ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID, "snow_capybara"),"main");

    public static final ModelLayerLocation GIRAFFE = new ModelLayerLocation(
            ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID, "giraffe"),"main");
    public static final ModelLayerLocation PENGUIN = new ModelLayerLocation(
            ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID, "penguin"), "main");



}