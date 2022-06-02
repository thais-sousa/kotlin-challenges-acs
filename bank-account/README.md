## Desafio - Conta Bancária
___

### **Criar uma classe Account, que representa uma conta bancária**

**Essa classe deve:**

* Conter a informação de saldo da conta, cujo valor inicial é informado quando se cria uma conta;
* Deve-se ter formas de se recuperar o valor do saldo da conta;
* Deve possuir um método de depósito de dinheiro, mas só devem ser aceitos depósitos de no máximo R$ 10.000,00 (caso contrário, lança um erro);
* Deve possuir um método de saque de dinheiro, mas durante essa operação o saldo da conta não pode ficar negativo (Caso contrário, lança um erro);
* Deve possuir um método de transferência de dinheiro, que recebe uma outra contaX (Instancia de Account) e o valor que deve ser transferido da conta atual para a contaX: 
 
   - A transferência deve seguir as regras de depósito e saque acima, inclusive com os casos de valores não aceitos
* Não deve ser possível alterar o saldo da conta sem ser pelos métodos acima