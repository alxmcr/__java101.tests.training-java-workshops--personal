package amcoca.topic15.formateo.exercise4;

import java.text.DecimalFormat;

public class Principal {

	public static void main(String[] args) {

		String formato1 = "####";
		String formato2 = "#.####";
		String formato3 = "####.## %";
		String formato4 = "0.000000 %";
		DecimalFormat formatoNumerico1 = new DecimalFormat(formato1);
		DecimalFormat formatoNumerico2 = new DecimalFormat(formato2);
		DecimalFormat formatoNumerico3 = new DecimalFormat(formato3);
		DecimalFormat formatoNumerico4 = new DecimalFormat(formato4);

		double numero1 = 12345.43242383;
		double numero2 = 3.43242383;
		System.out.println(numero1);
		System.out.println(formato1 + "->" + formatoNumerico1.format(numero1));
		System.out.println();
		System.out.println(numero2);
		System.out.println(formato2 + "->" + formatoNumerico2.format(numero2));
		System.out.println(formato3 + "->" + formatoNumerico3.format(numero2));
		System.out.println(formato4 + "->" + formatoNumerico4.format(numero2));

	}
}
