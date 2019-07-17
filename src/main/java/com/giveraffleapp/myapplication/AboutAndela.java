package com.giveraffleapp.myapplication;

import android.app.ProgressDialog;
import android.os.Bundle;



import androidx.appcompat.app.AppCompatActivity;


import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutAndela extends AppCompatActivity {


    private WebView myWebview;
    // private final String url = "https://andela.com/alc/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_about_andela);
        getWindow().setStatusBarColor(getResources().getColor(R.color.Andela_blue));


//        WebView myWebView = new WebView(this);
//        setContentView(myWebView);
//        myWebView.loadUrl(url);
        //Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
//        ProgressDialog progDailog = ProgressDialog.show(this, "Loading", "Please wait...", true);
//        progDailog.setCancelable(true);
//        progDailog.show();

        String andelaUrl = getIntent().getStringExtra("urls");
        myWebview = findViewById(R.id.webview);
        WebSettings nab = myWebview.getSettings();
        nab.setJavaScriptEnabled(true);
        nab.setLoadsImagesAutomatically(true);
        myWebview.loadUrl(andelaUrl);
        myWebview.setWebViewClient(new WebViewClient());




        //  myWebview.loadUrl("https://andela.com/alc/");
        //setContentView(myWebview);


    }


//    private class myBrowser extends WebViewClient {
//        @Override
//        public boolean shouldOverrideUrlLoading(WebView view, String url) {
//            return super.shouldOverrideUrlLoading(view, url);
        }



