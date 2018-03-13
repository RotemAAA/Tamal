package com.guzman.rotem.tamalsocialbank1;

/**
 * Created by tsuryohananov on 03/03/2018.
 */

public class Food {
    private String name;
    private String description;
    private int imgSrc;

    public Food(String name, String description, int imgSrc) {
        this.name = name;
        this.description = description;
        this.imgSrc = imgSrc;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImgSrc() {
        return imgSrc;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", imgSrc=" + imgSrc +
                '}';
    }
}
