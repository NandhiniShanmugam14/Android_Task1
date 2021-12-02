package com.example.androidtask1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickCountDisplayView = findViewById<TextView>(R.id.clickCountView)
        val redButton = findViewById<TextView>(R.id.clickRedButton)
        val greenButton = findViewById<TextView>(R.id.clickGreenButton)
        val blueButton = findViewById<TextView>(R.id.clickBlueButton)

        redButton.setOnClickListener{
            clickCountDisplayView.text = "Red was clicked"
        }
        greenButton.setOnClickListener{
            clickCountDisplayView.text = "Green was clicked"
        }
        blueButton.setOnClickListener {
            clickCountDisplayView.text = "Blue was clicked"
        }
    }
}