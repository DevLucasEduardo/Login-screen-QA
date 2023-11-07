# Calculadora-QA
<hr>
   
## Descrição

Este projeto é composto por uma classe calculadora que efetua operações 
matemáticas de <b>soma, subtração, multiplicação e divisão</b>.
<br>
Para garantir o funcionamento da calculadora, foram criados testes unitários a fim de verificar seu funcionamento.
Os testes foram feitos de duas formas e se encontram nas duas branches deste projeto. O primeiro deles foi criado a partir da instância da classe calculadora e 
o outro pela utilização do Framework JUnit na versão .

Este é um projeto Maven, isto é, o gerenciamento das dependências necessárias para o build do projeto são delegadas ao Maven, o qual configura e baixa as dependências necessárias, no caso o JUnit 5. 
<hr>

## Calculadora

A calculadora possui quatro métodos e cada um deles é responsável por efetuar uma das quatro operações aritméticas básicas.
Os métodos esperam dois argumentos, sendo eles os dois valores inteiros que vão ser utilizados para fazer a operação e a saída é o resultado inteiro desta.

Exemplo: <br>
```java
public int soma(int a, int b) {
    return a + b;
}
```

## Testes Unitários

Os testes unitários foram feitos de duas maneiras, sendo elas: 

- main branch: Aqui os testes foram feitos instanciando-se a classe calculadora e fazendo chamadas de seus métodos referentes às operações em diferentes cenários avaliados pelo
  desenvolvedor. A saída no console é uma comparação entre o resultado esperado e o resultado do método.
- junit branch: Dessa vez os testes foram feitos com a utilização do Framework JUnit na versão 5.10.0. Assim como no caso anterior,
  foram avaliados diferentes cenários, entretanto, dessa vez foram criados diferentes métodos para cada tipo de cenário
  com auxilio do decorator <i>@Test</i> e o método Assertions.assertEquals() providos pelo framework. Como saída é possível verificar quais dos métodos falharam e por qual motivo as falhas ocorreram.

Exemplo de testes utilizando o console:
```java
System.out.println("Soma de 4 e 6: " + c.soma(4, 6) + ". Resultado esperado: 10.");`
```

Exemplo de teste com JUnit: 

```java
@Test
public void somarPositivosMaioresQueZero() {
    // Soma de 4 e 6. Resultado esperado: 10
    Assertions.assertEquals(10, c.soma(4, 6));
}
```


