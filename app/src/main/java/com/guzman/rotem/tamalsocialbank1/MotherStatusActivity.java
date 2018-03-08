package com.guzman.rotem.tamalsocialbank1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MotherStatusActivity extends AppCompatActivity {

    private TextView tvHeadLine, tvStatusHead, tvStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mother_status);

        tvHeadLine = findViewById(R.id.tvHeadline);
        tvStatusHead = findViewById(R.id.tvStatusHead);
        tvStatus = findViewById(R.id.tvSMRequestStatus);
    }
}
