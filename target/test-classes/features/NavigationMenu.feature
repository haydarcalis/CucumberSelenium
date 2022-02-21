
Feature: Navigation Menu

  @car
  Scenario:Navigate Fleet--Vehicles
    Given The user is on the login page
    And   The user enters sales manager username and password and click login button
    When  The user navigates to Fleet,Vehicles
    Then  The title contains Car

  @Market
  Scenario:Navigate Marketing--Campaigns/(DATABASE)
    Given The user is on the login page
    And   The user enters sales manager username and password and click login button
    When  The user navigates to Marketing,Campaigns
    Then  The title contains Campaigns

  @calendar
  Scenario:Navigate Activities--Calendar Events
    Given The user is on the login page
    And   The user enters sales manager username and password and click login button
    When  The user navigates to Activities,Calendar Events
    Then  The title contains Calendar Events
