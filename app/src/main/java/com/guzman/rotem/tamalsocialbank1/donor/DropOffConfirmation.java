package com.guzman.rotem.tamalsocialbank1.donor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.guzman.rotem.tamalsocialbank1.R;

public class DropOffConfirmation extends AppCompatActivity {

    private TextView tvCenterAddress, tvCenterName, tvCenterPhone;
    private ListView lvChosenProducts;
    private Button btnConfirm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drop_off_confirmation);

        tvCenterAddress = findViewById(R.id.tvCenterAddress);
        tvCenterName = findViewById(R.id.tvCenterName);
        tvCenterPhone = findViewById(R.id.tvCenterPhone);

        lvChosenProducts = findViewById(R.id.lvChosenProducts);
        //TODO: connect to: food_list_layout to show the foods chosen

        btnConfirm = findViewById(R.id.btnConfirm);
    }
}
