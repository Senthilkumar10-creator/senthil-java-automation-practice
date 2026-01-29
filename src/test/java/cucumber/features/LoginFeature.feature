Feature: To validtae the login functionality of HRM Application

  Background:
    Given User navigate into HRM Application login URL
    And User is on the login page

  @Smoke @Regression
  Scenario: Login with valid credentials
    When User enters the valid 'Admin' in the username field
    And User enters the valid 'admin123' in the password field
    Then User clicks the login button
    And user successfully navigated into dashboard page

  @Regression
  Scenario Outline: Login with invalid credentials
    When User enters the invalid <"username"> in the username field
    And User enters the invalid <"password"> in the password field
    Then User clicks the login button
    And user should not navigated into dashboard page

    Examples:
      | username | password |
      | user     | pass     |
      | user1    | pass1    |

  @Sanity
  Scenario: Login with valid credentials
    When User enters the valid credentials
      | username | password |
      | Admin    | admin123 |
    Then User clicks the login button
    And user successfully navigated into dashboard page
