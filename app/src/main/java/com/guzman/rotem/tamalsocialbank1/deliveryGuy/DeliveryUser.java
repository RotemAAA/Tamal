package com.guzman.rotem.tamalsocialbank1.deliveryGuy;

import com.guzman.rotem.tamalsocialbank1.Donation;
import com.guzman.rotem.tamalsocialbank1.Request;
import com.guzman.rotem.tamalsocialbank1.User;

import java.util.ArrayList;

/**
 * Created by tsuryohananov on 13/03/2018.
 */

public class DeliveryUser extends User {
    private String phoneNumber;
    private String city;
    private String streetNumber;
    private ArrayList<Donation> donations;
    private ArrayList<Request> requests;

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

    public ArrayList<Donation> getDonations() {
        return donations;
    }

    public ArrayList<Request> getRequests() {
        return requests;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public void setDonations(ArrayList<Donation> donations) {
        this.donations = donations;
    }

    public void setRequests(ArrayList<Request> requests) {
        this.requests = requests;
    }
}
