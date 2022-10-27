@EndtoEndTestCaseQUBES
Feature: Check Clinic_check details

  @Clinic_details_check
  Scenario: check the all master details QUBES in Clinic details Customer
    Given Click on clinic tab
    Then Enter Clinic registration details
    Then Enter Working Day and Time For Clinic
    And Enter Additional Contact
    Then Click on Clinic list action tabs perform
    Then verified the hyperlink details
    And Download verified xlsx and pdf
