package com.example.assignment3

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView

class masukaplikasi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_masukaplikasi)
        val username = intent.getStringExtra("username")
        val textView = findViewById<TextView>(R.id.idwelcome)
        textView.text = "Selamat datang, $username!"
    }
}