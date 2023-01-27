package net.guramee.justforfun.entity.client;

import net.guramee.justforfun.JustForFun;
import net.guramee.justforfun.entity.custom.OwlEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class OwlModel extends AnimatedGeoModel<OwlEntity> {
    @Override
    public Identifier getModelResource(OwlEntity object) {
        return new Identifier(JustForFun.MOD_ID, "geo/owlthing.geo.json");
    }

    @Override
    public Identifier getTextureResource(OwlEntity object) {
        return new Identifier(JustForFun.MOD_ID, "textures/entity/owl/owl_texture.png");
    }

    @Override
    public Identifier getAnimationResource(OwlEntity animatable) {
        return new Identifier(JustForFun.MOD_ID, "animations/owlthing.animation.json");
    }
}
