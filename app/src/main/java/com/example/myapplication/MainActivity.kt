package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.widget.doAfterTextChanged
import androidx.core.widget.doOnTextChanged
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_resultado.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {

//        calcularBTN?.setOnClickListener {
//            calcularIMC(pesoEDT.text.toString(),alturaEDT.text.toString())
//        }
        calcularBTN?.setOnClickListener {
            calcularIMC(pesoEDT.text.toString(),alturaEDT.text.toString())

            val Resultado = Intent (this,Resultado::class.java)

        }
    }

    fun calcularIMC(peso: String, altura: String) {
        val peso = peso.toFloatOrNull()
        val altura = altura.toFloatOrNull()
        if (peso != null && altura != null) {
            val imc = peso / (altura* altura)
            val irParaResultado = Intent (this,Resultado::class.java)
            irParaResultado.putExtra("imcResultado",imc)
            startActivity(irParaResultado)
//            tituloTXT.text ="Seu IMC é: \n%.2f".format(imc)
//            chamaResultado.text ="Seu IMC é: \n%.2f".format(imc)
        } else {
            Toast.makeText(this, "Peso ou Altura não pode ser nulo !", Toast.LENGTH_SHORT).show()
        }
    }
//    fun telaResultado(imc:Float) {
//        val irParaResultado = Intent (this,Resultado::class.java)
//        irParaResultado.putExtra("imcResultado",imc)
    }
