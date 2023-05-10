package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var enterEmailEditText : EditText
    private lateinit var okayButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        listeners()
    }

    private fun listeners() {
        okayButton.setOnClickListener {
            Toast.makeText(this, "you clicked!", Toast.LENGTH_SHORT).show()
        }
        okayButton.setOnLongClickListener {
            val email = enterEmailEditText.text.toString()
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            intent.putExtra("EMAIL",email)
            startActivity(intent)
            true
        }
    }

    private fun init(){
        enterEmailEditText = findViewById(R.id.enterEmailEditText)
        okayButton = findViewById(R.id.okayButton)
    }
}