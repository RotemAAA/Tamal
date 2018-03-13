package com.guzman.rotem.tamalsocialbank1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class DeliveryGuyDestinationList extends AppCompatActivity {

    private ListView lvDeliveryDestinations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_guy_destination_list);

        lvDeliveryDestinations = findViewById(R.id.lvDeliveryDestinations);
        //TODO: get the intent from dbUtil with the user json, show a list of destinations.

        //TODO: show all the destionations in a list - frmo server
    }
}
