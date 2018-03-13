package com.guzman.rotem.tamalsocialbank1.stockKeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.guzman.rotem.tamalsocialbank1.R;

public class StorageManageDeliveryActivity extends AppCompatActivity {

    private ListView lvManageDelivery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storage_manage_delivery);

        lvManageDelivery = findViewById(R.id.lvManageDelivery);
        //TODO: connect to: storage_manage_delivery_my_list
        //TODO: see al the Deliveries online

    }
}
