package com.mod.more_of_all.entity.client;

import com.mod.more_of_all.ExampleMod;
import com.mod.more_of_all.entity.custom.ThrowingAxeProjectileEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class ThrowingAxeProjectileModel extends EntityModel<ThrowingAxeProjectileEntity> {
    public static final ModelLayerLocation LAYER_LOCATION =
            new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(
                    ExampleMod.MOD_ID, "throwingaxe_converted"), "main");

    private final ModelPart axe;

    public ThrowingAxeProjectileModel(ModelPart root) {
        this.axe = root.getChild("axe");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition axe = partdefinition.addOrReplaceChild("axe", CubeListBuilder.create().texOffs(2, 17).addBox(-2.0F, -18.0F, 0.0F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(16, 6).addBox(-1.0F, -17.0F, 0.5F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(18, 15).addBox(-7.0F, -17.0F, 0.5F, 5.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(10, 0).addBox(-9.0F, -18.0F, 0.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(16, 19).addBox(2.0F, -18.0F, 0.0F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(20, 11).addBox(-9.0F, -11.0F, 0.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 24.0F, -1.0F, 0.0F, -1.5708F, 0.0F));

        return LayerDefinition.create(meshdefinition, 32, 32);
    }

    @Override
    public void setupAnim(ThrowingAxeProjectileEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
        axe.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
    }
}
