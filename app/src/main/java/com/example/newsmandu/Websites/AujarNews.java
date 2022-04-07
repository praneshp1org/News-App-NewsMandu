package com.example.newsmandu.Websites;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.newsmandu.R;

public class AujarNews extends AppCompatActivity {
    private WebView webAujar;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aujar_news);

        webAujar = findViewById(R.id.webAujar);
        webAujar.setWebViewClient(new WebViewClient());
        webAujar.loadUrl("https://www.aujarnews.com/");
        WebSettings webSettings = webAujar.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
    @Override
    public void onBackPressed() {
        if (webAujar.canGoBack()) {
            webAujar.goBack();
        } else {
            super.onBackPressed();
        }
    }
}