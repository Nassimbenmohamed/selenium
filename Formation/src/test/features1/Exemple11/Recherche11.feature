
@tag
Feature: recherche google
  je veux rechercher via google

  @tag1
  Scenario: Recherche pays1
    Given ouVrire navigateur
    And ouvrire UrL de google "https://www.google.com/"
    When Saisir le mot "tunisie"
    And cliquer sur Entrerrr 
    Then Vérifier le résulttatt attendu contient le mot "google"
 

