package com.example.newsmandu.Websites;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.newsmandu.R;

public class ClickDharan extends AppCompatActivity {
    private WebView webCD;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_dharan);

        webCD = findViewById(R.id.webCD);
        webCD.setWebViewClient(new WebViewClient());
        webCD.loadUrl("https://clickdharan.com/");
        WebSettings webSettings = webCD.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
    @Override
    public void onBackPressed() {
        if (webCD.canGoBack()) {
            webCD.goBack();
        } else {
            super.onBackPressed();
        }
    }
}