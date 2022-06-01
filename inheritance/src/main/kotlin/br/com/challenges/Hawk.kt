package br.com.challenges

class Hawk : Animal, Oviparous() {
    override fun move(): String {
        return "Voa"
    }

    override fun emitsSound(): String {
        return "Grita"
    }
}