package com.guzman.rotem.tamalsocialbank1.dataSource;

import android.os.AsyncTask;
import android.widget.TextView;

import com.cloudant.client.api.ClientBuilder;
import com.cloudant.client.api.CloudantClient;
import com.cloudant.client.api.Database;
import com.guzman.rotem.tamalsocialbank1.DbUtil;
import com.guzman.rotem.tamalsocialbank1.Donation;
import com.guzman.rotem.tamalsocialbank1.Supply;

import java.util.ArrayList;

/**
 * Created by tsuryohananov on 18/03/2018.
 */

public class InNowDataSource extends AsyncTask<Void, Void, Void> {
    private ArrayList<Supply> supplies;
    private Donation donation;
    private TextView textView;
    private String s;

    final String dbAcnt = "67817cbe-88be-4383-98a9-93784d2103e2-bluemix";
    final String dbUser = "tionsedgandidideperassio";
    final String dbPass = "4bf6f9c4478a6ee21689e348ea0d0cf83a2c8d9d";
    final String dbName = "inventory";

    public InNowDataSource(/*ArrayList<Supply> supplies,*/ Donation donation, TextView textView) {
        //this.supplies = supplies;
        this.donation = donation;
        this.textView = textView;
    }


    @Override
    protected Void doInBackground(Void... voids) {

        CloudantClient client = ClientBuilder.account(dbAcnt)
                .username(dbUser)
                .password(dbPass)
                .build();

        final Database database = client.database(dbName, false);
        try {
             supplies = DbUtil.getAllSupplyList(database);
            for (Supply supply : supplies) {
                if (supply.getFoodName().equals(donation.getFood().getName())) {
                    //textView.setText(String.valueOf(supply.getInInventory()));
                    s = String.valueOf(supply.getInInventory());
                    break;
                }
            }
        } catch (Exception e) {
            //
        }

        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        textView.setText(s);
    }
}
