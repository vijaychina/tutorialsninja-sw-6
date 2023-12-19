@regression
Feature: Desktops Test
  As user I want to verify the product arranged in alphabetical order

  @author_vijaykumar
  Scenario: User should be able to verify the product arranged in alphabetical order
    Given I am on homepage
    When I mouse hover and click on Desktops tab
    And I pass selectMenu method name "Show AllDesktops"
    And I select sort by position "Name (Z - A)"
    Then I should be able to verify that the product is arranged in descending order


  Scenario Outline: User should be able to verify that product is added to shopping cart successfully
    Given I am on homepage
    When I mouse hover and click on Currency Dropdown
    And I mouse hover and click on £Pound Sterling
    When I mouse hover and click on Desktops tab
    And I pass selectMenu method name "Show AllDesktops"
    And I select sort by position "Name (A - Z)"
    And I click on "<product>"
    And I verify the text "<product>"
    And I enter qty "1"
    And I click on “Add to Cart” button
    And I verify the message "Success: You have added HP LP3065 to your shopping cart!"
    And I click on link "shopping cart"
    Then I Verify the Product name "<product>"
    And I Verify the Model "<model>"
    And I Verify the Todal "<price>"
    Examples:
      | product      | model      | price   |
      | HTC Touch HD | Product 1  | £74.73  |
      | iPhone       | product 11 | £75.46  |
      | iPod Classic | product 20 | £74.73  |
      | MacBook      | Product 16 | £368.73 |
      | MacBook Air  | Product 17 | £736.23 |
      | Sony VAIO    | Product 19 | £736.23 |