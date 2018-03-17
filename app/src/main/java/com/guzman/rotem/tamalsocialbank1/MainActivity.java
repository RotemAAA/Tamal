package com.guzman.rotem.tamalsocialbank1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.guzman.rotem.tamalsocialbank1.donor.MainDonorsActivity;
import com.guzman.rotem.tamalsocialbank1.donor.StoriesActivity;
import com.guzman.rotem.tamalsocialbank1.registration.RegestrationMainActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button btnFastDonation;
    private Button btnStories;
    private Button btnLogin;


    ArrayList<Supply> supplies = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        supplies.add(new Supply("מטרנה Extra Care - שלב 1", 0,"7290013083661", R.drawable.b7290013083661));
        supplies.add(new Supply("מטרנה Extra Care - שלב 1", 0,"7290013083661"));
        supplies.add(new Supply("מטרנה Extra Care - שלב 1", 0,"7290013083661"));

        btnFastDonation = findViewById(R.id.btnFastDonation);

        btnStories = findViewById(R.id.btnStories);


        btnLogin = findViewById(R.id.btnLogin);

        btnStories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, StoriesActivity.class);
                intent.putExtra("url", "https://www.2help.org.il/forum/dvyvt-mmhvt");
                startActivity(intent);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RegestrationMainActivity.class);
                startActivity(intent);
            }
        });

        btnFastDonation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainDonorsActivity.class);
                startActivity(intent);
            }
        });

    }


}
