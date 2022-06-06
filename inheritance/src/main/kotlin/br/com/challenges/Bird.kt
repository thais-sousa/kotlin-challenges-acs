package br.com.challenges

class Bird : Oviparous {
    override fun oviposition(): String {
        return "Bota ovos"
    }

    override fun move(): String {
        return "Voa"
    }

    override fun emitsSound(): String {
        return "Canta"
    }
}