package br.com.challenges

class EletricEngine : Engine {

    override fun isEnvironmentalFriendly(): Boolean {
        return true
    }

    override fun useFlammableFuel(): Boolean {
        return false
    }

    override fun useFossilFuel(): Boolean {
        return false
    }
}