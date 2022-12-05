@EndtoEndTest
Feature: Login Multiple user perform

  @Clinic_Admin_MoH_vaprocess_clinic_user
  Scenario: Login Clinic Administrator details
    Given Lanch the browser in as "chrome"
    When Enter the QUBES url as "http://34.124.173.240/"
    Then Enter the valid Username give the input box as "PRK004"
    Then Verfied the OTP in Outlook
    Then Enter the Valid OTP give the input box
    And Click on the Signin button
   Then Click on VAR Process from the MOH user tab 
    Then Click on New button in varprocess1
    Then Click on VAR1 Clinic from the MOH user tab
    Then Var process1 Clinic Save and submit
    Then Click on VAR Process from the MOH user tab 
    Then Click on New button in varprocess1
    Then Click on VAR1 Clinic from the MOH user tab
    Then Var process1 Clinic Save and submit
    And Click on the var1_vs2_Omission page
    Then Enter the BE number from Omission page tab
    Then Choose in the Supporting Document KEWPA15
    And Click on Save and submit button Omission page tab
    Then Valid data is checking in omission
    
  
  @Clinic_Admin_MoH_vaprocess_State_manager_user
  Scenario: Login Clinic Administrator details
    Given Lanch the browser in as "chrome"
    When Enter the QUBES url as "http://34.124.173.240/"
    Then Enter the valid Username give the input box as "haja.kuthubudin@qms.com.my"
    Then Verfied the OTP in Outlook
    Then Enter the Valid OTP give the input box
    And Click on the Signin button
     And Click on the Test Environment
   Then Click on statemanager varprocess
    Then Click on generate the BE number
    And Upload all file mandatory
    Then Enter the all datas and Draft
    And Perform action tab in var1 vs1
    And Click on Save and forward
    Then Verification in forwarded status
    
    @Clinic_Admin_AMD_user
    Scenario: Login Clinic AMD Details verified
    Given Lanch the browser in as "chrome"
    When Enter the QUBES url as "http://34.124.173.240/"
    Then Enter the valid Username give the input box as "prkqaam@qms.com.my"
    Then Verfied the OTP in Outlook
    Then Enter the Valid OTP give the input box
    And Click on the Signin button
     And Click on the Test Environment
     Then Perform BE registration process
      Then Basic information tab are the next button click
    Then Enter the datas for all manditory fild standrads components
    Then Enter the clinic information details
    And Click next button form finacial tab
    Then Enter the all other information details
    Then Add the supporting documents and save and submit
    