package net.guramee.justforfun.block.custom;

import net.guramee.justforfun.effect.ModEffects;
import net.minecraft.block.BlockState;
import net.minecraft.block.GlassBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class IntimidatingAuraBlock extends GlassBlock {

    public IntimidatingAuraBlock(Settings settings) {
        super(settings);
    }

    @Override
    @SuppressWarnings("deprecation")
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        LivingEntity livingEntity;

        if (entity instanceof LivingEntity && !(livingEntity = (LivingEntity)entity).hasStatusEffect(ModEffects.GAY)) {
            livingEntity.addStatusEffect(new StatusEffectInstance(ModEffects.GAY,
                    40, 0, false, false));
        }
    }
}
