package br.com.challenges

class Dog : Mammal {
    override fun itsMammal(): String {
        return "É um mamífero"
    }

    override fun move(): String {
        return "Anda sobre a terra"
    }

    override fun emitsSound(): String {
        return "Late"
    }
}