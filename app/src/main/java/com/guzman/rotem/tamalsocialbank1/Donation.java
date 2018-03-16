package com.guzman.rotem.tamalsocialbank1;

/**
 * Created by tsuryohananov on 17/02/2018.
 */

public class Donation {
    private String _id;
    private String _rev;
    private String fulName;
    private String city;
    private String streetAddress;
    private String phone;
    private boolean isPickUp;
    private Food food; //TODO: arraylist cuz I want to give the user the option to donate multiple types of food
    private int status; // 0, 1, 2 - received, delivery, accepted
    private int amount;

    public Donation(String fulName, String city, String streetAddress, String phone, boolean isPickUp, Food food, int status, int amount) {
        this.fulName = fulName;
        this.city = city;
        this.streetAddress = streetAddress;
        this.phone = phone;
        this.isPickUp = isPickUp;
        this.food = food;
        this.status = status;
        this.amount = amount;
    }

//TODO: ctor for pickup donation / just work it out with the boolean I made

    public String get_id() {
        return _id;
    }

    public String get_rev() {
        return _rev;
    }

    public String getFulName() {
        return fulName;
    }

    public String getCity() {
        return city;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getPhone() {
        return phone;
    }

    public boolean isPickUp() {
        return isPickUp;
    }

    public Food getFood() {
        return food;
    }

    public int getStatus() {
        return status;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Donation{" +
                "_id='" + _id + '\'' +
                ", _rev='" + _rev + '\'' +
                ", fulName='" + fulName + '\'' +
                ", city='" + city + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", phone='" + phone + '\'' +
                ", isPickUp=" + isPickUp +
                '}';
    }
}
