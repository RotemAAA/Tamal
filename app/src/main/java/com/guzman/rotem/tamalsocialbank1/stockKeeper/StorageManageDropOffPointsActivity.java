package com.guzman.rotem.tamalsocialbank1.stockKeeper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.guzman.rotem.tamalsocialbank1.R;

public class StorageManageDropOffPointsActivity extends AppCompatActivity {

    private Button btnAddDropOffCenter;

    private ListView lvDropOffCenters;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storage_manage_drop_off_points);

        btnAddDropOffCenter = findViewById(R.id.btnAddDropOffCenter);


        lvDropOffCenters = findViewById(R.id.lvDropOffCenters);
        //TODO: connect to: storage_manage_drop_off_point_my_list

        btnAddDropOffCenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StorageManageDropOffPointsActivity.this, StorageAddNewDropOffPointActivity.class);
                startActivity(intent);

            }
        });
    }
}
