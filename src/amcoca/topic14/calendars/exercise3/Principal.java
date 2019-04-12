package amcoca.topic14.calendars.exercise3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Principal {
	public static void main(String[] args) {
		GregorianCalendar g1 = new GregorianCalendar();
		g1.set(2013, 4, 2, 22, 30, 55);

		GregorianCalendar g2 = new GregorianCalendar();

		GregorianCalendar g3 = new GregorianCalendar(2013, 4, 2, 6, 30, 5);

		GregorianCalendar g4 = new GregorianCalendar(2013, Calendar.JULY, 2, 6, 30, 5);

		System.out.println("1) 2013/05/2 22:30:55 --> " + g1.getTime());
		System.out.println("2) Fecha actual: --> " + g2.getTime());
		System.out.println("3) 2013/05/2 6:30:05 --> " + g3.getTime());
		System.out.println("4) 2013/JULIO/2 6:30:05 --> " + g4.getTime());
	}
}
