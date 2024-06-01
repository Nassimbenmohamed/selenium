
@tag
Feature: Authentificatioon
  Ent tant que admin je ceux me connecter

  @tag1
  Scenario: authentificatioon ok
    Given ouvrire navigateuur
    And ouvrire UURL
    When Saisiir username 
    And Saisiir mdp 
    And cliquuer sur le bouton logiin
    Then Vérefier le nom du proffile
   


