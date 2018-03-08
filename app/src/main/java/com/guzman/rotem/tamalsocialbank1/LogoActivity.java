package com.guzman.rotem.tamalsocialbank1;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class LogoActivity extends AppCompatActivity {
    private ImageView ivLogo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);

        animateToMain();

        ivLogo = findViewById(R.id.ivLogo);
        ivLogo.animate().setDuration(3000).rotation(360).scaleY(3).scaleX(3).scaleXBy(2);
    }

    private void animateToMain() {
        Handler h = new Handler();
        h.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(LogoActivity.this, MainActivity.class);
                startActivity(intent);
            }
        }, 3000);
    }
}
