package br.com.challenges

fun toString(shape : Map<String, Any>) : String {

    return "Width: ${shape["Width"]}, " +
            "Height: ${shape["Height"]}, " +
            "Color: ${shape["Color"]}, " +
            "Área do retângulo: ${calcArea(shape)}"
}