package com.example.loginregisterrelative

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class newproduct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_newproduct)

        val btn_back =findViewById<Button>(R.id.L_back)

        btn_back.setOnClickListener {
            val intentBack =
                Intent (this, Home::class.java)

            startActivity(intentBack)
        }
    }
}