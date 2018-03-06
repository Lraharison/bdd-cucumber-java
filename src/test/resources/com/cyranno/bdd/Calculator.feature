Feature: Calculator

Scenario: diviser deux nombres 10 par 2
	Given recupere le calculator
	When je divise 10 par 2
	Then Le resultat est 5