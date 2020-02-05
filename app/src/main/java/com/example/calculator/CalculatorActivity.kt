package com.example.calculator

import android.content.pm.ActivityInfo
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calculator.*

class CalculatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        //縦画面で固定
        ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

        val calculateAreaText = calculate_area
        val outputAreaText = output_area
        val button00 = number_0_button
        val button01 = number_1_button
        val button02 = number_2_button
        val button03 = number_3_button
        val button04 = number_4_button
        val button05 = number_5_button
        val button06 = number_6_button
        val button07 = number_7_button
        val button08 = number_8_button
        val button09 = number_9_button
        calculateAreaText.setBackgroundColor(Color.WHITE)
        outputAreaText.setBackgroundColor(Color.WHITE)

        button00.setOnClickListener {
            calculateAreaText.text = "0"
        }
        button01.setOnClickListener {

        }
        button02.setOnClickListener {

        }
        button03.setOnClickListener {

        }
        button04.setOnClickListener {

        }
        button05.setOnClickListener {

        }
        button06.setOnClickListener {

        }
        button07.setOnClickListener {

        }
        button08.setOnClickListener {

        }
        button09.setOnClickListener {

        }

    }
}
