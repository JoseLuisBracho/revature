package com.mockitodemo.addserv.impl;

import com.mockitodemo.addserv.Calculadora;

public class CalculadoraImpl implements Calculadora {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("******** Adding two integers (Implem Serv Layer) *******");
		return a+b;
	}

	@Override
	public int minus(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("******* Substracting two integers (Implem Serv Layer) *********");
		return a-b;
	}

	@Override
	public int mult(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("******** Multipliying two integers (Implem Serv Layer) ********");
		return 0;
	}

	@Override
	public double div(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("******** Dividing two integres (Implem Serv Layer) **********");
		if (b!=0) {
			return a/b;
		} else {
			return 0;
		}
	}



}
