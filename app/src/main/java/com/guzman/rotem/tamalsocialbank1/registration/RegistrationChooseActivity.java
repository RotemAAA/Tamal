package com.guzman.rotem.tamalsocialbank1.registration;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.guzman.rotem.tamalsocialbank1.R;

public class RegistrationChooseActivity extends AppCompatActivity {

    private Button btnMother, btnVolunteer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_choose);

        btnMother = findViewById(R.id.btnMother);
        btnVolunteer = findViewById(R.id.btnVolunteer);

        //TODO: go to the web page from the Amuta site, webView

        btnVolunteer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegistrationChooseActivity.this, RegistrationWebViewActivity.class);
                intent.putExtra("uri", "https://www.2help.org.il/volunteering");
                startActivity(intent);
            }
        });

        btnMother.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(RegistrationChooseActivity.this, RegistrationWebViewActivity.class);
                intent.putExtra("uri", "https://www.2help.org.il/food");
                startActivity(intent);
            }
        });
    }
}
