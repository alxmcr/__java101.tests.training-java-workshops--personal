package amcoca.topic13.dates.exercise5;

import java.util.Date;

public class Principal {
	private static final String DESPUES_DE = " esta despues de: ";
	private static final String ANTES_DE = " esta antes de: ";

	public static void main(String[] args) {

		final int anio = 2013 - 1900;

		final Date fecha1 = new Date(anio, 0, 1);
		final Date fecha2 = new Date(anio, 3, 15);
		final Date fecha3 = new Date(anio, 3, 16);
		final Date fecha4 = new Date(anio, 3, 15);

		final String fecha1Str = fecha1.toString();
		final String fecha2Str = fecha2.toString();
		final String fecha3Str = fecha3.toString();
		final String fecha4Str = fecha4.toString();

		System.out.println(fecha1Str + "\n," + fecha2Str + "\n," + fecha3Str
				+ "\n," + fecha4Str);

		if (fecha1.after(fecha2)) {
			System.out.println("La fecha: " + fecha1Str + DESPUES_DE
					+ fecha2Str);
		} else if (fecha2.after(fecha1)) {
			System.out.println("La fecha: " + fecha2Str + DESPUES_DE
					+ fecha1Str);
		} else if (fecha2.before(fecha1)) {
			System.out.println("La fecha: " + fecha2Str + ANTES_DE + fecha1Str);
		}

		if (fecha2.after(fecha4)) {
			System.out.println("La fecha: " + fecha2Str + DESPUES_DE
					+ fecha4Str);
		} else if (fecha4.after(fecha2)) {
			System.out.println("La fecha: " + fecha4Str + DESPUES_DE
					+ fecha2Str);
		} else if (fecha4.before(fecha2)) {
			System.out.println("La fecha: " + fecha4Str + ANTES_DE + fecha2Str);
		}

		if (fecha2.after(fecha3)) {
			System.out.println("La fecha: " + fecha2Str + DESPUES_DE
					+ fecha4Str);
		} else if (fecha3.after(fecha2)) {
			System.out.println("La fecha: " + fecha3Str + DESPUES_DE
					+ fecha2Str);
		} else if (fecha3.before(fecha2)) {
			System.out.println("La fecha: " + fecha3Str + ANTES_DE + fecha2Str);
		}

	}
}
