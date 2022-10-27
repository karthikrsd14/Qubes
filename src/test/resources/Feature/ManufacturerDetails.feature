@EndtoEndTestCase_Manufacturer_details
Feature: Check manufacturerdetails_check

  @Active_yes_manufacturer_details
  Scenario: check the all master details QUBES in New manufacturer details active yes Customer
    Then Click on the ManufacturerDetails tab
    Then Click on new manufacurer button
    Then Enter the Category type
    Then Enter the Manufacturer Name
    Then Click on Generated manufacurer code button
    And Enter the all mandatoryfiled in data in manufacturer details page
    Then Click on save and submit button in manufacturer details page
    Then Click on Ok button in conformation in manufacturer details page
    Given Click on action tab
    When Click on hyperlink

  @Active_No_manufacturer_details
  Scenario: update new active yes data
    Then Click on new manufacurer button
    Then Enter the Category type
    Then Enter the Manufacturer Name
    Then Click on Generated manufacurer code button
    And Enter the all mandatoryfiled in data in manufacturer details page
    Then Click on save and submit button in manufacturer details page
    Then Click on Ok button in conformation in manufacturer details page
    Given Click on action tab
    When Click on active button in No
    When Click on hyperlink

  @manufacture_details_modules
  Scenario: Add all manufacture details and modules
    Given Click on Manufacturer and Model tab
    When Click on New button manufacturemodel
    When Category manufacturemodel
    Then Search the Manufacturer and Model details
    Then Save and submit manufacturemodel
    Then update data all manufacturer model details
    Then Verified all the data in manufacturer
    And Download pdf and xlsx
