package com.pratyay.multiplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread thread = new Thread(){
            public void run() {
                try {
                    sleep(2000);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                finally{
                    Intent i = new Intent(splash.this, FscreenActivityActivity.class);
                    startActivity(i);
                }
            }

        };thread.start();
    }
}