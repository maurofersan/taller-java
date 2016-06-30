package com.mauro.poo.bean;

public class Persona {
	public String nombre;
	public String apellido;
	public int posicion;
	
	/**
	 * Caminar x metros
	 * @param metros
	 * 		numero de metros que ha avanzado
	 */
	public void caminar(int metros) {
		posicion += metros;
	}
	/**
	 * 
	 * @param persona persona a la que vas a cargar
	 * @param metros numero de metros que lo cargaste
	 */
	public void cargar(Persona persona, int metros) {
		posicion += metros;
		persona.posicion += metros;
	}
	
	public static void cargar(Persona elQueCarga, Persona elCargado, int metros) {
		elQueCarga.posicion += metros;
		elCargado.posicion += metros;
	}
}
