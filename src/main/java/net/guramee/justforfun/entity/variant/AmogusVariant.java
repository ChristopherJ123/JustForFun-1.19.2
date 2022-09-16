package net.guramee.justforfun.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum AmogusVariant {
    RED(0),
    GREEN(1),
    BLUE(2),
    YELLOW(3),
    PINK(4),
    TEAL(5);

    private static final AmogusVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(AmogusVariant::getId)).toArray(AmogusVariant[]::new);
    private final int id;

    AmogusVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static AmogusVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
