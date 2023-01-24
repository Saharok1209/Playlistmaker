package com.example.playlist

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class SettingActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)
        val arrowBackId = findViewById<ImageView>(R.id.arrow_back)
        arrowBackId.setOnClickListener{
            finish()
        }
    }
}