package br.com.challenges

open class Human : Animal, Mammal() {
    override fun move(): String {
        return "Anda sobre a terra"
    }

    override fun emitsSound(): String {
        return "Fala"
    }
}