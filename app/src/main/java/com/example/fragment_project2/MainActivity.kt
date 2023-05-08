package com.example.fragment_project2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val firstFragment = Fragment1()
        val btnFragment1 = findViewById<Button>(R.id.btnFragmentOne)
        btnFragment1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.frameLayout, firstFragment).commit()
            }
        }
        val secondFragment = Fragment2()
        val btnFragment2 = findViewById<Button>(R.id.btnFragmentTwo)
        btnFragment2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.frameLayout, secondFragment).commit()

            }
        }
    }
}
