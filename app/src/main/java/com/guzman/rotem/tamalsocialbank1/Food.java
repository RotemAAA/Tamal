package com.guzman.rotem.tamalsocialbank1;

/**
 * Created by tsuryohananov on 03/03/2018.
 */

public class Food {
    private String name;
    private String description;
    private int type;

    public Food(String name, String description, int status) {
        this.name = name;
        this.description = description;
        this.type = status;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", type=" + type +
                '}';
    }
}