package com.guzman.rotem.tamalsocialbank1.dataSource;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.ListView;

import com.cloudant.client.api.ClientBuilder;
import com.cloudant.client.api.CloudantClient;
import com.cloudant.client.api.Database;
import com.guzman.rotem.tamalsocialbank1.DbUtil;
import com.guzman.rotem.tamalsocialbank1.Food;
import com.guzman.rotem.tamalsocialbank1.adapter.FoodAdapter;

import java.util.ArrayList;

/**
 * Created by Rotem on 13/03/2018.
 */
public class FoodDataSource extends AsyncTask<Void, Void, ArrayList<Food>>{
    final String dbAcnt = "67817cbe-88be-4383-98a9-93784d2103e2-bluemix";
    final String dbUser = "tsmandereeprownwastedits";
    final String dbPass = "740918fb3ecb293aef7fa749b895a7bb103a3557";
    final String dbName = "products";
    private Context context;
    private Database database;
    private ListView listView;

    public FoodDataSource(Context context, ListView listView) {
        this.context = context;
        this.listView = listView;
    }

    @Override
    protected ArrayList<Food> doInBackground(Void... voids) {
        CloudantClient client = ClientBuilder.account(dbAcnt)
                .username(dbUser)
                .password(dbPass)
                .build();

        database = client.database(dbName, false);
        return DbUtil.getAllFoodList(database);
    }

    @Override
    protected void onPostExecute(ArrayList<Food> foods) {
        FoodAdapter adapter = new FoodAdapter((Activity) context, foods);
        listView.setAdapter(adapter);
        super.onPostExecute(foods);
    }

    /*    public static ArrayList<Food> getData(){
        ArrayList<Food> data = new ArrayList<>();
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
    }*/
}
