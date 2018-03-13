package com.guzman.rotem.tamalsocialbank1.deliveryGuy;

import com.guzman.rotem.tamalsocialbank1.User;

/**
 * Created by tsuryohananov on 13/03/2018.
 */

public class DeliveryUser extends User {
    private String phoneNumber;
    private String city;
    private String streetNumber;

    public DeliveryUser(String _id, String firstName, String lastName, String role, String phoneNumber, String city, String streetNumber) {
        super(_id, firstName, lastName, role);
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.streetNumber = streetNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public String getStreetNumber() {
        return streetNumber;
    }
}
