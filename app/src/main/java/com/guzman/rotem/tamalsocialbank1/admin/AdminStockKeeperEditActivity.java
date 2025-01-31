package com.guzman.rotem.tamalsocialbank1.admin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
import com.guzman.rotem.tamalsocialbank1.stockKeeper.StockKeeperUser;

public class AdminStockKeeperEditActivity extends AppCompatActivity {

    private Button btnCodeReset, btnSendCode, btnUpdate;
    private EditText etCode, etFullName, etPhone;
    private String code, fullName, phone;

    final String dbAcnt = "67817cbe-88be-4383-98a9-93784d2103e2-bluemix";
    final String dbUser = "ndstedecionstentlymnatud";
    final String dbPass = "434006e0cef09ba9aabe33cca89e808a5139884d";
    final String dbName = "users";

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

        Intent intent = getIntent();
        String json = intent.getStringExtra("skEdit");
        Gson gson = new Gson();

        final StockKeeperUser stockKeeperUser = gson.fromJson(json, StockKeeperUser.class);

        if (stockKeeperUser != null) {
            etFullName.setText(stockKeeperUser.getFirstName() + " " + stockKeeperUser.getLastName());
            etPhone.setText(stockKeeperUser.getPhone());
            etCode.setText(stockKeeperUser.get_id());

            fullName = etFullName.getText().toString();
            phone = etPhone.getText().toString();
            code = etCode.getText().toString();
        }

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


        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (stockKeeperUser != null) {
                    DbUtil.deleteUser(stockKeeperUser.get_id(), stockKeeperUser.get_rev());
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
                StockKeeperUser sUser = new StockKeeperUser(code, first, last, "Manager", phone);
                DbUtil.writeToDb(getApplicationContext(), dbAcnt, dbUser, dbPass, dbName, sUser);
            }
        });

    }
}
