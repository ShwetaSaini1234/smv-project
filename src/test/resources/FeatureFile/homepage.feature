@home
Feature: home page functionality
  
  Background: Launch home page successfully
  Given browser is open
  When I click on button
  Then I am navigate to the home page
  
  @home1
  Scenario: Validation of alert message on home page
  When I click on get started button
  Then alert messgae is displayed
  
  @home2
  Scenario: Navigated to the login home page
  When user is navigated to the login home page
  Then user click on the sign in button
  
  @home3
  Scenario: Login with valid username and password
    Given user enters valid username and password
    When user click on the login button
    Then user is navigated to the portal home page
    And home page user click on the logout button
