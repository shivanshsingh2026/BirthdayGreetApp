package com.example.birthdaygreetapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun createBirthdaycard(view: View) {
        val name = findViewById<EditText>(R.id.Nameinput).editableText.toString()
//        Toast.makeText( this,"name entered was $name", Toast.LENGTH_SHORT).show() -- creates a pop up in bottom
        val intent = Intent(this, BirthdayGreeting::class.java)
        intent.putExtra(BirthdayGreeting.Name_Extra, name)
        startActivity(intent)
    }
}