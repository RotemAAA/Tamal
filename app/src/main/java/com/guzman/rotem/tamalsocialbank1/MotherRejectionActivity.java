package com.guzman.rotem.tamalsocialbank1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MotherRejectionActivity extends AppCompatActivity {

    private TextView tvHeadLine, tvMoreInfo;
    private Button btnDialNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mother_rejection);

        tvHeadLine = findViewById(R.id.tvHeadline);
        tvMoreInfo = findViewById(R.id.tvMoreInfo);
        btnDialNow = findViewById(R.id.btnDialNow);


    }
}
