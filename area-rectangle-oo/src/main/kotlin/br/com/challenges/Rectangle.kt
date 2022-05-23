package br.com.challenges

class Rectangle(
    var width: Int,
    var height: Int,
    var color: String
) {

    fun calcArea(): Int{
        return width * height
    }

    override fun toString(): String {
        return "Width: $width, " +
                "Height: $height, " +
                "Color: $color, " +
                "Área: ${this.calcArea()}"
    }
}