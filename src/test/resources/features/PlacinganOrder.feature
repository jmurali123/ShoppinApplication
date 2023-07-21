@newfeature
Feature: Placing an oder
  Scenario: Placing an oder for Desktop Computers
    Given I'm an user on the Demo shopping application
    When I add a product with quantity to the cart
      | product                       | quantity |
      | Build your own cheap computer | 3        |
    Then I should see successmsg
      | successMsg                                       |
      | The product has been added to your shopping cart |

