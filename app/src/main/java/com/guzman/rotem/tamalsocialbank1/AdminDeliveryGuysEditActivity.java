package com.guzman.rotem.tamalsocialbank1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class AdminDeliveryGuysEditActivity extends AppCompatActivity {
    private Button btnSendCode, btnCodeReset, btnUpdate;
    private EditText etFullName, etPhone, etCity, etStreetAndNumber, etCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_delivery_guys_edit);

        btnCodeReset = findViewById(R.id.btnCodeReset);
        btnSendCode = findViewById(R.id.btnSendCode);
        btnUpdate = findViewById(R.id.btnUpdate);

        etFullName = findViewById(R.id.etFullName);
        etPhone = findViewById(R.id.etPhone);
        etCity = findViewById(R.id.etCity);
        etStreetAndNumber = findViewById(R.id.etStreetAndNumber);
        etCode = findViewById(R.id.etCode);

        //TODO:                  :\
    }
}
