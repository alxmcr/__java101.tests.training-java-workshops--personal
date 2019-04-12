package amcoca.topic17.cohesion.bajo.exercise1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PersonaBaseDatos {

	// Datos propios de la clase
	private String primerNombre;
	private String segundoNombre;
	private String apPaterno;
	private String apMaterno;
	private int nroCarnet;
	private String lugarNacimiento;
	private int telefono;

	// Datos de la Base de Datos
	private static final String NOMBRE_TABLA = "T-PERSONA";
	private static final String USUARIO_BD = "BBDD-1";
	private static final String PASSWORD_BD = "12345";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String DRIVER_BD = "oracle.jdbc.OracleDriver";

	// Conexion
	private Connection connectionBBDD;

	public PersonaBaseDatos(String primerNombre, String segundoNombre,
			String apPaterno, String apMaterno, int nroCarnet,
			String lugarNacimiento, int telefono) {
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		this.apPaterno = apPaterno;
		this.apMaterno = apMaterno;
		this.nroCarnet = nroCarnet;
		this.lugarNacimiento = lugarNacimiento;
		this.telefono = telefono;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getApPaterno() {
		return apPaterno;
	}

	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}

	public String getApMaterno() {
		return apMaterno;
	}

	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}

	public int getNroCarnet() {
		return nroCarnet;
	}

	public void setNroCarnet(int nroCarnet) {
		this.nroCarnet = nroCarnet;
	}

	public String getLugarNacimiento() {
		return lugarNacimiento;
	}

	public void setLugarNacimiento(String lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public static String getNombreTabla() {
		return NOMBRE_TABLA;
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

	public void setConnectionBBDD(Connection connectionBBDD) {
		this.connectionBBDD = connectionBBDD;
	}

	public String recuperarRegistroBD(int nroCarnet) throws Exception {

		StringBuffer registroPersona = new StringBuffer();

		try {
			Connection conexion = this.getConnectionBBDD();

			StringBuffer consultaSQL = new StringBuffer("SELECT * ");
			consultaSQL.append(" FROM " + USUARIO_BD + "." + NOMBRE_TABLA)
					.append(" WHERE " + NOMBRE_TABLA + ".carnet=" + nroCarnet);
			PreparedStatement pst = conexion.prepareStatement(consultaSQL
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

	private Connection getConnectionBBDD() throws Exception {

		try {
			Class.forName("oracle.jdbc.OracleDriver");

			connectionBBDD = DriverManager.getConnection(URL, USUARIO_BD,
					PASSWORD_BD);

			connectionBBDD.setAutoCommit(false);

		} catch (Exception e) {
			throw new Exception(
					"No se pudo obtener una conexion a la Base de datos");
		}
		return connectionBBDD;
	}
}
