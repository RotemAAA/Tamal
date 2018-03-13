package com.guzman.rotem.tamalsocialbank1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class DonateChooseBarcodeOrListActivity extends AppCompatActivity {

    private Button toScanBarcode;
    private Button btnPickFromList;
    private ListView lvDonorsProducts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate_choose_barcode_or_list);


        lvDonorsProducts = findViewById(R.id.lvDonorsProducts);

        ArrayList<Food> foods = new ArrayList<>();
        Food food = new Food("מטרנה extra care comfort", "דל לקטוז פרו ביוטי", R.drawable.asset_1);
        foods.add(food);
        FoodAdapter foodAdapter = new FoodAdapter(this, foods);

        lvDonorsProducts.setAdapter(foodAdapter);


        toScanBarcode = findViewById(R.id.btnToScanBarcode);

        toScanBarcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DonateChooseBarcodeOrListActivity.this, ScanBarcodeActivity.class);
                startActivity(intent);
            }
        });
    }


}
