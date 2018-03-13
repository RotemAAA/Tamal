package com.guzman.rotem.tamalsocialbank1;

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
}
