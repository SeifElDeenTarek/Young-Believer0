package com.example.youngbeliever.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.youngbeliever.R;

public class SplashScreen extends AppCompatActivity
{
    private static int SPLASH_SCREEN_DURATION = 2000;

    Animation splashTopAnim, splashBottomAnim;
    ImageView splashImage;
    TextView splashText;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen_activity);

        splashTopAnim = AnimationUtils.loadAnimation(this, R.anim.splash_screen_top_anim);
        splashBottomAnim = AnimationUtils.loadAnimation(this, R.anim.splash_screen_bottom_anim);

        splashImage = findViewById(R.id.splash_image);
        splashText = findViewById(R.id.splash_text);

        splashImage.setAnimation(splashTopAnim);
        splashText.setAnimation(splashBottomAnim);

        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                Intent intent = new Intent(SplashScreen.this, HomeActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN_DURATION);
    }
}