package net.guramee.justforfun.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.guramee.justforfun.JustForFun;
import net.guramee.justforfun.item.custom.ModAxeItem;
import net.guramee.justforfun.item.custom.ModHoeItem;
import net.guramee.justforfun.item.custom.ModPickaxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item BRYAN_INGOT = registerItem("bryan_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.BRYANMOD)));

    public static final Item BRYAN_SWORD = registerItem("bryan_sword",
            new SwordItem(ModToolMaterial.BRYANTOOL, 25, 1f,
                    new FabricItemSettings().group(ModItemGroup.BRYANMOD)));

    public static final Item BRYAN_AXE = registerItem("bryan_axe",
            new ModAxeItem(ModToolMaterial.BRYANTOOL, 40, 4f,
                    new FabricItemSettings().group(ModItemGroup.BRYANMOD)));

    public static final Item BRYAN_PICKAXE = registerItem("bryan_pickaxe",
            new ModPickaxeItem(ModToolMaterial.BRYANTOOL, 15, 2f,
                    new FabricItemSettings().group(ModItemGroup.BRYANMOD)));

    public static final Item BRYAN_SHOVEL = registerItem("bryan_shovel",
            new ShovelItem(ModToolMaterial.BRYANTOOL, 10, 2f,
                    new FabricItemSettings().group(ModItemGroup.BRYANMOD)));

    public static final Item BRYAN_HOE = registerItem("bryan_hoe",
            new ModHoeItem(ModToolMaterial.BRYANTOOL, 1, 0f,
                    new FabricItemSettings().group(ModItemGroup.BRYANMOD)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(JustForFun.MOD_ID, name), item);
    }
    public static void registerModItems() {
        JustForFun.LOGGER.info("Registering Mod Items for " + JustForFun.MOD_ID);
    }
}
