package com.example.tashi_tsering.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Webview extends AppCompatActivity {


    WebView ourBrow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        ourBrow = (WebView) findViewById(R.id.webView);
        ourBrow.getSettings().setJavaScriptEnabled(true); // using java script feature in app
        ourBrow.setWebViewClient(new MyBrowser());
        ourBrow.loadUrl("http://www.telusko.com");

    }

    // allow the web page view in mobile app only

    private class MyBrowser extends WebViewClient
    {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {

            view.loadUrl(url);
            return true;
        }
    }
}
