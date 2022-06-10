package br.com.challenges

class GasolineEngine : Engine {

    override fun isEnvironmentalFriendly(): Boolean {
        return false
    }

    override fun useFlammableFuel(): Boolean {
        return true
    }

    override fun useFossilFuel(): Boolean {
        return true
    }
}