package br.com.challenges

class Whale : Animal, Mammal() {
    override fun move(): String {
        return "Nada na água"
    }

    override fun emitsSound(): String {
        return "Canta"
    }
}