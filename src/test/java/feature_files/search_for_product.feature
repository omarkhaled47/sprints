@Regression
Feature: Search for a product

  Background:
    Given Customer opens the browser and navigates to egypt laptop website

  @searchForValidProduct
  Scenario Outline: As a guest I want to search for a specific product - Valid product
    When Customer enters the name of the "<Product>" he want to search for in search products field
    Then Validate customer can see popular suggestions appears
    When Customer press the search button
    Then Validate customer can see the number of products found
    And Validate customer can see the products found
    Examples:
      | Product |
      | Hp      |
      | Lenovo  |

  @searchForInvalidProduct
  Scenario Outline: As a guest I want to search for a specific product - Invalid product
    When Customer enters the name of the "<Product>" he want to search for in search products field
    When Customer press the search button
    And Validate customer can see no products found message appears
    Examples:
      | Product       |
      | Invalid_input |