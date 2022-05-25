package br.com.challenges
fun main() {

    val contaThais = Acount(numero = 1001, titular = "Thais", saldo = 100.0)
    contaThais.deposit(1000.0)
    println(contaThais.saldo)

}

class Acount(
    val numero: Int,
    val titular: String,
    var saldo: Double
) {
    fun deposit(value: Double) {
        when {
            value < 10000.0 -> saldo += value
            else -> println("Não é possível depositar este valor. O valor máximo permitido para este depósito é de R$ 10.000,00")
        }
    }
}