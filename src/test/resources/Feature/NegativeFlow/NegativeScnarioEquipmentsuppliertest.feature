@EndtoEndTestCase_Equipment_supplier
Feature: Pass the Valid Positive Test

  #@QUBESLoginTest
  #Scenario Outline: Login the Page in Valid credentials
    #Given Lanch the browser in as "chrome"
    #When Enter the QUBES url as "http://34.124.173.240/"
    #When Enter the valid Username give the input box as "<Username>"
    #Then Click the Get OTP button
#
    #Examples: 
      #| Username       |
      #| info@thelipl.i |
      #|                |
#
  @QUBESLoginTest
  Scenario: Login the Page in Valid credentials
    Given Lanch the browser in as "chrome"
    When Enter the QUBES url as "http://34.124.173.240/"
    When Enter the valid Username give the input box as "admin@qms.com.my"
    Then Verfied the OTP in Outlook
    Then Enter the Valid OTP give the input box
    And Click on the Test Environment

  @Masterdetail_Equipments_supplier_check
  Scenario: check the all master details QUBES in New manufacturer suppiler details Customer
    Given Click on master tab
    When Click on supplier and manufacturer tab
    #When Verfied the Equipment Supplier Details tabs
    #Then Click on new button
    #Then Click on Generated code without values
    #Then Click on exitisting data
    #And Click on the new datas master tab
    #Then Empty datas are give the validations
    #And Enter Address only
    #Then Enter the datas in Contact and address
    #And Enter also contact number
    #Then Enter all the datas vaildations
    #Then Click on save and submit button
    #Then Click on Ok button in conformation
    #And Click on the create successfully Ok button
#
  #@performed_action_tab
  #Scenario: edit for action tab
    #Given Click on action button
    #When perform neagtive flows
    #Then edit2 with out address equipment details
    #Then edit3 with out Mobile no equipment details
    #Then edit4 with out Email id equipment details
    #Then edit5 Contact person details
    #Then edit6 equipment save and submit details

  @Manufacturer_flow_details
  Scenario: perform manufacturer details
    Given Click on the ManufacturerDetails tab in master
    When Click on new manufacurer button from manufacturer details
    Then Click on Generate Code button from manufacturer details
    And Enter the manufacturer exists Name with out catagory details
    Then Click on BE catagory model in check box
    Then Enter the vaild name for manufacturer input box
    And With out data mandatory filed give save and submited
    Then Enter the input box contact person name
    Then Enter the input box Email ID primary
    Then Enter the input box contact number landline
    Then Enter the input box contact number mobile
    Then Click on save submit button manufacturer details

   #@manufacuturer_edit_tab
   #Given Click on action tab from manufacturer details tab
   #When 