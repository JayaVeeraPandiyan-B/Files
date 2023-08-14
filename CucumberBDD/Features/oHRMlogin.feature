Feature: Check orange HR login page

Scenario: Check valid credentials
	
	Given User is on the orange HR login page
	When User keys the valid username
	And User keys the valid password
	And User click on the login button
	Then Browser should navigate to the home page

