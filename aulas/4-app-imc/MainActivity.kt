package com.example.imc

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputPeso = findViewById<EditText>(R.id.inputPeso)
        val inputAltura = findViewById<EditText>(R.id.inputAltura)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        val resultado = findViewById<TextView>(R.id.resultado)

        btnCalcular.setOnClickListener {
            val peso = inputPeso.text.toString().toDoubleOrNull()
            val altura = inputAltura.text.toString().toDoubleOrNull()

            if (peso != null && altura != null && altura > 0) {
                val imc = peso / (altura * altura)
                resultado.text = "Seu IMC é: %.2f".format(imc)
            } else {
                resultado.text = "Digite valores válidos"
            }

            resultado.visibility = View.VISIBLE

        }
    }
}