package br.com.challenges

class FlexEngine(val fuelType: String) : Engine {

    override fun isEnvironmentalFriendly(): Boolean {
        println("Combustível utilizado: $fuelType ")
        return fuelType == "Álcool"
    }

    override fun useFlammableFuel(): Boolean {
        return true
    }

    override fun useFossilFuel(): Boolean {
        return fuelType == "Gasolina"
    }
}