package com.guzman.rotem.tamalsocialbank1;

/**
 * Created by tsuryohananov on 11/03/2018.
 */

public class Supply {
    private String foodName;
    private long inInventory;

    public Supply(String foodName, long inInventory) {
        this.foodName = foodName;
        this.inInventory = inInventory;
    }

    public String getFoodName() {
        return foodName;
    }

    public long getInInventory() {
        return inInventory;
    }

    @Override
    public String toString() {
        return "Supply{" +
                "foodName='" + foodName + '\'' +
                ", inInventory=" + inInventory +
                '}';
    }
}
