package com.mockito.calcserv.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.mockitodemo.addserv.Calculadora;
import com.mockitodemo.calcserv.CalculatorService;

public class CalculatorServiceTest1 {
	@Test
	void testCalculatorServiceAdd() {
		System.out.println("******* Testing calculator add method*******");
		
		Calculadora calculadora;
		
		CalculatorService calculatorService;
		
		calculadora = Mockito.mock(Calculadora.class);
		calculatorService = new CalculatorService(calculadora);
		
		int a = 12;
		int b = 42;
		int expected = 54;
		
		when(calculadora.add(a, b)).thenReturn(expected);
		
		int actual = calculatorService.calcAdd(a, b);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculatorServiceSubs() {
		System.out.println("******* Testing calculator minus method*******");
		
		Calculadora calculadora;
		
		CalculatorService calculatorService;
		
		calculadora = Mockito.mock(Calculadora.class);
		calculatorService = new CalculatorService(calculadora);
		
		int a = 45;
		int b = 13;
		int expected = 32;
		
		when(calculadora.minus(a, b)).thenReturn(expected);
		
		int actual = calculatorService.calcSubs(a, b);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculatorServiceMult() {
		System.out.println("******* Testing calculator mult method*******");
		
		Calculadora calculadora;
		
		CalculatorService calculatorService;
		
		calculadora = Mockito.mock(Calculadora.class);
		calculatorService = new CalculatorService(calculadora);
		
		int a = 12;
		int b = 52;
		int expected = 624;
		
		when(calculadora.mult(a, b)).thenReturn(expected);
		
		int actual = calculatorService.calcMult(a, b);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculatorServiceDiv() {
		System.out.println("******* Testing calculator mult method*******");
		
		Calculadora calculadora;
		
		CalculatorService calculatorService;
		
		calculadora = Mockito.mock(Calculadora.class);
		calculatorService = new CalculatorService(calculadora);
		
		int a = 63;
		int b = 14;
		double expected = 4.5;
		
		when(calculadora.div(a, b)).thenReturn(expected);
		
		double actual = calculatorService.calcDiv(a, b);
		
		assertEquals(expected, actual);
	}

}
