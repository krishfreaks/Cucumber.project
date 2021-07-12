Feature: Login functionality of adactin application

Scenario: User enters valid username and password
    Given User launches url of adactin application
    When User enters "krishajay" as username
    And User enters "260593" as password
    And User click login button
    Then User validate login button
    
    Scenario: User Search the hotel
    When User selects location
    And User selects hotels
    And User selects roomtype
    And User selects no of rooms
    And User clear check in date
    And User enters check in date
    And User clear check out date
    And User enters check out date
    And User selects adults per room
    And User selects children per room
    Then User validate search button
    
    Scenario: User checks the information of select hotel
    When User click on radio button
    Then User validate continue button
    
    Scenario: User Book the hotel
    When User enters the firstname
    And User enters the lastname
    And User enters the billing address
    And User enters the credit card number
    And User selects credit card type
    And User selects credit card expiry month
    And User selects credit card expiry year
    And User enters CVV number
    And User click booknow button
    Then User validate booknow button