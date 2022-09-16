package net.guramee.justforfun.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.command.CommandOutput;
import net.minecraft.util.Nameable;
import net.minecraft.world.entity.EntityLike;

public abstract class ModEntity
        implements Nameable,
        EntityLike,
        CommandOutput {
    private static final TrackedData<Integer> GAY_TICKS = DataTracker.registerData(Entity.class,
            TrackedDataHandlerRegistry.INTEGER);

    protected final DataTracker dataTracker;

    public ModEntity(DataTracker dataTracker) {
        this.dataTracker = dataTracker;
        this.dataTracker.startTracking(GAY_TICKS, 0);
    }

    public NbtCompound writeNbt(NbtCompound nbt) {
        this.setGayTicks(nbt.getInt("TicksGay"));
        return nbt;
    }
    public int getGayTicks() {
        return this.dataTracker.get(GAY_TICKS);
    }
    public void setGayTicks(int gayTicks) {
        this.dataTracker.set(GAY_TICKS, gayTicks);
    }
    public float getGayScale() {
        int i = this.getMinGayDamageTicks();
        return (float)Math.min(this.getGayTicks(), i) / (float)i;
    }
    public boolean isGay() {
        return this.getGayTicks() >= this.getMinGayDamageTicks();
    }
    public int getMinGayDamageTicks() {
        return 140;
    }
}
