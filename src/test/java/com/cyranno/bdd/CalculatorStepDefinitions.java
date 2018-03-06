package com.cyranno.bdd;

import static org.assertj.core.api.Assertions.assertThat;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalculatorStepDefinitions {

	private Calculator calculator;

	@Given("^recupere le calculator$")
	public void recupereCalculator() {
		calculator = new Calculator();
	}

	@When("^je divise (\\d+) par (\\d+)")
	public void diviseDeuxNombres(int a, int b) {
		calculator.divide(a, b);
	}

	@Then("^Le resultat est (\\d+)$")
	public void recupererResultat(double resultat) {
		assertThat(calculator.getResultat()).isEqualTo(resultat);
	}

}
