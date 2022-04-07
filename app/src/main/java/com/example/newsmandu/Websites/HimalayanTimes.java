package com.example.newsmandu.Websites;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.newsmandu.R;

public class HimalayanTimes extends AppCompatActivity {
    private WebView webHimalayan;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_himalayan_times);

        webHimalayan = findViewById(R.id.webHimalayan);
        webHimalayan.setWebViewClient(new WebViewClient());
        webHimalayan.loadUrl("https://www.thehimalayantimes.com/");
        WebSettings webSettings = webHimalayan.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
    @Override
    public void onBackPressed() {
        if (webHimalayan.canGoBack()) {
            webHimalayan.goBack();
        } else {
            super.onBackPressed();
        }
    }
    }
