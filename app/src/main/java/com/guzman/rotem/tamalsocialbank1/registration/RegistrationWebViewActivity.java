package com.guzman.rotem.tamalsocialbank1.registration;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.guzman.rotem.tamalsocialbank1.R;

public class RegistrationWebViewActivity extends AppCompatActivity {
    private WebView webView;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_web_view);

        webView = findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        String url = getIntent().getStringExtra("url");

        loadWebView(url, webView);

    }

    private void loadWebView(String url, WebView webView) {
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setLoadWithOverviewMode(true);

        webView.setWebViewClient(new WebViewClient() {
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                Toast.makeText(getApplicationContext(), description, Toast.LENGTH_SHORT).show();
            }
        });

        webView.loadUrl(url);
    }
}
