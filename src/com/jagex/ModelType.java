package com.jagex;

public enum ModelType {
    NONE(0),
    RAW_MODEL(1),
    NPC_HEAD(2),
    PLAYER_HEAD(3),
    ITEM(4),
    PLAYER_MODEL(5),
    NPC_MODEL(6),
    PLAYER_HEAD_IGNOREWORN(7),
    ITEM_CONTAINER_MALE(8),
    ITEM_CONTAINER_FEMALE(9);

    private final int id;

    ModelType(int id) {
        this.id = id;
    }

    public static ModelType forId(int id) {
        for (ModelType t : ModelType.values()) {
            if (t.id == id)
                return t;
        }
        return null;
    }

    public int getId() {
        return id;
    }
}
