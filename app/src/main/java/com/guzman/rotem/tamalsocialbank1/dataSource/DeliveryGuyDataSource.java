package com.guzman.rotem.tamalsocialbank1.dataSource;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.ListView;

import com.cloudant.client.api.ClientBuilder;
import com.cloudant.client.api.CloudantClient;
import com.cloudant.client.api.Database;
import com.guzman.rotem.tamalsocialbank1.DbUtil;
import com.guzman.rotem.tamalsocialbank1.User;
import com.guzman.rotem.tamalsocialbank1.adapter.DeliveryGuyAdapter;
import com.guzman.rotem.tamalsocialbank1.deliveryGuy.DeliveryUser;

import java.util.ArrayList;

/**
 * Created by Rotem on 11/03/2018.
 */


public class DeliveryGuyDataSource extends AsyncTask<Void, Void, ArrayList<DeliveryUser>> {
    final String dbAcnt = "67817cbe-88be-4383-98a9-93784d2103e2-bluemix";
    final String dbUser = "ndstedecionstentlymnatud";
    final String dbPass = "434006e0cef09ba9aabe33cca89e808a5139884d";
    final String dbName = "users";
    @SuppressLint("StaticFieldLeak")
    private ListView listView;
    private Context context;

    private Database database;

    public DeliveryGuyDataSource(ListView listView, Context context) {
        this.listView = listView;
        this.context = context;
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
        System.out.println(deliveryUsers.toString());

        //TODO: adapter and populate the list
        DeliveryGuyAdapter adapter = new DeliveryGuyAdapter(deliveryUsers, context);

        listView.setAdapter(adapter);
    }
}

