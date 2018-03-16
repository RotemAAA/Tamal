package com.guzman.rotem.tamalsocialbank1.admin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.guzman.rotem.tamalsocialbank1.R;
import com.guzman.rotem.tamalsocialbank1.dataSource.StorageUserDataSource;

public class AdminStockKeeperActivity extends AppCompatActivity {

    private Button btnAddNewStockKeeper;
    private ListView lvStockKeepers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_stock_keeper);

        btnAddNewStockKeeper = findViewById(R.id.btnAddNewStockKeeper);


        lvStockKeepers = findViewById(R.id.lvStockKeepers);

        new StorageUserDataSource(lvStockKeepers, this).execute();

        btnAddNewStockKeeper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminStockKeeperActivity.this, AdminStockKeeperEditActivity.class);
                startActivity(intent);
            }
        });


    }

    @Override
    protected void onPostResume() {
        new StorageUserDataSource(lvStockKeepers, this).execute();
        super.onPostResume();
    }
}
