package com.example.myfirstapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.myfirstapplication.inicio.Usuario as Usuario1

class MainActivity : AppCompatActivity() {

    val databaseController = DatabaseController(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //vista de la pantalla "activity_main"
        val textoBienvenido = findViewById<TextView>(R.id.textViewBienvenido)
        val imagenLogo = findViewById<ImageView>(R.id.imageViewLostAllHope)
        val textoNombre = findViewById<TextView>(R.id.textViewNombreApodo)
        val ingresarNombre = findViewById<EditText>(R.id.editTextNombreUsuario)
        val textoContrasena = findViewById<TextView>(R.id.editTextTextPassword)
        val buttonSiguiente = findViewById<Button>(R.id.buttonSiguiente)

        buttonSiguiente.setOnClickListener {
            Toast.makeText(this, "REGISTRADO", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, NotaUno::class.java)
            startActivity(intent)
            databaseController.agregarUsuario()
            }
        }
    }

private fun DatabaseController.agregarUsuario() {
}
