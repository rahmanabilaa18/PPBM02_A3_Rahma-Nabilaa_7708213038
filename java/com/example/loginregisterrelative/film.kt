package com.example.loginregisterrelative

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class film : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_film)

        val btn_back = findViewById<ImageView>(R.id.H_back)

        btn_back.setOnClickListener {
            val intentMain =
                Intent(this, Home::class.java)

            startActivity(intentMain)
        }

        val btn_new = findViewById<Button>(R.id.S_btn_3)

        btn_new.setOnClickListener {
            val intentMain =
                Intent(this, newfilm::class.java)

            startActivity(intentMain)
        }

        val btn_history = findViewById<Button>(R.id.S_btn_4)

        btn_history.setOnClickListener {
            val intentMain =
                Intent(this, purchase::class.java)

            startActivity(intentMain)
        }
    }
}