Feature: Login as different users

  Scenario: Login as a driver user
    Given The user is on the login page
    When The user login using "user2" and "UserUser123"
    Then The user should be able to login
    And The title contains "Dashboard"