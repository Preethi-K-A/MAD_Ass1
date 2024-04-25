package com.example.exp2

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val tv : TextView = findViewById(R.id.txt)
        val btn1 : Button = findViewById(R.id.button1)
        val btn2 : Button = findViewById(R.id.button2)
        var x : Int = 0
        btn1.setOnClickListener {
            x++
            tv.text = x.toString()
        }
        btn2.setOnClickListener {
            x--
            tv.text = x.toString()
        }
    }
}