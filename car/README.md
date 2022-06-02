## Desafio - Car

___

**Implementar uma classe `Car`, que possui um motor.**

- O motor deve ser um dos argumentos na criação do Car.

- O motor pode ser um objeto da classe `GasEngine`, `EletricEngine` ou `GasolineEngine`, que possuem alguns métodos/atributos (Pode criar outras classes e heranças):

    - `isEnvironmentalFriendly`, que retorna se o motor é prejudicial ao meio ambiente ou não

    - `useFlammableFuel`, que retorna se o combustível usado é inflamável ou não

    - `useFossilFuel`, que retorna se o combustível usado é de origem fóssil ou não


- O carro deve ter um método que retorna uma nota de qualidade:

    - Se o motor do veículo é prejudicial ao meio ambiente, a nota é C;

    - Se o motor do veículo não é prejudicial ao meio ambiente, e usa um combustível fóssil a nota é B;

    - Se o motor do veículo não é prejudicial ao meio ambiente, e usa um combustível não fóssil a nota é A


- O carro deve ter um método que retorna se precisa conter um extintor ou não

    - Se o motor do veículo usar combustível inflamável, então precisa

    - Caso contrário, não precisa



- No exercício acima, implemente dois novos motores de forma que eles funcionem com o `Car`:

  - `HydrogenEngine` que representa um motor a hidrogênio

  - `FlexEngine` que representa um motor que funciona com álcool e com gasolina.

     - Na instanciação do motor, deve ser passado se ele vai usar álcool ou gasolina

     - Implemente os métodos desse motor de forma que reflitam as características do combustível usado

**Para reflexão e discutir:** 

Foi necessário alterar a classe `Car` para adicionar novos motores?

**Se sim, quais? Se não, qual a relevância disso?**

  _Não foi necessário, considerando que havia criado uma interface `Engine`, onde cada motor a implementava e
  descrevia seus métodos de acordo com a sua característica e os métodos da classe
  `Car` foram executados considerando o retorno dos métodos descritos em cada motor._

 