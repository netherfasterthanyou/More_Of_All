package com.mod.more_of_all.entity.client;

import java.util.Arrays;
import java.util.Comparator;

public enum CapybaraVariant {
    BROWN(0);

    private static final CapybaraVariant[] BY_ID = Arrays.stream(values()).sorted(
            Comparator.comparingInt(CapybaraVariant::getId)).toArray(CapybaraVariant[]::new);
    private final int id;

    CapybaraVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static CapybaraVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}