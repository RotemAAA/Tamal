package com.guzman.rotem.tamalsocialbank1;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import com.cloudant.client.api.ClientBuilder;
import com.cloudant.client.api.CloudantClient;
import com.cloudant.client.api.Database;
import com.cloudant.client.org.lightcouch.NoDocumentException;
import com.google.gson.Gson;
import com.guzman.rotem.tamalsocialbank1.admin.AdminMainActivity;
import com.guzman.rotem.tamalsocialbank1.deliveryGuy.DeliveryGuyDestionations;
import com.guzman.rotem.tamalsocialbank1.deliveryGuy.DeliveryUser;
import com.guzman.rotem.tamalsocialbank1.mother.MomUser;
import com.guzman.rotem.tamalsocialbank1.mother.MotherMainActivity;
import com.guzman.rotem.tamalsocialbank1.stockKeeper.StockKeeperUser;
import com.guzman.rotem.tamalsocialbank1.stockKeeper.StorageMainActivity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tsuryohananov on 02/03/2018.
 */

public class DbUtil {
    static ArrayList<Donation> donationArrayList;
    static ArrayList<User> userArrayList;

    public static ArrayList<Donation> getDonationArrayList() {
        return donationArrayList;
    }

    @SuppressLint("StaticFieldLeak")
    public static void readFromDb(final Context context, final String account, final String userName, final String pass, final String dbName) {
        AsyncTask as = new AsyncTask<Void, Void, Void>() {

            @Override
            protected Void doInBackground(Void... voids) {
                CloudantClient client = ClientBuilder.account(account)
                        .username(userName)
                        .password(pass)
                        .build();

                Database database = client.database(dbName, false);
                switch (dbName) {
                    case "demo":
                        donationArrayList = getAllDocList(database);
                        break;
                    case "requests":
                        // return requests ArrayList
                        break;
                    case "inventory":
                        // return inventory ArrayList
                        break;
                    case "users":
                        userArrayList = getAllUsersList(database);
                        break;
                }
                return null;
            }
        }.execute();


    }

    public static ArrayList<Donation> getAllDocList(Database database) {
        try {
            return (ArrayList<Donation>) database.getAllDocsRequestBuilder().includeDocs(true).build().getResponse().getDocsAs(Donation.class);
        } catch (IOException e) {
            //e.printStackTrace();
        }
        return null;
    }

    public static ArrayList<User> getAllUsersList(Database database) {
        try {
            return (ArrayList<User>) database.getAllDocsRequestBuilder().includeDocs(true).build().getResponse().getDocsAs(User.class);
        } catch (IOException e) {
            //e.printStackTrace();
        }
        return null;
    }

    public static ArrayList<DropOffCenter> getAllDropOffCenters(Database database) {
        try {
            return (ArrayList<DropOffCenter>) database.getAllDocsRequestBuilder().includeDocs(true).build().getResponse().getDocsAs(DropOffCenter.class);
        } catch (IOException e) {
            //e.printStackTrace();
        }
        return null;
    }

    public static ArrayList<User> getUserArrayList() {
        return userArrayList;
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
    public static void writeToDb(final Context context, final String account, final String userName, final String pass, final String dbName, final Object toWrite) {
        new AsyncTask<Void, Void, Void>() {

            @Override
            protected Void doInBackground(Void... voids) {
                CloudantClient client = ClientBuilder.account(account)
                        .username(userName)
                        .password(pass)
                        .build();

                Database database = client.database(dbName, false);
                database.save(toWrite);

                Log.i("SAVED", "doInBackground: cloudant data was saved.... ");
                return null;
            }

            @Override
            protected void onPostExecute(Void aVoid) {
                Toast.makeText(context, "המידע התקבל בהצלחה", Toast.LENGTH_LONG).show();
                super.onPostExecute(aVoid);
            }
        }.execute();
    }

    @SuppressLint("StaticFieldLeak")
    public static void role(final Activity context, final String id, final String account, final String userName, final String pass, final String dbName) {
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... voids) {
                CloudantClient client = ClientBuilder.account(account)
                        .username(userName)
                        .password(pass)
                        .build();
                Database database = client.database(dbName, false);
                try {
                    String statrsWith = id.substring(0, 1);
                    Log.d("IDSUB", statrsWith);
                    User user = database.find(User.class, id);
                    String role = user.getRole();
                    switch (role) {
                        case "Admin":
                            Log.i("ADMIN", "Hello Admin " + user.getFirstName() + " Welcome");
                            Gson gson2 = new Gson();
                            String json2 = gson2.toJson(user);
                            Intent intent2 = new Intent(context, AdminMainActivity.class);
                            intent2.putExtra("user", json2);
                            context.startActivity(intent2);

                            break;
                        case "Manager":
                            StockKeeperUser sUser = database.find(StockKeeperUser.class, id);
                            Log.i("WAREHOUSE MANAGER", "Hello warehouse manager " + sUser.getFirstName() + " Welcome");
                            Gson gson1 = new Gson();
                            String json1 = gson1.toJson(sUser);
                            Intent intent1 = new Intent(context, StorageMainActivity.class);
                            intent1.putExtra("user", json1);
                            context.startActivity(intent1);
                            break;
                        case "Delivery":
                            DeliveryUser dUser = database.find(DeliveryUser.class, id);
                            Log.i("DELIVERY GUY", "Hello delivery guy, " + dUser.getFirstName() + " Welcome");
                            Gson gson3 = new Gson();
                            String json3 = gson3.toJson(dUser);
                            Intent intent3 = new Intent(context, DeliveryGuyDestionations.class);
                            intent3.putExtra("user", json3);
                            context.startActivity(intent3);
                            break;
                        case "Mother":
                            MomUser momUser = database.find(MomUser.class, id);
                            System.out.println(momUser.toString());
                            Log.i("Mom", "Hello mom, " + momUser.getFirstName() + " Welcome");
                            Gson gson = new Gson();
                            String json = gson.toJson(momUser);
                            Intent intent = new Intent(context, MotherMainActivity.class);
                            intent.putExtra("user", json);
                            context.startActivity(intent);

                            break;
                        default:
                            Log.i("No Role", "No Role Found");
                            break;
                    }
                } catch (NoDocumentException e) {
                    Log.i("No User", "No User Found");
                }
                return null;
            }
        }.execute();
    }

    @SuppressLint("StaticFieldLeak")
    public static void deleteUser(final String id, final String rev) {
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... voids) {
                CloudantClient client = ClientBuilder.account("67817cbe-88be-4383-98a9-93784d2103e2-bluemix")
                        .username("ndstedecionstentlymnatud")
                        .password("434006e0cef09ba9aabe33cca89e808a5139884d")
                        .build();

                Database db = client.database("users", false);
                db.remove(id, rev);
                Log.i("DELETE", "user removed");
                return null;
            }
        }.execute();
    }
}
