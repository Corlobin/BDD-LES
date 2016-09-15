Feature: Realizar calculos basicos

Este cenario tem como objetivo realizar o teste das operacoes basicas da aritmetica: somar, subtrair, multiplicar e dividir.
    Scenario: somar
      Given Eu tenho o numero 1 e 2
      When Eu realizo uma soma
      Then eu tenho como resultado o 3

    Scenario: subtrair
      Given Eu tenho o numero 1 e 2
      When Eu realizo uma subtracao
      Then eu tenho como resultado o -1

    Scenario: multiplicar
      Given Eu tenho o numero 1 e 2
      When Eu realizo uma multiplicacao
      Then eu tenho como resultado o 2

    Scenario: dividir
      Given Eu tenho o numero 2 e 2
      When Eu realizo uma divisao
      Then eu tenho como resultado o 1
