package net.guramee.justforfun.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.guramee.justforfun.JustForFun;
import net.guramee.justforfun.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block BRYAN_BLOCK = registerBlock("bryan_block",
            new Block(FabricBlockSettings.of(Material.SCULK).strength(4f).requiresTool()), ModItemGroup.BRYANMOD);
    public static final Block BRYAN_ORE = registerBlock("bryan_ore",
            new Block(FabricBlockSettings.of(Material.SCULK).strength(4f).requiresTool()), ModItemGroup.BRYANMOD);

        private static Block registerBlock(String name, Block block, ItemGroup group) {
            registerBlockItem(name, block, group);
            return Registry.register(Registry.BLOCK, new Identifier(JustForFun.MOD_ID, name), block);
        }

        private static Item registerBlockItem(String name, Block block, ItemGroup group) {
            return Registry.register(Registry.ITEM, new Identifier(JustForFun.MOD_ID, name),
                    new BlockItem(block, new FabricItemSettings().group(group)));
        }
    public static void registerMobBlocks () {
        JustForFun.LOGGER.info("Registering ModBlocks for " + JustForFun.MOD_ID);
    }
}
