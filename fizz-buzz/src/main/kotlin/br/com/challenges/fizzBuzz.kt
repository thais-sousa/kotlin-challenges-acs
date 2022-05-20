package br.com.challenges

fun fizzBuzz(numbers: IntRange) {

    for (n in numbers) {
        when {
            n % 3 == 0 && n % 5 == 0 -> println("FizzBuzz")
            n % 3 == 0 && n % 5 != 0 -> println("Fizz")
            n % 3 != 0 && n % 5 == 0 -> println("Buzz")
            else -> println(n)
        }

// Implementação usando o "IF" - Refatorado utilizando o "When"
/*        if (n % 3 == 0 && n % 5 == 0) {
            println("FizzBuzz")
        } else if (n % 3 == 0) {
            println("Fizz")
        } else if (n % 5 == 0) {
            println("Buzz")
        } else {
            println(n)
        }
    }*/
    }
}