@smoke
Feature: F04_Planner | users add makkah hotels
  Scenario Outline: user can select a hotel in Makkah
    Given user go to planner tab
    When user select Path
    And user Fill Guests "<RoomType>" "<RoomsCount>" "<ADTCount>"
    And user Fill Date"<day>""<month>""<year>"
    And user Fill Spent Nights on "<Makkah>"and"<selection>"and"<Madinah>"
    And Fill Vehicles"<Vehicles>"
    And Fill Nationality"<Nationality>"
    And Fill Country "<Country>" and Click Search Package
    Then user go to Search result Page
    And select Makkah Hotel Room
    And select Madinah Hotel Room
    And select Transportation
    And select Ground Service
    Examples:
      |selection| RoomType | RoomsCount | ADTCount | Vehicles| Nationality|Makkah|Madinah|Country|day|month|year|
      |yes | 4        | 2          | 2       |  1   |  Egypt  | 5 |  3     | Egypt |6| October    |2022 |
