package com.example.newsmandu.Websites;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.newsmandu.R;

public class OnlineKhabar extends AppCompatActivity {
    private WebView webratopati;
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online);


        webratopati = findViewById(R.id.webRatopati);
        webratopati.setWebViewClient(new WebViewClient());
        webratopati.loadUrl("https://www.onlinekhabar.com/");
        WebSettings webSettings = webratopati.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
    @Override
    public void onBackPressed() {
        if (webratopati.canGoBack()) {
            webratopati.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
