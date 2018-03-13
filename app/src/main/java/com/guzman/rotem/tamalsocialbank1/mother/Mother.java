package com.guzman.rotem.tamalsocialbank1.mother;

import com.guzman.rotem.tamalsocialbank1.Person;

/**
 * Created by Rotem on 02/03/2018.
 */

public class Mother extends Person {

    private String foodType;


    public Mother(String firstName, String lastName, String foodType) {
        super(firstName, lastName);
        this.foodType = foodType;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }


}

