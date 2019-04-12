package amcoca.topic15.formateo.exercise3;

import java.text.MessageFormat;

public class Principal {

	public static void main(String[] args) {

		String formato = "Hola {0}, Feliz {1}";

		MessageFormat mensaje = new MessageFormat(formato);

		String[] datos = { "Ale", "Lunes" };

		System.out.println(mensaje.format(datos));
	}
}
