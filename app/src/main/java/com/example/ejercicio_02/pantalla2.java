package com.example.ejercicio_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class pantalla2 extends AppCompatActivity {


    MediaPlayer m, m1, m2, m3, m4;
    ImageButton btnSonido, btnSonido1, btnSonido2, btnSonido3, btnSonido4;
    Button iratres, iratras2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        btnSonido = (ImageButton) findViewById(R.id.btn2);
        m = MediaPlayer.create(this,R.raw.uno);
        btnSonido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                m.start();
            }
        });


        btnSonido1 = (ImageButton) findViewById(R.id.btn3);
        m1 = MediaPlayer.create(this,R.raw.dos);
        btnSonido1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                m1.start();
            }
        });

        btnSonido2 = (ImageButton) findViewById(R.id.btn4);
        m2 = MediaPlayer.create(this,R.raw.tres);
        btnSonido2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                m2.start();
            }
        });

        btnSonido3 = (ImageButton) findViewById(R.id.btn5);
        m3 = MediaPlayer.create(this,R.raw.cuatro);
        btnSonido3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                m3.start();
            }
        });

        btnSonido4 = (ImageButton) findViewById(R.id.btn6);
        m4 = MediaPlayer.create(this,R.raw.cinco);
        btnSonido4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                m4.start();
            }
        });

        iratres=(Button) findViewById(R.id.btn7);
        iratres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pantatres = new Intent(getApplicationContext(), pantalla3.class);
                startActivity(pantatres);
            }
        });

        iratras2=(Button) findViewById(R.id.btn15);
        iratras2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iratrasuno = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(iratrasuno);
            }
        });





    }
}