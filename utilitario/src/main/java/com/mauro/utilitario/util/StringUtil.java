package com.mauro.utilitario.util;

/**
 * Clase con metodos complementarios para manejo de Strings
 * 
 * @see java.lang.String
 * @author Mauro Fernandez
 * @since 1.0
 *
 */
public class StringUtil {
	/**
	 * 
	 * retorna una cadena con el primer caracter en mayuscula y los demas
	 * caracteres en minuscula. <br>
	 * Ejemplo: StringUtil.capitalize("juan") returns "Juan"
	 * 
	 * @since 1.0
	 * @param source:
	 *            cadena que se le aplicara el capitalize
	 * @return cadena que se le aplico capitalize
	 */
	public static String capitalize(String source) {

		if (source == null || source.isEmpty()) {
			return source;
		}
		String primerCaracter = source.substring(0, 1);
		String demasCaracteres = source.substring(1);
		primerCaracter = primerCaracter.toUpperCase();
		demasCaracteres = demasCaracteres.toLowerCase();
		return primerCaracter + demasCaracteres;
	}

	/**
	 * Trunca una cadena a un maximo de caracteres
	 * 
	 * @since 1.1
	 * @param cadena:
	 *            cadena a truncar
	 * @param numcaracteres:
	 *            numero maximo de caracteres de la nueva cadena
	 * @return cadena truncada
	 */
	public static String truncate(String cadena, int numcaracteres) {

		if (cadena == null) {
			return cadena;
		}
		if (cadena.length() <= numcaracteres) {
			return cadena;
		}
		return cadena.substring(0, numcaracteres);
	}

	/**
	 * Multiplica la cadena ingresada por parametro n veces
	 * 
	 * @since 1.2
	 * @param cadena:
	 *            cadena fuente
	 * @param times:
	 *            numero de veces a repetir
	 * @return: cadena repetida "n veces"
	 */
	public static String times(String cadena, int times) {

		if (cadena == null) {
			return cadena;
		}
		String cadenaTimes = "";
		for (int i = 0; i < times; i++) {

			cadenaTimes += cadena;
		}

		return cadenaTimes;
	}

	/**
	 * Invierte la cadena
	 * 
	 * @since 1.2
	 * @param cadena:
	 *            cadena a invertir
	 * @return retorna la cadena invertida
	 */
	public static String reverse(String cadena) {

		String cadenaReverse = "";
		if(cadena == null) {
			return null;
		}
		for (int i = cadena.length() - 1; i >= 0; i--) {
			cadenaReverse += cadena.charAt(i);

		}
		return cadenaReverse;
	}

	/**
	 * Recibe una cadena como parametro y le aplica capitalize a cada palabra
	 * que tenga esa cadena. Una palabra es cada conjunto de caracteres
	 * separados por espacio.
	 * 
	 * Example: StringUtil.capitalizeAllWords("hola mundo") : "Hola Mundo"
	 * StringUtil.capitalizeAllWords("java wOrld") : "Java World"
	 * 
	 * @since 1.2
	 * @param cadena:
	 *            cadena de entrada
	 * @return String con palabras internas aplicadas capitaliza
	 */
	public static String capitalizeAllWords(String cadena) {
		boolean esInicioDePalabra = true;
		String resultado = "";
		if(cadena == null) {
			return null;
		}
		for (int i = 0; i < cadena.length(); i++) {
			char caracterActual = cadena.charAt(i);

			// char caracterTransformado;
			// if(esInicioDePalabra) {
			// caracterTransformado = Character.toUpperCase(caracterActual);
			// } else {
			// caracterTransformado = Character.toLowerCase(caracterActual);
			// }
			char caracterTransformado = (esInicioDePalabra) ? Character.toUpperCase(caracterActual)
					: Character.toLowerCase(caracterActual);

			// boolean esEspacioEnBlanco =
			// Character.isWhitespace(caracterActual);
			// if(esEspacioEnBlanco) {
			// esInicioDePalabra = true;
			// } else {
			// esInicioDePalabra = false;
			// }
			boolean esEspacioEnBlanco = Character.isWhitespace(caracterActual);
			esInicioDePalabra = esEspacioEnBlanco;
			resultado += caracterTransformado;
		}

		return resultado;
	}

	/**
	 * Intercambio los caracteres de la cadena pasada por parametro a minuscula o
	 * mayuscula segun los caracteres de la cadena. 
	 * 
	 * @since 1.2
	 * @param cadena: cadena a intercambiar caracteres a minuscula o mayuscula.
	 * @return cadena intercambiada caracteres a minuscula o mayuscula.
	 */
	public static String swapCase(String cadena) {

		String resultado = "";
		if (cadena == null) {
			return null;
		}
		for (int i = 0; i < cadena.length(); i++) {

			if (Character.isUpperCase(cadena.charAt(i))) {

				char upperCase = Character.toLowerCase(cadena.charAt(i));
				resultado += upperCase;

			} else {
				char lowerCase = Character.toUpperCase(cadena.charAt(i));
				resultado += lowerCase;
			}
		}
		return resultado;
	}
	/**
	 * Remueve los espacios a los extrems de la cadena especificada y si encuentra espacios
	 * de mas de un caracter entre palabras los convierte a espacios de un solo caracter.
	 * 
	 * @since 1.2
	 * @param cadena: cadena de String a quitar espacios al extremo y convertir espacios mas
	 * de un caracter entre palabras en un solo espacio.
	 * @return cadena sin espacios al extremo y un solo espacio entre palabras.
	 */
	public static String fullTrim(String cadena) {
		
		if(cadena == null){
			return null;
		}
		boolean esEspacio = true;
		String cadenaTrim = cadena.trim();
		String resultado = "";
		for (int i = 0; i < cadenaTrim.length(); i++) {
			
			if(Character.isWhitespace(cadenaTrim.charAt(i)) && esEspacio) {
				
				resultado += cadenaTrim.charAt(i);
				esEspacio = false;
			} else if(!Character.isWhitespace(cadenaTrim.charAt(i))){
				resultado += cadenaTrim.charAt(i);
				esEspacio = true;
			}
		}
		
		return resultado;
	}

}
