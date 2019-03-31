package com.example.intentsandwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MyBrowserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_browser);

        WebView webView = (WebView)findViewById(R.id.webView);
        webView.loadUrl(getIntent().getDataString());


    }
}
