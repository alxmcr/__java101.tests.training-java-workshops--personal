package amcoca.topic13.dates.exercise4;

import java.util.Date;

public class Principal {
	public static void main(String[] args) {
		// int yearEsperado = 2013;
		int yearEsperado = 2013 - Constantes.YEAR_DATE_UTIL;
		int dia = 29;

		Date fecha2 = new Date(yearEsperado, Constantes.FEBRERO_DATE, dia);

		StringBuffer datosIngresados = new StringBuffer();
		StringBuffer datosObtenidos = new StringBuffer();

		datosIngresados.append(Constantes.DATOS_INGRESADOS)
				.append(yearEsperado + Constantes.YEAR_DATE_UTIL)
				.append(Constantes.BARRA_INCLINADA)
				.append(Constantes.FEBRERO_DATE + 1)
				.append(Constantes.BARRA_INCLINADA).append(dia);
		datosObtenidos.append(Constantes.DATOS_OBTENIDOS)
				.append((fecha2.getYear() + Constantes.YEAR_DATE_UTIL))
				.append(Constantes.BARRA_INCLINADA)
				.append(fecha2.getMonth() + 1)
				.append(Constantes.BARRA_INCLINADA).append(fecha2.getDate());
		System.out.println(datosIngresados.toString());
		System.out.println(datosObtenidos.toString());
	}
}
