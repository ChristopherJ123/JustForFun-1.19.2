package net.guramee.justforfun.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;


public class ModStatusEffect extends StatusEffect {

    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (this == ModEffects.GAY) {
            if (entity.getHealth() < entity.getMaxHealth()) {
                entity.setFrozenTicks(200);
                gayInt();
            }
        }
    }

    private boolean gayInt() {
        return false;
    }

    protected ModStatusEffect(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }
}
