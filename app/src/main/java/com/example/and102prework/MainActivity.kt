package com.example.and102prework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.elmoButton)
        button.setOnClickListener {                 //This is what happens once the button is clicked.
            Log.v("Elmo's World", "Button was clicked!!")
            Toast.makeText(this, "Elmo wants you to do your best! You've got this!", Toast.LENGTH_SHORT).show()
        }
    }
}