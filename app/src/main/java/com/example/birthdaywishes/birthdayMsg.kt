package com.example.birthdaywishes

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class birthdayMsg : AppCompatActivity() {

    companion object{
        const val name = "name"
    }

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_msg)

        val name = intent.getStringExtra(name)
        val msgText = findViewById<TextView>(R.id.msgText)
        msgText.text = "Happy Birthday $name"

    }
}