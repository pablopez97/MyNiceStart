package com.dam.mynicestart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class SplashActivity extends AppCompatActivity {

    ImageView imgview2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ImageView myLogo = (ImageView) findViewById(R.id.imageView2);
        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.fadein);
        myLogo.startAnimation(myanim);

        TextView myTitulo = (TextView) findViewById(R.id.titulo);
        //Animation myanim2 = AnimationUtils.loadAnimation(this, R.anim.fadein);
        myTitulo.startAnimation(myanim);



        imgview2 = findViewById(R.id.imgfondo);

        Glide.with(this)
                .load(R.drawable.skyline)
                .into(imgview2);

        openApp(true);
    }

    private void openApp(boolean locationPermission) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, 5000);
    }
}