package com.guzman.rotem.tamalsocialbank1.deliveryGuy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.google.gson.Gson;
import com.guzman.rotem.tamalsocialbank1.Donation;
import com.guzman.rotem.tamalsocialbank1.R;
import com.guzman.rotem.tamalsocialbank1.Request;

import java.util.ArrayList;

public class DeliveryGuyDestinationList extends AppCompatActivity {

    private ListView lvDeliveryDestinations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_guy_destination_list);

        //get intent extra's with the delivery user json
        Intent intent = getIntent();
        String json = intent.getStringExtra("user");
        Gson gson = new Gson();
        DeliveryUser dUser = gson.fromJson(json, DeliveryUser.class);
        try {
            ArrayList<Donation> donations = dUser.getDonations();
            ArrayList<Request> requests = dUser.getRequests(); // arraylists for destinations
        } catch (Exception e) {
            Log.d("No Destinations", "No Destinations");

            // some textview that says "no destinations"
        }
        //TODO: populate the listview (maybe we need 2). the ware house manager will update his arraylist with destinations
        // it means the wh manager will take a donation for ex and change it status and push it to the wanted delivery guy's arraylist of destinations

        lvDeliveryDestinations = findViewById(R.id.lvDeliveryDestinations);

    }
}
