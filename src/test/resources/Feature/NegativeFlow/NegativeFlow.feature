@Negative_Flow_VarProcess
Feature: VarProcess negative flow process
Scenario: Check the Invalidation from varprocess
Given Lanch the browser in as "chrome"
    When Enter the QUBES url as "http://34.124.173.240/"
    When Enter the valid Username give the input box as "admin@qms.com.my"
    Then Click the Get OTP button
    #Then Verfied the OTP in Outlook
    #Then Enter the Valid OTP give the input box
    And Click on the Test Environment
    
 Scenario: Check Negative Test case var process
  Given Click on VAR Process tab
    When Click on VAR1 Clinic tab
    Then Click on New button in varprocess1
    Then Give invaild datas in mandatroy details
    #Then With out supporting documents to checks