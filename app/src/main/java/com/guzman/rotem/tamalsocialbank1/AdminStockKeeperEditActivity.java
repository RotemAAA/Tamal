package com.guzman.rotem.tamalsocialbank1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class AdminStockKeeperEditActivity extends AppCompatActivity {

    private Button btnCodeReset, btnSendCode, btnUpdate;
    private EditText etCode, etFullName, etPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_stock_keeper_edit);


        btnCodeReset = findViewById(R.id.btnCodeReset);
        btnSendCode = findViewById(R.id.btnSendCode);
        btnUpdate = findViewById(R.id.btnUpdate);

        etCode = findViewById(R.id.etCode);
        etFullName = findViewById(R.id.etFullName);
        etPhone = findViewById(R.id.etPhone);

        //TODO:         :\\\

    }
}
