package br.com.challenges

class GasEngine : Engine {

    override fun isEnvironmentalFriendly(): Boolean {
        return true
    }

    override fun useFlammableFuel(): Boolean {
        return true
    }

    override fun useFossilFuel(): Boolean {
        return true
    }
}