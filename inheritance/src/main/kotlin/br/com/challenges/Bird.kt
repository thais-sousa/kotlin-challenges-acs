package br.com.challenges

class Bird : Animal, Oviparous() {
    override fun move(): String {
        return "Voa"
    }

    override fun emitsSound(): String {
        return "Canta"
    }
}