package com.example.myapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.playlist.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonSearchId = findViewById<Button>(R.id.searchId)
        val buttonLibraryId = findViewById<Button>(R.id.libraryId)
        val buttonSettingId = findViewById<Button>(R.id.settingId)
        val buttonClickListener: View.OnClickListener = object : View.OnClickListener {
            override fun onClick(p0: View?) {
                when(p0?.id) {
                    R.id.searchId -> {
                        val intent = Intent(this@MainActivity, SearchActivity::class.java)
                        startActivity(intent)
                    }
                    R.id.libraryId -> {
                        val intent = Intent(this@MainActivity, MediaActivity::class.java)
                        startActivity(intent)
                    }
                    R.id.settingId -> {
                        val intent = Intent(this@MainActivity, SettingActivity::class.java)
                        startActivity(intent)
                        //Toast.makeText(this@MainActivity, "Нажали на настройки!", Toast.LENGTH_SHORT).show()
                    }

                }
            }
        }
        buttonSearchId.setOnClickListener(buttonClickListener)
        buttonLibraryId.setOnClickListener(buttonClickListener)
        buttonSettingId.setOnClickListener(buttonClickListener)

    }
}