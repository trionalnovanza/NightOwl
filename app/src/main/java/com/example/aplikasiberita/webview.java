package com.example.aplikasiberita;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class webview extends AppCompatActivity {

    private WebView webView;
    String url = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        webView = findViewById(R.id.webview);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        Intent intent= getIntent();

        String url = intent.getStringExtra("file");

        webView.loadUrl("file:///android_asset/"+url+".html");
        webView.setWebViewClient(new WebViewClient());


       //url = getIntent().getStringExtra("URL NAME");
        // webView.loadUrl(url);
        // webView.getSettings().setJavaScriptEnabled(true);
        // webView.setWebViewClient(new WebViewClient());
        // webView.setWebChromeClient(new WebChromeClient(){
        //    @Override
        //    public void onProgressChanged(WebView view, int newProgress) {
        //        super.onProgressChanged(view, newProgress);
        //   }

        //  @Override
        //   public void onReceivedTitle(WebView view, String title) {
        //       super.onReceivedTitle(view, title);
        //    }
        //  });
        //}

        //@Override
        // public void onBackPressed() {
        //   if(webView.canGoBack()){
        //       webView.goBack();
        //   }else {
        //       finish();
        //    }
    }
}