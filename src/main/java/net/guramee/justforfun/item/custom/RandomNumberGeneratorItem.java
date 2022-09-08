package net.guramee.justforfun.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class RandomNumberGeneratorItem extends Item {
    public RandomNumberGeneratorItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient() && hand == Hand.MAIN_HAND) {
            // output a random number
            outputRandomNumber(user);
            // add a cooldown
            user.getItemCooldownManager().set(this, 20);
        }
        return super.use(world, user, hand);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {

        tooltip.add(Text.literal("beep boop-- Generate a random number boop beep- :)").formatted(Formatting.AQUA));
        super.appendTooltip(stack, world, tooltip, context);
    }

    private void outputRandomNumber(PlayerEntity player) {
        player.sendMessage(Text.literal("bruh your number is " + getRandomNumber() + " :/" + "and your " +
                "last death pos is " + player.getLastDeathPos()));
    }

    private int getRandomNumber() {
        return (int) (Math.random() * 1001);
    }

}
