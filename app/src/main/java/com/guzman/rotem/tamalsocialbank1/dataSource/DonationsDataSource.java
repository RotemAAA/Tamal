package com.guzman.rotem.tamalsocialbank1.dataSource;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.ListView;

import com.cloudant.client.api.ClientBuilder;
import com.cloudant.client.api.CloudantClient;
import com.cloudant.client.api.Database;
import com.guzman.rotem.tamalsocialbank1.DbUtil;
import com.guzman.rotem.tamalsocialbank1.Donation;

import java.util.ArrayList;

/**
 * Created by tsuryohananov on 16/03/2018.
 */

public class DonationsDataSource extends AsyncTask<Void, Void, ArrayList<Donation>> {
    final String dbAcnt = "67817cbe-88be-4383-98a9-93784d2103e2-bluemix";
    final String dbUser = "towellephapenerenefortic";
    final String dbPass = "8e602a9f89d418e279e3855219b98f4570340926";
    final String dbName = "demo";
    private Context context;
    private Database database;
    private ListView listView;
    private int what;

    public DonationsDataSource(Context context, ListView listView, int what) {
        this.context = context;
        this.listView = listView;
        this.what = what;
    }

    @Override
    protected ArrayList<Donation> doInBackground(Void... voids) {
        CloudantClient client = ClientBuilder.account(dbAcnt)
                .username(dbUser)
                .password(dbPass)
                .build();

        database = client.database(dbName, false);
        return DbUtil.getAllDocList(database);
    }

    @Override
    protected void onPostExecute(ArrayList<Donation> donations) {
        //get the donations adapter and set adapter
        switch (what) {
            case 0:
                setDonations(donations, 0, listView);
                break;
            case 1:
                setDonations(donations, 1, listView);
                break;
            case 2:
                setDonations(donations, 2, listView);
                break;
            default:
                setDonations(donations, 0, listView);
                break;
        }
    }

    private void setDonations(ArrayList<Donation> donations, int i, ListView listView) {
        ArrayList<Donation> d1 = new ArrayList<>();
        for (Donation donation : donations) {
            if (donation.getStatus() == i) {
                d1.add(donation);
            }
        }
        //TODO: set adapter to the list view - donations adapter
    }
}
