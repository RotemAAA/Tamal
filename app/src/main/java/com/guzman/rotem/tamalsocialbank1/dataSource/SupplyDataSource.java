package com.guzman.rotem.tamalsocialbank1.dataSource;

import android.app.Activity;
import android.os.AsyncTask;
import android.widget.ListView;

import com.cloudant.client.api.ClientBuilder;
import com.cloudant.client.api.CloudantClient;
import com.cloudant.client.api.Database;
import com.guzman.rotem.tamalsocialbank1.DbUtil;
import com.guzman.rotem.tamalsocialbank1.Supply;
import com.guzman.rotem.tamalsocialbank1.adapter.SupplyAdapter;

import java.util.ArrayList;

/**
 * Created by Rotem on 11/03/2018.
 */

public class SupplyDataSource extends AsyncTask<Void, Void, ArrayList<Supply>> {

    final String dbAcnt = "67817cbe-88be-4383-98a9-93784d2103e2-bluemix";
    final String dbUser = "tionsedgandidideperassio";
    final String dbPass = "4bf6f9c4478a6ee21689e348ea0d0cf83a2c8d9d";
    final String dbName = "inventory";

    private ListView listView;
    private Activity context;
    private Database database;

    public SupplyDataSource(ListView listView, Activity context) {
        this.listView = listView;
        this.context = context;
    }

    @Override
    protected ArrayList<Supply> doInBackground(Void... voids) {
        CloudantClient client = ClientBuilder.account(dbAcnt)
                .username(dbUser)
                .password(dbPass)
                .build();

        database = client.database(dbName, false);
        ArrayList arr = DbUtil.getAllSupplyList(database);
        return arr;
    }

    @Override
    protected void onPostExecute(ArrayList<Supply> supplies) {

        SupplyAdapter adapter = new SupplyAdapter(supplies, context);
        listView.setAdapter(adapter);
        //super.onPostExecute(supplies);
    }
}