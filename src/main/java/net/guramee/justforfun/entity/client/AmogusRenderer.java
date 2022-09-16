package net.guramee.justforfun.entity.client;

import com.google.common.collect.Maps;
import net.guramee.justforfun.JustForFun;
import net.guramee.justforfun.entity.custom.AmogusEntity;
import net.guramee.justforfun.entity.variant.AmogusVariant;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class AmogusRenderer extends GeoEntityRenderer<AmogusEntity> {

    public static final Map<AmogusVariant, Identifier> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(AmogusVariant.class), (map) -> {
                    map.put(AmogusVariant.RED,
                            new Identifier(JustForFun.MOD_ID, "textures/entity/amogus/amogus_red_texture.png"));
                    map.put(AmogusVariant.GREEN,
                            new Identifier(JustForFun.MOD_ID, "textures/entity/amogus/amogus_green_texture.png"));
                    map.put(AmogusVariant.BLUE,
                            new Identifier(JustForFun.MOD_ID, "textures/entity/amogus/amogus_blue_texture.png"));
                    map.put(AmogusVariant.YELLOW,
                            new Identifier(JustForFun.MOD_ID, "textures/entity/amogus/amogus_yellow_texture.png"));
                    map.put(AmogusVariant.PINK,
                            new Identifier(JustForFun.MOD_ID, "textures/entity/amogus/amogus_pink_texture.png"));
                    map.put(AmogusVariant.TEAL,
                            new Identifier(JustForFun.MOD_ID, "textures/entity/amogus/amogus_teal_texture.png"));
            });

    public AmogusRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new AmogusModel());
        this.shadowRadius = 0.5F;
    }

    @Override
    public Identifier getTextureResource(AmogusEntity instance) {
        return LOCATION_BY_VARIANT.get(instance.getVariant());
    }

    @Override
    public RenderLayer getRenderType(AmogusEntity animatable, float partialTicks, MatrixStack stack,
                                     VertexConsumerProvider renderTypeBuffer, VertexConsumer vertexBuilder,
                                     int packedLightIn, Identifier textureLocation) {



        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
