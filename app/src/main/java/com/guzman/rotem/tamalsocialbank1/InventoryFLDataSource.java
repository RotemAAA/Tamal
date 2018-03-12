package com.guzman.rotem.tamalsocialbank1;

import java.util.ArrayList;

/**
 * Created by Rotem on 11/03/2018.
 */

public class InventoryFLDataSource {

    public static ArrayList<InventoryFL> getData(){
        ArrayList<InventoryFL> data = new ArrayList<>();

        data.add(new InventoryFL("מטרנה EXTRA CARE שלב 1", 50));
        data.add(new InventoryFL("מטרנה EXTRA CARE שלב 2", 100));
        data.add(new InventoryFL("מטרנה EXTRA CARE שלב 3", 20));
        data.add(new InventoryFL("מטרנה חלבי שלב 1", 300));
        data.add(new InventoryFL("מטרנה חלבי שלב 2", 40));
        data.add(new InventoryFL("מטרנה חלבי שלב 3", 11));

        return data;
    }

}