package net.guramee.justforfun;

import net.fabricmc.api.ModInitializer;
import net.guramee.justforfun.block.ModBlocks;
import net.guramee.justforfun.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JustForFun implements ModInitializer {
	public static final String MOD_ID = "justforfun";
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");
//asd
	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerMobBlocks();

	}

}
