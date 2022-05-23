package br.com.challenges

fun main() {

    val geometricForm = Rectangle(
        width = 10,
        height = 10,
        color = "Red"
    )

    println("Área do Retângulo: ${geometricForm.calcArea()}")
    println(geometricForm.toString())

    geometricForm.width = 20
    println(geometricForm.toString())

    geometricForm.color = "Black"
    println(geometricForm.toString())
}