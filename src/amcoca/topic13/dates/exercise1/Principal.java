package amcoca.topic13.dates.exercise1;

import java.sql.Date;

public class Principal {
	public static void main(String[] args) {

		int yearDesirable = 8100;
		Date fechaSQL = new Date(8100, 6, 2);
		System.out.println("yearDesirable: " + yearDesirable);
		System.out.println("fechaSQL: " + fechaSQL);

		yearDesirable = 8100 - 1900;
		System.out.println("yearDesirable: " + yearDesirable);
		fechaSQL = new Date(yearDesirable, 6, 2);
		System.out.println("\nfechaSQL: " + fechaSQL);

		// Fecha Nac. 2 de Julio del 1989
		int yearWanted = 1989 - 1900;
		Date fechaNacimiento = new Date(yearWanted, 6, 2);

		System.out.println("\nfechaNacimiento: " + fechaNacimiento);
	}
}
