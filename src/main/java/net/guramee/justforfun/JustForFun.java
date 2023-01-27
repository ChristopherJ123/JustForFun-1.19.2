package net.guramee.justforfun;

import com.eliotlash.mclib.math.functions.classic.Mod;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.guramee.justforfun.block.ModBlocks;
import net.guramee.justforfun.effect.ModEffects;
import net.guramee.justforfun.entity.ModEntities;
import net.guramee.justforfun.entity.custom.AmogusEntity;
import net.guramee.justforfun.entity.custom.OwlEntity;
import net.guramee.justforfun.item.ModItems;
import net.guramee.justforfun.world.feature.ModConfiguredFeatures;
import net.guramee.justforfun.world.gen.ModEntitySpawn;
import net.guramee.justforfun.world.gen.ModOreGeneration;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class JustForFun implements ModInitializer {
	public static final String MOD_ID = "justforfun";
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");
//asd
	@Override
	public void onInitialize() {
		ModConfiguredFeatures.registerConfiguredFeatures();

		ModOreGeneration.generateOres();
		ModEntitySpawn.addEntitySpawn();

		ModItems.registerModItems();
		ModBlocks.registerMobBlocks();

		ModEffects.registerEffects();

		GeckoLib.initialize();

		FabricDefaultAttributeRegistry.register(ModEntities.AMOGUS, AmogusEntity.setAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.OWL, OwlEntity.setAttributes());

	}

}
