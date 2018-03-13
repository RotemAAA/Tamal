package com.guzman.rotem.tamalsocialbank1;

import java.util.ArrayList;

/**
 * Created by Rotem on 13/03/2018.
 */

public class StockKeeperDataSource {

    public static ArrayList<StockKeeperUser> getData(){
        ArrayList<StockKeeperUser> data = new ArrayList<>();




        data.add(new StockKeeperUser(
                "1323",
                "רותם",
                "גוזמן",
                "stockKeeper",
                "0238583843"
        ));
        data.add(new StockKeeperUser(
                "13777",
                "צור",
                "יוחננוב",
                "stockKeeper",
                "0238583843"
        ));  data.add(new StockKeeperUser(
                "55555",
                "דור",
                "צמח",
                "stockKeeper",
                "0238583843"
        ));


        return data;
    }
}
