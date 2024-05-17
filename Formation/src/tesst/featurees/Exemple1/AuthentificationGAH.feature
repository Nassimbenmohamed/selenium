
@tag
Feature: Authentification GAH
  En tant que adinistrateur je jeux loger 

  @tag1
  Scenario: Authentification valide ok 
    Given ouvrire Navigateur
    And ouvrire URL
    When Saisir email
    And Saisir mot de passe
    And clique bouton connexion
    Then Vérifier le nom du user
    

  
