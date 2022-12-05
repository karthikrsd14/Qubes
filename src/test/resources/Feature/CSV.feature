@EndtoEndTestCase_Equipment_supplier
Feature: Pass the Valid Positive Test

  @QUBESLoginTest
  Scenario: Login the Page in Valid credentials
    Given Lanch the browser in as "chrome"
    When Enter the QUBES url as "http://34.124.173.240/"
    When Enter the valid Username give the input box as "info@thelipl.in"
    Then Click the Get OTP button
    Then Verfied the OTP in Outlook
    Then Enter the Valid OTP give the input box
    And Click on the Test Environment
     Given Click on the equipment management tab
    When Click on BE registration tab
    Then Upload all the Document CSV