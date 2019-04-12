package amcoca.topic17.cohesion.alto.exercise1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConexionBD {
	// Datos de la Base de Datos
	private static final String USUARIO_BD = "BBDD-1";
	private static final String PASSWORD_BD = "12345";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String DRIVER_BD = "oracle.jdbc.OracleDriver";

	// Conexion
	private Connection connectionBBDD;

	public void establecerConexion() throws Exception {
		try {
			Class.forName("oracle.jdbc.OracleDriver");

			connectionBBDD = DriverManager.getConnection(URL, USUARIO_BD,
					PASSWORD_BD);

			connectionBBDD.setAutoCommit(false);

		} catch (Exception e) {
			throw new Exception(
					"No se pudo obtener una conexion a la Base de datos");
		}
	}

	public void setConnectionBBDD(Connection connectionBBDD) {
		this.connectionBBDD = connectionBBDD;
	}

	public static String getUsuarioBd() {
		return USUARIO_BD;
	}

	public static String getPasswordBd() {
		return PASSWORD_BD;
	}

	public static String getUrl() {
		return URL;
	}

	public static String getDriverBd() {
		return DRIVER_BD;
	}

	public String recuperarRegistroBD(String select, String tabla,
			String condicion) throws Exception {

		StringBuffer registroPersona = new StringBuffer();

		try {
			StringBuffer consultaSQL = new StringBuffer("SELECT " + select);
			consultaSQL.append(" FROM " + USUARIO_BD + "." + tabla).append(" WHERE " + condicion);
			PreparedStatement pst = connectionBBDD.prepareStatement(consultaSQL
					.toString());

			ResultSet resultado = pst.executeQuery();

			if (resultado != null) {
				if (resultado.next()) {
					registroPersona.append(resultado.getString(1))
							.append(resultado.getString(2))
							.append(resultado.getString(3))
							.append(resultado.getString(4))
							.append(resultado.getString(5))
							.append(resultado.getString(6))
							.append(resultado.getString(7));
				}
			}

		} catch (Exception e) {
			throw new Exception("No se pudo obtener conexion a BD");
		}

		return registroPersona.toString();
	}
}
