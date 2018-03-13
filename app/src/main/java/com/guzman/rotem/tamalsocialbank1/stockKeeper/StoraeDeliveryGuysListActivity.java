package com.guzman.rotem.tamalsocialbank1.stockKeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.guzman.rotem.tamalsocialbank1.dataSource.DeliveryGuyDataSource;
import com.guzman.rotem.tamalsocialbank1.R;
import com.guzman.rotem.tamalsocialbank1.adapter.DeliveryGuyAdapter;

public class StoraeDeliveryGuysListActivity extends AppCompatActivity {

    private ListView lvDeliveryGuys;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storae_delivery_guys_list);

        lvDeliveryGuys = findViewById(R.id.lvDeliveryGuys);


        //TODO: get in intent the Truma details from the previous screen and send the delivery guy to there

        DeliveryGuyAdapter deliveryGuyAdapter = new DeliveryGuyAdapter(DeliveryGuyDataSource.getData(),this);
        lvDeliveryGuys.setAdapter(deliveryGuyAdapter);


    }
}
