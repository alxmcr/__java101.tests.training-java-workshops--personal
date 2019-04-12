package amcoca.topic12.regularexpression.exercise2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * PA�S - Abreviatura: BO: Bolivia (2 letras MAYUSCULAS)
 *
 *
 * @author Alejandro M. Coca Rojas
 *
 */
public class Principal {

	public static void main(String[] args) {
		String expresionRegular = "([A-Z]{2})";
		String cadena1 = "BO", cadena2 = "BRA", cadena3 = "UR", cadena4 = "12", cadena5 = "A2", cadena6 = "b2", cadena7 = "bo";
		boolean resultado;

		Pattern patron = Pattern.compile(expresionRegular);
		System.out.println("Exp. Regular: " + patron.pattern());

		// Caso de Prueba 1
		Matcher validador = patron.matcher(cadena1);
		resultado = validador.matches();

		System.out.println();
		System.out.println("============ Resultado Prueba 1: '" + cadena1
				+ "' (" + cadena1.length() + " caracteres ) ==========");

		if (resultado) {
			System.out
					.println("Exitoso, la exp.reg. coincide con el dato de prueba");
		} else {
			System.out
					.println("Erroneo, la exp.reg. NO coincide con el dato de prueba");
		}
		System.out
				.println("==============================================================");

		// Caso de Prueba 2
		validador = patron.matcher(cadena2);
		resultado = validador.matches();
		System.out.println("============ Resultado Prueba 2: '" + cadena2
				+ "' (" + cadena2.length() + " caracteres) ==========");

		if (resultado) {
			System.out
					.println("Exitoso, la exp.reg. coincide con el dato de prueba");
		} else {
			System.out
					.println("Erroneo, la exp.reg. NO coincide con el dato de prueba");
		}
		System.out
				.println("==============================================================");

		// Caso de Prueba 3
		validador = patron.matcher(cadena3);
		resultado = validador.matches();
		System.out.println("============ Resultado Prueba 3: '" + cadena3
				+ "' (" + cadena3.length() + " caracteres) ==========");

		if (resultado) {
			System.out
					.println("Exitoso, la exp.reg. coincide con el dato de prueba");
		} else {
			System.out
					.println("Erroneo, la exp.reg. NO coincide con el dato de prueba");
		}
		System.out
				.println("==============================================================");

		// Caso de Prueba 4
		validador = patron.matcher(cadena4);
		resultado = validador.matches();
		System.out.println("============ Resultado Prueba 3: '" + cadena4
				+ "' (" + cadena3.length() + " caracteres) ==========");

		if (resultado) {
			System.out
					.println("Exitoso, la exp.reg. coincide con el dato de prueba");
		} else {
			System.out
					.println("Erroneo, la exp.reg. NO coincide con el dato de prueba");
		}
		System.out
				.println("==============================================================");

		// Caso de Prueba 5
		validador = patron.matcher(cadena5);
		resultado = validador.matches();
		System.out.println("============ Resultado Prueba 3: '" + cadena5
				+ "' (" + cadena3.length() + " caracteres) ==========");

		if (resultado) {
			System.out
					.println("Exitoso, la exp.reg. coincide con el dato de prueba");
		} else {
			System.out
					.println("Erroneo, la exp.reg. NO coincide con el dato de prueba");
		}
		System.out
				.println("==============================================================");

		// Caso de Prueba 6
		validador = patron.matcher(cadena6);
		resultado = validador.matches();
		System.out.println("============ Resultado Prueba 6: '" + cadena6
				+ "' (" + cadena3.length() + " caracteres) ==========");

		if (resultado) {
			System.out
					.println("Exitoso, la exp.reg. coincide con el dato de prueba");
		} else {
			System.out
					.println("Erroneo, la exp.reg. NO coincide con el dato de prueba");
		}
		System.out
				.println("==============================================================");

		// Caso de Prueba 7
		validador = patron.matcher(cadena7);
		resultado = validador.matches();
		System.out.println("============ Resultado Prueba 7: '" + cadena7
				+ "' (" + cadena3.length() + " caracteres) ==========");

		if (resultado) {
			System.out
					.println("Exitoso, la exp.reg. coincide con el dato de prueba");
		} else {
			System.out
					.println("Erroneo, la exp.reg. NO coincide con el dato de prueba");
		}
		System.out
				.println("==============================================================");

	}
}
