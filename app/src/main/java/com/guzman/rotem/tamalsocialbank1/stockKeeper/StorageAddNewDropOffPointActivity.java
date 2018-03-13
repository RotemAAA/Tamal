package com.guzman.rotem.tamalsocialbank1.stockKeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.guzman.rotem.tamalsocialbank1.R;

public class StorageAddNewDropOffPointActivity extends AppCompatActivity {

    private EditText etCenterName, etCenterStreetAndAddress, etCenterCity, etCenterPhone;
    private Button btnAdd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storage_add_new_drop_off_point);

        etCenterName = findViewById(R.id.etCenterName);
        etCenterStreetAndAddress = findViewById(R.id.etStreetAndNumber);
        etCenterCity = findViewById(R.id.etCity);
        etCenterPhone = findViewById(R.id.etPhone);
        btnAdd = findViewById(R.id.btnAdd);

        //TODO: ALL  -  server
    }
}
