Feature: CDT simulation succesfully
  As a user
  I want to be able to simulate a loan
  So that I can get an estimate of the monthly payments

  Background:
    Given I am on the Bancolombia's CDT simulator website
    When I click on "CONTINUAR" button

  Scenario: Simulate a free investment loan
    When I enter an invest amount between 1000000 and 5000000000
    And I select "Si" for the question "¿Sabes a qué plazo deseas mantenerlo? (días)"
    And I enter a deadline of between 60 and 540 days
    And I click on "SIMULAR"
    Then I should see the estimated monthly payment