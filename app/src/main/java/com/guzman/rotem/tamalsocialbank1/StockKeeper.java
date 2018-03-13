package com.guzman.rotem.tamalsocialbank1;

/**
 * Created by Rotem on 13/03/2018.
 */

public class StockKeeper extends Person {

    private String phone;

    public StockKeeper(String firstName, String lastName, String phone) {
        super(firstName, lastName);
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "StockKeeper{" +
                "phone='" + phone + '\'' +
                '}';
    }
}
