@datastru
Feature: Data Structure Introduction

 Background: I am on home page
    Given home page is open
    When I click on Sign in button
    And I enter username and password
    Then I am navigated to home page afte logged in

  @datastru1
  Scenario: validation of datastructure introduction button
    When I click on get started button below datastructure introduction
    Then I land in Data Structures Introduction Page

  @datastru2
  Scenario: validation of Time complexity link 
    When I click on get started button below datastructure introduction
    And I click on Time Complexity link
    Then I redirected in Time Complexity of  Datastructure Introduction Page

  @datastru3
  Scenario: validation of Practice Question in Time Complexity page of Datastructure Introduction
    When I click on get started button below datastructure introduction
    And I click on Time Complexity link
    And I click on Practice Questions link
    Then I should redirected to the Practice Questions page

  @datastru4
  Scenario: validation of try here button
    When I click on get started button below datastructure introduction
    And I click on Time Complexity link
    And I click on try here button
    Then I should be redirected to a page having an tryEditor with a Run button

  @datastru5
  Scenario: validation of tryEditor by entering code
    When I click on get started button below datastructure introduction
    And I click on Time Complexity link
    And I click on try here button
    And I enter code in tryeditor and click Run
    Then The code should run sucessfully
