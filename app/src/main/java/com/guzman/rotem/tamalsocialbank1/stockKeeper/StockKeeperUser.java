package com.guzman.rotem.tamalsocialbank1.stockKeeper;

import com.guzman.rotem.tamalsocialbank1.User;

/**
 * Created by tsuryohananov on 13/03/2018.
 */

public class StockKeeperUser extends User {
    private String phone;

    public StockKeeperUser(String _id, String firstName, String lastName, String role, String phone) {
        super(_id, firstName, lastName, role);
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
        return "StockKeeperUser{" +
                "phone='" + phone + '\'' +
                '}';
    }
}
