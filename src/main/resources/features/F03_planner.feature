@smoke
Feature: F03_Planner | users could Book Umrah Planeer

  Scenario Outline: user navigate to Umrah Planeer module
    Given user go to planner tab
    When user select Path
        And user Fill Guests "<RoomType>" "<RoomsCount>" "<ADTCount>"
        And user Fill Date"<day>""<month>""<year>"
        And user Fill Spent Nights on "<Makkah>"and"<selection>"and"<Madinah>"
        And Fill Vehicles"<Vehicles>"
        And Fill Nationality"<Nationality>"
        And Fill Country "<Country>" and Click Search Package
       Then user go to Search result Page
    Examples:
    |selection| RoomType | RoomsCount | ADTCount | Vehicles| Nationality|Makkah|Madinah|Country|day|month|year|

    |  yes    | 4        | 6          | 4       |  5    |  Egypt  | 7 |  3     | Egypt | 30 | September  |2022|








