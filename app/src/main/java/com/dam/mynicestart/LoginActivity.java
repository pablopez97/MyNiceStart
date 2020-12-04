package com.dam.mynicestart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
/**
 *Ventana en la que se comprueban los credenciales de los usuarios contraseña y nombre de usuario
 * @author Pablo López García
 * @see SplashActivity
 */
public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void registro(View view) {

        Intent i = new Intent(this, Registro.class);

        startActivity(i);

    }

    public void pasaAmain(View view) {

        Intent i = new Intent(this, MainActivity.class);

        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);

        startActivity(i);

    }
}