package com.guzman.rotem.tamalsocialbank1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class BuyingPoints extends AppCompatActivity {

    private ListView lvBuyingPoints;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buying_points);

        lvBuyingPoints = findViewById(R.id.lvBuyingPoints);
    }
}
