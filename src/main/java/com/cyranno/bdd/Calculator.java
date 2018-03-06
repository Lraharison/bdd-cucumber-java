package com.cyranno.bdd;

public class Calculator {

	private double res;

	public void divide(int a, int b) {
		res = (double) a / b;

	}

	public double getResultat() {
		return res;
	}

}
