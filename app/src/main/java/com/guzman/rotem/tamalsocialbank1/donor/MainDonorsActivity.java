package com.guzman.rotem.tamalsocialbank1.donor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.guzman.rotem.tamalsocialbank1.R;

public class MainDonorsActivity extends AppCompatActivity {
    private Button btnDonateFood;
    private Button btnDonateMoney;
    private Button btnBuyPoints;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_donors);

        btnBuyPoints = findViewById(R.id.btnBuyPoints);
        btnDonateFood = findViewById(R.id.btnFoodDonation);
        btnDonateMoney = findViewById(R.id.btnMoneyDonation);

        btnBuyPoints.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainDonorsActivity.this, BuyingPoints.class);
                startActivity(intent);
            }
        });

        btnDonateMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainDonorsActivity.this, DonateMoneyActivity.class);
                startActivity(intent);
            }
        });

        btnDonateFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainDonorsActivity.this, DonateChooseBarcodeOrListActivity.class);
                startActivity(intent);
            }
        });
    }
}
