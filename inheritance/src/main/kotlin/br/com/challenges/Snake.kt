package br.com.challenges

class Snake : Animal, Oviparous() {
    override fun move(): String {
        return "Rasteja pelo chão"
    }

    override fun emitsSound(): String {
        return "Assobia"
    }
}