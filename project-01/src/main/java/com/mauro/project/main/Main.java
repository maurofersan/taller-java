package com.mauro.project.main;

import com.mauro.utilitario.util.StringUtil;

public class Main {

	public static void main(String[] args) {
		String nombres[] = { "JuLio", "marcOs", "roBerto", "LUIS" };

		for (String nombre : nombres) {
			System.out.println(StringUtil.capitalize(nombre));
		}
		
		System.out.println(StringUtil.capitalize(""));
	}

}
