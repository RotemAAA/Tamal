package com.guzman.rotem.tamalsocialbank1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegestrationMainActivity extends AppCompatActivity {

    private Button btnEnter, btnRegister;
    private EditText etPassword;
    private String id;
    // those are for users db
    final String dbAcnt = "67817cbe-88be-4383-98a9-93784d2103e2-bluemix";
    final String dbUser = "ndstedecionstentlymnatud";
    final String dbPass = "434006e0cef09ba9aabe33cca89e808a5139884d";
    final String dbName = "users";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regestration_main);

        btnRegister = findViewById(R.id.btnRegister);
        btnEnter = findViewById(R.id.btnEnter);
        etPassword = findViewById(R.id.etPassword);
        

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegestrationMainActivity.this, RegistrationChooseActivity.class);
                startActivity(intent);
            }
        });

        btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // here I need to go to the server and intent to required activity
                if (id != null && !id.equals("")) {
                    DbUtil.role(getApplicationContext(), id, dbAcnt, dbUser, dbPass, dbName);
                } else {
                    Toast.makeText(getApplicationContext(), "נא להזין את הקוד המזהה", Toast.LENGTH_LONG).show();
                }
            }
        });


        etPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                id = etPassword.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
                //id = etPassword.getText().toString();
            }
        });
    }
}
