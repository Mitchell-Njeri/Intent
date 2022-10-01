package com.example.intents

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val zalego = Intent(Intent.ACTION_VIEW, Uri.parse("https://zalegoacademy.ac.ke"))
        if (zalego.resolveActivity(packageManager)!=null) {
            startActivity(zalego)
        }


        val button = findViewById<Button>(R.id.button4)
        button.setOnClickListener {
            val button=Intent(this, HomeActivity::class.java)
            startActivity(button)
        }
    }
}