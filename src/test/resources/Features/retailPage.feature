Feature: Retail Wensite Feature

Background: 
	Given User is on Retail website

@test
Scenario: Open the retail wensite 
      Given User is on Retail website
      When User search "iPhone"
      And User click on search button
      Then User should see iPhone image   


	
@RegisterTest 	
Scenario: Register an Account test case
		When User click  on MyAccount
		And User click on Register option
		And User fill the Registration form with Below information
		|firstName|lastName|email|telephone|password|confirmPassword|subscribe|
		|Alex|Sokolova|alex@gmail.com|1012026633|test|test|no|
		And User accept the privacy and policy 
		And User click on Continue button
		Then User should be registered in Retail Website
       
    
      
 