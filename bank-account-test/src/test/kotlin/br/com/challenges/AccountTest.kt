package br.com.challenges

import io.mockk.junit5.MockKExtension
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(MockKExtension::class)
internal class AccountTest {

    private lateinit var accountThais: Account
    private lateinit var accountMonteiro: Account

    @BeforeEach
    fun init() {
        accountThais = Account(numberAccount = 1001, nameClient = "Thais", accountBalance = 100.0)
        accountMonteiro = Account(numberAccount = 1002, nameClient = "Monteiro", accountBalance = 200.0)
    }

    //deposit
    @Test
    fun `must deposit successfully if the amount is greater than zero`() {
        accountMonteiro.deposit(50.0)

        assertEquals(250.0, accountMonteiro.accountBalance)
    }

    @Test
    fun `must deposit successfully if the amount is less than $10000`() {
        accountMonteiro.deposit(8000.0)

        assertEquals(8200.0, accountMonteiro.accountBalance)
    }

    @Test
    fun `should throw an exception if the value is negative`() {
        assertThrows<IllegalArgumentException> {
            accountMonteiro.deposit(-200.0)
        }
    }

    @Test
    fun `should throw an exception if the value is greater than $10000`() {
        val exception = assertThrows(IllegalArgumentException::class.java) {
            accountMonteiro.deposit(20000.0)
        }

        assertEquals(
            "O valor para depósito ou transferência deve ser positivo e de no máximo R$ 10.000,00",
            exception.message
        )
    }

    //sac
    @Test
    fun `must successfully withdraw $100`() {
        accountThais.sac(100.0)

        assertEquals(0.0, accountThais.accountBalance)
    }

    @Test
    fun `should throw an exception when the withdrawal amount is greater than the account balance`() {
        assertThrows<IllegalArgumentException> {
            accountThais.sac(200.0)
        }
    }

    @Test
    fun `should throw an exception when the withdrawal amount is negative`() {
        val exception = assertThrows(IllegalArgumentException::class.java) {
            accountThais.sac(-200.0)
        }
        assertEquals("Não é possível sacar este valor!", exception.message)
    }

    //transfer
    @Test
    fun `must make a successful transfer if the amount is less than the account balance`() {
        accountMonteiro.transfer(accountThais, 200.0)

        assertEquals(0.0, accountMonteiro.accountBalance)
        assertEquals(300.0, accountThais.accountBalance)
    }

    @Test
    fun `must make a successful transfer if the amount is less than $10000`() {
        val accountMarcoTransfer = Account(numberAccount = 1002, nameClient = "Marco", accountBalance = 20000.0)
        accountMarcoTransfer.transfer(accountThais, 10000.0)

        assertEquals(10000.0, accountMarcoTransfer.accountBalance)
        assertEquals(10100.0, accountThais.accountBalance)
    }

    @Test
    fun `should throw an exception if the transfer amount is greater than the account balance`() {
        assertThrows<IllegalArgumentException> {
            accountThais.transfer(accountMonteiro, 300.0)
        }
    }

    @Test
    fun `should throw an exception if the transfer amount is greater than $10000`() {
        val accountMarcoTransfer = Account(numberAccount = 1002, nameClient = "Marco", accountBalance = 20000.0)

        val exception = assertThrows(IllegalArgumentException::class.java) {
            accountMarcoTransfer.transfer(accountThais, 20000.0)
        }
        assertEquals("Não é permitido transferir este valor!", exception.message)
    }

    @Test
    fun `should throw an exception if the transfer amount is negative`() {
        assertThrows<IllegalArgumentException> {
            accountMonteiro.transfer(accountThais, -50.0)
        }
    }
}