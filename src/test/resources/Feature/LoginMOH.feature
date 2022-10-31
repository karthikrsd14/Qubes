Feature: Login Multiple user perform
@Clinic_Admin 
Scenario: Login Clinic Administrator details
Given Lanch the browser in as "chrome"
When Enter the QUBES url as "http://34.124.173.240/"
Then Enter the valid Username give the input box as "PRK004"
Then Click the Get OTP button
Then Perform varprocess all details