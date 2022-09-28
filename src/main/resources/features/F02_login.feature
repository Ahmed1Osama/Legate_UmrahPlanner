@smoke
Feature: F02_login | users could login
  Scenario Outline:guest user could login with valid email and password
    Given user go to login page
    When user enter valid <email>and<password>
    Then user login successfully
    Examples:
      | email | password |
      | "ahmed.osama@legate.com.sa" | "Osos@9090" |


  Scenario Outline:user couldn't login with invalid email and password
    Given user go to login page
    When user enter invalid <email>and<password>
    Then user couldn't login successfull
    Examples:
      | email | password |
      | "ahmed.osama@legate.com" | "Osos@9090" |
