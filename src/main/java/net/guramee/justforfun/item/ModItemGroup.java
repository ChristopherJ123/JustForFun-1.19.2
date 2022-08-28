package net.guramee.justforfun.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.guramee.justforfun.JustForFun;
import net.guramee.justforfun.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup BRYANMOD = FabricItemGroupBuilder.build(new Identifier(JustForFun.MOD_ID, "bryanmod"),
            () -> new ItemStack(ModBlocks.BRYAN_BLOCK));
}
