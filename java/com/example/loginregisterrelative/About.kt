package com.example.loginregisterrelative

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class About : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val btn_back = findViewById<Button>(R.id.A_back)

        btn_back.setOnClickListener {
            val intenBack =
                Intent (this, Home::class.java)

            startActivity(intenBack)
        }
    }
}