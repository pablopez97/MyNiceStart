package com.dam.mynicestart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
/**
 *Clase hijo del MainActivity que tiene una flecha en la parte superior izquierda que nos hara volver
 * a la ventanta padre
 * @author Pablo López García
 * @see MainActivity
 */
public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}