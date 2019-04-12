package amcoca.topic12.regularexpression.exercise1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Cadena tenga una longitud de 3 a 8 caracteres
 *
 * @author Alejandro M. Coca Rojas
 *
 */
public class Principal {

	public static void main(String[] args) {
		String expresionRegular = "[A-Za-z]{3,8}";
		String cadena1 = "hola", cadena2 = "abc", cadena3 = "ab", cadena4 = "abcdefghi", cadena5 = "qwertyui",
				cadena6 = "12345678", cadena7 = "aBcDeFgH";
		boolean resultado;

		Pattern patron = Pattern.compile(expresionRegular);
		System.out.println("Exp. Regular: " + patron.pattern());

		// Caso de Prueba 1
		Matcher validador = patron.matcher(cadena1);
		resultado = validador.matches();

		System.out.println();
		System.out.println(
				"============ Resultado Prueba 1: '" + cadena1 + "' (" + cadena1.length() + " caracteres ) ==========");

		if (resultado) {
			System.out.println("Exitoso, la exp.reg. coincide con el dato de prueba");
		} else {
			System.out.println("Erroneo, la exp.reg. NO coincide con el dato de prueba");
		}
		System.out.println("==============================================================");

		// Caso de Prueba 2
		validador = patron.matcher(cadena2);
		resultado = validador.matches();
		System.out.println(
				"============ Resultado Prueba 2: '" + cadena2 + "' (" + cadena2.length() + " caracteres) ==========");

		if (resultado) {
			System.out.println("Exitoso, la exp.reg. coincide con el dato de prueba");
		} else {
			System.out.println("Erroneo, la exp.reg. NO coincide con el dato de prueba");
		}
		System.out.println("==============================================================");

		// Caso de Prueba 3
		validador = patron.matcher(cadena3);
		resultado = validador.matches();
		System.out.println(
				"============ Resultado Prueba 3: '" + cadena3 + "' (" + cadena3.length() + " caracteres) ==========");

		if (resultado) {
			System.out.println("Exitoso, la exp.reg. coincide con el dato de prueba");
		} else {
			System.out.println("Erroneo, la exp.reg. NO coincide con el dato de prueba");
		}
		System.out.println("==============================================================");

		// Caso de Prueba 4
		validador = patron.matcher(cadena4);
		resultado = validador.matches();
		System.out.println(
				"============ Resultado Prueba 4: '" + cadena4 + "' (" + cadena4.length() + " caracteres) ==========");

		if (resultado) {
			System.out.println("Exitoso, la exp.reg. coincide con el dato de prueba");
		} else {
			System.out.println("Erroneo, la exp.reg. NO coincide con el dato de prueba");
		}
		System.out.println("==============================================================");

		// Caso de Prueba 5
		validador = patron.matcher(cadena5);
		resultado = validador.matches();
		System.out.println(
				"============ Resultado Prueba 5: '" + cadena5 + "' (" + cadena5.length() + " caracteres) ==========");

		if (resultado) {
			System.out.println("Exitoso, la exp.reg. coincide con el dato de prueba");
		} else {
			System.out.println("Erroneo, la exp.reg. NO coincide con el dato de prueba");
		}
		System.out.println("==============================================================");

		// Caso de Prueba 6
		validador = patron.matcher(cadena6);
		resultado = validador.matches();
		System.out.println(
				"============ Resultado Prueba 6: '" + cadena6 + "' (" + cadena6.length() + " caracteres) ==========");

		if (resultado) {
			System.out.println("Exitoso, la exp.reg. coincide con el dato de prueba");
		} else {
			System.out.println("Erroneo, la exp.reg. NO coincide con el dato de prueba");
		}
		System.out.println("==============================================================");

		// Caso de Prueba 7
		validador = patron.matcher(cadena7);
		resultado = validador.matches();
		System.out.println(
				"============ Resultado Prueba 7: '" + cadena7 + "' (" + cadena6.length() + " caracteres) ==========");

		if (resultado) {
			System.out.println("Exitoso, la exp.reg. coincide con el dato de prueba");
		} else {
			System.out.println("Erroneo, la exp.reg. NO coincide con el dato de prueba");
		}
		System.out.println("==============================================================");

	}
}
