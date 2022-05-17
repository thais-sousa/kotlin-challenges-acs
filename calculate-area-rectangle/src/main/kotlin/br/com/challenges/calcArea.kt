package br.com.challenges

fun calcArea(shape: Map<String, Any>): Int {

    return shape["Width"].toString().toInt() * shape["Height"].toString().toInt()

}