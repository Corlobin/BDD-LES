Feature: Converter n�meros romanos em n�mero naturais maiores que zero 
  Converter os n�mero romanos informados em n�meros naturais maiores que zero. 
    
  Scenario: informando o n�mero I
    Given Eu tenho o n�mero "I"
    When Eu quero converter para um n�mero natural 
    Then Eu tenho o n�mero 1 como resultado
   
  Scenario: informando o n�mero II
    Given Eu tenho o n�mero "II"
    When Eu quero converter para um n�mero natural 
    Then Eu tenho o n�mero 2 como resultado   
    
 Scenario: informando o n�mero IX
    Given Eu tenho o n�mero "IX"
    When Eu quero converter para um n�mero natural 
    Then Eu tenho o n�mero 9 como resultado   
 
 Scenario: informando o n�mero XXI
    Given Eu tenho o n�mero "XXI"
    When Eu quero converter para um n�mero natural 
    Then Eu tenho o n�mero 21 como resultado      