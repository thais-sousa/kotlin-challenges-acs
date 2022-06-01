package br.com.challenges

class Whale : Mammal {
    override fun itsMammal(): String {
        return "É um mamífero"
    }

    override fun move(): String {
        return "Nada na água"
    }

    override fun emitsSound(): String {
        return "Canta"
    }
}