package com.guzman.rotem.tamalsocialbank1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class AdminDeliveryGuysActivity extends AppCompatActivity {

    private Button btnAddNewDeliveryGuy;
    private ListView lvAdminDeliveryGuys;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_delivery_guys);

        btnAddNewDeliveryGuy = findViewById(R.id.btnAddNewDeliveryGuy);


        lvAdminDeliveryGuys = findViewById(R.id.lvAdminDeliveryGuys);

        DeliveryGuyAdapterAdmin deliveryGuyAdapterAdmin = new DeliveryGuyAdapterAdmin(DeliveryGuyDataSource.getData(), this);
        lvAdminDeliveryGuys.setAdapter(deliveryGuyAdapterAdmin);

        btnAddNewDeliveryGuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminDeliveryGuysActivity.this, AdminDeliveryGuysEditActivity.class);
                startActivity(intent);
            }
        });

    }
}
