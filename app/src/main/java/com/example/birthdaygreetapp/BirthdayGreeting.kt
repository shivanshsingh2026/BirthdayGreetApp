package com.example.birthdaygreetapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BirthdayGreeting : AppCompatActivity() {
    companion object{
        const val Name_Extra = "name"
    }
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)
        val name = intent.getStringExtra(Name_Extra)
        findViewById<TextView>(R.id.birthdaywish).text = "Happy Birthday\n$name !!"
    }
}