package com.example.loginregisterrelative

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.bottomsheet.BottomSheetDialog

class newfilm : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_newfilm)

        val btn_back = findViewById<Button>(R.id.back1)

        btn_back.setOnClickListener {
            val intentMain =
                Intent(this, film::class.java)

            startActivity(intentMain)
        }

        lateinit var btnShowBottomSheet: Button

        btnShowBottomSheet = findViewById(R.id.baru);

        btnShowBottomSheet.setOnClickListener{

            val dialog = BottomSheetDialog(this)
            val view = layoutInflater.inflate(R.layout.activity_bottomsheet, null)
            val btnClose = view.findViewById<Button>(R.id.A_back1)

            btnClose.setOnClickListener {
                dialog.dismiss()
            }

            dialog.setCancelable(false)
            dialog.setContentView(view)
            dialog.show()
        }
    }
}
