package com.guzman.rotem.tamalsocialbank1.dataSource;

import android.app.Activity;
import android.os.AsyncTask;
import android.widget.ListView;

import com.cloudant.client.api.ClientBuilder;
import com.cloudant.client.api.CloudantClient;
import com.cloudant.client.api.Database;
import com.guzman.rotem.tamalsocialbank1.DbUtil;
import com.guzman.rotem.tamalsocialbank1.DropOffCenter;
import com.guzman.rotem.tamalsocialbank1.adapter.DropOffCenterAdapter;

import java.util.ArrayList;

/**
 * Created by Rotem on 10/03/2018.
 */

public class DropOffCenterDataSource extends AsyncTask<Void, Void, ArrayList<DropOffCenter>> {
    //drop off database credentials -
    final String dbAcnt = "67817cbe-88be-4383-98a9-93784d2103e2-bluemix";
    final String dbUser = "tiagarvereseelthanyuegul";
    final String dbPass = "6f610d3c37d3cc9088b4e91093ca478b6daafe96";
    final String dbName = "drop_off_centers";
    private Activity context;
    private Database database;
    private ListView listView;

    public DropOffCenterDataSource(Activity context, ListView listView) {
        this.context = context;
        this.listView = listView;
    }

    @Override
    protected ArrayList<DropOffCenter> doInBackground(Void... voids) {
        CloudantClient client = ClientBuilder.account(dbAcnt)
                .username(dbUser)
                .password(dbPass)
                .build();

        database = client.database(dbName, false);
        return DbUtil.getAllDropOffCenters(database);
    }

    @Override
    protected void onPostExecute(ArrayList<DropOffCenter> dropOffCenters) {
        DropOffCenterAdapter adapter = new DropOffCenterAdapter(dropOffCenters, context);
        listView.setAdapter(adapter);
    }
}