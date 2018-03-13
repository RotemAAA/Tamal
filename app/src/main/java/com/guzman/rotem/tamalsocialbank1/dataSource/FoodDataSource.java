package com.guzman.rotem.tamalsocialbank1.dataSource;

import com.guzman.rotem.tamalsocialbank1.Food;
import com.guzman.rotem.tamalsocialbank1.R;

import java.util.ArrayList;

/**
 * Created by Rotem on 13/03/2018.
 */

public class FoodDataSource {
    public static ArrayList<Food> getData(){
        ArrayList<Food> data = new ArrayList<>();
        //TODO: get the list from the server
        data.add(new Food(
                "מטרנה שלב 3",
                "לגילאים 0-3",
                "414313T530809",
                R.drawable.asset_1
        ));

        data.add(new Food(
                "מטרנה שלב 2",
                "לגילאים 3-6",
                "414313T530809",
                R.drawable.asset_3
        ));

        data.add(new Food(
                "מטרנה שלב 4",
                "לגילאים 0-6",
                "414313T530809",
                R.drawable.asset_4
        ));

        return data;
    }
}
