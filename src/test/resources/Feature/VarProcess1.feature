@End2EndVarProcessTest1
Feature: VarProcess Details check

  Scenario: All mandatroy details give that varprocess
    Given Click on VAR Process tab
    When Click on VAR1 Clinic tab
    Then Click on New button in varprocess1
    And Enter the Varprocess1 All mandatroy details
    Then Var process1 Clinic Save and submit

  Scenario: Performe var1 process
    Given Click on varprocess in var1
    When Search the VAR1 VS1 Additional New datas Equipment
    Then Click on generate the BE number
    And Upload all file mandatory
    Then Enter the all datas and Draft
    And Perform action tab in var1 process BE Number12
    And Click on Save and forward
    Then Verification in forwarded status

  Scenario: Equipment management performed
    Given Click on the equipment management tab
    When Click on BE registration tab
    Then Enter the BE number for seach box number12
    Then Basic information tab are the next button click
    Then Enter the datas for all manditory fild standrads components
    Then Enter the clinic information details
    And Click next button form finacial tab
    Then Enter the all other information details
    Then Add the supporting documents and save and submit

  #Scenario: performed on VAR1-VS2 Clinic Omission process
    #Given Click on VAR1-VS2 Omission process tab
    #When Clinic on New tab under Omission page
    #Then Enter the BE number from Omission page tab
    #Then Choose in the Supporting Document KEWPA15
    #And Click on Save and submit button Omission page tab

  Scenario: Peroformed all the datas by repeated and reused perform
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
    And Perform action tab in var1 perform by the BE number123
    And Click on Save and forward
    Then Verification in forwarded status
    Given Click on the equipment management tab
    When Click on BE registration tab
    Then Enter the vaild BE number in search box
    Then Basic information tab are the next button click
    Then Enter the datas for all manditory fild standrads components
    Then Enter the clinic information details
    And Click next button form finacial tab
    Then Enter the all other information details
    Then Add the supporting documents and save and submit
   