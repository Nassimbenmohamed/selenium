@tag
Feature: inscription faacebook
  je veux me connecter

  @tag2
  Scenario Outline: inscription facebook11
    Given ouvrire navigateeuuuur
    And ouvrire URL de facebook1 "https://www.facebook.com/?locale=fr_FR"
    When cliquer sur le bouton sinscrirre
    And saisir firtname "<namee2>"
    And saisir lastname "<prenom2>"
    And saisir mail "<mail2>"
    And saisir confirmation 
    And saisir mdp "<mdp2>"
    And choisir jour "<jour2>"
    And choisir mois "<mois2>"
    And choisir année "<année2>"
    And choisir genere "<genere2>"
    And cliquer sur le bouton sinscriree
    Then la creation se faitte avec succée 

    Examples: 
      | namee2 | prenom2 | mail2             | mdp2   | jour2 | mois2 | année2 | genere2 | statut2 |
      | nassim | BM      | nassim1@gmail.com | 123456 |    15 |     4 |   1999 | homme   | ok      |
      | nacir  | BenM    | nacir@gmail.com   | 456321 |    10 |     8 |   2000 | homme   | ko      |
