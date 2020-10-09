package com.example.cookieclicker

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    internal  var score = 0

    internal lateinit var cookieClicker: Button
    internal lateinit var counter: TextView

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_main)
        cookieClicker = findViewById(R.id.cookieClicker)
        counter = findViewById(R.id.counter)

        cookieClicker.setOnClickListener {
            incrementScore()
        }
    }

    @SuppressLint("StringFormatInvalid")
    private fun incrementScore(){
        score += 1
        val newCookies = getString(R.string.yourCookieScore, score)
        counter.text = newCookies

    }
}