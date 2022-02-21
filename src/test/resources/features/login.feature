@login
Feature: Users should be able to login

  @driver
  Scenario: Login as a driver
    Given The user is on the login page
    When  The user enters username and password and click login button
    Then  The user should be able to login

  @salesmanager
  Scenario: Login as a sales manager
    Given The user is on the login page
    When  The user enters sales manager username and password and click login button
    Then  The user should be able to login

  @storemanager
  Scenario: Login as a store manager
    Given The user is on the login page
    When  The user enters store manager username and password and click login button
    Then  The user should be able to login