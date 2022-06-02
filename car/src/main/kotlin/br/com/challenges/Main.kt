package br.com.challenges

fun main() {
    val carGas = Car(GasEngine())
    println("Motor a gás: ${carGas.qualityNote()}. ${carGas.extinguisher()}")
    println()

    val carGasoline = Car(GasolineEngine())
    println("Motor a gasolina: ${carGasoline.qualityNote()}. ${carGasoline.extinguisher()}")
    println()

    val carEletricEngine = Car(EletricEngine())
    println("Motor elétrico: ${carEletricEngine.qualityNote()}. ${carEletricEngine.extinguisher()}")
    println()

    val carHydrogenEngine = Car(HydrogenEngine())
    println("Motor a hidrogênio: ${carHydrogenEngine.qualityNote()}. ${carHydrogenEngine.extinguisher()}")
    println()

    val carFlexEngine = Car(FlexEngine("Álcool"))
    println("Motor flex: ${carFlexEngine.qualityNote()}. ${carFlexEngine.extinguisher()}")
    println()

    val carFlexEngineGasoline = Car(FlexEngine("Gasolina"))
    println("Motor flex: ${carFlexEngineGasoline.qualityNote()}. ${carFlexEngineGasoline.extinguisher()}")
    println()
}