package com.hackathon.googlemapcurrentlocation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class offmallactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_offmallactivity)
        val but = findViewById<Button>(R.id.servicebutton)

        but.setOnClickListener {

            val intent = Intent(this, mallactivity::class.java)

            startActivity(intent)
        }
        val but1 = findViewById<Button>(R.id.offeringbutton)

        but1.setOnClickListener {

            val intent = Intent(this, offmallactivity::class.java)

            startActivity(intent)
        }
        val button = findViewById<Button>(R.id.btn1)

        button.setOnClickListener {

            val intent = Intent(this, bankactivity::class.java)

            startActivity(intent)
        }
        val button1 = findViewById<Button>(R.id.btn2)

        button1.setOnClickListener {

            val intent = Intent(this, mallactivity::class.java)

            startActivity(intent)
        }
        val button3 = findViewById<Button>(R.id.btn3)

        button3.setOnClickListener {

            val intent = Intent(this, shopactivity::class.java)

            startActivity(intent)
        }
        val button4 = findViewById<Button>(R.id.btn4)

        button4.setOnClickListener {

            val intent = Intent(this, atmactivity::class.java)

            startActivity(intent)
        }
        val button5 = findViewById<Button>(R.id.btn5)

        button5.setOnClickListener {

            val intent = Intent(this, healthactivity::class.java)

            startActivity(intent)
        }
    }
}