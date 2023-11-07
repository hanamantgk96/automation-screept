
@tag
Feature: Title of your feature
  I want to use this template for my feature file

 @Login_01
  Scenario: Login to the application with valid credentials successfully and validate Login page
    Given Launch the browser
    When Login with username "SNOCADMIN" and password "Snoc@1234"
    Then Verify the login is successful
    Given Click dot symbol
    When click on order option
    When click on View Order Option  
  
  
 
