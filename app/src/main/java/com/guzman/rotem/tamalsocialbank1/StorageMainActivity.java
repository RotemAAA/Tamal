package com.guzman.rotem.tamalsocialbank1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class StorageMainActivity extends AppCompatActivity {
    private Button btnManageInventory, btnManageDelivery, btnManageRequests, btnManagePickUpPoints, btnManageDonations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storage_main);

        btnManageInventory = findViewById(R.id.btnManageInventory);
        btnManageDelivery = findViewById(R.id.btnManageDelivery);
        btnManageRequests = findViewById(R.id.btnManageRequests);
        btnManagePickUpPoints = findViewById(R.id.btnManagePickUpPoints);
        btnManageDonations = findViewById(R.id.btnManageDonations);

        btnManageDonations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StorageMainActivity.this, StorageManageDonationsActivity.class);
                startActivity(intent);
            }
        });

        btnManagePickUpPoints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StorageMainActivity.this, StorageManageDropOffPointsActivity.class);
                startActivity(intent);
            }
        });

        btnManageRequests.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StorageMainActivity.this, StorageManageRequestsActivity.class);
                startActivity(intent);
            }
        });

        btnManageDelivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StorageMainActivity.this, StorageManageDeliveryActivity.class);
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
