package amcoca.topic15.formateo.exercise2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal {

	public static void main(String[] args) throws ParseException {

		String fecha = "20131112";

		String formatoMostrar = "yyyyMMdd";

		System.out.println("Antes...");
		System.out.println(fecha);
		System.out.println("Despues...");
		SimpleDateFormat formato = new SimpleDateFormat(formatoMostrar);
		Date x = formato.parse(fecha);
		System.out.println("Resultado: " + x);
	}
}
