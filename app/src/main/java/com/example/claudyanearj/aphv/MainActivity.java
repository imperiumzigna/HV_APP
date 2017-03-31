package com.example.claudyanearj.aphv;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton myImageButton;
    ImageButton xx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myImageButton = (ImageButton) findViewById(R.id.services);

        myImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(MainActivity.this, ServicesActivity.class);
                startActivity(intentLoadNewActivity);
            }
        });


        xx = (ImageButton) findViewById(R.id.btTell);

        xx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadTellActivity = new Intent(MainActivity.this, TellActivity.class);
                startActivity(intentLoadTellActivity);
            }
        });


    }
}
