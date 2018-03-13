package com.guzman.rotem.tamalsocialbank1.donor;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.guzman.rotem.tamalsocialbank1.R;

public class DonateMoneyActivity extends AppCompatActivity {
    private Button btnDialNow;
    private Button btnLeaveDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate_money);

        btnDialNow = findViewById(R.id.btnDialNow);
        btnLeaveDetails = findViewById(R.id.btnLeaveDetails);

        btnDialNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri phoneUri = Uri.parse("tel:0507888094");

                Intent dialIntent = new Intent(Intent.ACTION_DIAL, phoneUri);

                startActivity(dialIntent);
            }
        });

        btnLeaveDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DonateMoneyActivity.this, LeaveDetailsActivity.class);
                startActivity(intent);
            }
        });
    }
}
