package com.example.newsmandu.Websites;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.newsmandu.R;

public class BBCNepali extends AppCompatActivity {
    private WebView webBBC;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_b_c_nepali);

        webBBC = findViewById(R.id.webBBC);
        webBBC.setWebViewClient(new WebViewClient());
        webBBC.loadUrl("https://www.bbc.com/nepali");
        WebSettings webSettings = webBBC.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
    @Override
    public void onBackPressed() {
        if (webBBC.canGoBack()) {
            webBBC .goBack();
        } else {
            super.onBackPressed();
        }
    }
}