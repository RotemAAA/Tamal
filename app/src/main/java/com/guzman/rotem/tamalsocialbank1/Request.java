package com.guzman.rotem.tamalsocialbank1;

import com.guzman.rotem.tamalsocialbank1.mother.MomUser;

/**
 * Created by tsuryohananov on 06/03/2018.
 */

public class Request {
    private String _id;
    private String _rev;
    private String firstName;
    private String lastName;
    private String address;
    private String phone;
    private int status; // 0 processing, 1 delivery , 2 done


    public Request(MomUser user, int status) {
        this._id = user.get_id();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.status = status;
        this.address = user.getStreetNumber() + " " + user.getCity();
        this.phone = user.getPhone();
    }

    public String get_id() {
        return _id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getStatus() {
        return status;
    }

    public String get_rev() {
        return _rev;
    }

    public void set_rev(String _rev) {
        this._rev = _rev;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Request{" +
                "_id='" + _id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", status=" + status +
                '}';
    }
}
