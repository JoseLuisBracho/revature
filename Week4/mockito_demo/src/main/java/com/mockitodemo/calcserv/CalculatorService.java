package com.mockitodemo.calcserv;

import com.mockitodemo.addserv.Calculadora;

public class CalculatorService {
	private Calculadora calculator;

	public CalculatorService(Calculadora calculator) {
		super();
		this.calculator = calculator;
	}
	
	public int calcAdd(int a, int b) {
		System.out.println("***** Calculator service add executed ******");
		return calculator.add(a, b);
	}
	
	public int calcSubs(int a, int b) {
		System.out.println("***** Calculator service minus executed ******");
		return calculator.minus(a, b);
	}
	
	public int calcMult(int a, int b) {
		System.out.println("***** Calculator service add executed ******");
		return calculator.mult(a, b);
	}
	
	public double calcDiv(int a, int b) {
		System.out.println("***** Calculator service add executed ******");
		return calculator.div(a, b);
	}

}
