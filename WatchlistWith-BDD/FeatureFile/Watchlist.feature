
Feature: Watchlist
 
  Scenario: Handling of Watch list
  
    Given User can lauch the chrome browser
    When User Open the AngleBroking login webpage URL. "https://trade.angelbroking.com/login/"
    Then Passing the UserID "BBLM24363" and Password "Lucifer"
    And Click on signin button
    Then Open the Hidden division popup and close it
    Then Click on Watch list Icon
    And Select all watch list
    Then close the browser
    
   


 
