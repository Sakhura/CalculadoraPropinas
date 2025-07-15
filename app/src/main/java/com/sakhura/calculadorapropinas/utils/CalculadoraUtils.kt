package com.sakhura.calculadorapropinas.utils

object CalculadoraUtils {
    fun calcularPropina(montoTotal: Double, porcentaje: Double): Double {
        return montoTotal * (porcentaje)
    }
    fun calcularTotal(montoTotal: Double, porcentaje: Double): Double {
        return montoTotal + calcularPropina(montoTotal, porcentaje)

    }
}