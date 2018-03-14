package com.guzman.rotem.tamalsocialbank1.registration;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

import com.guzman.rotem.tamalsocialbank1.R;

public class RegistrationWebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_web_view);


        String uri1 = getIntent().getStringExtra("uri");
        Uri uri = Uri.parse(uri1);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        try {
            startActivity(intent);

        }catch (Exception e){
            new AlertDialog.Builder(this).setTitle("Please check your internet connection..").setMessage(e.toString()).show();
        }


    }
}
