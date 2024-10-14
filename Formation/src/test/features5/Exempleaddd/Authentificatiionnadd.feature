
@tag
Feature: cnx valide
  je veut connecter

  @tag1
  Scenario: authentificationOK
    Given Ouvrire nav
    And ouvrire UURll
    When Saaisis user
    And saaisis mdp
    And cliquer sur le bouton ccnxx
    Then Vérifierle nom du prpofil 
    

  