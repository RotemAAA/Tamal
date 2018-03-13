package com.guzman.rotem.tamalsocialbank1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AdminDeliveryGuysEditActivity extends AppCompatActivity {
    private Button btnSendCode, btnCodeReset, btnUpdate;
    private EditText etFullName, etPhone, etCity, etStreetAndNumber, etCode;
    private String code, fullName, phone, city, streetNumber;

    final String dbAcnt = "67817cbe-88be-4383-98a9-93784d2103e2-bluemix";
    final String dbUser = "ndstedecionstentlymnatud";
    final String dbPass = "434006e0cef09ba9aabe33cca89e808a5139884d";
    final String dbName = "users";

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

        etCity.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                city = etCity.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        etFullName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                fullName = etFullName.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        etCode.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                code = etCode.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        etPhone.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                phone = etPhone.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        etStreetAndNumber.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                streetNumber = etStreetAndNumber.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String[] separated = fullName.split(" ");
                String first = "";
                String last = "";

                for (int i = 0; i < separated.length; i++) {

                    if (i == 0) {
                        first = separated[0].trim();
                        Log.d("FName ** ", "" + first + "\n ");
                    } else if (i == 1) {
                        last = separated[1].trim();
                        Log.d("MName ** ", "" + last + "\n ");
                    } else {
                        Toast.makeText(getApplicationContext(), "נא למלא שם מלא", Toast.LENGTH_LONG).show();
                    }
                }
                DeliveryUser dUser = new DeliveryUser(code, first, last, "Delivery", phone, city, streetNumber);
                DbUtil.writeToDb(getApplicationContext(), dbAcnt, dbUser, dbPass, dbName, dUser);
            }
        });
    }
}
