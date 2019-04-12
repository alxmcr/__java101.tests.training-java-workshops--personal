package amcoca.topic16.javadoc.exercise1;

/**
 * Es una clase que representa a una Persona
 *
 * @author Alejandro M. Coca
 * @since 1.0.0. (06/07/2013)
 * @version 1.0.1 (06/07/2013)
 *
 */

public class Persona {

	/**
	 * Nombre de un estudiante
	 */
	private String nombre;
	/**
	 * Apellido Paterno de un estudiante
	 */
	private String apellidoPaterno;
	/**
	 * Apellido Materno de un estudiante
	 */
	private String apellidoMaterno;
	/**
	 * Carnet de un estudiante
	 */
	private String carnet;
	/**
	 * Sexo de un estudiante
	 */
	private boolean sexo;

	/**
	 * @param nombre
	 *            el nombre con que se creara el objeto
	 * @param apellidoPaterno
	 *            el apellido paterno con que se creara el objeto
	 * @param apellidoMaterno
	 *            el apellido materno con que se creara el objeto
	 * @param carnet
	 *            el carnet ademas de la abreviatura donde fue expedido
	 * @param sexo
	 *            el sexo de la persona masculino(true) o femenino (false)
	 */
	public Persona(String nombre, String apellidoPaterno,
			String apellidoMaterno, String carnet, boolean sexo) {
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.carnet = carnet;
		this.sexo = sexo;
	}

	/**
	 * @return el nombre de una persona
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre de la persona a ser establecido
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return el apellido paterno de una persona
	 */
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	/**
	 * @param apellidoPaterno a ser establecido
	 */
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	/**
	 * @return el apellido materno de una persona
	 */
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	/**
	 * @param apellidoMaterno
	 *            el apellido materno a ser establecido
	 */
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	/**
	 * @return el carnet de una persona
	 */
	public String getCarnet() {
		return carnet;
	}

	/**
	 * @param carnet
	 *            el carnet a ser establecido
	 */
	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}

	/**
	 * @return el sexo, true: si es Masculino y caso contrario: false
	 */
	public boolean isSexo() {
		return sexo;
	}

	/**
	 * @param sexo
	 *            el sexo a ser establecido, true: masculino y false caso
	 *            contrario
	 */
	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}

	/**
	 * @return en una cadena los datos de una persona
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return nombre + ", " + apellidoPaterno + ", " + apellidoMaterno + ", "
				+ carnet + ", " + sexo;
	}

}
