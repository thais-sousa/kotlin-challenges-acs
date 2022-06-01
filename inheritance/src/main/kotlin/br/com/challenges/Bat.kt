package br.com.challenges

class Bat : Animal, Mammal() {
    override fun move(): String {
        return "Voa"
    }

    override fun emitsSound(): String {
        return "Canta"
    }
}