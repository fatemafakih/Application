package com.mucsc2450.fatema.rxc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webview extends AppCompatActivity {
    WebView mwebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        mwebview= (WebView)findViewById(R.id.webview);

        mwebview.getSettings().setJavaScriptEnabled(true);
        mwebview.setWebViewClient(new WebViewClient());
        mwebview.loadUrl("https://www.athletic.net/CrossCountry/School.aspx?SchoolID=36169");

    }
}
