package com.example.birthdaywishes

import android.content.Intent
import android.health.connect.datatypes.units.Length
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun getwish(view: View) {

        val btn = findViewById<Button>(R.id.button)
        val name = findViewById<TextView>(R.id.name)
        val nameInput = name.editableText.toString()
        val intent = Intent(this,birthdayMsg::class.java)
        intent.putExtra(birthdayMsg.name,nameInput)
        startActivity(intent)
    }
}