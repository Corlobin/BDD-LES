Feature: Converter n�meros romanos em n�mero naturais maiores que zero 
  Converter os n�mero romanos informados em n�meros naturais maiores que zero. 

  Scenario Outline: convertendo um n�mero romano
    Given Eu tenho o n�mero "<Numero_romano>"
    When Eu quero converter para um n�mero natural 
    Then Eu tenho o n�mero <Numero_natural> como resultado
    
    Examples:
    | Numero_romano | Numero_natural |
    | I | 1 | 
    | II | 2 |
    | IX | 9 |
    | XXI | 21 |