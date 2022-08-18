package br.com.challenges

class Account(
    accountBalance: Double,
) {
    var nameClient = ""
    var numberAccount = 0
        private set
    var accountBalance = accountBalance
        private set

    constructor(nameClient: String, numberAccount: Int, accountBalance: Double) : this(accountBalance) {

        this.nameClient = nameClient
        registrationAccount(numberAccount)
        checkAccountBalance(this.accountBalance)
    }

    fun registrationAccount(numberAccount: Int) {
        if (numberAccount > 1002) {
            throw IllegalArgumentException("Número de conta inválido")
        } else {
            this.numberAccount = numberAccount
        }
    }

    fun checkAccountBalance(accountBalance: Double) {
        if (accountBalance >= 0.0){
            this.accountBalance = accountBalance
        } else {
            throw IllegalArgumentException("O valor não pode ser negativo")
        }

    }

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