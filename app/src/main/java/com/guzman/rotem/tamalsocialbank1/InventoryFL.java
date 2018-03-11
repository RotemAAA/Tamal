package com.guzman.rotem.tamalsocialbank1;

/**
 * Created by Rotem on 11/03/2018.
 */

public class InventoryFL {
    private String foodType;
    private int numInInventory;

    public InventoryFL(String foodType, int numInInventory) {
        this.foodType = foodType;
        this.numInInventory = numInInventory;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public int getNumInInventory() {
        return numInInventory;
    }

    public void setNumInInventory(int numInInventory) {
        this.numInInventory = numInInventory;
    }

    @Override
    public String toString() {
        return "InventoryFL{" +
                "foodType='" + foodType + '\'' +
                ", numInInventory='" + numInInventory + '\'' +
                '}';
    }
}
