package net.guramee.justforfun;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.guramee.justforfun.block.ModBlocks;
import net.guramee.justforfun.client.GayEffectOverlay;
import net.guramee.justforfun.entity.ModEntities;
import net.guramee.justforfun.entity.client.AmogusRenderer;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.EntityRenderer;

public class JustForFunClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.INTIMIDATING_AURA_BLOCK, RenderLayer.getTranslucent());

        HudRenderCallback.EVENT.register(new GayEffectOverlay());

        EntityRendererRegistry.register(ModEntities.AMOGUS, AmogusRenderer::new);
    }
}
