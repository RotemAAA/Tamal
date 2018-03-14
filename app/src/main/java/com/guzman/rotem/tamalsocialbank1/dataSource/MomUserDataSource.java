package com.guzman.rotem.tamalsocialbank1.dataSource;

import com.guzman.rotem.tamalsocialbank1.mother.MomUser;

import java.util.ArrayList;

/**
 * Created by Rotem on 13/03/2018.
 */

public class MomUserDataSource {

    public static ArrayList<MomUser> getData() {
        ArrayList<MomUser> data = new ArrayList<>();

        data.add(new MomUser(
                "133",
                "רותם1",
                "גוזמן",
                "אמא",
                "פתח תקווה",
                "0528482483",
                "יוסף פפר 4",
                5
        ));

        data.add(new MomUser(
                "15",
                "רותם2",
                "גוזמן",
                "אמא",
                "רמת גן",
                "0523258677",
                "יוסף פפר 4",
                1
        ));


        data.add(new MomUser(
                "47",
                "רותם43",
                "גוזמן",
                "אמא",
                "תל אביב",
                "036778989",
                "יוסף פפר 4",
                10
        ));

        data.add(new MomUser(
                "133",
                "רותם1",
                "גוזמן",
                "אמא",
                "פתח תקווה",
                "0528482483",
                "יוסף פפר 4",
                5
        ));

        data.add(new MomUser(
                "15",
                "רותם2",
                "גוזמן",
                "אמא",
                "רמת גן",
                "0523258677",
                "יוסף פפר 4",
                1
        ));


        data.add(new MomUser(
                "47",
                "רותם43",
                "גוזמן",
                "אמא",
                "תל אביב",
                "036778989",
                "יוסף פפר 4",
                10
        ));


        return data;
    }


}
