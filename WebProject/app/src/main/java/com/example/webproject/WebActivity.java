package com.example.webproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        webView=findViewById(R.id.webView);
        String getUrl=getIntent().getExtras().getString("url");


        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.loadUrl("http://" + getUrl);
    }


    public void gotoback(View view) {
//        super.onBackPressed();
        if(webView.canGoBack()){
            webView.goBack();
        }
        else{
            finish();
        }
    }

    public void gotohome(View view) {
        Intent intent=new Intent(WebActivity.this,MainActivity.class);
        startActivity(intent);
    }

    public void closetheweb(View view) {
        this.finish();
    }
}