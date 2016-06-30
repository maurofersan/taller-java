package com.mauro.poo.main;

import com.mauro.poo.bean.Persona;

public class MainPersona {
	public static void main(String[] args) {
		Persona juan = new Persona();
		juan.nombre = "Juan";
		juan.apellido = "Rosas";
		juan.posicion = 0;
		
		Persona pedro = new Persona();
		pedro.nombre = "Pedro";
		pedro.apellido = "Arias";
		pedro.posicion = 0;
		
		juan.caminar(5);
		pedro.caminar(10);
		
		System.out.println("Juan esta en la posicion: " + juan.posicion);
		System.out.println("Pedro esta en la posicion: " + pedro.posicion);
		
		juan.cargar(pedro, 5);
		
		Persona.cargar(juan,pedro,5);
		
		System.out.println("Juan cargando a Pedro");
		System.out.println("Juan esta en la posicion: " + juan.posicion);
		System.out.println("Pedro esta en la posicion: " + pedro.posicion);
	}
}
