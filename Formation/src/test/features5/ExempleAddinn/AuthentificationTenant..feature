
@tag
Feature: Connection tenant
  je veux me connecte au projet tenant 

  @tag1
  Scenario: Connexion tenant ok
    Given ouvrire navigAteur
    And ouvrire UrL "https://tenant-frontend.dev.abridia.com/#/login"
    When saisis lEmail Adress "ahmed.bensalem@addinn.com"
    And saisis le Password de tenant "123456789"
    And cliquer SUR le bouton Sig In 
    Then Vérifier le nom de proFil
    
  
  
