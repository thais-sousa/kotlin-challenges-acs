package br.com.challenges

fun fibonacci(numbers: IntRange) {

    var firstTerm = 0
    var secondTerm = 1

    print("Primeiros ${numbers.count()} termos da Sequência de Fibonacci: ")

    for (number in numbers) {
        print("$firstTerm, ")

        val sumOfTerms = firstTerm + secondTerm
        firstTerm = secondTerm
        secondTerm = sumOfTerms
    }
}