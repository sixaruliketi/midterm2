package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    private lateinit var welcomeBackTextView : TextView
    private lateinit var numberTextView : TextView
    private lateinit var clickButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        init()
        listeners()
    }

    private fun listeners() {
        clickButton.setOnClickListener {
            var number = numberTextView.text.toString().toInt()
            number--
            numberTextView.text = number.toString()
        }
    }

    private fun init(){
        welcomeBackTextView = findViewById(R.id.welcomeBackTextView)
        numberTextView = findViewById(R.id.numberTextView)
        clickButton = findViewById(R.id.clickButton)

        val email = intent.extras?.getString("EMAIL","")
        welcomeBackTextView.text = "welcome back\n$email"
    }
}