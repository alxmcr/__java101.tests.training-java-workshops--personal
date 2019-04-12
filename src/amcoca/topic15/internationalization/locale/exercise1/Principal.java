package amcoca.topic15.internationalization.locale.exercise1;

import java.text.DateFormat;
import java.text.MessageFormat;
import java.util.Locale;

public class Principal {
	public static void main(String[] args) {
		String patron = "Idioma: {0} - Pais: {1} ({2}) ";
		MessageFormat lineaAMostrar = new MessageFormat(patron);

		Locale list[] = DateFormat.getAvailableLocales();

		System.out.println("Idioma, Pais");
		System.out.println("---------------------");
		for (Locale aLocale : list) {
			String[] datos = { aLocale.getLanguage(), aLocale.getDisplayCountry(), aLocale.getCountry() };

			System.out.println(lineaAMostrar.format(datos));

		}
	}
}
