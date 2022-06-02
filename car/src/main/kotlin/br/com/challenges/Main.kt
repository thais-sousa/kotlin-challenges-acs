package br.com.challenges

fun main() {
    val carGas = Car(GasEngine())
    println(carGas.qualityNote())

    val carGasoline = Car(GasolineEngine())
    println(carGasoline.qualityNote())

    val carEletricEngine = Car(EletricEngine())
    println(carEletricEngine.qualityNote())
}