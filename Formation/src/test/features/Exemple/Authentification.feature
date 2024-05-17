
@tag
Feature: Authentification
  En tant que admin je veux m authentifier

  @tag1
  Scenario: Authentification Valide
    Given Ouvrir Navigateur 
    And   Ouvrir URL
    When Saisir Username
    And  Saisir mdp
    And  Cliquer sur le bouton login
    Then Vérifier le nom du profil
    

  