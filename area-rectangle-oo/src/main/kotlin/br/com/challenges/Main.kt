package br.com.challenges

fun main() {


}

class Rectangle(
    val width: Int,
    val height: Int,
    val color: String
) {

    fun calcArea(): Int{
        return width * height
    }

    override fun toString(): String {
        return "Width: $width, " +
                "Height: $height, " +
                "Color: $color, "
    }
}