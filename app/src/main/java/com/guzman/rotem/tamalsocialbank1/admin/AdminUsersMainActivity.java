package com.guzman.rotem.tamalsocialbank1.admin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.guzman.rotem.tamalsocialbank1.R;

public class AdminUsersMainActivity extends AppCompatActivity {

    private Button btnMothers, btnDeliveryGuys, btnStockKeepers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_users_main);

        btnMothers = findViewById(R.id.btnMothers);
        btnDeliveryGuys = findViewById(R.id.btnDeliveryGuys);
        btnStockKeepers = findViewById(R.id.btnStockKeepers);

        btnStockKeepers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminUsersMainActivity.this, AdminStockKeeperActivity.class);
                startActivity(intent);
            }
        });

        btnDeliveryGuys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminUsersMainActivity.this, AdminDeliveryGuysActivity.class);
                startActivity(intent);
            }
        });

        btnMothers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminUsersMainActivity.this, AdminMotherActivity.class);
                startActivity(intent);
            }
        });
    }


    //TODO: add new clerk
}
