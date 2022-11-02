@EndtoEndTest
Feature: Login Multiple user perform

  @Clinic_Admin_MoH_vaprocess_clinic_user
  Scenario: Login Clinic Administrator details
    Given Lanch the browser in as "chrome"
    When Enter the QUBES url as "http://34.124.173.240/"
    Then Enter the valid Username give the input box as "PRK004"
    Then Click the Get OTP button
    Then Verfied the OTP in Outlook
    Then Enter the Valid OTP give the input box
    And Click on the Signin button
   Then Click on VAR Process from the MOH user tab 
    Then Click on New button in varprocess1
    Then Click on VAR1 Clinic from the MOH user tab
    Then Var process1 Clinic Save and submit
  
  @Clinic_Admin_MoH_vaprocess_State_manager_user
  Scenario: Login Clinic Administrator details
    Given Lanch the browser in as "chrome"
    When Enter the QUBES url as "http://34.124.173.240/"
    Then Enter the valid Username give the input box as "haja.kuthubudin@qms.com.my"
    Then Click the Get OTP button
    Then Verfied the OTP in Outlook
    Then Enter the Valid OTP give the input box
     And Click on the Test Environment
   Then Click on statemanager varprocess
    Then Click on generate the BE number
    And Upload all file mandatory
    Then Enter the all datas and Draft
    And Perform action tab in var1 vs1
    And Click on Save and forward
    Then Verification in forwarded status