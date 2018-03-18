package com.guzman.rotem.tamalsocialbank1.donor;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.guzman.rotem.tamalsocialbank1.R;
import com.guzman.rotem.tamalsocialbank1.adapter.HoursAdapter;
import com.guzman.rotem.tamalsocialbank1.dataSource.HoursDataSource;

import java.util.ArrayList;

public class LeaveDetailsActivity extends AppCompatActivity {

    private EditText etFullName;
    private EditText etPhone;
    private Spinner spinnerPickHour;
    private Button btnSend;
    private String hoursP;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leave_details);

        etFullName = findViewById(R.id.etFullName);
        etPhone = findViewById(R.id.etPhone);
        btnSend = findViewById(R.id.btnSend);
        spinnerPickHour = findViewById(R.id.spnrPickHour);

        ArrayList<Hour> hours = HoursDataSource.getData();
        HoursAdapter hoursAdapter = new HoursAdapter(this, HoursDataSource.getData());
        spinnerPickHour.setAdapter(hoursAdapter);


        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = etFullName.getText().toString();
                String userPhone = etPhone.getText().toString();
//                String hours = spinnerPickHour.

                Hour hour1 = (Hour) spinnerPickHour.getSelectedItem();
                hoursP = hour1.getHour();

                String [] address = {"rotem.guzman@gmail.com"};
//                String address = "socialrespo@gmail.com";
                String subject = "תורם מבקש שיחה חוזרת";



                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("mailto:"));
                intent.setType("text/html");
                intent.putExtra(Intent.EXTRA_EMAIL, address);
                intent.putExtra(Intent.EXTRA_SUBJECT, subject);
                intent.putExtra(Intent.EXTRA_TEXT, "שם תורם: " + userName + "\n" +
                        "טלפון: " + userPhone + "\n" +
                        "שעת חזרה מועדפת: " + hoursP + "\n" +
                "הערות: \n");
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(Intent.createChooser(intent, "Send Email"));
                }





            }
        });

    }


}
