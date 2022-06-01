package br.com.challenges

class Dog : Animal, Mammal() {
    override fun move(): String {
        return "Anda sobre a terra"
    }

    override fun emitsSound(): String {
        return "Late"
    }
}