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
        supplies.add(new Supply("מטרנה Extra Care - שלב 2", 0,"7290013083678", R.drawable.b7290013083678));
        supplies.add(new Supply("מטרנה Extra Care - שלב 3", 0,"7290013083685", R.drawable.b7290013083685));
        supplies.add(new Supply("מטרנה Extra Care Comfort", 0,"7290014258914", R.drawable.b7290014258914));
        supplies.add(new Supply("מטרנה - חלבי - שלב 1", 0,"7290011447267", R.drawable.b7290011447267));
        supplies.add(new Supply("מטרנה - חלבי - שלב 2", 0,"7290011447281", R.drawable.b7290011447281));
        supplies.add(new Supply("מטרנה - חלבי - שלב 3", 0,"7290011447304", R.drawable.b7290011447304));
        supplies.add(new Supply("מטרנה - מהדרין - שלב 1", 0,"7290011447359", R.drawable.b7290011447359));
        supplies.add(new Supply("מטרנה - מהדרין - שלב 2", 0,"7290011447373", R.drawable.b7290011447373));
        supplies.add(new Supply("מטרנה - מהדרין - שלב 3", 0,"7290008975551", R.drawable.b7290008975551));
        supplies.add(new Supply("מטרנה-צמחי-מגיל לידה ואילך", 0,"7290014258716", R.drawable.b7290014258716));
        supplies.add(new Supply("מטרנה-צמחי-מגיל 12 חודשים", 0,"7290014258730", R.drawable.b7290014258730));
        supplies.add(new Supply("מטרנה-צמחי-מגיל 0 עד 12 חודשים", 0,"7290014258723", R.drawable.b7290014258723));
        supplies.add(new Supply("מטרנה-צמחי-מגיל 0 עד 12 חודשים", 0,"7290014258723", R.drawable.b7290014258723));



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
