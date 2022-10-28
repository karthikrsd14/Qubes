@End2EndVarProcessTest2
Feature: VarProcess Details check
Scenario: All mandatroy details give that varprocess
  Given Click on VAR Process tab
  When Click on VAR1 Clinic tab
  Then Click on New button in varprocess1
  And Enter the Varprocess1 All mandatroy details 
  Then Var process1 Clinic Save and submit

  Scenario: Performe var1 process
  Given Click on varprocess in var1
  When Search the VAR1 VS1 Additional New updtes value datas Equipment
  Then Click on generate the updated BE number
  And Upload all file mandatory
  Then Enter the all datas and Draft
  And Perform action tab new update in var1 vs1
  And Click on Save and forward
  Then Verification in forwarded status
  
  Scenario: Equipment management performed
  Given  Click on the equipment management tab
  When Click on BE registration tab
  Then Enter the BE number in active data from seach box
  Then Basic information tab are the next button click
  Then  Enter the datas for all manditory fild standrads components
  Then Enter the clinic information update new details
  And Click next button form finacial tab
  Then Enter the all other information details
  Then Add the supporting documents and save and submit
 
  
  Scenario: Performed in vs3 tab
  Given Click on VAR1_VS3 tab
  #When Enter the data in BE number search box
  #Then Verified the data for var1_vs2 tab
   
   