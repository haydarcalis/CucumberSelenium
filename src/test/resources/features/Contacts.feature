Feature:Contacts Page

  Scenario: Default page number
    Given The user is on the login page
    And The user enters username and password and click login button
    When The user navigates to "Customers" "Contacts"
    Then Default page number should be 1

  @number
  Scenario: Verify Create Calendar Event
    Given The user is on the login page
    And The user enters sales manager username and password and click login button
    When The user navigates to "Activities" "Calendar Events"
    Then The title contains "Calendar"


  Scenario: Menu options driver
    Given The user logged in as a "driver"
    Then The user should see following options

      | Fleet      |
      | Customers  |
      | Activities |
      | System     |

  @menu
  Scenario: Menu options Sales Manager
    Given The user logged in as a "sales manager"
    Then The user should see following options

      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |

@userverify
  Scenario: Login as a given user
    Given The user is on the login page
    When The user logs in using following credentials

      | username  | user2       |
      | password  | UserUser123 |
      | firstname | Mabel       |
      | lastname  | Ziemann     |

    Then The user should be able to login

