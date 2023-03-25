Feature: To verify the addtocart functionality of the
  application

  Background: 
    Given user launches phillipstoys application
    When user enter the product in search box
    And user click the search button

  @sanity
  Scenario: To add the product to add to cart page
    When user add the product to add to cart
    Then user sees the add to cart page

  @sanity
  Scenario: To increase the count of product in add to
    cart page

    When user add the product to add to cart
    And user increase the count in add to cart
    Then user sees the add to cart page with increase count
