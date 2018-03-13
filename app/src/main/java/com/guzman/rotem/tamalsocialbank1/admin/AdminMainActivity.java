package com.guzman.rotem.tamalsocialbank1.admin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.guzman.rotem.tamalsocialbank1.R;
import com.guzman.rotem.tamalsocialbank1.stockKeeper.StorageMainActivity;

public class AdminMainActivity extends AppCompatActivity {
    private Button btnManageUsers, btnManageInventory, btnManageProducrs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_main);

        btnManageInventory = findViewById(R.id.btnManageInventory);
        btnManageUsers = findViewById(R.id.btnManageUsers);
        btnManageProducrs = findViewById(R.id.btnManageProducts);

        btnManageProducrs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminMainActivity.this, AdminProductsActivity.class);
                startActivity(intent);

            }
        });

        btnManageInventory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminMainActivity.this, StorageMainActivity.class);
                startActivity(intent);
            }
        });

        btnManageUsers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminMainActivity.this, AdminUsersMainActivity.class);
                startActivity(intent);
            }
        });
    }
}
