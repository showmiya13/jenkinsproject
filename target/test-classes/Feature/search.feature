@full
Feature: To verify the search functionality of the application

  Background: 
    Given user launches phillipstoys application

  @reg
  Scenario: To verify the search relevance for the search functionality
    When user enter the product in search box 
    And user click the search button
    Then user sees the results based on selected product

  @smoke
  Scenario Outline: To verify the search using category option
    When user click the category "<category>" in homepage
    And user click the sub-category "<subcategory>"
    Then user sees the results based on "<category>" and "<subcategory>"

    Examples: 
      | category | subcategory  |
      | Toys     | Comic        |
      | Brand    | Peter Rabbit |
