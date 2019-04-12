package amcoca.topic3.poo.exercise4;

public class MainStringBuffer {

	public static void main(String[] args) {

		StringBuffer bufferSinEspacios = new StringBuffer();
		bufferSinEspacios.append("Hola").append("mundo").append("como").append("estas?");
		String mensajeAMostrar = bufferSinEspacios.toString();
		System.out.println(mensajeAMostrar);

		StringBuffer bufferConEspacios = new StringBuffer();
		bufferConEspacios.append("Hola ").append("mundo ").append("como ").append("estas?");
		mensajeAMostrar = bufferConEspacios.toString();
		System.out.println(mensajeAMostrar);
	}
}
