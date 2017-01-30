Feature: Home Page test
  As a user
  I want to be able to click in icon on home page
  So that I can see index  or contact us page

  Scenario: Click on logo
    Given user is on start page
    When user click on logo
    Then user should see start page

  Scenario: Click on 'Contact us' button
    Given user is on start page for click icon
    When user click on 'Contact us' button
    Then user should see 'Contact us' page

# można sprawdzić czy działają np social media - czy kierują na odpowiednie strony

