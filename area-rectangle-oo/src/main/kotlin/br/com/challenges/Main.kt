package br.com.challenges

fun main() {

    val polygon = Rectangle(
        width = 10,
        height = 10,
        color = "Red"
    )

    println("Área do Retângulo: ${polygon.calcArea()}")
    println(polygon.toString())

    polygon.width = 20
    println(polygon.toString())

    polygon.color = "Black"
    println(polygon.toString())
}