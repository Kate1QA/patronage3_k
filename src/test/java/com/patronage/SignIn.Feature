Feature: Login tests
  As a user
  I want to be able to sign in
  So that I can see user account

  Scenario: Click on 'Sign in' button
    Given user is on start page and would like to 'Sign in'
    When user click on 'Sign in' button
    Then user should see page to Login

  Scenario: Login on account with error - incorrect password
    Given user is on page to Login
    When user gives email
    And user gives incorrect password
    When user click on 'Submit' button
    Then user should see error incorrect password

  Scenario: Login on account with error - incorrect email
    Given user is on page to login to user account
    When user gives incorrect email
    And user gives correct password
    When click on 'Submit' button
    Then user should see error incorrect email

  Scenario: Login on account
      Given user is on Login page
      When user gives email adres
      And user gives password
      When user click on 'Submit' button'
      Then user should see account

