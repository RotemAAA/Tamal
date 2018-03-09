package com.guzman.rotem.tamalsocialbank1;

/**
 * Created by tsuryohananov on 06/03/2018.
 */

public class Request {
    private String _id;
    private String firstName;
    private String lastName;
    private int status; // 0 processing, 1 delivery , 2 done


    public Request(User user, int status) {
        this._id = user.get_id();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.status = status;
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
