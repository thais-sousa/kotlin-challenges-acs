package br.com.challenges

fun main() {

    val contaThais = Account(numeroCta = 1001, titular = "Thais")
    contaThais.deposit(150.0)
    println(contaThais.accountBalance)
    contaThais.sac(-50.0)
    println("conta após saque: ${contaThais.accountBalance}")

    val contaMarco = Account(numeroCta = 1002, titular = "Marco")
    contaThais.transfer(contaMarco, 10000.0)
    println(contaMarco.accountBalance)
    println(contaThais.accountBalance)

}

class Account(
    numeroCta: Int,
    titular: String
) {
    var accountBalance = 0.0
        private set

    val limiteValue = 10000.0
    fun deposit(value: Double) {
        when {
            value > 0 && value <= limiteValue -> this.accountBalance += value
            else -> throw IllegalArgumentException("O valor para depósito deve ser positivo e de no máximo R$ 10.000,00")
        }
    }

    fun sac(value: Double) {
        when {
            accountBalance > 0 && accountBalance >= value -> accountBalance -= value
            else -> throw IllegalArgumentException("Não é possível sacar este valor!")
        }
    }

    fun transfer(destinationAccount: Account, value: Double) {
        if (accountBalance >= value && value <= limiteValue) {
            accountBalance -= value
            destinationAccount.deposit(value)
        } else
            throw IllegalArgumentException("Não é permitido transferir este valor!")
    }
}
