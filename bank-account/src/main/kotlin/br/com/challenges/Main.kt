package br.com.challenges

import javax.print.attribute.standard.Destination

fun main() {

    val contaThais = Account(numeroCta = 1001, titular = "Thais", saldo = 100.0)
    contaThais.deposit(100.0)
    println(contaThais.saldo)
    contaThais.sac(250.0)
    println(contaThais.saldo)

    val contaMarco = Account(numeroCta = 1002,  titular = "Marco", saldo = 0.0)
    contaThais.transfer(contaMarco, 10000.0)
    println(contaMarco.saldo)
    println(contaThais.saldo)

}

class Account(
    val numeroCta: Int,
    val titular: String,
    var saldo: Double
) {
    fun deposit(value: Double) {
        when {
            value <= 10000.0 -> this.saldo += value
            else -> throw IllegalArgumentException("O valor máximo permitido para depósito é de R$ 10.000,00 $numeroCta $titular")
        }
    }

    fun sac(value: Double) {
        when {
            saldo > 0 && saldo >= value -> saldo -= value
            else -> throw IllegalArgumentException("Não é possível sacar este valor!")
        }
    }

    fun transfer (destinationAccount: Account, value: Double) {
        if(saldo >= value && value <= 10000.0 ) {
            saldo -= value
            destinationAccount.deposit(value)
        } else
            throw IllegalArgumentException("Não é permitido transferir este valor!")
    }
}
