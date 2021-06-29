package com.example.myfirstapplication.calendario

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.myfirstapplication.PantallaPrincipalMenu
import com.example.myfirstapplication.R
import com.example.myfirstapplication.R.id.imageButton

class Recordatorio : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recordatorio)

        val textUsuario = findViewById<TextView>(R.id.textUsuario)
        val buttonBorrar = findViewById<TextView>(R.id.butonBorar)
        val buttonGuardar = findViewById<TextView>(R.id.buttonGuardar)
        val imageButton = findViewById<Button>(imageButton)


        imageButton.setOnClickListener {
            val intent = Intent(this, PantallaPrincipalMenu::class.java)
            startActivity(intent)
        }

    }
}