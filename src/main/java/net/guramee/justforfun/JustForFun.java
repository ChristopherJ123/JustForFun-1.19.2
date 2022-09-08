package net.guramee.justforfun;

import net.fabricmc.api.ModInitializer;
import net.guramee.justforfun.block.ModBlocks;
import net.guramee.justforfun.effect.ModEffects;
import net.guramee.justforfun.item.ModItems;
import net.guramee.justforfun.world.feature.ModConfiguredFeatures;
import net.guramee.justforfun.world.gen.ModOreGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JustForFun implements ModInitializer {
	public static final String MOD_ID = "justforfun";
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");
//asd
	@Override
	public void onInitialize() {
		ModConfiguredFeatures.registerConfiguredFeatures();

		ModOreGeneration.generateOres();

		ModItems.registerModItems();
		ModBlocks.registerMobBlocks();

		ModEffects.registerEffects();

	}

}
