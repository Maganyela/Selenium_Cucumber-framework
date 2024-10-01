Feature: General View

  Scenario: Validate general user is able to view product without logging in
    Given User navigate to the Online product page
    When User click on the formal shoes drop down
    Then Usr should be able to view the products