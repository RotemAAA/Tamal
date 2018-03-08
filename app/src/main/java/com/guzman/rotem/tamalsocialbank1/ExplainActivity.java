package com.guzman.rotem.tamalsocialbank1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExplainActivity extends AppCompatActivity {

    private Button btnGotIt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explain);

        btnGotIt = findViewById(R.id.btnGotIt);

        btnGotIt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ExplainActivity.this, DonateChooseBarcodeOrListActivity.class);
                startActivity(intent);
            }
        });
    }
}
