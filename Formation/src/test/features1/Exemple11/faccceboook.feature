
@smoke
Feature: inscription feacbook
  je veux inscrire

  @tag1
  Scenario: inscription facebook1
    Given ouvrire navigateeuuuur
    And ouvrire URL de facebook1 "https://www.facebook.com/?locale=fr_FR"
    When cliquer sur le bouton sinscrirre
    And saisir firtname "Nassim1"
    And saisir lastname "BM1"
    And saisir mail " nassim1@gmail.com"
    And saisir confirmation
    And saisir mdp "nassim123456"
    And choisir jour "20"
    And choisir mois "4"
    And choisir année "1999"
    And choisir genere "h"
    And cliquer sur le bouton sinscriree
    Then la creation se faitte avec succée
   

 
