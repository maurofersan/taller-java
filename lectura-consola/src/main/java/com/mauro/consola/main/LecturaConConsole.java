package com.mauro.consola.main;

import java.io.Console;

public class LecturaConConsole {

	public static void main(String[] args) {
		
		Console console = System.console();
		if (console != null){
			System.out.println("Ingresa tu nombre");
			String nombre = console.readLine();
	
			System.out.println("Ingrese apellido");
			String apellido = console.readLine();
			
			System.out.println("Ingrese su edad");
			int edad = Integer.parseInt(console.readLine());
			
			System.out.println("Ingrese su password:");
			char [] password = console.readPassword();
			String passwordStr = new String(password);
			
			//TODO modificar ñ por su valor unicode, Googlear Unicode table y buscar valor
			System.out.format("Su nombre es %s y su apellido es %s y tienes %d a\u00F1os\n", nombre, apellido,edad);
			System.out.println("Su password es: " + passwordStr);
		} else {
			System.out.println("La aplicaci\u00F3n no pudo encontrar una consola.");
		}
	}
}
