package com.hackathon.googlemapcurrentlocation

import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
class getstartedactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_getstarted)
        // Get a reference to the button
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {

            val intent = Intent(this, loginactivity::class.java)

            startActivity(intent)
        }
    }
}