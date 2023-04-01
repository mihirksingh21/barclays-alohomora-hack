package com.hackathon.googlemapcurrentlocation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class offbankactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_offbankactivity)
        val button = findViewById<Button>(R.id.servicebutton)

        button.setOnClickListener {

            val intent = Intent(this, bankactivity::class.java)

            startActivity(intent)
        }
        val button1 = findViewById<Button>(R.id.offeringbutton)

        button1.setOnClickListener {

            val intent = Intent(this, offbankactivity::class.java)

            startActivity(intent)
        }
    }
}