package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.playlist.R

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