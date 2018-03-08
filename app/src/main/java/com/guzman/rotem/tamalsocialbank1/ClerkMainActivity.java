package com.guzman.rotem.tamalsocialbank1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class ClerkMainActivity extends AppCompatActivity {

    private Button btnClerkAddMother;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clerk_main);

        btnClerkAddMother = findViewById(R.id.btnClerkAddMother);
    }
}
