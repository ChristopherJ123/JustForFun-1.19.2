package net.guramee.justforfun.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.nbt.NbtCompound;


//unused
public class ModEntity {
    private static final TrackedData<Integer> GAY_TICKS = DataTracker.registerData(Entity.class,
            TrackedDataHandlerRegistry.INTEGER);

    public ModEntity() {
    }

    public NbtCompound writeNbt(NbtCompound nbt) {
        this.setGayTicks(nbt.getInt("TicksGay"));
        return nbt;
    }

    public int getGayTicks() {
        return 0;
    }

    public void setGayTicks(int gayTicks) {

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
