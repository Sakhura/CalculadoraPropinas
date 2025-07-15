package com.sakhura.calculadorapropinas

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.sakhura.calculadorapropinas.utils.CalculadoraUtils

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val etMontoTotal = findViewById<EditText>(R.id.etMontoTotal)
        val rgPorcentaje = findViewById<RadioGroup>(R.id.rgPorcentaje)
        val tvPropina = findViewById<TextView>(R.id.tvPropina)
        //val tvTotal = findViewById<TextView>(R.id.tvTotal)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        val btnLimpiar = findViewById<Button>(R.id.btnLimpiar)

        btnCalcular.setOnClickListener {
            val montoTexto = etMontoTotal.text.toString()

            if(montoTexto.isBlank()){
                Toast.makeText(this, "Por favor ingrese un monto total", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val monto = montoTexto.toDoubleOrNull()
            if(monto == null || monto <= 0){
                Toast.makeText(this, "Por favor ingrese un monto válido", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val porcentaje = when (rgPorcentaje.checkedRadioButtonId) {
                R.id.rb10 -> 0.10
                R.id.rb15 -> 0.15
                R.id.rb20 -> 0.20
                else -> 0.10
            }

            val propina = CalculadoraUtils.calcularPropina(monto, porcentaje)
            val total = CalculadoraUtils.calcularTotal(monto, propina)

            tvPropina.text = "Propina: $propina"
            //tvTotal.text = "Total: $total"

            }
        btnLimpiar.setOnClickListener {
            etMontoTotal.text.clear()
            rgPorcentaje.clearCheck()
            tvPropina.text = "Propina: $0.00"
            //tvTotal.text = "Total: $0.00"
        }
    }
}