package net.guramee.justforfun.entity.client;

import net.guramee.justforfun.JustForFun;
import net.guramee.justforfun.entity.custom.OwlEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class OwlRenderer extends GeoEntityRenderer<OwlEntity> {
    public OwlRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new OwlModel());
        this.shadowRadius = 0.4F;
    }

    @Override
    public Identifier getTextureResource(OwlEntity instance) {
        return new Identifier(JustForFun.MOD_ID, "textures/entity/owl/owl_texture.png");
    }

    @Override
    public RenderLayer getRenderType(OwlEntity animatable, float partialTicks, MatrixStack stack,
                                     VertexConsumerProvider renderTypeBuffer, VertexConsumer vertexBuilder,
                                     int packedLightIn, Identifier textureLocation) {

        stack.scale(1.2f, 1.2f, 1.2f);

        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
