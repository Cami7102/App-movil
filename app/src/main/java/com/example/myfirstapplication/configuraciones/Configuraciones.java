package com.example.myfirstapplication.configuraciones;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.example.myfirstapplication.MainActivity;
import com.example.myfirstapplication.R;
import com.example.myfirstapplication.configuracion.configuraciones.CambiarContrasenia;
import com.example.myfirstapplication.configuracion.configuraciones.EliminarUsuario;
import com.example.myfirstapplication.configuracion.configuraciones.Fondo;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;


import java.util.HashMap;
import java.util.Map;

public class Configuraciones extends AppCompatActivity {

    Button colores;
    Button fondos;
    Button cambiarpasses;
    Button editarperfiles;
    Button borrares;
    Button guardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuraciones);
        Map<String,String> mapa= new HashMap<>();

        guardar=(Button)findViewById(R.id.guardar);
        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent guardar;
                guardar = new Intent(Configuraciones.this, MainActivity.class);
                startActivity(guardar);
            }
        });

        colores=(Button)findViewById(R.id.colores);
        colores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent colores = new Intent(Configuraciones.this, Color.class);
                startActivity(colores);
            }
        });


        fondos=(Button)findViewById(R.id.fondos);
        fondos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                Intent fondos = new Intent(Configuraciones.this, Fondo.class);
                startActivity(fondos);
            }
        });




        cambiarpasses=(Button)findViewById(R.id.cambiarpasses);
        cambiarpasses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v3) {
                Intent cambiarpasses = new Intent(Configuraciones.this, CambiarContrasenia.class);
                startActivity(cambiarpasses);
            }
        });


        borrares=(Button)findViewById(R.id.borrares);
        borrares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v6) {
                Intent borrares = new Intent(Configuraciones.this, EliminarUsuario.class);
                startActivity(borrares);
            }
        });

    }
}