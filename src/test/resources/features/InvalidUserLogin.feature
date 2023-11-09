Feature: Invalid User Login
  Background:
    Given user is navigated to HRMS application
    And user clicks on login button

  @passed
  Scenario: User attempts to log in with an empty username field
    #Given user is navigated to HRMS application
    When the user leaves the username field empty
    #And user clicks on login button
    Then the system should display an error message stating "Username cannot be empty"

  @passed
  Scenario: User attempts to log in with an empty password field
    #Given user is navigated to HRMS application
    When the user leaves the password field empty
   # And user clicks on login button
    Then the system should display an error message stating "Password cannot be empty"

  @passed
  Scenario: User enters incorrect login credentials
    #Given user is navigated to HRMS application
    When the user enters incorrect login credentials
    #And user clicks on login button
    Then the system should display an error message stating "Invalid credentials"

  @passed
  Scenario: User corrects input and attempts to log in again
    #Given user is navigated to HRMS application
    When the user enters valid login credentials
    #And user clicks on login button
    Then the user should be successfully logged in