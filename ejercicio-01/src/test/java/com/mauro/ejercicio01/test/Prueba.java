package com.mauro.ejercicio01.test;

import com.mauro.utilitario.util.StringUtil;

public class Prueba {
	
	public static void main(String[] args) {
		System.out.println(StringUtil.truncate("Hola mundo", 7));
		System.out.println(StringUtil.truncate("java", 10));
		System.out.println(StringUtil.truncate("universidad", 2));
		System.out.println(StringUtil.truncate("laptop", 6));
		
		
	}
}
