package com.guzman.rotem.tamalsocialbank1.dataSource;

import com.guzman.rotem.tamalsocialbank1.Supply;

import java.util.ArrayList;

/**
 * Created by Rotem on 11/03/2018.
 */

public class SupplyDataSource {

    public static ArrayList<Supply> getData(){
        ArrayList<Supply> data = new ArrayList<>();

        data.add(new Supply("מטרנה EXTRA CARE שלב 1", 50));
        data.add(new Supply("מטרנה EXTRA CARE שלב 2", 100));
        data.add(new Supply("מטרנה EXTRA CARE שלב 3", 20));
        data.add(new Supply("מטרנה חלבי שלב 1", 300));
        data.add(new Supply("מטרנה חלבי שלב 2", 40));
        data.add(new Supply("מטרנה חלבי שלב 3", 11));

        return data;
    }

}