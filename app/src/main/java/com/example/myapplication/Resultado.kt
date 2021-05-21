package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resultado.*

class Resultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        var intencao = intent
        var resultadoImc = intencao.getFloatExtra("imcResultado", 0f)
        chamaResultado.text = "Seu IMC é: \n%.2f ".format(resultadoImc)

        if (resultadoImc < 18.50) {
            IMC_comentario.text = "Abaixo do peso!"
        } else if (resultadoImc >= 18.50 && resultadoImc <= 24.99) {
            IMC_comentario.text = "Saudável, que BOM!"
        } else if (resultadoImc >= 25.00 && resultadoImc <= 29.99) {
            IMC_comentario.text = "Sobrepeso!"
        } else if (resultadoImc >= 30.00 && resultadoImc <= 34.99) {
            IMC_comentario.text = "Obesidade grau 1, Atenção!"
        } else if (resultadoImc >= 35.00 && resultadoImc <= 39.99) {
            IMC_comentario.text = "Obesidade grau 2, Atenção!"
        } else {
            IMC_comentario.text = "Obesidade grave, Cuidado!"

        }
    }
}