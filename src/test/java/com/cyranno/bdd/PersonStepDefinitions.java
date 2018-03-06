package com.cyranno.bdd;

import static org.assertj.core.api.Assertions.assertThat;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PersonStepDefinitions {
	private PersonRepository personRepository = new PersonRepository();

	@Before
	public void init() {
		personRepository.clear();
	}

	@Given("^La liste des personnes est vide$")
	public void la_liste_personne_est_vide() {
		assertThat(personRepository.count()).isEqualTo(0);
	}

	@When("^On ajoute (.*) dans la liste$")
	public void on_ajoute_dans_la_liste(String person) {
		personRepository.create(person);
	}

	@Then("^La liste contenant (.*) et la taille de la liste est egale a (\\d+)$")
	public void la_liste_contenant_Koto_et_la_taille_de_la_liste_est_egale(String person, int count) throws Throwable {
		assertThat(personRepository.count()).isEqualTo(count);
		assertThat(personRepository.find(person)).isNotNull();
	}

	@Given("^La liste contient des personnes et contient (.*)$")
	public void la_liste_contient_des_personnes_et_contient_Koto(String person) {
		personRepository.create(person);
		assertThat(personRepository.find(person)).isNotNull();
		assertThat(personRepository.count()).isGreaterThan(0);
	}

	@When("^On supprime (.*)$")
	public void on_supprime_Koto_dans_la_liste(String person) {
		personRepository.remove(person);
	}

	@Then("^On ne trouve plus (.*) dans la liste$")
	public void koto_n_est_plus_dans_la_liste(String person) throws Throwable {
		assertThat(personRepository.find(person)).isNull();
	}

}
