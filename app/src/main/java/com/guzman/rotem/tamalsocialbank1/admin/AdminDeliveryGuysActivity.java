package com.guzman.rotem.tamalsocialbank1.admin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.guzman.rotem.tamalsocialbank1.R;
import com.guzman.rotem.tamalsocialbank1.dataSource.DeliveryGuyDataSource;

public class AdminDeliveryGuysActivity extends AppCompatActivity {

    private Button btnAddNewDeliveryGuy;
    private ListView lvAdminDeliveryGuys;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_delivery_guys);

        btnAddNewDeliveryGuy = findViewById(R.id.btnAddNewDeliveryGuy);
        lvAdminDeliveryGuys = findViewById(R.id.lvAdminDeliveryGuys);

        btnAddNewDeliveryGuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminDeliveryGuysActivity.this, AdminDeliveryGuysEditActivity.class);
                startActivity(intent);
            }
        });

        DeliveryGuyDataSource dataSource = new DeliveryGuyDataSource(lvAdminDeliveryGuys, this, 1);
        dataSource.execute();
    }

    @Override
    protected void onPostResume() {
        DeliveryGuyDataSource dataSource = new DeliveryGuyDataSource(lvAdminDeliveryGuys, this, 1);
        dataSource.execute();
        super.onPostResume();
    }
}
