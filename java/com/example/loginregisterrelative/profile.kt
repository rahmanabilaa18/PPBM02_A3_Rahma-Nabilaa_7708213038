package com.example.loginregisterrelative

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class profile : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val btn_back = findViewById<Button>(R.id.P_back)

        btn_back.setOnClickListener {
            val intentBack =
                Intent (this, Home::class.java)

            startActivity(intentBack)
        }

        val btn_mutual = findViewById<Button>(R.id.mutual)

        btn_mutual.setOnClickListener {
            val intentBack =
                Intent (this, list_view::class.java)

            startActivity(intentBack)
        }
    }
}