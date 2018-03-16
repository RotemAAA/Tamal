package com.guzman.rotem.tamalsocialbank1.donor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.guzman.rotem.tamalsocialbank1.R;
import com.guzman.rotem.tamalsocialbank1.dataSource.DropOffCenterDataSource;

public class DropOffPoints extends AppCompatActivity {

    private ListView lvDropOffPoints;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drop_off_points);

        lvDropOffPoints = findViewById(R.id.lvDropOffPoints);
        new DropOffCenterDataSource(this, lvDropOffPoints).execute();

    }
}