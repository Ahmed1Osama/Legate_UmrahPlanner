@smoke
Feature: F01_Register | users could register with new accounts

  Scenario Outline: guest user could register with valid data successfully
    Given user go to register page
    When user enter Full name"<fullName>"
    And user enter Email"<email>"
    And user enter Phone Number"<phone>"
    And user enter Password "<Password>" and confirmed"<CPassword>"
    And user agree on terms and conditions.
    Then user logon successfuly
    Examples:
      | fullName | email | phone | Password | CPassword |
      | Ahmed Osama | ahmedtest15@mailinator.com| 01092656556 | P@ssw0rd | P@ssw0rd |
