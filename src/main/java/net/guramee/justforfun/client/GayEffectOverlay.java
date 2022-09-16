package net.guramee.justforfun.client;

import com.mojang.blaze3d.systems.RenderSystem;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.guramee.justforfun.JustForFun;
import net.guramee.justforfun.effect.GayEffect;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawableHelper;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Identifier;

public class GayEffectOverlay implements HudRenderCallback {
    public static final Identifier GAY_AURA = new Identifier(JustForFun.MOD_ID, "textures/hud/gay_aura_overlay.png");

    @Override
    public void onHudRender(MatrixStack matrixStack, float tickDelta) {
        int x = 0;
        int y = 0;
        MinecraftClient client = MinecraftClient.getInstance();
        if (client != null) {
            int width = client.getWindow().getScaledWidth();
            int height = client.getWindow().getScaledHeight();

            x = width;
            y = height;
        }

        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0f, 1.0f, 1.0f, 0.0f);
        RenderSystem.setShaderTexture(0, GAY_AURA);
        DrawableHelper.drawTexture(matrixStack, x - 50,  y - 25, 0, 0, 100, 100, 100,
                100);
    }
}
