package net.guramee.justforfun.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.guramee.justforfun.JustForFun;
import net.guramee.justforfun.block.custom.IntimidatingAuraBlock;
import net.guramee.justforfun.block.custom.TesseractBlock;
import net.guramee.justforfun.item.ModItemGroup;
import net.guramee.justforfun.sound.ModSounds;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModBlocks {

    public static final Block BRYAN_BLOCK = registerBlock("bryan_block",
            new Block(FabricBlockSettings.of(Material.SCULK).strength(4f).requiresTool()), ModItemGroup.BRYANMOD);
    public static final Block BRYAN_ORE = registerBlock("bryan_ore",
            new Block(FabricBlockSettings.of(Material.SCULK).strength(4f).requiresTool()), ModItemGroup.BRYANMOD);
    public static final Block INTIMIDATING_AURA_BLOCK = registerBlock("intimidating_aura_block",
            new IntimidatingAuraBlock(FabricBlockSettings.copy(Blocks.GLASS).strength(0.5f).sounds(BlockSoundGroup.SCULK_SENSOR).noCollision()),
            ModItemGroup.BRYANMOD);
    public static final Block TESSERACT = registerBlock("tesseract",
            new TesseractBlock(FabricBlockSettings.of(Material.SCULK).strength(4f).requiresTool().nonOpaque()
                    .luminance(state -> 15).sounds(ModSounds.TESSERACT_SOUNDS)), ModItemGroup.BRYANMOD);


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
