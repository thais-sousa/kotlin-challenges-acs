package br.com.challenges

class Penguin : Oviparous {
    override fun oviposition(): String {
        return "Bota ovos"
    }

    override fun move(): String {
        return "Anda sobre a terra e nada na água"
    }

    override fun emitsSound(): String {
        return "Canta"
    }
}