package com.example.newsmandu.Websites;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.newsmandu.R;

public class GorkhaPatra extends AppCompatActivity {
    private WebView webGorkha;
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gorkha_patra);

        webGorkha = findViewById(R.id.webGorkhaPatra);
        webGorkha.setWebViewClient(new WebViewClient());
        webGorkha.loadUrl("https://www.gorkhapatra.org.np/");
        WebSettings webSettings = webGorkha.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
    @Override
    public void onBackPressed() {
        if (webGorkha.canGoBack()) {
            webGorkha.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
