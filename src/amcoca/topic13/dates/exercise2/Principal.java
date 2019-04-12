package amcoca.topic13.dates.exercise2;

import java.sql.Date;

public class Principal {
	public static void main(String[] args) {

		// int yearEsperado = 2013;
		int yearEsperado = 2013 - Constantes.YEAR_DATE_UTIL;

		Date fecha2 = new Date(yearEsperado, Constantes.FEBRERO_DATE, 29);

		System.out.println(
				fecha2.getDay() + "/" + fecha2.getMonth() + "/" + (fecha2.getYear() + Constantes.YEAR_DATE_UTIL));
	}
}
