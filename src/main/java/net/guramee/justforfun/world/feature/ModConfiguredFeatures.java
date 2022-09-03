package net.guramee.justforfun.world.feature;

import net.guramee.justforfun.JustForFun;
import net.guramee.justforfun.block.ModBlocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {

    public static final List<OreFeatureConfig.Target> OVERWORLD_BRYAN_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.BRYAN_ORE.getDefaultState()));
/*  WIP
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_BRYAN_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> NETHER_BRYAN_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.BASE_STONE_NETHER, ModBlocks.NETHERRACK_BRYAN_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> END_BRYAN_ORES = List.of(
            OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.END_STONE), ModBlocks.ENDSTONE_BRYAN_ORE.getDefaultState()));

 */

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> BRYAN_ORE =
            ConfiguredFeatures.register("bryan_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_BRYAN_ORES, 3));

    public static void registerConfiguredFeatures() {
        JustForFun.LOGGER.debug("Registering the ModConfiguredFeatures for " + JustForFun.MOD_ID);
    }
}
