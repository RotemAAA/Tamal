package com.guzman.rotem.tamalsocialbank1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class DonateChooseBarcodeOrListActivity extends AppCompatActivity {

    private Button toScanBarcode;
    private Button btnPickFromList;
    private ListView lvDonorsProducts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate_choose_barcode_or_list);


        lvDonorsProducts = findViewById(R.id.lvDonorsProducts);
        //TODO: connect to: food_list_layout


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
