package com.example.midrerm;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.Toast;

public class third2 extends second {
    WebView web;
    private ImageButton call;
    WebSettings webSettings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web2);
        Toast.makeText(getApplicationContext(),"onCreate(3)",Toast.LENGTH_LONG).show();

        web = findViewById(R.id.webView2);
        webSettings = web.getSettings();
        webSettings.setJavaScriptEnabled(true);//開啟javascript功能
        web.setWebViewClient(new WebViewClient());

        call = findViewById(R.id.imageButton4);
        call.setOnClickListener(callOnClickListener);
        web.loadUrl("https://fundanantou.pixnet.net/blog/post/214535954-%E3%80%90%E6%9B%B8%E5%8C%85%E5%AE%A2super-go%E3%80%91%2A%E9%81%8A%E5%9F%94%E9%87%8C%22%E6%A1%83%E7%B1%B3%E7%94%9F%E6%85%8B%E6%9D%91-%E3%80%88%E8%B7%AF%E7%B7%9A/");

    }

    private View.OnClickListener callOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(view.getId() == R.id.imageButton4) {
                Uri uri = Uri.parse("tel:0911123456");
                Intent intent = new Intent(Intent.ACTION_DIAL,uri);
                startActivity(intent);
            }
        }
    };
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(),"onStart(3)",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(),"onRestart(3)",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(),"onResume(3)",Toast.LENGTH_LONG).show();

    }


    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(),"onPause(3)",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(),"onStop(3)",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"onDestroy(3)",Toast.LENGTH_LONG).show();
    }
}
