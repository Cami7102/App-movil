package com.example.myfirstapplication.calendario

import android.content.Intent
import android.os.Bundle
import android.provider.CalendarContract
import android.widget.CalendarView
import androidx.appcompat.app.AppCompatActivity
import com.example.myfirstapplication.R
import java.util.*

class Calendario : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calendario)

        val calendarView = findViewById<CalendarView>(R.id.calendarView)
        calendarView.setOnDateChangeListener { view, year, month, dayOfMonth ->
            val cal = GregorianCalendar(year, month, dayOfMonth)
            val millis: Long = cal.getTimeInMillis()
            anadirEvento("Recordatorio", millis, millis)
        }
    }

    fun anadirEvento(title: String, begin: Long, end: Long) {
        val intent = Intent(Intent.ACTION_INSERT).apply {
            data = CalendarContract.Events.CONTENT_URI
            putExtra(CalendarContract.Events.TITLE, title)
            putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, begin)
            putExtra(CalendarContract.EXTRA_EVENT_END_TIME, end)
        }
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }
}