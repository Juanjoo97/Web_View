package com.example.myapp20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView MyApp;
    String url="https://app-proyecto2021.web.app/#/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyApp=(WebView)findViewById(R.id.MyApp);
        MyApp.setWebViewClient(new WebViewClient());
        MyApp.loadUrl(url);
        WebSettings ajusvisorweb=MyApp.getSettings();
        ajusvisorweb.setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if (MyApp.canGoBack()){
            MyApp.goBack();
        } else {
            super.onBackPressed();
        }
    }
}