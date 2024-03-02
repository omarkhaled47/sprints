@Regression
Feature: Adding items to a cart

  Background:
    Given Customer opens the browser and navigates to egypt laptop website

  @EmptyCart
  Scenario: As a guest I want to the cart - empty cart
    When Customer clicks on cart button
    Then Validate customer can see empty cart message appears

  @addItemToCart
  Scenario Outline: As a guest I want to add items to card in order to continue purchasing
    When Customer enters the name of the "<Product>" he want to search for in search products field
    And Customer press the search button
    * Customer clicks on the product he wants to purchase
    * Customer clicks on add to cart button
    * Customer clicks on checkout button
    Then Validate customer can see the product added to cart successfully

    Examples:
      | Product |
      | Hp      |
