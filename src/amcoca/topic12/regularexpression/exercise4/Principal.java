package amcoca.topic12.regularexpression.exercise4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String expresionRegular = "\\d{3,5}";
		String numero1 = "345", numero2 = "12345", numero3 = "87";
		boolean resultado;

		Pattern patron = Pattern.compile(expresionRegular);
		System.out.println("Exp. Regular: " + patron.pattern());

		// Caso de Prueba 1
		Matcher validador = patron.matcher(numero1);
		resultado = validador.matches();
		System.out.println("Resultado Prueba 1: " + numero1);

		if (resultado) {
			System.out.println("Exitoso, la exp.reg. coincide con el dato de prueba");
		} else {
			System.out.println("Erroneo, la exp.reg. NO coincide con el dato de prueba");
		}

		// Caso de Prueba 2
		validador = patron.matcher(numero2);
		resultado = validador.matches();
		System.out.println("Resultado Prueba 2: " + numero2);

		if (resultado) {
			System.out.println("Exitoso, la exp.reg. coincide con el dato de prueba");
		} else {
			System.out.println("Erroneo, la exp.reg. NO coincide con el dato de prueba");
		}

		// Caso de Prueba 3
		validador = patron.matcher(numero3);
		resultado = validador.matches();
		System.out.println("Resultado Prueba 3: " + numero3);

		if (resultado) {
			System.out.println("Exitoso, la exp.reg. coincide con el dato de prueba");
		} else {
			System.out.println("Erroneo, la exp.reg. NO coincide con el dato de prueba");
		}
	}

}
