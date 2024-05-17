
@tag
Feature: recherche google
  je veux rechercher via google

  @tag1
  Scenario: recherche pays
    Given ouvrire navigateurr
    And ouvrire URL de google "https://www.google.com/"
    When Saisir le mot  "Algerie"
    And cliquer sur entrer
    Then verifier que le phrase contient le mot "Algérie"
   

  