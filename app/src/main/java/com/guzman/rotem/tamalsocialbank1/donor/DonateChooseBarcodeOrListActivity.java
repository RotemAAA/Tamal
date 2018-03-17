package com.guzman.rotem.tamalsocialbank1.donor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.guzman.rotem.tamalsocialbank1.R;
import com.guzman.rotem.tamalsocialbank1.dataSource.FoodDataSource;

public class DonateChooseBarcodeOrListActivity extends AppCompatActivity {

    private Button toScanBarcode;
    private Button btnPickFromList;
    private ListView lvDonorsProducts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate_choose_barcode_or_list);


        lvDonorsProducts = findViewById(R.id.lvDonorsProducts);

/*        ArrayList<Food> foods = new ArrayList<>();
        Food food = new Food("מטרנה extra care comfort", "דל לקטוז פרו ביוטי","35633567437", R.drawable.asset_1);
        foods.add(food);
        FoodAdapter foodAdapter = new FoodAdapter(this, foods);

        lvDonorsProducts.setAdapter(foodAdapter);*/
        new FoodDataSource(this, lvDonorsProducts).execute();

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
