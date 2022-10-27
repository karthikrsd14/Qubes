@EndtoEndTestCase_Equipment_supplier
Feature: Pass the Valid Positive Test

  @QUBESLoginTest
  Scenario: Login the Page in Valid credentials
    Given Lanch the browser in as "chrome"
    When Enter the QUBES url as "http://34.124.173.240/"
    When Enter the valid Username give the input box as "rkarthik@ideassion.com"
    Then Click the Get OTP button
    #Then Verfied the OTP in Outlook
    #Then Enter the Valid OTP give the input box
    And Click on the Test Environment
  #@Masterdetail_Equipments_supplier_check
  #Scenario: check the all master details QUBES in New manufacturer suppiler details Customer
    #Given Click on master tab
    #When Click on supplier and manufacturer tab
    #When Verfied the Equipment Supplier Details tabs
    #Then Click on new button
    #Then Enter the Equipment supplier name text box in new data
    #Then Click on Generated code
    #And Enter the all mandatoryfiled in data
    #Then Click on save and submit button
    #Then Click on Ok button in conformation
    #And Click on the create successfully Ok button
#@supplier_verified
  #Scenario: verified the new acitve yes customer details
    #Given Click on action button
    #When Click on save submit button
    #Then Click on suppilercode hyperlink and verfied
    #And Download on Excel and Pdf
    #Then Verfied the download file
#
#@active_to_inactive_Equipment_supplier
  #Scenario: Update data give active no vaildation
    #Then Click on new button
    #Then Enter the Equipment supplier name text box in new data
    #Then Click on Generated code
    #And Enter the all mandatoryfiled in data
    #Then Click on save and submit button
    #Then Click on Ok button in conformation
    #And Click on the create successfully Ok button
    #Then click on action button
    #Then Edit all the datas
    #When Click on active button
    #Then Click on suppilercode hyperlink and verfied
    #And Download on Excel and Pdf
    #Then Verfied the download file
