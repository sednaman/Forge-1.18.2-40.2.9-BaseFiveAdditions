package net.sedna.basefiveadditions.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.sedna.basefiveadditions.BaseFiveAdditions;
import net.sedna.basefiveadditions.entity.custom.FalconEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class FalconModel extends AnimatedGeoModel<FalconEntity> {
    @Override
    public ResourceLocation getModelLocation(FalconEntity object) {
        return new ResourceLocation(BaseFiveAdditions.MOD_ID, "geo/falcon.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(FalconEntity object) {
        return new ResourceLocation(BaseFiveAdditions.MOD_ID, "textures/entity/falcon/falcon.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(FalconEntity animatable) {
        return new ResourceLocation(BaseFiveAdditions.MOD_ID, "animations/falcon.animation.json");
    }
}
