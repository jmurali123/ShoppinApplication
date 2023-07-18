@newfeature
Feature: Placing an oder
  Scenario: Placing an oder for Desktop Computers
    Given I'm an user on the Demo shopping application
    When I add a product with quantity to the cart
      | product                       | quantity |
      | Build your own cheap computer | 3        |