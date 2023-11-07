
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: perform the restock operation
  	Given navigate the view order page
    When click an Awaiting Payment option
    And click Reject order items option
    And select products for which product qty you want to reject 
    And enter the reject qty 
    And select Reject Reasons
    And select Action Type and give comment
    And click save button
    Then Validate the data in inventory

  
