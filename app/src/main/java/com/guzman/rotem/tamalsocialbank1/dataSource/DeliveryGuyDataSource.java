package com.guzman.rotem.tamalsocialbank1.dataSource;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.ListView;

import com.cloudant.client.api.ClientBuilder;
import com.cloudant.client.api.CloudantClient;
import com.cloudant.client.api.Database;
import com.guzman.rotem.tamalsocialbank1.DbUtil;
import com.guzman.rotem.tamalsocialbank1.Donation;
import com.guzman.rotem.tamalsocialbank1.Request;
import com.guzman.rotem.tamalsocialbank1.User;
import com.guzman.rotem.tamalsocialbank1.adapter.DeliveryGuyAdapter;
import com.guzman.rotem.tamalsocialbank1.adapter.DeliveryGuyAdapterAdmin;
import com.guzman.rotem.tamalsocialbank1.deliveryGuy.DeliveryUser;

import java.util.ArrayList;

/**
 * Created by Rotem on 11/03/2018.
 */


public class DeliveryGuyDataSource extends AsyncTask<Void, Void, ArrayList<DeliveryUser>> {
    static final String dbAcnt = "67817cbe-88be-4383-98a9-93784d2103e2-bluemix";
    static final String dbUser = "ndstedecionstentlymnatud";
    static final String dbPass = "434006e0cef09ba9aabe33cca89e808a5139884d";
    static final String dbName = "users";
    @SuppressLint("StaticFieldLeak")
    private ListView listView;
    private Context context;
    private Database database;
    private int who;
    private Donation d;
    private Request r;

    public DeliveryGuyDataSource(ListView listView, Context context, int who) {
        this.listView = listView;
        this.context = context;
        this.who = who;
    }

    public DeliveryGuyDataSource(ListView listView, Context context, int who, Donation d) {
        this.listView = listView;
        this.context = context;
        this.who = who;
        this.d = d;
    }

    public DeliveryGuyDataSource(ListView listView, Context context, int who, Request r) {
        this.listView = listView;
        this.context = context;
        this.who = who;
        this.r = r;
    }

    @Override
    protected ArrayList<DeliveryUser> doInBackground(Void... voids) {
        CloudantClient client = ClientBuilder.account(dbAcnt)
                .username(dbUser)
                .password(dbPass)
                .build();

        database = client.database(dbName, false);
        ArrayList<User> users = DbUtil.getAllUsersList(database);
        ArrayList<DeliveryUser> dUsers = new ArrayList<>();
        assert users != null;
        for (User user : users) {
            if (user.getRole().equals("Delivery")) {
                DeliveryUser dUser = database.find(DeliveryUser.class, user.get_id());
                dUsers.add(dUser);
            }
        }
        return dUsers;
    }

    @Override
    protected void onPostExecute(ArrayList<DeliveryUser> deliveryUsers) {

        if (who == 0) {
            if (d != null) {
                DeliveryGuyAdapter adapter = new DeliveryGuyAdapter(deliveryUsers, context, d);
                listView.setAdapter(adapter);
            } else if (r!=null) {
                DeliveryGuyAdapter adapter = new DeliveryGuyAdapter(deliveryUsers, context, r);
                listView.setAdapter(adapter);
            }
            else {
                DeliveryGuyAdapter adapter = new DeliveryGuyAdapter(deliveryUsers, context);
                listView.setAdapter(adapter);
            }
        } else if (who == 1) {
            //admin's addapter
            DeliveryGuyAdapterAdmin adapterAdmin = new DeliveryGuyAdapterAdmin(deliveryUsers, context);
            listView.setAdapter(adapterAdmin);
        }
    }

    @SuppressLint("StaticFieldLeak")
    public static DeliveryUser getDeliveryUser(DeliveryUser d) {
        new GetUser(d).execute();
        return d;
    }

    public static class GetUser extends AsyncTask<Void, Void, DeliveryUser> {
        private DeliveryUser deliveryUser;

        public GetUser(DeliveryUser deliveryUser) {
            this.deliveryUser = deliveryUser;
        }

        @Override
        protected DeliveryUser doInBackground(Void... voids) {
            CloudantClient client = ClientBuilder.account(dbAcnt)
                    .username(dbUser)
                    .password(dbPass)
                    .build();
            Database database = client.database(dbName, false);
            DeliveryUser dUser = database.find(DeliveryUser.class, deliveryUser.get_id());
            return dUser;
        }

        @Override
        protected void onPostExecute(DeliveryUser deliveryUser) {
            this.deliveryUser = deliveryUser;
        }
    }
}

