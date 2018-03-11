package com.guzman.rotem.tamalsocialbank1;

/**
 * Created by Rotem on 10/03/2018.
 */

public class DropOffCenter {

    private String name;
    private String address;
    private String phone;

    public DropOffCenter(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }



    @Override
    public String toString() {
        return "DropOffCenter{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}