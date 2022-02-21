Feature: Account Type

  @wip
  Scenario: Driver user
    Given The user logged in as a "driver"
    When The user navigates to "Activities" "Calendar Events"
    Then The title contains "Activities"

  Scenario: Sales Manager
    Given The user logged in as a "sales manager"
    When The user navigates to "Customer" "Accounts"
    Then The title contains "Accounts-Customer"

  Scenario: Store Manager
    Given The user logged in as a "store manager"
    When The user navigates to "Customer" "Contacts"
    Then The title contains "Contacts-Customer"

  Scenario Outline: Diffrent user types
    Given The user logged in as a "<userType>"
    When The user navigates to "<menu>" "<submenu>"
    Then The title contains "<title>"
    Examples:
      | userType      | menu       | submenu         | title      |
      | driver        | Activities | Calendar Events | Activities |
      | sales manager | Customer   | Accounts        | Customer   |
      | store manager | Customer   | Contacts        | Customer   |