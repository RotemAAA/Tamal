package com.guzman.rotem.tamalsocialbank1.donor;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;
import com.guzman.rotem.tamalsocialbank1.DbUtil;
import com.guzman.rotem.tamalsocialbank1.Donation;
import com.guzman.rotem.tamalsocialbank1.Food;
import com.guzman.rotem.tamalsocialbank1.R;

public class BookDelivery extends AppCompatActivity {

    final String dbAcnt = "67817cbe-88be-4383-98a9-93784d2103e2-bluemix";
    final String dbUser = "msedimpancerearlyingloyn";
    final String dbPass = "5c96fa375977ab2abb54cf5a1f16c45dd2fb85ab";
    final String dbName = "demo";

    private EditText fullName;
    private EditText city;
    private EditText street;
    private EditText phone;
    private Button sendBtn;

    private Food food;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_delivery);

        fullName = findViewById(R.id.etFullName);
        city = findViewById(R.id.etCity);
        street = findViewById(R.id.etStreetAndNumber);
        phone = findViewById(R.id.etPhone);
        sendBtn = findViewById(R.id.btnSend);

        getDetailsSp();

        Intent intent = getIntent();
        String chosenFood = intent.getStringExtra("chosen_food");
        Gson gson = new Gson();
        food = gson.fromJson(chosenFood, Food.class);

        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (fullName.getText().toString().equals("") || city.getText().toString().equals("") || street.getText().toString().equals("") || phone.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "נא למלא את השדות", Toast.LENGTH_LONG).show();
                } else {
                    //TODO: get the amount and set status to 0
                    Donation donation = new Donation(fullName.getText().toString(), city.getText().toString(), street.getText().toString(), phone.getText().toString(), false, food);
                    writeDonation(donation);
                    saveDetails(donation);
                    Toast.makeText(getApplicationContext(), "תודה רבה, " + fullName.getText().toString(), Toast.LENGTH_LONG).show();
                }
            }

            private void saveDetails(Donation donation) {
                SharedPreferences prefs = getApplicationContext().getSharedPreferences("user", MODE_PRIVATE);
                SharedPreferences.Editor edit = prefs.edit();
                Gson gson = new Gson();
                String json = gson.toJson(donation);
                edit.putString("last", json);
                edit.commit();
            }
        });
    }

    private void getDetailsSp() {
        SharedPreferences prefs = getApplicationContext().getSharedPreferences("user", MODE_PRIVATE);
        String fromSp = prefs.getString("last", null);
        if (fromSp != null) {
            Gson gson = new Gson();
            Donation donation = gson.fromJson(fromSp, Donation.class);

            fullName.setText(donation.getFulName());
            city.setText(donation.getCity());
            street.setText(donation.getStreetAddress());
            phone.setText(donation.getPhone());
        }
    }

    private void writeDonation(Donation d) {
        DbUtil.writeToDb(getApplicationContext(), dbAcnt, dbUser, dbPass, dbName, d);
    }

/*    private void readDonDb() {
        DbUtil.readFromDb(getApplicationContext(), dbAcnt, dbUser, dbPass, dbName);

        for (int i = 0; i < 3; i = i) {
            ArrayList<Donation> myDonationList = DbUtil.getDonationArrayList();
            Log.d("LOADING", "loading....");

            if (myDonationList != null) {
                for (Donation donation : myDonationList) {
                    System.out.println(donation.toString());
                }
                break;
            }

        }
    }*/

}
