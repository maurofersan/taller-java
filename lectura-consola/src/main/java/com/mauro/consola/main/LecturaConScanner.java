package com.mauro.consola.main;

import java.util.Scanner;

public class LecturaConScanner {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Ingresa tu nombre");
			String nombre = scanner.nextLine();

			System.out.println("Ingrese apellido");
			String apellido = scanner.nextLine();
			
			System.out.println("Ingrese su edad");
			int edad = scanner.nextInt();
			
			System.out.format("Su nombre es %s y su apellido es %s y tienes %d anios\n", nombre, apellido,edad);
			
			scanner.close();
	}

}
