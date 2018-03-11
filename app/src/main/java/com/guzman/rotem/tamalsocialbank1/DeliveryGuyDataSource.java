package com.guzman.rotem.tamalsocialbank1;

import java.util.ArrayList;

/**
 * Created by Rotem on 11/03/2018.
 */

public class DeliveryGuyDataSource {

    public static ArrayList<DeliveryGuy> getData(){
        ArrayList<DeliveryGuy> data = new ArrayList<>();

        data.add(new DeliveryGuy(
                "רותם",
                "גוזמן",
                "0528482483",
                "פתח תקווה",
                "יוסף פפר 4"));

        data.add(new DeliveryGuy(
                "דור",
                "צמח",
                "036884312",
                "רמת גן",
                "הרא\"ה 5"));

        data.add(new DeliveryGuy(
                "צור",
                "יוחננוב",
                "036774545",
                "גבעתיים",
                "סירקין 7"));
        data.add(new DeliveryGuy(
                "רותם",
                "גוזמן",
                "0528482483",
                "פתח תקווה",
                "יוסף פפר 4"));

        data.add(new DeliveryGuy(
                "דור",
                "צמח",
                "036884312",
                "רמת גן",
                "הרא\"ה 5"));

        data.add(new DeliveryGuy(
                "צור",
                "יוחננוב",
                "036774545",
                "גבעתיים",
                "סירקין 7"));

        return data;
    }
}
