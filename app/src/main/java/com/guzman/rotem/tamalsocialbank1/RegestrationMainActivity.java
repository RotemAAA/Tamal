package com.guzman.rotem.tamalsocialbank1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegestrationMainActivity extends AppCompatActivity {

    private Button btnEnter;
    private EditText etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regestration_main);

        btnEnter = findViewById(R.id.btnEnter);
        etPassword = findViewById(R.id.etPassword);

        //TODO: add register button
        //TODO: ALL
    }
}
