package br.com.challenges

class Penguin : Animal, Oviparous() {
    override fun move(): String {
        return "Anda sobre a terra e nada na água"
    }

    override fun emitsSound(): String {
        return "Canta"
    }
}