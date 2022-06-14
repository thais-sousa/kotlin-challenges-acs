package br.com.challenges

class Account(
    val numberAccount: Int,
    val nameClient: String,
    accountBalance: Double,
) {
    var accountBalance = accountBalance
        private set

    private val limiteValue = 10000.0

    fun deposit(value: Double) {
        when {
            value > 0 && value <= limiteValue -> accountBalance += value
            else -> throw IllegalArgumentException("O valor para depósito ou transferência deve ser positivo e de no máximo R$ 10.000,00")
        }
    }

    fun sac(value: Double) {
        when (value > 0) {
            (accountBalance > 0 && accountBalance >= value) -> accountBalance -= value
            else -> throw IllegalArgumentException("Não é possível sacar este valor!")
        }
    }

    fun transfer(destinationAccount: Account, value: Double) {
        when {
            accountBalance >= value && value <= limiteValue -> {
                accountBalance -= value
                destinationAccount.deposit(value)
            }
            else -> throw IllegalArgumentException("Não é permitido transferir este valor!")
        }
    }
}