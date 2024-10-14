@tag
Feature: Authentifi
  authenti

  @tag2
  Scenario Outline: authentification cas ko
    Given ouvrire navi
    And ouvrire URRRL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When saisir usssernaime "<user>"
    And sAisir mdtp "<mot>"
    And cliquerr sUr le BOuton loguer
    Then Vérifier le message ko "<messssage>"

    Examples: 
      | user | mot  | messssage           |
      | usds | sdsd | Invalid credentials |
      | fkgr | fefe | Invalid credentials |
      |  123 | kgrk | Invalid credentials |
