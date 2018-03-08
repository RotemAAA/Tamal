package com.guzman.rotem.tamalsocialbank1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class RegistrationChooseActivity extends AppCompatActivity {

    private Button btnMother, btnVolunteer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_choose);

        btnMother = findViewById(R.id.btnMother);
        btnVolunteer = findViewById(R.id.btnVolunteer);

        //TODO: connect to web
    }
}
