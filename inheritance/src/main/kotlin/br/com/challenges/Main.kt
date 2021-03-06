package br.com.challenges

fun main() {
    val snake = Snake()
    println("Snake: ${snake.move()} , ${snake.emitsSound()}, ${snake.oviposition()}")

    val dog = Dog()
    println("Dog: ${dog.move()}, ${dog.emitsSound()}, ${dog.itsMammal()}")

    val hawk = Hawk()
    println("Hawk: ${hawk.move()}, ${hawk.emitsSound()}, ${hawk.oviposition()}")

    val whale = Whale()
    println("Whale: ${whale.move()}, ${whale.emitsSound()}, ${whale.itsMammal()}")

    val bird = Bird()
    println("Bird: ${bird.move()}, ${bird.emitsSound()}, ${bird.oviposition()}")

    val einstein = Einstein()
    println("Einstein: ${einstein.move()}, ${einstein.emitsSound()}, ${einstein.isAlive()}, ${einstein.itsMammal()}")

    val penguin = Penguin()
    println("Penguin: ${penguin.move()}, ${penguin.emitsSound()}, ${penguin.oviposition()}")

    val platypus = Platypus()
    println("Platypus: ${platypus.move()}, ${platypus.emitsSound()}, ${platypus.oviposition()}, ${platypus.itsMammal()}")

    val bat = Bat()
    println("Bat: ${bat.move()}, ${bat.emitsSound()}, ${bat.itsMammal()}")
}