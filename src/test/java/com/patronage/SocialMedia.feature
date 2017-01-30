Feature: Social media
  As a user
  I want to be able to connect with social media
  So that I can see pages of them

  Scenario: Connect with Facebook
    Given user is on 'My store' home page
    When user click on 'Facebook' button
    Then user should see Facebook page

  Scenario: Connect with Twitter
    Given user is on My Store home page
    When user click on 'Twitter' button
    Then user should see Twitter page

  Scenario: Connect with YouTube
    Given user is on 'My Store' page
    When user click on 'YouTube' button
    Then user should see YouTube page

  Scenario: Connect with Google Plus
    Given user is on My Store page
    When user click on 'Google Plus' button
    Then user should see Google Plus page

