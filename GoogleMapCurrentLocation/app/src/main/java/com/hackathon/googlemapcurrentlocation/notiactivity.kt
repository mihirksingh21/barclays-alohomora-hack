package com.hackathon.googlemapcurrentlocation

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

public class notiactivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.text_view_id) as TextView
        textView.setOnClickListener {
            Toast.makeText(
                this@notiactivity,
                R.string.text_on_click, Toast.LENGTH_LONG
            ).show()
        }

    }
}
