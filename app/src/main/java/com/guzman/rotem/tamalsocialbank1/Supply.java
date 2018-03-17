package com.guzman.rotem.tamalsocialbank1;

/**
 * Created by tsuryohananov on 11/03/2018.
 */

public class Supply {
    private String _id;
    private String _rev;
    private String foodName;
    private long inInventory;
    private String barcode;
    private int imgSrc;

    public Supply(String foodName, long inInventory, String barcode, int imgSrc) {
        this.foodName = foodName;
        this.inInventory = inInventory;
        this.barcode = barcode;
        this.imgSrc = imgSrc;

    }

    public String getFoodName() {
        return foodName;
    }

    public long getInInventory() {
        return inInventory;
    }

    public int getImgSrc() {
        return imgSrc;
    }

    public String getBarcode() {
        return barcode;


    }

    @Override
    public String toString() {
        return "Supply{" +
                "_id='" + _id + '\'' +
                ", _rev='" + _rev + '\'' +
                ", foodName='" + foodName + '\'' +
                ", inInventory=" + inInventory +
                ", barcode='" + barcode + '\'' +
                ", imgSrc=" + imgSrc +
                '}';
    }
}
