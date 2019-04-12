package amcoca.topic12.regularexpression.exercise6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String expresionRegular = "([a-z]{2})([.])(\\w*)";
		String codUsuario1 = "am-coca";
		String codUsuario2 = "ja..mnemo";
		String codUsuario3 = "ja.mnemo";

		Pattern patron = Pattern.compile(expresionRegular);
		System.out.println("Exp. Regular: " + patron.pattern());

		boolean resultado;

		// Caso de Prueba 1
		Matcher validador = patron.matcher(codUsuario1);
		resultado = validador.matches();
		System.out.println("Resultado Prueba 1: " + codUsuario1);

		if (resultado) {
			System.out
					.println("Exitoso, la exp.reg. coincide con el dato de prueba");
		} else {
			System.out
					.println("Erroneo, la exp.reg. NO coincide con el dato de prueba");
		}

		// Caso de Prueba 2
		validador = patron.matcher(codUsuario2);
		resultado = validador.matches();
		System.out.println("Resultado Prueba 2: " + codUsuario2);

		if (resultado) {
			System.out
					.println("Exitoso, la exp.reg. coincide con el dato de prueba");
		} else {
			System.out
					.println("Erroneo, la exp.reg. NO coincide con el dato de prueba");
		}

		// Caso de Prueba 3
		validador = patron.matcher(codUsuario3);
		resultado = validador.matches();
		System.out.println("Resultado Prueba3: " + codUsuario3);

		if (resultado) {
			System.out
					.println("Exitoso, la exp.reg. coincide con el dato de prueba");
		} else {
			System.out
					.println("Erroneo, la exp.reg. NO coincide con el dato de prueba");
		}
	}
}
