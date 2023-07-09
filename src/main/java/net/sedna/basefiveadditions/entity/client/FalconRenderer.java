package net.sedna.basefiveadditions.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.sedna.basefiveadditions.BaseFiveAdditions;
import net.sedna.basefiveadditions.entity.custom.FalconEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class FalconRenderer extends GeoEntityRenderer<FalconEntity> {
    public FalconRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new FalconModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(FalconEntity instance){
        return new ResourceLocation(BaseFiveAdditions.MOD_ID,"textures/entity/falcon/falcon.png");
    }

    @Override
    public RenderType getRenderType(FalconEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.8F,0.8F,0.8F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
