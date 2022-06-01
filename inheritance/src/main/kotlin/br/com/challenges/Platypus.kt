package br.com.challenges

class Platypus : Mammal, Oviparous{

    override fun itsMammal(): String {
        return "É um mamífero"
    }

    override fun oviposition(): String {
        return "Bota ovos"
    }

    override fun move(): String {
        return "Anda sobre a terra e nada na água"
    }

    override fun emitsSound(): String {
        return "Rosna"
    }
}