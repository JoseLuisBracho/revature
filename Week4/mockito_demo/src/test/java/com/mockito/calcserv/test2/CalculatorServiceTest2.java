package com.mockito.calcserv.test2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.mockitodemo.addserv.Calculadora;
import com.mockitodemo.calcserv.CalculatorService;

public class CalculatorServiceTest2 {
	
	// Same example using mock annotation
	CalculatorService calculatorService;
	
	@Mock
	Calculadora calculadora;
	
	@BeforeEach
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testCalculatorServiceAdd() {
		System.out.println("******* Testing calculator *******");
		
		calculatorService = new CalculatorService(calculadora);
		
		int a = 45;
		int b = 14;
		int expected = 59;
		
		when(calculadora.add(a, b)).thenReturn(expected);
		
		int actual = calculadora.add(a, b);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testCalculatorServiceSubs() {
		System.out.println("******* Testing calculator *******");
		
		calculatorService = new CalculatorService(calculadora);
		
		int a = 45;
		int b = 14;
		int expected = 31;
		
		when(calculadora.minus(a, b)).thenReturn(expected);
		
		int actual = calculadora.minus(a, b);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testCalculatorServiceMult() {
		System.out.println("******* Testing calculator *******");
		
		calculatorService = new CalculatorService(calculadora);
		
		int a = 45;
		int b = 14;
		int expected = 630;
		
		when(calculadora.mult(a, b)).thenReturn(expected);
		
		int actual = calculadora.mult(a, b);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testCalculatorServiceDiv() {
		System.out.println("******* Testing calculator *******");
		
		calculatorService = new CalculatorService(calculadora);
		
		int a = 45;
		int b = 10;
		double expected = 4.5;
		
		when(calculadora.div(a, b)).thenReturn(expected);
		
		double actual = calculadora.div(a, b);
		
		assertEquals(expected, actual);
	}

}
