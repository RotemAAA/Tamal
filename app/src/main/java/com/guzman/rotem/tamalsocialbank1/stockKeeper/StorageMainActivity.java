package com.guzman.rotem.tamalsocialbank1.stockKeeper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.guzman.rotem.tamalsocialbank1.R;

public class StorageMainActivity extends AppCompatActivity {
    private Button btnManageInventory, btnManageRequests, btnManageDonations, btnSendDeliveryGuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storage_main);

        btnManageInventory = findViewById(R.id.btnManageInventory);
        btnManageRequests = findViewById(R.id.btnManageRequests);
        btnManageDonations = findViewById(R.id.btnManageDonations);
        btnSendDeliveryGuy = findViewById(R.id.btnSendDeliveryGuy);

        btnSendDeliveryGuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StorageMainActivity.this, StoraeDeliveryGuysListActivity.class);
                startActivity(intent);
            }
        });

        btnManageDonations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StorageMainActivity.this, StorageDonationsActivity.class);
                startActivity(intent);
            }
        });



        btnManageRequests.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StorageMainActivity.this, StorageRequestsActivity.class);
                startActivity(intent);
            }
        });



        btnManageInventory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StorageMainActivity.this, StorageManageInventoryActivity.class);
                startActivity(intent);
            }
        });



    }
}
