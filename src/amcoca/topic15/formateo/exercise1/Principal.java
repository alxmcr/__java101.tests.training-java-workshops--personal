package amcoca.topic15.formateo.exercise1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal {

	public static void main(String[] args) {

		Date fechaActual = new Date();

		String formatoMostrar = "YYYY/MM/dd";

		System.out.println("Antes...");
		System.out.println(fechaActual);
		System.out.println("Despues...");
		SimpleDateFormat formato = new SimpleDateFormat(formatoMostrar);
		System.out.println("Resultado: " + formato.format(fechaActual));
	}
}
