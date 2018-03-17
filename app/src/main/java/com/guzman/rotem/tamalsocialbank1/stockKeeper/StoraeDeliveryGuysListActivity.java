package com.guzman.rotem.tamalsocialbank1.stockKeeper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.google.gson.Gson;
import com.guzman.rotem.tamalsocialbank1.Donation;
import com.guzman.rotem.tamalsocialbank1.R;
import com.guzman.rotem.tamalsocialbank1.Request;
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
        String json1 = intent.getStringExtra("theRequest");
        Donation d = gson.fromJson(json, Donation.class);
        Request r = gson.fromJson(json1, Request.class);

        if (d != null) {
            DeliveryGuyDataSource dataSource = new DeliveryGuyDataSource(lvDeliveryGuys, this, 0, d);
            dataSource.execute();
        } else if (r!=null){
            DeliveryGuyDataSource dataSource = new DeliveryGuyDataSource(lvDeliveryGuys,this, 0, r);
            dataSource.execute();
        } else {
            DeliveryGuyDataSource dataSource = new DeliveryGuyDataSource(lvDeliveryGuys, this, 0);
            dataSource.execute();
        }

/*        if (r != null) {
            RequestsDataSource dataSource = new RequestsDataSource(this, lvDeliveryGuys, 0, r);
            dataSource.execute();
        } else {
            RequestsDataSource dataSource = new RequestsDataSource(this, lvDeliveryGuys, 0);
            dataSource.execute();
        }*/

/*        if (d != null || r != null) {
            if (d!=null) {

            } else if ()
            if (r!=null) {

            }
        }*/
    }
}
