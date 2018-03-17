package com.guzman.rotem.tamalsocialbank1.dataSource;

import com.guzman.rotem.tamalsocialbank1.donor.Hour;

import java.util.ArrayList;

/**
 * Created by Rotem on 17/03/2018.
 */

public class HoursDataSource {
    public static ArrayList<Hour> getData(){
        ArrayList<Hour> data = new ArrayList<>();
        data.add(new Hour("8:00 - 10:00"));
        data.add(new Hour("10:00 - 12:00"));
        data.add(new Hour("12:00 - 14:00"));
        data.add(new Hour("14:00 - 16:00"));
        data.add(new Hour("16:00 - 18:00"));
        return data;
    }
}
