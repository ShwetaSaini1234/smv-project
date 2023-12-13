@Array
Feature: Array page validation

  @Array1
  Scenario: Validation of Array Get Started button
    Given I am on home page
    When I click on get started button under Array
    Then I am redirected to Array page

  @Array2
  Scenario: Validation of Arrays in python link
    Given I am on home page
    When I click on get started button under Array
    And I click on Arrays in python link
    Then I am redirected to Arrays in python page

  @Array3
  Scenario: Validation of Arrays in python Try here  button link
    Given I am on home page
    When I click on get started button under Array
    And I click on Arrays in python link
    And I click on Try here button
    Then I should be redirected to a tryEditor page with Run button

  @Array4
  Scenario: Validation of Arrays in python page tryEditor by entering code
    Given I am on home page
    When I click on Array get started button
    And I click on Arrays in python link
    And I click on Try here button
    And I enter code in arraytryeditor and click Run
    Then The array code should run sucessfully

  @Array5
  Scenario: Validation of Arrays Using List link
    Given I am on home page
    When I click on Array get started button
    And I click on Arrays Using List link
    Then I am redirected to Arrays Using List page

  @Array6
  Scenario: Validation of Arrays using list tryEditor by entering code
    Given I am on home page
    When I click on Array get started button
    And I click on Arrays Using List link
    And I click on Try here button
    And I enter code in arraytryeditor and click Run
    Then The array code should run sucessfully

  @Array7
  Scenario: Validation of Basic Operations in Lists link
    Given I am on home page
    When I click on Array get started button
    And I click on Basic Operations in Lists link
    Then I am redirected to Basic Operations in Lists page

  @Array8
  Scenario: Validation of Basic Operations in Lists tryEditor by entering code
    Given I am on home page
    When I click on Array get started button
    And I click on Basic Operations in Lists link
    And I click on Try here button
    And I enter code in arraytryeditor and click Run
    Then The array code should run sucessfully

  @Array9
  Scenario: Validation of Applications of Array link
    Given I am on home page
    When I click on Array get started button
    And I click on  Applications of Array link
    Then I am redirected to Applications of Array link page

  @Array10
  Scenario: Validation of Applications of Array link tryEditor by entering code
    Given I am on home page
    When I click on Array get started button
    And I click on  Applications of Array link
    And I click on Try here button
    And  I enter code in arraytryeditor and click Run
    Then The array code should run sucessfully

  @Array11
  Scenario: Validation of Practice Questions link
    Given I am on home page
    When I click on Array get started button
    And I click on Arrays in python link
    And I click on Array Practice Questions link
    Then I should be redirected to Practice Questions page

  @Array12
  Scenario: Validation of Search the array link in Practice Questions page
    Given I am on home page
    When I click on Array get started button
    And I click on Arrays in python link
    And I click on Array Practice Questions link
    When I click on Search the array link
    Then I should be redirected to Questions tryEditor page with Run and Submit buttons

  @Array13
  Scenario: Validation of Max Consecutive Ones in Practice Questions page
    Given I am on home page
    When I click on Array get started button
    And I click on Arrays in python link
    And I click on Array Practice Questions link
    When I click on Max Consecutive Ones link
    Then I should be redirected to Questions tryEditor page with Run and Submit buttons

  @Array14
  Scenario: Validation of Find Numbers with Even Number of Digits in Practice Questions page
    Given I am on home page
    When I click on Array get started button
    And I click on Arrays in python link
    And I click on Array Practice Questions link
    When I click on Find Numbers with Even Number of Digits link
    Then I should be redirected to Questions tryEditor page with Run and Submit buttons

  @Array15
  Scenario: Validation of Squares of Sorted Array in Practice Questions page
    Given I am on home page
    When I click on Array get started button
    And I click on Arrays in python link
    And I click on Array Practice Questions link
    When I click on Squares of Sorted Array link
    Then I should be redirected to Questions tryEditor page with Run and Submit buttons
