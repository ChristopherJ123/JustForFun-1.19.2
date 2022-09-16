package net.guramee.justforfun.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.World;

public abstract class ModPlayerEntity extends LivingEntity {
    public boolean insideIntimidatingBlock() {
        return this.isOnFire();
    }

    protected ModPlayerEntity(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }
}
