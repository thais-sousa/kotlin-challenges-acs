package br.com.challenges

class Bat : Mammal {
    override fun itsMammal(): String {
        return "É um mamífero"
    }

    override fun move(): String {
        return "Voa"
    }

    override fun emitsSound(): String {
        return "Canta"
    }
}