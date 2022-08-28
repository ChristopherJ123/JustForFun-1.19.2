package net.guramee.justforfun.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.guramee.justforfun.JustForFun;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item BRYAN_INGOT = registerItem("bryan_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.BRYANMOD)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(JustForFun.MOD_ID, name), item);
    }
    public static void registerModItems() {
        JustForFun.LOGGER.info("Registering Mod Items for " + JustForFun.MOD_ID);
    }
}
