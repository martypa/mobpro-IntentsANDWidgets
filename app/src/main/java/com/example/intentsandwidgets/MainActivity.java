package com.example.intentsandwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void startBrowseronClick(View Btn){
        Intent browserCall = new Intent();
        browserCall.setAction(Intent.ACTION_VIEW);
        browserCall.setData(Uri.parse("https://www.hslu.ch/de-ch/"));
        startActivity(browserCall);
    }







}
