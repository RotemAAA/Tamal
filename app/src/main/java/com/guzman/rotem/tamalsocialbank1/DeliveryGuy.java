package com.guzman.rotem.tamalsocialbank1;

/**
 * Created by Rotem on 11/03/2018.
 */

public class DeliveryGuy extends Person  {
    private String phone, city, streetAndNumber;

    public DeliveryGuy(String firstName, String lastName, String phone, String city, String streetAndNumber) {
        super(firstName, lastName);
        this.phone = phone;
        this.city = city;
        this.streetAndNumber = streetAndNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetAndNumber() {
        return streetAndNumber;
    }

    public void setStreetAndNumber(String streetAndNumber) {
        this.streetAndNumber = streetAndNumber;
    }

    @Override
    public String toString() {
        return "DeliveryGuy{" +
                "phone='" + phone + '\'' +
                ", city='" + city + '\'' +
                ", streetAndNumber='" + streetAndNumber + '\'' +
                '}';
    }
}
