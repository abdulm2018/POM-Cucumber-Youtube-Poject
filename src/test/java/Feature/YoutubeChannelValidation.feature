@UATTesting
Feature: Youtube channel name Validation
Scenario: Youtube channel name validations 
	Given OPEN Chrome browser with URL
	When Search selenium tutorial 
	And Click on channel name 
	Then Validate channel name  
	