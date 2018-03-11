package com.guzman.rotem.tamalsocialbank1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class DropOffPoints extends AppCompatActivity {

    private ListView lvDropOffPoints;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drop_off_points);

        lvDropOffPoints = findViewById(R.id.lvDropOffPoints);

        DropOffCenterAdapter dropOffCenterAdapter = new DropOffCenterAdapter(DropOffCenterDataSource.getDate(), this);
        lvDropOffPoints.setAdapter(dropOffCenterAdapter);

//       ArrayList<DropOffCenter> d1  = DropOffCenterDataSource.getDate();
////        System.out.println(d1.toString());
//        Log.d("sdghsghgf", d1.toString());

    }
}