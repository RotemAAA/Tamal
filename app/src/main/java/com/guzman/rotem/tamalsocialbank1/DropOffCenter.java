package com.guzman.rotem.tamalsocialbank1;

import android.support.annotation.DrawableRes;

/**
 * Created by Rotem on 10/03/2018.
 */

public class DropOffCenter {

    private static String name;
    private static String address;
    private static String phone;

    @DrawableRes
    private static int imageWaze;

    @DrawableRes
    private static int imageName;

    @DrawableRes
    private static int imageAddress;

    @DrawableRes
    private static int imagePhone;


    public DropOffCenter() {
    }

    public DropOffCenter(String name, String address, String phone, int imageWaze, int imageName, int imageAddress, int imagePhone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.imageWaze = imageWaze;
        this.imageName = imageName;
        this.imageAddress = imageAddress;
        this.imagePhone = imagePhone;
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

    public int getImageWaze() {
        return imageWaze;
    }

    public void setImageWaze(int imageWaze) {
        this.imageWaze = imageWaze;
    }

    public int getImageName() {
        return imageName;
    }

    public void setImageName(int imageName) {
        this.imageName = imageName;
    }

    public int getImageAddress() {
        return imageAddress;
    }

    public void setImageAddress(int imageAddress) {
        this.imageAddress = imageAddress;
    }

    public int getImagePhone() {
        return imagePhone;
    }

    public void setImagePhone(int imagePhone) {
        this.imagePhone = imagePhone;
    }

    @Override
    public String toString() {
        return "DropOffCenter{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", imageWaze=" + imageWaze +
                ", imageName=" + imageName +
                ", imageAddress=" + imageAddress +
                ", imagePhone=" + imagePhone +
                '}';
    }
}