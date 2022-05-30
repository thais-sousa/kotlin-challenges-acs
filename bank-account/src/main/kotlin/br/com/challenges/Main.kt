package br.com.challenges

fun main() {

    //Criando a conta e testando os métodos
    val accountThais = Account(numberAccount = 1001, nameClient = "Thais", accountBalance = 100.0)
    println("Dados da Conta ${accountThais.numberAccount}: Nome do Titular = ${accountThais.nameClient}, Saldo da conta ${accountThais.accountBalance}")
    accountThais.deposit(200.0)
    println("Saldo conta Thais após depósito: ${accountThais.accountBalance}")

    accountThais.sac(50.0)
    println("Saldo conta Thais após saque: ${accountThais.accountBalance}")

    println()

    //Criando uma nova conta e testando os métodos
    val accountMonteiro = Account(numberAccount = 1002, nameClient = "Monteiro", accountBalance = 0.0)
    println("Dados da Conta ${accountMonteiro.numberAccount}: Nome do Titular = ${accountMonteiro.nameClient}, Saldo da conta ${accountMonteiro.accountBalance}")
    accountMonteiro.deposit(100.0)
    println("Saldo conta Monteiro após depósito: ${accountMonteiro.accountBalance}")

    accountMonteiro.sac(30.0)
    println("Saldo conta Monteiro após saque: ${accountMonteiro.accountBalance}")

    println()

    //Testando transferências
    accountThais.transfer(accountMonteiro, 50.0)
    println("Saldo conta Monteiro após receber transferência: ${accountMonteiro.accountBalance}")
    println("Saldo conta Thais após realizar transferência: ${accountThais.accountBalance}")

    accountMonteiro.transfer(accountThais, 30.0)
    println("Saldo conta Thais após receber transferência: ${accountThais.accountBalance}")
    println("Saldo conta Monteiro após realizar transferência: ${accountMonteiro.accountBalance}")

    //Testando transferência acima do valor permitido
    accountThais.transfer(accountMonteiro, 50000.0)
}

class Account(
    val numberAccount: Int,
    val nameClient: String,
    accountBalance: Double,
) {
    var accountBalance = accountBalance
        private set

    val limiteValue = 10000.0
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