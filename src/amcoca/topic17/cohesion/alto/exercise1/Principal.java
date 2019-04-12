package amcoca.topic17.cohesion.alto.exercise1;

public class Principal {
	public static void main(String[] args) {

		ConexionBD conexion = new ConexionBD();

		try {
			conexion.establecerConexion();

			String select = " * ";
			String tabla = "T-PERSONA";
			String condicion = tabla + ".carnet=" + 123456;

			System.out.println(conexion.recuperarRegistroBD(select, tabla, condicion));

		} catch (Exception e) {
			System.out.println("Ocurrio un error en el establecimiento de conexion");
		}
	}
}
