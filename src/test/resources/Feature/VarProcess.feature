@End2EndVarProcessTest
Feature: VarProcess Details check

  Scenario: All mandatroy details give that varprocess
    Given Click on VAR Process tab
    When Click on VAR1 Clinic tab
    Then Click on New button in varprocess1
    And Enter the Varprocess1 All mandatroy details
    Then Var process1 Clinic Save and submit

  Scenario: Performe var1 process
    Given Click on varprocess in var1
    When Search the VAR1 VS1 Additional Equipment
    Then Click on generate the BE number
    And Upload all file mandatory
    Then Enter the all datas and Draft
    And Perform action tab in var1 vs1
    And Click on Save and forward
    Then Verification in forwarded status

  Scenario: Equipment management performed
    Given Click on the equipment management tab
    When Click on BE registration tab
    Then Enter the data from the search box
    Then Basic information tab are the next button click
    Then Enter the datas for all manditory fild standrads components
    Then Enter the clinic information details
    And Click next button form finacial tab
    Then Enter the all other information details
    Then Add the supporting documents and save and submit

  Scenario: performed on VAR1-VS2 Clinic Omission process
    Given Click on VAR1-VS2 Omission process tab
    When Clinic on New tab under Omission page
    Then Enter the BE number from Omission page tab
    Then Choose in the Supporting Document KEWPA15
    And Click on Save and submit button Omission page tab
    Then Valid data is checking in omission

  Scenario: Verified all view datas repeated
    Given Click on VAR Process tab
    When Click on VAR1 Clinic tab
    Then Click on New button in varprocess1
    And Enter the Varprocess1 All mandatroy details
    Then Var process1 Clinic Save and submit
    Given Click on varprocess in var1
    When Search the VAR1 VS1 Additional Equipment
    Then Click on generate the BE number
    And Upload all file mandatory
    Then Enter the all datas and Draft
    And Perform action tab replace data1
    And Click on Save and forward
    Then Verification in forwarded status 
    Given Click on the equipment management tab
    When Click on BE registration tab
    Then Enter the data BE number1 search box
    Then Basic information tab are the next button click
    Then Enter the datas for all manditory fild standrads components
    Then Enter the clinic information details
    And Click next button form finacial tab
    Then Enter the all other information details
    Then Add the supporting documents and save and submit
    
     Scenario: performed on VAR1-VS2 Clinic DER Omission process
  Then Check the validations VAR1_VS2
  Then Click on VAR1_VS2_Omission Of Equipment tab