package com.guzman.rotem.tamalsocialbank1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegestrationMainActivity extends AppCompatActivity {

    private Button btnEnter, btnRegister;
    private EditText etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regestration_main);

        btnRegister = findViewById(R.id.btnRegister);
        btnEnter = findViewById(R.id.btnEnter);
        etPassword = findViewById(R.id.etPassword);

        //TODO: add register button
        //TODO: ALL

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegestrationMainActivity.this, RegistrationChooseActivity.class);
                startActivity(intent);
            }
        });
    }
}
