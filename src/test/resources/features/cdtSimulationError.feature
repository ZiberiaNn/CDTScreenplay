Feature: CDT simulation error
  As a user
  I want to be able to start to simulate a loan
  So that I can see an error message when I enter a wrong CDT amount

  Background:
    Given I am on the Bancolombia's CDT simulator website
    When I click on "CONTINUAR" button

  Scenario: Simulate a free investment loan
    When I enter an invest amount that is under 1000000
    Then I should see the error message "El campo no cumple con el valor mínimo: $1,000,000"