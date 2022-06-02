package br.com.challenges

fun main() {
    val carGas = Car(GasEngine())
    println("Motor a gás: ${carGas.qualityNote()}. ${carGas.extinguisher()}")

    val carGasoline = Car(GasolineEngine())
    println("Motor a gasolina: ${carGasoline.qualityNote()}. ${carGasoline.extinguisher()}")

    val carEletricEngine = Car(EletricEngine())
    println("Motor elétrico: ${carEletricEngine.qualityNote()}. ${carEletricEngine.extinguisher()}")
}