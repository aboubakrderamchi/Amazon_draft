@login_feature
Feature: Amazon Login functionality validation

Scenario:
	Given User is on Amazon Page
	When User enters username
	Then User click on continue button
	When User enters password
	And User click on sign in button
	Then Get title
	Then User should be able to land on the homepage
	
