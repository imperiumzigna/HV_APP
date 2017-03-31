package com.example.claudyanearj.aphv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        for (int i =0; i<20000; i++){

            Log.i("LOG","i: "+i);
        }


        //Background tasks
        startActivity(new Intent(this,MainActivity.class));

    }
}
