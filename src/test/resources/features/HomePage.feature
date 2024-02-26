
Feature: HomePage

  @smoke
  Scenario: Search Product
    
    Given I click esc keyword to close landing page popups
    Then I validated home page   
    When I click on search box
    And I type product on search box
 

  