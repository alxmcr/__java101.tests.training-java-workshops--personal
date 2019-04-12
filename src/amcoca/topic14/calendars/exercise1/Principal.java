package amcoca.topic14.calendars.exercise1;

import java.util.Calendar;

public class Principal {
	public static void main(String[] args) {
		Calendar calendario = Calendar.getInstance();
		calendario.set(2013, 11, 31);
		System.out.println(calendario.getTime());
		calendario.add(Calendar.MONTH, 1);
		System.out.println(calendario.getTime());

		int year = calendario.get(Calendar.YEAR);
		int mes = calendario.get(Calendar.MONTH);
		int dia1 = calendario.get(Calendar.DAY_OF_WEEK);
		int dia2 = calendario.get(Calendar.DAY_OF_MONTH);
		int dia3 = calendario.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		int dia4 = calendario.get(Calendar.DAY_OF_YEAR);

		System.out.println("========= USANDO ADD =============");
		System.out.println("year: " + year);
		System.out.println("mes: " + (mes+1));
		System.out.println("DAY_OF_WEEK: " + dia1);
		System.out.println("DAY_OF_MONTH: " + dia2);
		System.out.println("DAY_OF_WEEK_IN_MONTH: " + dia3);
		System.out.println("DAY_OF_YEAR: " + dia4);
		System.out.println("==================================");
	}
}
