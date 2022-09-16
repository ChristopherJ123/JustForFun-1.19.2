package net.guramee.justforfun.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.guramee.justforfun.JustForFun;
import net.guramee.justforfun.entity.custom.AmogusEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {
    public static final EntityType<AmogusEntity> AMOGUS = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(JustForFun.MOD_ID, "amogus"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, AmogusEntity::new)
                    .dimensions(EntityDimensions.fixed(1f, 1.5f)).build());
}
