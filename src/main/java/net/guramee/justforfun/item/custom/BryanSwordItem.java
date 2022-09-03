package net.guramee.justforfun.item.custom;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.tag.BlockTags;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class BryanSwordItem extends SwordItem implements Vanishable {

    public BryanSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 200, 1), attacker);
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 200, 1), attacker);
        attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.BAD_OMEN, 200, 1), attacker);
        attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.UNLUCK, 200, 1), attacker);

        return super.postHit(stack, target, attacker);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.literal("Gay sword").formatted(Formatting.RED).formatted(Formatting.UNDERLINE));
    }   else {
            tooltip.add(Text.literal("... shift").formatted(Formatting.DARK_GRAY));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }

}
