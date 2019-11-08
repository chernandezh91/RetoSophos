Feature: As a user I want to select a product from the vivanda store to make your purchase

  Scenario: select a product and verify that it is in the cart
    Given the user enters the vivanda page
    When i select the desired product
      | nameProduct |
      | vino        |
    Then verify that is in the shopping cart
      | verifyField |
      | !Gracias! Ya guardamos tu elección|