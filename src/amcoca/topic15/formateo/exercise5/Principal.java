package amcoca.topic15.formateo.exercise5;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Principal {
	public static void main(String[] args) {
		Calendar fecha = Calendar.getInstance();
		fecha.set(2013, Calendar.JULY, 2);
		
		DateFormat formato = DateFormat.getDateInstance(DateFormat.FULL,
				Locale.US);
		
		System.out.println("Fecha: " + formato.format(fecha.getTime()));
	}
}
