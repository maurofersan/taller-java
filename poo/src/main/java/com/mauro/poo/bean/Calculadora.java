package com.mauro.poo.bean;

public class Calculadora {
	
	private int resultado;
	
	public int getResultado() {
		return resultado;
	}
	public void sumar(int sumando1, int sumando2) {
		resultado = sumando1 + sumando2;
	}
	public void restar(int minuendo, int sustraendo) {
		resultado = minuendo - sustraendo;
	}
	public void multiplicar(int sumando1, int sumando2) {
		resultado = sumando1 * sumando2;
	}
	public void dividir(int sumando1, int sumando2) {
		resultado = sumando1 / sumando2;
	}

}
