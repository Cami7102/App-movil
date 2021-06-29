package com.example.myfirstapplication

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.widget.CalendarView
import android.widget.TextView
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.MenuItemCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.example.myfirstapplication.calendario.Calendario
import android.content.Intent as Intent
import android.view.MenuItem as ViewMenuItem

class PantallaPrincipalMenu: AppCompatActivity(){

    lateinit var toolbar: androidx.appcompat.widget.Toolbar
    lateinit var drawerLayout: DrawerLayout
    val databaseController = DatabaseController(this)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pantalla_principal_menu)

        val listaMensajes = listOf(
            "Cuando menos lo esperamos, la vida nos coloca delante un desafío que pone a prueba nuestro coraje y nuestra voluntad de cambio. Paulo Coelho",
            "Piensa en lo peor que te podría suceder y después da gracias a Dios por lo bien que estás. Dale Carnegie",
            "No te compares con nadie, ten la cabeza bien alta y recuerda, no eres ni mejor ni peor, simplemente eres TU y eso nadie lo puede superar.",
            "La vida te da la oportunidad de escribir, corregir y mejorar tu historia todos los días.",
            "Abandonar puede tener justificación; abandonarse, no la tiene jamás. Ralph Waldo Emerson",
            "Por muy larga que sea la tormenta, el sol siempre vuelve a brillar entre las nubes. Khalif Gihrn",
            "Sabemos lo que somos, pero aún no sabemos lo que podemos llegar a ser. William Shakespeare")

        val mensajeAleatorio = listaMensajes.random()

        val calendario = findViewById<Toolbar>(R.id.menu_item_Calendario)
        val diario = findViewById<Toolbar>(R.id.menu_item_Diario)
        val confi = findViewById<Toolbar>(R.id.menu_item_Configuracion)
        val perfi = findViewById<Toolbar>(R.id.menu_item_Perfil)
        val contactos = findViewById<Toolbar>(R.id.menu_item_Contactos)

        calendario.setOnClickListener {
            val intent = Intent(this, Calendario::class.java)
            startActivity(intent)
        }

        toolbar = findViewById(R.id.toolbar)
        drawerLayout = findViewById(R.id.drawer_layout)
        toolbar.setOnMenuItemClickListener { menuItem ->
            when(menuItem.itemId){
                R.id.menu_item_Perfil ->{
                    Toast.makeText(this, "Perfil", Toast.LENGTH_SHORT).show()
                }
                R.id.menu_item_Diario ->{
                    Toast.makeText(this, "Diario", Toast.LENGTH_SHORT).show()
                }
                R.id.menu_item_Calendario ->{
                    Toast.makeText(this, "Calendario", Toast.LENGTH_SHORT).show()
                }
                R.id.menu_item_Contactos ->{
                    Toast.makeText(this, "Contactos", Toast.LENGTH_SHORT).show()
                }
                R.id.menu_item_Configuracion ->{
                    Toast.makeText(this, "Configuracion", Toast.LENGTH_SHORT).show()
                }
            }
            true
        }

        toolbar.setNavigationOnClickListener {
            Toast.makeText(this, "DISFRUTA!!", Toast.LENGTH_SHORT).show()
        }

        val toggle = ActionBarDrawerToggle(this, drawerLayout, toolbar,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )
        drawerLayout.addDrawerListener(toggle)
    }


}