package com.guzman.rotem.tamalsocialbank1;
import android.content.Intent;
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

        Intent intent = getIntent();
        int status = intent.getIntExtra("status", 0);

        switch (status) {
            case 0:
                tvStatus.setText("ההזמנה בטיפול");
                break;
            case 1:
                tvStatus.setText("ההזמנה במשלוח");
                break;

        }
    }
}
