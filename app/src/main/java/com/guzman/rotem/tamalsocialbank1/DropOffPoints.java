package com.guzman.rotem.tamalsocialbank1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class DropOffPoints extends AppCompatActivity {

    private ListView lvDropOffPoints;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drop_off_points);

        lvDropOffPoints = findViewById(R.id.lvDropOffPoints);

        //TODO: connect to: drop-off_points_my_list
    }
}
