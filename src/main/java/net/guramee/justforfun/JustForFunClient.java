package net.guramee.justforfun;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.guramee.justforfun.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class JustForFunClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.INTIMIDATING_AURA_BLOCK, RenderLayer.getTranslucent());
    }
}
