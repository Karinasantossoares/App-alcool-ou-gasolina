package com.example.appgasolinaoualcool

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clique(view: View) {
        val precoAlcool = tv_alcool.text.toString()
        val precoGasolina = tv_gasolina.text.toString()
        calcularPreco(precoAlcool, precoGasolina)
    }

    fun calcularPreco(precoAlcool: String, precoGasolina: String) {
        val valorAlcool = precoAlcool.toDouble()
        val valorGasolina = precoGasolina.toDouble()
        var resultado = valorAlcool / valorGasolina
        if (resultado >= 0.7) {
            tv_opcaoescolhida.setText("Melhor gasolina")
        } else {
            tv_opcaoescolhida.setText("Melhor usar alcool")
        }
    }


}