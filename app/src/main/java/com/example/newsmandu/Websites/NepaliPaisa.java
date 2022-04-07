package com.example.newsmandu.Websites;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.newsmandu.R;

public class NepaliPaisa extends AppCompatActivity {
    private WebView webNepali;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nepali_paisa);

        webNepali = findViewById(R.id.webNepali);
        webNepali.setWebViewClient(new WebViewClient());
        webNepali.loadUrl("https://www.nepalipaisa.com/");
        WebSettings webSettings = webNepali.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
    @Override
    public void onBackPressed() {
        if (webNepali.canGoBack()) {
            webNepali.goBack();
        } else {
            super.onBackPressed();
        }
    }
}