package com.guzman.rotem.tamalsocialbank1.registration;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.guzman.rotem.tamalsocialbank1.R;

public class RegistrationWebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_web_view);

        String uri;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                uri= null;
            } else {
                uri= extras.getString("uri");
            }
        } else {
            uri= (String) savedInstanceState.getSerializable("uri");
        }
    }
}
