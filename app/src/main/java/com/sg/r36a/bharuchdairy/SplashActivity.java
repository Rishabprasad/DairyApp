package com.sg.r36a.bharuchdairy;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.content.res.ResourcesCompat;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 3000;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Typeface typeface = ResourcesCompat.getFont(this, R.font.blacklist);
        imageView = findViewById(R.id.logo);
        TextView appname= findViewById(R.id.appname);
        appname.setTypeface(typeface);



        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                startActivity(new Intent(SplashActivity.this,MainActivity.class));
                finish();
            }
        }, SPLASH_TIME_OUT);
    }

    @Override
    public void onResume() {
        super.onResume();
        ((AppCompatActivity)this).getSupportActionBar().hide();
    }
    @Override
    public void onStop() {
        super.onStop();
        ((AppCompatActivity)this).getSupportActionBar().show();
    }
}
