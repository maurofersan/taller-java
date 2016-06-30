package com.mauro.ejercicio08.bean;

public class Alumno {

	private String nombre;
	private double nota;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	public void mostrarDatos() {
		System.out.format("El nombre del alumno 1 es %s y su nota es %.2f\n", nombre,
				nota);
	}
}
