package com.guzman.rotem.tamalsocialbank1.mother;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.cloudant.client.api.ClientBuilder;
import com.cloudant.client.api.CloudantClient;
import com.cloudant.client.api.Database;
import com.cloudant.client.org.lightcouch.NoDocumentException;
import com.google.gson.Gson;
import com.guzman.rotem.tamalsocialbank1.DbUtil;
import com.guzman.rotem.tamalsocialbank1.R;
import com.guzman.rotem.tamalsocialbank1.Request;
import com.guzman.rotem.tamalsocialbank1.User;

public class MotherMainActivity extends AppCompatActivity {

    private Button btnAskHelp;
    private User user;
    final String dbAcnt = "67817cbe-88be-4383-98a9-93784d2103e2-bluemix";
    final String dbUser = "brommeninimelleandeeding";
    final String dbPass = "9cb4e3bf199f7c0c8eb51d862befb9899c5f0df1";
    final String dbName = "requests";
    private int status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mother_main);

        Intent intent = getIntent();
        String json = intent.getStringExtra("user");
        Gson gson = new Gson();
        user = gson.fromJson(json, MomUser.class);
        btnAskHelp = findViewById(R.id.btnAskHelp);

        checkStatus();

        btnAskHelp.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("StaticFieldLeak")
            @Override
            public void onClick(View v) {
                new AsyncTask<Void, Void, Void>() {
                    @Override
                    protected Void doInBackground(Void... voids) {
                        CloudantClient client = ClientBuilder.account(dbAcnt)
                                .username(dbUser)
                                .password(dbPass)
                                .build();
                        Database database = client.database(dbName, false);
                        try {
                            Request r = database.find(Request.class, user.get_id());
                            int status = r.getStatus();

                            switch (status) {
                                case 0:
                                    Intent intent = new Intent(getApplicationContext(), MotherStatusActivity.class);
                                    intent.putExtra("status", 0);
                                    startActivity(intent);
                                    break;
                                case 1:
                                    Intent intent2 = new Intent(getApplicationContext(), MotherStatusActivity.class);
                                    intent2.putExtra("status", 1);
                                    startActivity(intent2);
                                    break;
                                case 2:
                                    Request request = new Request((MomUser) user, 0);
                                    DbUtil.writeToDb(getApplicationContext(), dbAcnt, dbUser, dbPass, dbName, request);
                                    break;
                            }

                        } catch (NoDocumentException e) {
                            // no such request, make a new one
                            Request request = new Request((MomUser) user, 0);
                            DbUtil.writeToDb(getApplicationContext(), dbAcnt, dbUser, dbPass, dbName, request);
                        }
                        return null;
                    }
                }.execute();
            }
        });
    }

    @SuppressLint("StaticFieldLeak")
    private void checkStatus() {
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... voids) {
                CloudantClient client = ClientBuilder.account(dbAcnt)
                        .username(dbUser)
                        .password(dbPass)
                        .build();
                Database database = client.database(dbName, false);
                try {
                    Request r = database.find(Request.class, user.get_id());
                    int status = r.getStatus();

                    switch (status) {
                        case 0:
                            Intent intent = new Intent(getApplicationContext(), MotherStatusActivity.class);
                            intent.putExtra("status", 0);
                            startActivity(intent);
                            break;
                        case 1:
                            Intent intent2 = new Intent(getApplicationContext(), MotherStatusActivity.class);
                            intent2.putExtra("status", 1);
                            startActivity(intent2);
                            break;
                        case 2:
                            //Toast.makeText(getApplicationContext(), "ההזמנה הסתיימה", Toast.LENGTH_LONG).show();
                            break;
                    }

                } catch (NoDocumentException e) {
                    // no such request, make a new one
/*                            Request request = new Request(user, 0);
                    DbUtil.writeToDb(getApplicationContext(), dbAcnt, dbUser, dbPass, dbName, request);*/
                }
                return null;
            }
        }.execute();
    }
}
