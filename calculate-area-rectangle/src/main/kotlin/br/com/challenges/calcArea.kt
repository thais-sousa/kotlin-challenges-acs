package br.com.challenges

fun calcArea(shape: Map<String, Any>): Int {

    val result = shape["Width"].toString().toInt() * shape["Height"].toString().toInt()

    return result

}

