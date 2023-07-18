@Regression
Feature: User Authentication
  As a user,
  I want to be able to authenticate myself,
  So that I can access my account.

  Background:
    Given this is background step
  @Regression
  Scenario: Successfull login
    Given a registered user with the email "planittest78@gmail.com" and password "123456"
    When the user enters the credentials and clicks on the login
    Then the system should authenticate the user

  @Regression @smoke
  Scenario Outline: OutlineTest
    Given I have a product "<productname>" with quantity "<quantity>" to the cart
    Then the product is added successfully

    Examples:
      | productname | quantity |
      | product1    |5         |
      | product2    |6         |


  Scenario: Datatabletest
    Given the user is on the landing page
      | Rajesh  | Rajesh@123 |
      | Sukriti | S@1234     |


  Scenario: DatatabletestasMap
    Given the user entered the creds
      | username          | password   |  |
      | Rajesh@gmail.com  | Rajest123  |  |
      | Sukriti@gmail.com | Sukriti123 |  |

  @endtoend
  Scenario: Verify test data
    Given I have the below test data
"""
  {
  "users": [
  {
  "name": "john",
  "age": 30
  },
  {
  "name": "Peter",
  "age": 25
  }
  ]
  }
  """
