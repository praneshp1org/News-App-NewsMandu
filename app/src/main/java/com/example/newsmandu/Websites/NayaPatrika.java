package com.example.newsmandu.Websites;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.newsmandu.R;

public class NayaPatrika extends AppCompatActivity {
    private WebView webNaya;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_naya_patrika);

        webNaya = findViewById(R.id.webNayaPatrika);
        webNaya.setWebViewClient(new WebViewClient());
        webNaya.loadUrl("https://www.nayapatrikadaily.com/");
        WebSettings webSettings = webNaya.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
    @Override
    public void onBackPressed() {
        if (webNaya.canGoBack()) {
            webNaya.goBack();
        } else {
            super.onBackPressed();
        }
    }
}