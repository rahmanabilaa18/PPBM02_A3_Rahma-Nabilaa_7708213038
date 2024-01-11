package com.example.loginregisterrelative

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class bottomsheet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottomsheet)

        val btn_balik = findViewById<Button>(R.id.A_back1)

        btn_balik.setOnClickListener {
            val intentMain =
                Intent(this, slidetoact::class.java)

            startActivity(intentMain)
        }
    }
}