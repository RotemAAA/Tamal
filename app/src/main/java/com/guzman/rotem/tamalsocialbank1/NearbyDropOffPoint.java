package com.guzman.rotem.tamalsocialbank1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class NearbyDropOffPoint extends AppCompatActivity {
    private Button btnDropProductsHere, btnWazeNavigation;
    private TextView tvCenterName, tvCenterAddress, tvCenterPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nearby_drop_off_point);

        btnDropProductsHere = findViewById(R.id.btnDropProductsHere);
        tvCenterAddress = findViewById(R.id.tvCenterAddress);
        tvCenterName = findViewById(R.id.tvCenterName);
        tvCenterPhone = findViewById(R.id.tvCenterPhone);
        //TODO: GET THE DETAILS


        btnWazeNavigation = findViewById(R.id.btnWazeNavigation);
        //TODO: waze intent

        btnDropProductsHere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NearbyDropOffPoint.this, DropOffConfirmation.class);
                startActivity(intent);
            }
        });


    }
}
