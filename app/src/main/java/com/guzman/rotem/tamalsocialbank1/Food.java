package com.guzman.rotem.tamalsocialbank1;

/**
 * Created by tsuryohananov on 03/03/2018.
 */

public class Food {
    private String name;
    private String description;
    private String barcode;
    private int imgSrc;

    public Food(String name, String description, String barcode, int imgSrc) {
        this.name = name;
        this.description = description;
        this.barcode = barcode;
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

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", barcode='" + barcode + '\'' +
                ", imgSrc=" + imgSrc +
                '}';
    }
}
