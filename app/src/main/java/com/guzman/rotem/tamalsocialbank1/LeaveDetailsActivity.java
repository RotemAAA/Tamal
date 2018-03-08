package com.guzman.rotem.tamalsocialbank1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class LeaveDetailsActivity extends AppCompatActivity{

    private EditText etFullName;
    private EditText etPhone;
    private Spinner spinnerPickHour;
    private Button btnSend;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leave_details);

        etFullName = findViewById(R.id.etFullName);
        etPhone = findViewById(R.id.etPhone);
        btnSend = findViewById(R.id.btnSend);


        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = etFullName.getText().toString();
                String userPhone = etPhone.getText().toString();

                //TODO: SPINNER to string-array: pick_up_hours
                //TODO: ALL
            }
        });

    }





}
