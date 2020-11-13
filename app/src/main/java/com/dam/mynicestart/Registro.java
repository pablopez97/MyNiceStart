package com.dam.mynicestart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        Intent i = new Intent(this, LoginActivity.class);


    }


    public void vueltaLogin(View view) {

        Intent i = new Intent(this, LoginActivity.class);

        startActivity(i);

    }
}