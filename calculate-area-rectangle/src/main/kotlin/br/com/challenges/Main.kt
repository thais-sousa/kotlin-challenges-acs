package br.com.challenges

fun main() {
    val rectangle = mutableMapOf("Width" to 10, "Height" to 10, "Color" to "Red")

    println("Área do Retângulo: ${calcArea(rectangle)}")
    println("Atributos do retângulo: ${toString(rectangle)}")

    rectangle["Width"] = 5
    println("Atributos do retângulo - Alteração Width: ${toString(rectangle)}")

}









