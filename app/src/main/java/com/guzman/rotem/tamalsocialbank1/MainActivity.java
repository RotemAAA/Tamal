package com.guzman.rotem.tamalsocialbank1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnFastDonation;
    private Button btnStories;
    private Button btnLogin;


    // those are for users db
    final String dbAcnt = "67817cbe-88be-4383-98a9-93784d2103e2-bluemix";
    final String dbUser = "ndstedecionstentlymnatud";
    final String dbPass = "434006e0cef09ba9aabe33cca89e808a5139884d";
    final String dbName = "users";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


/*        User user = new User("mom092", "שולה", "נתן", "Mother");

        DbUtil.writeToDb(getApplicationContext(), dbAcnt, dbUser, dbPass, dbName, user);

        String id = "k1312tsur";
        DbUtil.role(getApplicationContext(), id, dbAcnt, dbUser, dbPass, dbName);*/

        String id = "mom092";
        DbUtil.role(getApplicationContext(), id, dbAcnt, dbUser, dbPass, dbName);




        btnFastDonation = findViewById(R.id.btnFastDonation);

        btnStories = findViewById(R.id.btnStories);
        //TODO: connect to web??

        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RegistrationChooseActivity.class);
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
