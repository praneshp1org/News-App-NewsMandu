package com.example.newsmandu.Websites;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.newsmandu.R;

public class Kantipur extends AppCompatActivity {
    private WebView webKantipur;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kantipur);

        webKantipur= findViewById(R.id.webKantipur);
        webKantipur.setWebViewClient(new WebViewClient());
        webKantipur.loadUrl("https://ekantipur.com/");
        WebSettings webSettings = webKantipur.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
    @Override
    public void onBackPressed() {
        if (webKantipur.canGoBack()) {
            webKantipur.goBack();
        } else {
            super.onBackPressed();
        }
    }

    }