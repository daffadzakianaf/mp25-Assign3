package com.example.assignment3

import android.content.Intent
import android.os.Bundle
import android.text.InputType
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var isPasswordVisible = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameField = findViewById<EditText>(R.id.idname)
        val passField = findViewById<EditText>(R.id.idpass)
        val loginBtn = findViewById<Button>(R.id.btn_1)
        val daftarTextView = findViewById<TextView>(R.id.idrgst)
        val togglePassword = findViewById<ImageView>(R.id.togglePassword)

        togglePassword.setOnClickListener {
            isPasswordVisible = !isPasswordVisible
            if (isPasswordVisible) {
                passField.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
                togglePassword.setImageResource(R.drawable.openeye)
            } else {
                passField.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
                togglePassword.setImageResource(R.drawable.hideeye)
            }
            passField.setSelection(passField.text.length)
        }

        loginBtn.setOnClickListener {
            val name = nameField.text.toString().trim()
            val pass = passField.text.toString().trim()

            if (name.isEmpty() || pass.isEmpty()) {
                Toast.makeText(this, "Nama dan password wajib diisi", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, masukaplikasi::class.java)
                intent.putExtra("username", name)
                startActivity(intent)
            }
        }

        daftarTextView.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}
