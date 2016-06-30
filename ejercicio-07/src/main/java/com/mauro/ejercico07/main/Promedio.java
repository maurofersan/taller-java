package com.mauro.ejercico07.main;

import java.util.Scanner;

import com.mauro.utilitario.util.StringUtil;

public class Promedio {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el nombre del alumno:");
		String nombre = scanner.nextLine();
		System.out.println("Ingrese la nota 1 del alumno");
		int nota1 = scanner.nextInt();
		System.out.println("Ingrese la nota 2 del alumno");
		int nota2 = scanner.nextInt();
		System.out.println("Ingrese la nota 3 del alumno");
		int nota3 = scanner.nextInt();

		nombre = StringUtil.capitalizeAllWords(StringUtil.fullTrim(nombre));
		int[] notas = { nota1, nota2, nota3 };

		String estado = "";

		estado = calcularPromedio(notas) > 10.0 ? "aprobado" : "desaprobado";

		System.out.format("El nombre del alumno es %s y su promedio final es %.2f el alumno esta %s ", nombre,
				calcularPromedio(notas), estado);
		scanner.close();

	}

	public static double calcularPromedio(int notas[]) {
		int notaTotal = 0;
		for (int i = 0; i < notas.length; i++) {
			notaTotal += notas[i];
		}
		return notaTotal / (notas.length);
	}
}
