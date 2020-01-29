@sprint2 @addemployee
Feature: Add Employee

  @smoke
  Scenario: Add new Employee
    Given I open browser and navigated to the HRMS
    And I am logged into HRMS
    And I navigated to Add Employee Page
    When I add firstName, middleName and last name
    And I click Save
    Then I see Employee has been succesfully added
    And I close browser
