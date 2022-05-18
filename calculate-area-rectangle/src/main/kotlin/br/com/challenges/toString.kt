package br.com.challenges

fun toString(shape : Map<String, Any>) : String {

    val rectangle = mutableMapOf("Width" to 10, "Height" to 10, "Color" to "Red")

    return "Width: ${shape["Width"]}, " +
            "Height: ${shape["Height"]}, " +
            "Color: ${shape["Color"]}, " +
            "Área do retângulo: ${calcArea(rectangle)}"
}