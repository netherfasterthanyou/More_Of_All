package com.mod.more_of_all.entity.client;

import com.google.common.collect.Maps;
import com.mod.more_of_all.ExampleMod;
import com.mod.more_of_all.entity.custom.PenguinEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;

public class PenguinRenderer extends MobRenderer<PenguinEntity, PenguinModel> {
    private static final Map<PenguinVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(PenguinVariant.class), map -> {
                map.put(PenguinVariant.DEFAULT,
                        ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID, "textures/entity/penguin/penguin.png"));
                map.put(PenguinVariant.ALBINO,
                        ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID, "textures/entity/penguin/penguin_albino.png"));
                map.put(PenguinVariant.CLUB,
                        ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID, "textures/entity/penguin/penguin_club.png"));
            });

    public PenguinRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new PenguinModel(pContext.bakeLayer(ModModelLayers.PENGUIN)), 0.75f);
    }

    @Override
    public ResourceLocation getTextureLocation(PenguinEntity pEntity) {
        return LOCATION_BY_VARIANT.get(pEntity.getVariant());
    }

    @Override
    public void render(PenguinEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()) {
            pPoseStack.scale(0.45f, 0.45f, 0.45f);
        }


        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}