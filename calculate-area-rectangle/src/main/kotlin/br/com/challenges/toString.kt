package br.com.challenges

fun toString(shape: Map<String, Any>): String {

    val attributes = "Width: ${shape["Width"]}, " +
                     "Height: ${shape["Height"]}, " +
                     "Color: ${shape["Color"]}, " +
                     "Área do retângulo: ${calcArea(shape)}"

    return attributes
}