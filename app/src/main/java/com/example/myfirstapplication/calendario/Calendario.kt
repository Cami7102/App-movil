package com.example.myfirstapplication.calendario

import android.content.Intent
import android.database.Cursor
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CalendarContract
import android.widget.Button
import android.widget.TextView
import com.example.myfirstapplication.R

class Calendario : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calendario)

        val calendarView = findViewById<TextView>(R.id.calendarView)
        val ConstraintLayout = findViewById<TextView>(R.id.calendar)


        fun añadirEvento(title: String, location: String, begin: Long, end: Long) {
            val intent = Intent(Intent.ACTION_INSERT).apply {
                data = CalendarContract.Events.CONTENT_URI
                putExtra(CalendarContract.Events.TITLE, title)
                putExtra(CalendarContract.Events.EVENT_LOCATION, location)
                putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, begin)
                putExtra(CalendarContract.EXTRA_EVENT_END_TIME, end)
            }
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            }
        }
        val uri: Uri = CalendarContract.Calendars.CONTENT_URI
        val selection: String = "((${CalendarContract.Calendars.ACCOUNT_NAME} = ?) AND (" +
                "${CalendarContract.Calendars.ACCOUNT_TYPE} = ?) AND (" +
                "${CalendarContract.Calendars.OWNER_ACCOUNT} = ?))"
        val selectionArgs: Array<String> = arrayOf("hera@example.com", "com.example", "hera@example.com")
        val EVENT_PROJECTION = null
        val cur: Cursor? = contentResolver.query(uri, EVENT_PROJECTION, selection, selectionArgs, null)
    }

}