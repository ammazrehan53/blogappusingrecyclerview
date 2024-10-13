package com.example

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.blogappusingrecyclerview.R

class detail1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail1)
        val img1 = intent.getIntExtra("img1", 0)
        val des1 = intent.getStringExtra("des1")
        val longdes = intent.getStringExtra("longdes")

        findViewById<ImageView>(R.id.img1).setImageResource(img1)
        findViewById<TextView>(R.id.des1).text = des1
        findViewById<TextView>(R.id.longdes).text = longdes
    }
}