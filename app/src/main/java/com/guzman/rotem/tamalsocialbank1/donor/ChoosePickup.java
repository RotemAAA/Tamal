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
    private String amount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_pickup);

        btnDropOffPoints = findViewById(R.id.btnDropOffPoints);
        btnPickDelivery = findViewById(R.id.btnHomePickUp);

        Intent intent = getIntent();
        chosenFood = intent.getStringExtra("chosen_food");
        amount = intent.getStringExtra("amount");


        btnDropOffPoints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChoosePickup.this, DropOffPoints.class);
                intent.putExtra("chosen_food", chosenFood);
                intent.putExtra("amount", amount);
                startActivity(intent);
            }
        });



        btnPickDelivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChoosePickup.this, BookDelivery.class);
                intent.putExtra("chosen_food", chosenFood);
                intent.putExtra("amount", amount);
                startActivity(intent);
            }
        });

    }
}
