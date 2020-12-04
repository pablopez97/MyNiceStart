package com.dam.mynicestart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
/**
 *Venta en la que se le solicita al usuario que cumplimente los datos necesarios para poder realizar
 * el registro en la app
 * Cuando le demos al boton de aceptar nos volvera a llevar a la ventana de Login
 * @author Pablo López García
 * @see LoginActivity
 */
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