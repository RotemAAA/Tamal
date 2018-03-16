package com.guzman.rotem.tamalsocialbank1.donor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.guzman.rotem.tamalsocialbank1.R;
import com.guzman.rotem.tamalsocialbank1.dataSource.DropOffCenterDataSource;

public class BuyingPoints extends AppCompatActivity {

    private ListView lvBuyingPoints;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buying_points);

        lvBuyingPoints = findViewById(R.id.lvBuyingPoints);
        new DropOffCenterDataSource(getApplicationContext(), lvBuyingPoints).execute();

    }
}
