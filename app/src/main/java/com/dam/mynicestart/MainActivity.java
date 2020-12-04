package com.dam.mynicestart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imagenGirl = findViewById(R.id.imageView3);

        Glide.with(this).load(R.drawable.girl).circleCrop().into(imagenGirl);

    }

    public void pasarAmain2(View view) {

        Intent i = new Intent(this, MainActivity2.class);

        startActivity(i);



    }
}