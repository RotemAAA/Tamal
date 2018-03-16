package com.guzman.rotem.tamalsocialbank1.admin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;
import com.guzman.rotem.tamalsocialbank1.DbUtil;
import com.guzman.rotem.tamalsocialbank1.R;
import com.guzman.rotem.tamalsocialbank1.mother.MomUser;

public class AdminMotherEditActivity extends AppCompatActivity {

    private Button btnCodeReset, btnSendCode, btnUpdate;
    private EditText etCode, etFullName, etPhone, etCity, etStreetAndNumber, etFoodCapacity;
    private String code, fullName, phone, city, streetNumber, foodCapacity;

    final String dbAcnt = "67817cbe-88be-4383-98a9-93784d2103e2-bluemix";
    final String dbUser = "ndstedecionstentlymnatud";
    final String dbPass = "434006e0cef09ba9aabe33cca89e808a5139884d";
    final String dbName = "users";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_mother_edit);

        Intent intent = getIntent();
        String json = intent.getStringExtra("toEdit");
        Gson gson = new Gson();

        final MomUser momUser = gson.fromJson(json, MomUser.class);


        btnCodeReset = findViewById(R.id.btnCodeReset);
        btnSendCode = findViewById(R.id.btnSendCode);
        btnUpdate = findViewById(R.id.btnUpdate);

        etCity = findViewById(R.id.etCity);
        etFullName = findViewById(R.id.etFullName);
        etCode = findViewById(R.id.etCode);
        etPhone = findViewById(R.id.etPhone);
        etStreetAndNumber = findViewById(R.id.etStreetAndNumber);
        etFoodCapacity = findViewById(R.id.etFoodCapacity);

        if (momUser != null) {
            etFullName.setText(momUser.getFirstName() + " " + momUser.getLastName());
            etPhone.setText(momUser.getPhone());
            etCity.setText(momUser.getCity());
            etStreetAndNumber.setText(momUser.getStreetNumber());
            etCode.setText(momUser.get_id());
            etFoodCapacity.setText(String.valueOf(momUser.getFoodLimit()));

            fullName = etFullName.getText().toString();
            phone = etPhone.getText().toString();
            city = etCity.getText().toString();
            streetNumber = etStreetAndNumber.getText().toString();
            code = etCode.getText().toString();
            foodCapacity = etFoodCapacity.getText().toString();
        }

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

        etFoodCapacity.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                foodCapacity = etFoodCapacity.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (momUser!=null) {
                    DbUtil.deleteUser(momUser.get_id(), momUser.get_rev());
                }

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
                MomUser momUser = new MomUser(code, first, last, "Mother", city, phone, streetNumber, Integer.valueOf(foodCapacity));
                DbUtil.writeToDb(getApplicationContext(), dbAcnt, dbUser, dbPass, dbName, momUser);
            }
        });
    }
}
