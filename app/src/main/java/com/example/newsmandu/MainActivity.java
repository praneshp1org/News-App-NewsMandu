package com.example.newsmandu;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.newsmandu.Websites.AujarNews;
import com.example.newsmandu.Websites.BBCNepali;
import com.example.newsmandu.Websites.BlastTimes;
import com.example.newsmandu.Websites.ClickDharan;
import com.example.newsmandu.Websites.GorkhaPatra;
import com.example.newsmandu.Websites.HimalayanTimes;
import com.example.newsmandu.Websites.Kantipur;
import com.example.newsmandu.Websites.NagarikNews;
import com.example.newsmandu.Websites.NayaPatrika;
import com.example.newsmandu.Websites.NepaliPaisa;
import com.example.newsmandu.Websites.OnlineKhabar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Kantipur(View view) {
        Intent kantipurOpen = new Intent(MainActivity.this, Kantipur.class);
        startActivity(kantipurOpen);
    }

    public void Himlayan(View view) {
        Intent himalayanOpen = new Intent(MainActivity.this, HimalayanTimes.class);
        startActivity(himalayanOpen);
    }

    public void Gorkha(View view) {
        Intent gorkhaOpen = new Intent(MainActivity.this, GorkhaPatra.class);
        startActivity(gorkhaOpen);
    }

    public void onlineK(View view) {
        Intent ratopatiOpen = new Intent(MainActivity.this, OnlineKhabar.class);
        startActivity(ratopatiOpen);
    }

    public void blast(View view) {
        Intent blastOpen = new Intent(MainActivity.this, BlastTimes.class);
        startActivity(blastOpen);
    }

    public void naya(View view) {
        Intent nayaOpen = new Intent(MainActivity.this, NayaPatrika.class);
        startActivity(nayaOpen);
    }

    public void Nepse(View view) {
        Intent NepaliOpen = new Intent(MainActivity.this, NepaliPaisa.class);
        startActivity(NepaliOpen);
    }

    public void aujar(View view) {
        Intent aujarOpen = new Intent(MainActivity.this, AujarNews.class);
        startActivity(aujarOpen);
    }

    public void bbcN(View view) {
        Intent openBBc = new Intent(MainActivity.this, BBCNepali.class);
        startActivity(openBBc);
    }

    public void Nagarik(View view) {
        Intent openNagarik = new Intent(MainActivity.this, NagarikNews.class);
        startActivity(openNagarik);
    }

    public void clickDharan(View view) {
        Intent openCD = new Intent(MainActivity.this, ClickDharan.class);
        startActivity(openCD);
    }

}