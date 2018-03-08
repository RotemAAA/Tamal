package com.guzman.rotem.tamalsocialbank1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class AdminStockKeeperActivity extends AppCompatActivity {

    private Button btnAddNewStockKeeper;
    private ListView lvStockKeepers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_stock_keeper);

        btnAddNewStockKeeper = findViewById(R.id.btnAddNewStockKeeper);


        lvStockKeepers = findViewById(R.id.lvStockKeepers);
        //TODO: connect to: admin_manage_stock_keepers_my_list

        btnAddNewStockKeeper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminStockKeeperActivity.this, AdminStockKeeperEditActivity.class);
                startActivity(intent);
            }
        });


    }
}
