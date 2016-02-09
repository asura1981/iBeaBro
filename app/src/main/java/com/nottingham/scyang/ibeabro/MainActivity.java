package com.nottingham.scyang.ibeabro;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.facebook.Session;


public class MainActivity extends Activity {

    public WebView main_web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        main_web = (WebView) findViewById(R.id.webView);
        main_web.getSettings().setJavaScriptEnabled(true);
        main_web.setWebChromeClient(new WebChromeClient());
        main_web.loadUrl("http://www.yiezi.com/beacons/iBeaCast");
        /*main_web.getSettings().setSupportMultipleWindows(true);
        main_web.setWebViewClient(new WebViewClient(){
            @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url){
                if (url.contains("url")==true){
                    return true;
                }
                return false;
            }
        });*/
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
