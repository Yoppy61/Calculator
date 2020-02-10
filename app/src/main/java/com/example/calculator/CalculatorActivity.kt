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
        outputAreaText.ellipsize
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
        val dotButton = dot_button
        val equalButton = equal_button
        val deleteButton = delete_button
        val divisionButton = division_button
        val multiplicationButton = multiplication_button
        val subtractionButton = subtraction_button
        val additionButton = addition_button
        val calculateAreaStringBuilder = StringBuilder()
        val inputData01StringBuilder = StringBuilder()
        val inputData02StringBuilder = StringBuilder()
        val outputError = "エラー"
        val dot = "."
        var isDotExist = false
        var operatorType = ""
        var buttonNum: Int
        var dotCounter = 0
        //var operatorCounter = 0


        calculateAreaText.setBackgroundColor(Color.WHITE)
        outputAreaText.setBackgroundColor(Color.WHITE)

        button00.setOnClickListener {
            if (operatorType == "") {
                buttonNum = 0
                inputData01StringBuilder.append(buttonNum)
                calculateAreaStringBuilder.append(buttonNum)
                calculateAreaText.text = calculateAreaStringBuilder
            } else {
                buttonNum = 0
                inputData02StringBuilder.append(buttonNum)
                calculateAreaStringBuilder.append(buttonNum)
                calculateAreaText.text = calculateAreaStringBuilder
            }
        }

        button01.setOnClickListener {
            if (operatorType == "") {
                buttonNum = 1
                inputData01StringBuilder.append(buttonNum)
                calculateAreaStringBuilder.append(buttonNum)
                calculateAreaText.text = calculateAreaStringBuilder
            } else {
                buttonNum = 1
                inputData02StringBuilder.append(buttonNum)
                calculateAreaStringBuilder.append(buttonNum)
                calculateAreaText.text = calculateAreaStringBuilder
            }
        }

        button02.setOnClickListener {
            if (operatorType == "") {
                buttonNum = 2
                inputData01StringBuilder.append(buttonNum)
                calculateAreaStringBuilder.append(buttonNum)
                calculateAreaText.text = calculateAreaStringBuilder
            } else {
                buttonNum = 2
                inputData02StringBuilder.append(buttonNum)
                calculateAreaStringBuilder.append(buttonNum)
                calculateAreaText.text = calculateAreaStringBuilder
            }
        }

        button03.setOnClickListener {
            if (operatorType == "") {
                buttonNum = 3
                inputData01StringBuilder.append(buttonNum)
                calculateAreaStringBuilder.append(buttonNum)
                calculateAreaText.text = calculateAreaStringBuilder
            } else {
                buttonNum = 3
                inputData02StringBuilder.append(buttonNum)
                calculateAreaStringBuilder.append(buttonNum)
                calculateAreaText.text = calculateAreaStringBuilder
            }
        }
        button04.setOnClickListener {
            if (operatorType == "") {
                buttonNum = 4
                inputData01StringBuilder.append(buttonNum)
                calculateAreaStringBuilder.append(buttonNum)
                calculateAreaText.text = calculateAreaStringBuilder
            } else {
                buttonNum = 4
                inputData02StringBuilder.append(buttonNum)
                calculateAreaStringBuilder.append(buttonNum)
                calculateAreaText.text = calculateAreaStringBuilder
            }
        }

        button05.setOnClickListener {
            if (operatorType == "") {
                buttonNum = 5
                inputData01StringBuilder.append(buttonNum)
                calculateAreaStringBuilder.append(buttonNum)
                calculateAreaText.text = calculateAreaStringBuilder
            } else {
                buttonNum = 5
                inputData02StringBuilder.append(buttonNum)
                calculateAreaStringBuilder.append(buttonNum)
                calculateAreaText.text = calculateAreaStringBuilder
            }
        }

        button06.setOnClickListener {
            if (operatorType == "") {
                buttonNum = 6
                inputData01StringBuilder.append(buttonNum)
                calculateAreaStringBuilder.append(buttonNum)
                calculateAreaText.text = calculateAreaStringBuilder
            } else {
                buttonNum = 6
                inputData02StringBuilder.append(buttonNum)
                calculateAreaStringBuilder.append(buttonNum)
                calculateAreaText.text = calculateAreaStringBuilder
            }
        }

        button07.setOnClickListener {
            if (operatorType == "") {
                buttonNum = 7
                inputData01StringBuilder.append(buttonNum)
                calculateAreaStringBuilder.append(buttonNum)
                calculateAreaText.text = calculateAreaStringBuilder
            } else {
                buttonNum = 7
                inputData02StringBuilder.append(buttonNum)
                calculateAreaStringBuilder.append(buttonNum)
                calculateAreaText.text = calculateAreaStringBuilder
            }
        }

        button08.setOnClickListener {
            if (operatorType == "") {
                buttonNum = 8
                inputData01StringBuilder.append(buttonNum)
                calculateAreaStringBuilder.append(buttonNum)
                calculateAreaText.text = calculateAreaStringBuilder
            } else {
                buttonNum = 8
                inputData02StringBuilder.append(buttonNum)
                calculateAreaStringBuilder.append(buttonNum)
                calculateAreaText.text = calculateAreaStringBuilder
            }
        }

        button09.setOnClickListener {
            if (operatorType == "") {
                buttonNum = 9
                inputData01StringBuilder.append(buttonNum)
                calculateAreaStringBuilder.append(buttonNum)
                calculateAreaText.text = calculateAreaStringBuilder
            } else {
                buttonNum = 9
                inputData02StringBuilder.append(buttonNum)
                calculateAreaStringBuilder.append(buttonNum)
                calculateAreaText.text = calculateAreaStringBuilder
            }
        }

        dotButton.setOnClickListener {
            isDotExist = true
            dotCounter += 1
            if (dotCounter == 1) {
                if (operatorType == "") {
                    inputData01StringBuilder.append(dot)
                    calculateAreaStringBuilder.append(dot)
                    calculateAreaText.text = calculateAreaStringBuilder
                } else {
                    inputData02StringBuilder.append(dot)
                    calculateAreaStringBuilder.append(dot)
                    calculateAreaText.text = calculateAreaStringBuilder
                }
            } else {
                dotCounter = 1
            }
        }

        equalButton.setOnClickListener {
            if (inputData01StringBuilder.toString() != "" && inputData02StringBuilder.toString() != "") {
                val inputData01String: String = inputData01StringBuilder.toString()
                val inputData02String: String = inputData02StringBuilder.toString()
                var doubleResult = 0.0
                val inputData01Double = inputData01String.toDouble()
                val inputData02Double = inputData02String.toDouble()
                when (operatorType) {
                    " ÷ " -> doubleResult = inputData01Double / inputData02Double
                    " × " -> doubleResult = inputData01Double * inputData02Double
                    " - " -> doubleResult = inputData01Double - inputData02Double
                    " + " -> doubleResult = inputData01Double + inputData02Double
                }
                if (!isDotExist) {
                    if (doubleResult.toString().length > 9) {
                        outputAreaText.text = outputError
                    } else {
                        if (doubleResult % 1.0 == 0.0) {
                            outputAreaText.text = doubleResult.toInt().toString()
                        } else {
                            outputAreaText.text = doubleResult.toString()
                        }
                    }
                } else {
                    if (doubleResult.toString().length > 10) {
                        outputAreaText.text = outputError
                    } else {
                        if (doubleResult % 1.0 == 0.0) {
                            outputAreaText.text = doubleResult.toInt().toString()
                        } else {
                            outputAreaText.text = doubleResult.toString()
                        }
                    }
                }
            }
        }


        deleteButton.setOnClickListener {
            calculateAreaText.text = ""
            outputAreaText.text = ""
            calculateAreaStringBuilder.clear()
            inputData01StringBuilder.clear()
            inputData02StringBuilder.clear()
        }

        divisionButton.setOnClickListener {
            dotCounter = 0
            if (operatorType != " ÷ ") {
                operatorType = " ÷ "
                calculateAreaStringBuilder.append(operatorType)
                calculateAreaText.text = calculateAreaStringBuilder
            }
        }

        multiplicationButton.setOnClickListener {
            dotCounter = 0
            if (operatorType != " × ") {
                operatorType = " × "
                calculateAreaStringBuilder.append(operatorType)
                calculateAreaText.text = calculateAreaStringBuilder
            }
        }

        subtractionButton.setOnClickListener {
            dotCounter = 0
            if (operatorType != " - ") {
                operatorType = " - "
                calculateAreaStringBuilder.append(operatorType)
                calculateAreaText.text = calculateAreaStringBuilder
            }
        }

        additionButton.setOnClickListener {
            dotCounter = 0
            if (operatorType != " + ") {
                operatorType = " + "
                calculateAreaStringBuilder.append(operatorType)
                calculateAreaText.text = calculateAreaStringBuilder
            }
        }
    }
}

