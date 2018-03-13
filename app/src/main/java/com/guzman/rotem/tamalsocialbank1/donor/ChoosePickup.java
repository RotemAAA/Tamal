package com.guzman.rotem.tamalsocialbank1.donor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.guzman.rotem.tamalsocialbank1.R;

public class ChoosePickup extends AppCompatActivity {

    private Button btnPickDelivery;
    private Button btnNearbyDropoff;
    private Button btnDropOffPoints;

    private String chosenFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_pickup);

        btnDropOffPoints = findViewById(R.id.btnDropOffPoints);
        btnNearbyDropoff = findViewById(R.id.btnNearbyDropOff);
        btnPickDelivery = findViewById(R.id.btnHomePickUp);

        Intent intent = getIntent();
        chosenFood = intent.getStringExtra("chosen_food");


        btnDropOffPoints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChoosePickup.this, DropOffPoints.class);
                intent.putExtra("chosen_food", chosenFood);
                startActivity(intent);
            }
        });

        btnNearbyDropoff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChoosePickup.this, NearbyDropOffPoint.class);
                intent.putExtra("chosen_food", chosenFood);
                startActivity(intent);
            }
        });

        btnPickDelivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChoosePickup.this, BookDelivery.class);
                intent.putExtra("chosen_food", chosenFood);
                startActivity(intent);
            }
        });

    }
}
