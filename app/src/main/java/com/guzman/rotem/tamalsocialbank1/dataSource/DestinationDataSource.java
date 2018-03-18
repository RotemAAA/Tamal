package com.guzman.rotem.tamalsocialbank1.dataSource;

import android.app.Activity;
import android.os.AsyncTask;
import android.widget.ListView;

import com.cloudant.client.api.ClientBuilder;
import com.cloudant.client.api.CloudantClient;
import com.cloudant.client.api.Database;
import com.guzman.rotem.tamalsocialbank1.Donation;
import com.guzman.rotem.tamalsocialbank1.Request;
import com.guzman.rotem.tamalsocialbank1.adapter.DestinationAdapter;
import com.guzman.rotem.tamalsocialbank1.deliveryGuy.DeliveryUser;

import java.util.ArrayList;

/**
 * Created by Rotem on 14/03/2018.
 */

public class DestinationDataSource extends AsyncTask<Void, Void, ArrayList> {

    final String dbAcnt = "67817cbe-88be-4383-98a9-93784d2103e2-bluemix";
    final String dbUser = "ndstedecionstentlymnatud";
    final String dbPass = "434006e0cef09ba9aabe33cca89e808a5139884d";
    final String dbName = "users";

    private String id;
    private String _rev;
    private DeliveryUser deliveryUser;
    private int i;
    private Activity context;
    private ListView listView;

    public DestinationDataSource(DeliveryUser deliveryUser, int i, Activity context, ListView listView) {
        this.i = i;
        this.deliveryUser = deliveryUser;
        this.id = deliveryUser.get_id();
        this.context = context;
        this.listView = listView;
    }

    @Override
    protected ArrayList doInBackground(Void... voids) {
        DeliveryUser save = deliveryUser;
        CloudantClient client = ClientBuilder.account(dbAcnt)
                .username(dbUser)
                .password(dbPass)
                .build();

        Database db = client.database(dbName, false);
        deliveryUser = db.find(DeliveryUser.class, save.get_id());
        ArrayList arr = null;
        if (i == 0) {
            arr = deliveryUser.getDonations();
        }
        if (i == 1) {
            arr = deliveryUser.getRequests();
        }
        return arr;
    }

    @Override
    protected void onPostExecute(ArrayList arrayList) {
        if (i == 0) {
            ArrayList<Donation> donations = arrayList;
            DestinationAdapter adapter = new DestinationAdapter(donations, context, 0, deliveryUser);
            if (arrayList != null)
                listView.setAdapter(adapter);
        }
        if (i == 1) {
            ArrayList<Request> requests = arrayList;
            DestinationAdapter adapter = new DestinationAdapter(requests, context, 1, deliveryUser);
            if (arrayList != null)
                listView.setAdapter(adapter);
        }
    }
}
