package br.com.challenges

class Snake : Oviparous {
    override fun oviposition(): String {
        return "Bota ovos"
    }

    override fun move(): String {
        return "Rasteja pelo chão"
    }

    override fun emitsSound(): String {
        return "Assobia"
    }
}