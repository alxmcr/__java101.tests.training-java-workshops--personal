package amcoca.topic15.internationalization.locale.exercise2;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Principal {
	public static void main(String[] args) {

		Date fecha = new Date();

		Locale localizationSpanishBO = new Locale("es", "BO");

		DateFormat formato = DateFormat.getDateInstance(DateFormat.LONG, localizationSpanishBO);
		System.out.println("LONG (Espa�ol): " + formato.format(fecha));

		formato = DateFormat.getDateInstance(DateFormat.LONG, Locale.GERMANY);
		System.out.println("LONG (Aleman): " + formato.format(fecha));

		formato = DateFormat.getDateInstance(DateFormat.LONG, Locale.FRANCE);
		System.out.println("LONG (Frances): " + formato.format(fecha));
	}
}
