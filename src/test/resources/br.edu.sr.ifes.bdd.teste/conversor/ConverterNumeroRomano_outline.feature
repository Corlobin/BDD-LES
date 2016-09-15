Feature: Converter números romanos em número naturais maiores que zero 
  Converter os número romanos informados em números naturais maiores que zero. 

  Scenario Outline: convertendo um número romano
    Given Eu tenho o número "<Numero_romano>"
    When Eu quero converter para um número natural 
    Then Eu tenho o número <Numero_natural> como resultado
    
    Examples:
    | Numero_romano | Numero_natural |
    | I | 1 | 
    | II | 2 |
    | IX | 9 |
    | XXI | 21 |