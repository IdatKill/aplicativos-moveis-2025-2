package com.example.calculadora_imc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.calculadora_imc.ui.theme.Calculadora_IMCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Calculadora_IMCTheme {
                ImcApp()
            }
        }
    }
}

@Composable
fun ImcApp() {
    // Estados para armazenar entradas
    var peso by remember { mutableStateOf(TextFieldValue("")) }
    var altura by remember { mutableStateOf(TextFieldValue("")) }
    var resultado by remember { mutableStateOf("") }

    // Layout principal
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Cálculo de IMC", style = MaterialTheme.typography.headlineSmall)

        Spacer(modifier = Modifier.height(16.dp))

        // Input Peso
        OutlinedTextField(
            value = peso,
            onValueChange = { peso = it },
            label = { Text("Digite seu peso (kg)") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Input Altura
        OutlinedTextField(
            value = altura,
            onValueChange = { altura = it },
            label = { Text("Altura (m)") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Botão
        Button(onClick = {
            val pesoDouble = peso.text.toDoubleOrNull()
            val alturaDouble = altura.text.toDoubleOrNull()

            if (pesoDouble != null && alturaDouble != null && alturaDouble > 0) {
                val imc = pesoDouble / (alturaDouble * alturaDouble)
                resultado = "Seu IMC é: %.2f".format(imc)
            } else {
                resultado = "Por favor, insira valores válidos."
            }
        }) {
            Text("Calcular")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Resultado
        Text(resultado)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ImcPreview() {
    Calculadora_IMCTheme {
        ImcApp()
    }
}