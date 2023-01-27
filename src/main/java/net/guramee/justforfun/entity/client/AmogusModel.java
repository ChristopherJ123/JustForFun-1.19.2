package net.guramee.justforfun.entity.client;

import net.guramee.justforfun.JustForFun;
import net.guramee.justforfun.entity.custom.AmogusEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AmogusModel extends AnimatedGeoModel<AmogusEntity> {
    @Override
    public Identifier getModelResource(AmogusEntity object) {
        return new Identifier(JustForFun.MOD_ID, "geo/amogus.geo.json");
    }

    @Override
    public Identifier getTextureResource(AmogusEntity object) {
        return AmogusRenderer.LOCATION_BY_VARIANT.get(object.getVariant());
    }

    @Override
    public Identifier getAnimationResource(AmogusEntity animatable) {
        return new Identifier(JustForFun.MOD_ID, "animations/amogus.animation.json");
    }
}
