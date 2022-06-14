### Testes unitários - Conta Bancária

**O desafio consiste em:**

Implementar testes unitários para os seguintes cenários:

**Depósito:**

> - Realizar um depósito com sucesso, se o valor for maior que zero;
> - Realizar um depósito com sucesso, se o valor for menor que $ 10.000,00;
> - Lançar uma exceção caso o valor do depósito seja negativo;
> - Lançar uma exceção caso o valor do depósito seja maior que $ 10.000,00.

**Saque:**
>- Realizar um saque com sucesso, se o valor for maior que zero;
>- Lançar uma exceção se o valor do saque for superior ao saldo da conta;
>- Lançar uma exceção se o valor do saque for negativo.

**Transferência:**
>- Realizar uma transferência com sucesso, se o valor for menor que o saldo da conta;
>- Realizar uma transferência com sucesso, se o valor for menor que $10.000,00;
>- Lançar uma exceção se o valor for maior que o saldo da conta;
>- Lançar uma exceção se o valor for maior que $10.000,00;
>- Lançar uma exceção se o valor for negativo.