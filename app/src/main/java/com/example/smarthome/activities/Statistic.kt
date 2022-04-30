package com.example.smarthome.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.smarthome.R

class Statistic : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.statistic_mountly)

        val home2 = findViewById<ImageView>(R.id.imageViewhome2);

        home2.setOnClickListener{
            Intent(this, MainActivity::class.java).also{
                startActivity(it)
            }
        }
    }
}