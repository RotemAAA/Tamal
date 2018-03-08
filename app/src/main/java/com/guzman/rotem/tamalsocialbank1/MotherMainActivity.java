package com.guzman.rotem.tamalsocialbank1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class MotherMainActivity extends AppCompatActivity {

    private Button btnAskHelp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mother_main);

        btnAskHelp = findViewById(R.id.btnAskHelp);
        //TODO: connect
    }
}
