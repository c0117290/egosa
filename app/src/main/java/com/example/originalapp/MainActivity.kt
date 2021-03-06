package com.example.originalapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        aviationButton.setOnClickListener {
            val intent = Intent(applicationContext, EnglishContentsActivity::class.java)
            intent.putExtra("title_num",0)
            startActivity(intent)
        }
        hotelButton.setOnClickListener {
            val intent = Intent(applicationContext, EnglishContentsActivity::class.java)
            intent.putExtra("title_num",1)
            startActivity(intent)
        }
        moveButton.setOnClickListener {
            val intent = Intent(applicationContext, EnglishContentsActivity::class.java)
            intent.putExtra("title_num",2)
            startActivity(intent)
        }
    }
}