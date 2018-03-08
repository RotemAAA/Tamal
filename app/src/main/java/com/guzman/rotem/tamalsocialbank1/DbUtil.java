package com.guzman.rotem.tamalsocialbank1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.cloudant.client.api.ClientBuilder;
import com.cloudant.client.api.CloudantClient;
import com.cloudant.client.api.Database;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tsuryohananov on 02/03/2018.
 */

public class DbUtil {
    static ArrayList<Donation> donationArrayList;

    //TODO: make this arraylists for requests and storage db and populate from the readFromDb() method
/*    static ArrayList<Donation> donationArrayList;
    static ArrayList<Donation> donationArrayList;*/

    public static ArrayList<Donation> getDonationArrayList() {
        return donationArrayList;
    }

    @SuppressLint("StaticFieldLeak")
    static void readFromDb(final Context context, final String account, final String userName, final String pass, final String dbName) {
        new AsyncTask<Void, Void, Void>() {

            @Override
            protected Void doInBackground(Void... voids) {
                CloudantClient client = ClientBuilder.account(account)
                        .username(userName)
                        .password(pass)
                        .build();

                Database database = client.database(dbName, false);
                if (dbName.equals("demo")) {
                    donationArrayList = getAllDocList(database);
                }
                else if (dbName.equals("requests")) {

                }
                else if (dbName.equals("storage")) {

                }
                return null;
            }
        }.execute();
    }

    static ArrayList<Donation> getAllDocList(Database database) {
        try {
            return (ArrayList<Donation>) database.getAllDocsRequestBuilder().includeDocs(true).build().getResponse().getDocsAs(Donation.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @SuppressLint("StaticFieldLeak")
    private void deleteFirst() {
        new AsyncTask<Void, Void, Void>() {

            @Override
            protected Void doInBackground(Void... voids) {
                CloudantClient client = ClientBuilder.account("67817cbe-88be-4383-98a9-93784d2103e2-bluemix")
                        .username("msedimpancerearlyingloyn")
                        .password("5c96fa375977ab2abb54cf5a1f16c45dd2fb85ab")
                        .build();

                Database db = client.database("demo", false);
                List<Donation> pList = getAllDocList(db);
                if (pList != null) {
                    String id = pList.get(0).get_id();
                    String rev = pList.get(0).get_rev();
                    db.remove(id, rev);
/*                    Toast toast = Toast.makeText(getApplicationContext(), "first document removed", Toast.LENGTH_LONG);
                    toast.show();*/
                    Log.i("DELETE", "first document removed");
                }

                return null;
            }
        }.execute();
    }

    @SuppressLint("StaticFieldLeak")
    static void writeToDb(final Context context, final String account, final String userName, final String pass, final String dbName, final Object toWrite) {
        new AsyncTask<Void, Void, Void>() {

            @Override
            protected Void doInBackground(Void... voids) {
                CloudantClient client = ClientBuilder.account(account)
                        .username(userName)
                        .password(pass)
                        .build();

                Database database = client.database(/*"demo"*/dbName, false);
/*
                Donation person = new Donation("Tsur", "Yohananov", "0538049882",
                        true*//*, "example_id", null*//*);*/

                database.save(toWrite);

                Log.i("TAG", "doInBackground: cloudant data was saved.... ");
                //Toast.makeText(context, "data saved to cloudant....", Toast.LENGTH_LONG).show();
                return null;
            }

            @Override
            protected void onPostExecute(Void aVoid) {
                Toast.makeText(context, "data saved to cloudant...", Toast.LENGTH_LONG).show();
                super.onPostExecute(aVoid);
            }
        }.execute();
    }

    public void writeToDb(View view) {
        writeToDb(view);
    }

    public void readFromDb(View view) {
        readFromDb(view);
    }

}