package amcoca.topic12.regularexpression.exercise5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Principal {
	public static void main(String[] args) {

		String expresionRegular = "a*b", cadenaPrueba1 = "aaaaab", cadenaPrueba2 = "aaa", cadenaPrueba3 = "b";
		boolean resultado;

		Pattern patron = Pattern.compile(expresionRegular);

		// Caso de prueba - aaaaab
		Matcher validador = patron.matcher(cadenaPrueba1);
		resultado = validador.matches();

		System.out.println("\n EXPRESION REGULAR : " + patron.pattern());

		// Mostrar Resultados - Casos de Prueba
		System.out.println("\n== RESULTADO DE PRUEBA N� 1 '" + cadenaPrueba1 + "' ==");
		if (resultado) {
			System.out.println("La secuencia de caracteres '" + cadenaPrueba1 + "'"
					+ " concuerda satisfactoriamente con la expres. regular '" + expresionRegular + "'");
		} else {
			System.out.println("La secuencia de caracteres NO COINCIDEN");
		}
		System.out.println();

		// Caso de prueba - aaa
		validador = patron.matcher(cadenaPrueba2);
		resultado = validador.matches();

		// Mostrar Resultados - Casos de Prueba
		System.out.println("== RESULTADO DE PRUEBA N� 2 '" + cadenaPrueba2 + "' ==");
		if (resultado) {
			System.out.println("La secuencia de caracteres '" + cadenaPrueba2 + "'"
					+ " concuerda satisfactoriamente con la expres. regular '" + expresionRegular + "'");
		} else {
			System.out.println("La secuencia de caracteres NO COINCIDEN");
		}
		System.out.println();

		// Caso de prueba - aaa
		validador = patron.matcher(cadenaPrueba3);
		resultado = validador.matches();

		// Mostrar Resultados - Casos de Prueba
		System.out.println("== RESULTADO DE PRUEBA N� 3 '" + cadenaPrueba3 + "' ==");
		if (resultado) {
			System.out.println("La secuencia de caracteres '" + cadenaPrueba3 + "'"
					+ " concuerda satisfactoriamente con la expres. regular '" + expresionRegular + "'");
		} else {
			System.out.println("La secuencia de caracteres NO COINCIDEN");
		}
		System.out.println();

	}
}
