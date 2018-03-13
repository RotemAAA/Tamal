package com.guzman.rotem.tamalsocialbank1;

import java.util.ArrayList;

/**
 * Created by Rotem on 13/03/2018.
 */

public class StockKeeperDataSource {

    public static ArrayList<StockKeeper> getData(){
        ArrayList<StockKeeper> data = new ArrayList<>();

        data.add(new StockKeeper(
                "רותם",
                "גוזמן",
                "0528482483"
        ));

        data.add(new StockKeeper(
                "צור",
                "יוחננוב",
                "036772323"
        ));

        data.add(new StockKeeper(
                "דור",
                "צמח",
                "089831212"
        ));
        data.add(new StockKeeper(
                "רותם",
                "גוזמן",
                "0528482483"
        ));

        data.add(new StockKeeper(
                "צור",
                "יוחננוב",
                "036772323"
        ));

        data.add(new StockKeeper(
                "דור",
                "צמח",
                "089831212"
        ));

        return data;
    }
}
