package net.guramee.justforfun.effect;

import net.guramee.justforfun.JustForFun;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEffects{
    public static StatusEffect GAY;


    public static StatusEffect registerStatusEffect(String name) {
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(JustForFun.MOD_ID, name),
                new GayEffect(StatusEffectCategory.NEUTRAL, 3124687));
    }

    public static void registerEffects() {
        GAY = registerStatusEffect("gay");
    }
}
