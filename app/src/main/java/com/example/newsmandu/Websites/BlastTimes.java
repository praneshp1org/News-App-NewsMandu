package com.example.newsmandu.Websites;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.newsmandu.R;

public class BlastTimes extends AppCompatActivity {
    private WebView webBlast;
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blast_times);

        webBlast = findViewById(R.id.weBlast);
        webBlast.setWebViewClient(new WebViewClient());
        webBlast.loadUrl("https://www.blastkhabar.com/");
        WebSettings webSettings = webBlast.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
    @Override
    public void onBackPressed() {
        if (webBlast.canGoBack()) {
            webBlast.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
