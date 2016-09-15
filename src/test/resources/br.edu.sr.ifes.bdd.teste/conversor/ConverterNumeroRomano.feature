Feature: Converter números romanos em número naturais maiores que zero 
  Converter os número romanos informados em números naturais maiores que zero. 
    
  Scenario: informando o número I
    Given Eu tenho o número "I"
    When Eu quero converter para um número natural 
    Then Eu tenho o número 1 como resultado
   
  Scenario: informando o número II
    Given Eu tenho o número "II"
    When Eu quero converter para um número natural 
    Then Eu tenho o número 2 como resultado   
    
 Scenario: informando o número IX
    Given Eu tenho o número "IX"
    When Eu quero converter para um número natural 
    Then Eu tenho o número 9 como resultado   
 
 Scenario: informando o número XXI
    Given Eu tenho o número "XXI"
    When Eu quero converter para um número natural 
    Then Eu tenho o número 21 como resultado      