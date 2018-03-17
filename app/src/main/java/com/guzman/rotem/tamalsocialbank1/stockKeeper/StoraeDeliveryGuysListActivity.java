package com.guzman.rotem.tamalsocialbank1.stockKeeper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.google.gson.Gson;
import com.guzman.rotem.tamalsocialbank1.Donation;
import com.guzman.rotem.tamalsocialbank1.R;
import com.guzman.rotem.tamalsocialbank1.dataSource.DeliveryGuyDataSource;

public class StoraeDeliveryGuysListActivity extends AppCompatActivity {

    private ListView lvDeliveryGuys;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storae_delivery_guys_list);

        lvDeliveryGuys = findViewById(R.id.lvDeliveryGuys);
        Gson gson = new Gson();
        Intent intent = getIntent();
        String json = intent.getStringExtra("theDonation");
        Donation d = gson.fromJson(json, Donation.class);

        if (d != null) {
            DeliveryGuyDataSource dataSource = new DeliveryGuyDataSource(lvDeliveryGuys, this, 0, d);
            dataSource.execute();
        } else {
            DeliveryGuyDataSource dataSource = new DeliveryGuyDataSource(lvDeliveryGuys, this, 0);
            dataSource.execute();
        }
    }
}
