Feature: Manufacture model detils

  Scenario: Negative flow for manufacturer details
    Given Click on Manufacturer and Model tab
    When Click on New button manufacturemodel
    Then Click on save and submit button manufacturer model
    And Select verified manufacturer name drop down
    Then Click on Catagory BE catagory
    And Select the manufacurer details without verified manufacturer name
    And Select verified manufacturer name drop down
 