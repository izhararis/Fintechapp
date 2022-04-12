package com.praktikum.fintech

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btnHome : Button
    private lateinit var btnProfile : Button
    private lateinit var btnSettings : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHome = findViewById(R.id.btn_home)
        btnProfile = findViewById(R.id.btn_profile)
        btnSettings = findViewById(R.id.btn_settings)

        btnHome.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("username", "izhar")
            startActivity(intent)
        }


    }
}