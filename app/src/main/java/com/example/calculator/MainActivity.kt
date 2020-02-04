package com.example.calculator

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //縦画面で固定
        ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

        val calculatorButton = findViewById<Button>(R.id.calculator_button)
        calculatorButton.setOnClickListener {
            val intent = Intent(this@MainActivity, CalculatorActivity::class.java)
            startActivity(intent)
        }
    }
}
