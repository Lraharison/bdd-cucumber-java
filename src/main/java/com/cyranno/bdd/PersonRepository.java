package com.cyranno.bdd;

import java.util.HashSet;
import java.util.Set;

public class PersonRepository {

	private Set<String> persons = new HashSet<>();

	public int count() {
		return persons.size();
	}

	public void create(String person) {
		persons.add(person);
	}

	public String find(String person) {
		for (String p : persons) {
			if (p.equals(person)) {
				return p;
			}
		}
		return null;
	}

	public void clear() {
		persons.clear();

	}

	public void remove(String person) {
		persons.remove(person);

	}

}
