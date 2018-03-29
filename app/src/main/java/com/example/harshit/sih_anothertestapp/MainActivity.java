package com.example.harshit.sih_anothertestapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView web_view ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        web_view = (WebView)findViewById(R.id.web_view);

        web_view.getSettings().setJavaScriptEnabled(true);

        web_view.setWebChromeClient(new WebChromeClient());

        web_view.setWebViewClient(new WebViewClient() {

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });




        web_view.loadUrl("http://192.168.43.24:5000/markers");



    }
}
