package com.guzman.rotem.tamalsocialbank1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class AdminMotherEditActivity extends AppCompatActivity {

    private Button btnCodeReset, btnSendCode, btnUpdate;
    private EditText etCode, etFullName, etPhone, etCity, etStreetAndNumber, etFoodCapacity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_mother_edit);

        btnCodeReset = findViewById(R.id.btnCodeReset);
        btnSendCode = findViewById(R.id.btnSendCode);
        btnUpdate = findViewById(R.id.btnUpdate);

        etCity = findViewById(R.id.etCity);
        etFullName = findViewById(R.id.etFullName);
        etCode = findViewById(R.id.etCode);
        etPhone = findViewById(R.id.etPhone);
        etStreetAndNumber = findViewById(R.id.etStreetAndNumber);
        etFoodCapacity = findViewById(R.id.etFoodCapacity);



        //TODO:     :\\\
    }
}
