package amcoca.topic14.calendars.exercise4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Principal {
	public static void main(String[] args) {
		final Calendar cald1 = Calendar.getInstance();

		final String formato = "yyyy/MMMM/dd";
		final Date date = conversionCalendarADate(cald1);
		final SimpleDateFormat f = new SimpleDateFormat(formato);
		System.out.println("DATE --> " + f.format(date));

		final Calendar cald2 = conversionDateACalendar(date);

		// Ingles
		String language = "en";
		String country = "EN";
		Locale localizacion = new Locale(language, country);
		DateFormat form = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.MEDIUM, localizacion);

		System.out.println("Calendario --> " + form.format(cald2.getTime()));
	}

	private static Calendar conversionDateACalendar(Date date) {

		Calendar c1 = Calendar.getInstance();
		c1.setTime(date);

		return c1;
	}

	private static Date conversionCalendarADate(Calendar calendario) {
		return calendario.getTime();
	}
}
