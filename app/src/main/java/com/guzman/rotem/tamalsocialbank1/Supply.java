package com.guzman.rotem.tamalsocialbank1;

/**
 * Created by tsuryohananov on 11/03/2018.
 */

public class Supply {
    private String _id;
    private String _rev;
    private String foodName;
    private String description;
    private long inInventory;
    private String barcode;
    private int imgSrc;

    public Supply(String foodName, String description, String barcode, int imgSrc, long amount) {
        this.foodName = foodName;
        this.description = description;
        this.inInventory = amount;
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

    public String getDescription() {
        return description;
    }

    public String get_id() {
        return _id;
    }

    public String get_rev() {
        return _rev;
    }

    public void setInInventory(long inInventory) {
        this.inInventory = inInventory;
    }

    public void set_rev(String _rev) {
        this._rev = _rev;
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
