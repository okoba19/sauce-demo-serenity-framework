Feature: Login Feature
  As a User
  I want to login to the Application Sauce Demo
  So that I can get access to all of the functionality.

Scenario: Login with correct credentials
Given I open a Login page
  When I enter 'standard_user' in the Username input field on the login page
  And I enter 'secret_sauce' in the Password input field on the login page
  And I click on the Login button on the login page
  Then The product list is displayed on the product page