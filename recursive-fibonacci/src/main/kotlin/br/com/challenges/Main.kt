package br.com.challenges

fun main() {
    val numbers = 0..20
    print(("Primeiros ${numbers.count()} termos da Sequência de Fibonacci: "))

    for (number in numbers) {
        print("${fibonacci(number)}, ")
    }
}

fun fibonacci(number: Int): Int {
    return if (number < 2) number else fibonacci(number -1) + fibonacci(number - 2)
}