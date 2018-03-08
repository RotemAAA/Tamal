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
    private Food food;


    public Donation() {
    }

    public Donation(String fulName, String city, String streetAddress, String phone, boolean isPickUp, Food food) {
        this.fulName = fulName;
        this.city = city;
        this.streetAddress = streetAddress;
        this.phone = phone;
        this.isPickUp = isPickUp;
        this.food = food;
    }


    //TODO: ctor for pickup donation

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
