package amcoca.topic15.internationalization.timezone.exercise1;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Principal {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		DateFormat formato = DateFormat.getTimeInstance();

		formato.setTimeZone(TimeZone.getTimeZone("America/La_Paz"));
		System.out.println("{" + formato.format(cal.getTime()) + "}");

		formato.setTimeZone(TimeZone.getTimeZone("Europe/Madrid"));
		System.out.println("{" + formato.format(cal.getTime()) + "}");
	}
}
