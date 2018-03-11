package com.guzman.rotem.tamalsocialbank1;

/**
 * Created by tsuryohananov on 11/03/2018.
 */

public class MomUser extends User {
    private String city;
    private String phone;
    private String streetNumber;
    private int foodLimit;

    public MomUser(String _id, String firstName, String lastName, String role) {
        super(_id, firstName, lastName, role);
    }

    public MomUser(String _id, String firstName, String lastName, String role, String city, String phone, String streetNumber, int foodLimit) {
        super(_id, firstName, lastName, role);
        this.city = city;
        this.phone = phone;
        this.streetNumber = streetNumber;
        this.foodLimit = foodLimit;
    }

    public String getCity() {
        return city;
    }

    public String getPhone() {
        return phone;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public int getFoodLimit() {
        return foodLimit;
    }

    @Override
    public String toString() {
        return "MomUser{" +
                "city='" + city + '\'' +
                ", phone='" + phone + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                ", foodLimit=" + foodLimit +
                '}';
    }
}
