package amcoca.topic13.dates.exercise3;

import java.util.Date;

public class Principal {
	public static void main(String[] args) {
		Date fechaActual = new Date();
		System.out.println(fechaActual);

		int yearExpected = 2013 - 1900;
		//int yearExpected = 2013;

		Date fechaNavidad = new Date(yearExpected, 11, 25);
		System.out.println(fechaNavidad);

		Date fechaX=new Date(381923813);
		System.out.println(fechaX);
		}
}
