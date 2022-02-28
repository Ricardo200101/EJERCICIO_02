package com.example.ejercicio_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class pantalla3 extends AppCompatActivity {

    // Declaracion de variables al usar

    MediaPlayer  m6, m7, m8, m9, m10;
    ImageButton btnSonido6, btnSonido7, btnSonido8, btnSonido9, btnSonido10;
    Button iratras1, iracuantro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla3);

        // Declaraccion de accion que le vamos a dar a los botones

        btnSonido6 = (ImageButton) findViewById(R.id.btn8);
        m6 = MediaPlayer.create(this,R.raw.seis);
        btnSonido6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                m6.start();
            }
        });

        btnSonido7 = (ImageButton) findViewById(R.id.btn9);
        m7 = MediaPlayer.create(this,R.raw.siete);
        btnSonido7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                m7.start();
            }
        });

        btnSonido8 = (ImageButton) findViewById(R.id.btn10);
        m8 = MediaPlayer.create(this,R.raw.ocho);
        btnSonido8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                m8.start();
            }
        });

        btnSonido9 = (ImageButton) findViewById(R.id.btn11);
        m9 = MediaPlayer.create(this,R.raw.nueve);
        btnSonido9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                m9.start();
            }
        });

        btnSonido10 = (ImageButton) findViewById(R.id.btn12);
        m10 = MediaPlayer.create(this,R.raw.dies);
        btnSonido10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                m10.start();
            }
        });

        // Botones de regresar y sigueinte

        iratras1=(Button) findViewById(R.id.btn14);
        iratras1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iratrasdos = new Intent(getApplicationContext(), pantalla2.class);
                startActivity(iratrasdos);
            }
        });

        iracuantro=(Button)  findViewById(R.id.btn13);
        iracuantro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iracuatro = new Intent(getApplicationContext(), pantalla4.class);
                startActivity(iracuatro);
            }
        });









    }
}