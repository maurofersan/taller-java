package com.mauro.ejercicio08.main;

import static com.mauro.utilitario.util.StringUtil.capitalizeAllWords;
import static com.mauro.utilitario.util.StringUtil.fullTrim;

import java.util.Arrays;
import java.util.Scanner;

import com.mauro.ejercicio08.bean.Alumno;

public class ClacularNotas {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Alumno[] alumnos = new Alumno[3];

//		System.out.println(alumnos);
		System.out.println(Arrays.toString(alumnos));
		// alumnos[0].setNombre("Nombre");

		for (int i = 0; i < alumnos.length; i++) {
			Alumno nuevoAlumno = new Alumno();
			System.out.println("Ingrese el nombre del alumno " + (i + 1) + ":");
			nuevoAlumno.setNombre(capitalizeAllWords(fullTrim(scanner.nextLine())));
			System.out.println("Ingrese la nota 1 del alumno " + (i + 1) + ":");
			nuevoAlumno.setNota(scanner.nextInt());
			scanner.nextLine();
			System.out.println(">Se va a agregar el alumno: " + nuevoAlumno.getNombre() 
								+ ", " + nuevoAlumno.getNota());
			alumnos[i] = nuevoAlumno;
			System.out.println(">Nuevo alumno agrgado en el indice " + i);
		}
		System.out.println("> alumnos: " + Arrays.toString(alumnos));
		for (Alumno alumno : alumnos) {
			alumno.mostrarDatos();
		}
		scanner.close();

	}
}
