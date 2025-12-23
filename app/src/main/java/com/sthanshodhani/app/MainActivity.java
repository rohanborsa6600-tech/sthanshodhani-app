package com.sthanshodhani.app;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView myWebView = new WebView(this);
        setContentView(myWebView);
        
        // वेब सेटिंग्ज (JavaScript चालू करणे)
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        
        // लिंक ॲपमध्येच उघडण्यासाठी
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("https://www.sthanshodhani.com");
    }
    
    // बॅक बटण सेटिंग
    @Override
    public void onBackPressed() {
        WebView myWebView = (WebView) findViewById(android.R.id.content).getRootView();
        if (myWebView.canGoBack()) {
            myWebView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
