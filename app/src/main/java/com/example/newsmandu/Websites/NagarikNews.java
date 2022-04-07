package com.example.newsmandu.Websites;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.newsmandu.R;

public class NagarikNews extends AppCompatActivity {
    private WebView webNagarik;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nagarik_news);
        webNagarik = findViewById(R.id.webNagarik);
        webNagarik.setWebViewClient(new WebViewClient());
        webNagarik.loadUrl("https://nagariknews.nagariknetwork.com/");
        WebSettings webSettings = webNagarik.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
    @Override
    public void onBackPressed() {
        if (webNagarik.canGoBack()) {
            webNagarik.goBack();
        } else {
            super.onBackPressed();
        }
    }
    }