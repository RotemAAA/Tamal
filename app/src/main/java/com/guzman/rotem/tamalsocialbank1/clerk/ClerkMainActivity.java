package com.guzman.rotem.tamalsocialbank1.clerk;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.guzman.rotem.tamalsocialbank1.R;
import com.guzman.rotem.tamalsocialbank1.admin.AdminMotherActivity;

public class ClerkMainActivity extends AppCompatActivity {

    private Button btnClerkAddMother;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clerk_main);

        btnClerkAddMother = findViewById(R.id.btnClerkAddMother);

        btnClerkAddMother.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent intent = new Intent(ClerkMainActivity.this, AdminMotherActivity.class);
                startActivity(intent);
            }
        });
    }
}
