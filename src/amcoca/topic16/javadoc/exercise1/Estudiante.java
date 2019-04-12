/**
 *
 */
package amcoca.topic16.javadoc.exercise1;

/**
 * Es una clase que representa a un Estudiante
 *
 * @author Alejandro M. Coca
 * @since 1.0.0. (06/07/2013)
 * @version 1.0.1 (06/07/2013)
 *
 */

public class Estudiante extends Persona {

	/**
	 * Matricula de un estudiante
	 */
	private String matricula;

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
	 * @param matricula
	 *            la matricula de un estudiante
	 */
	public Estudiante(String nombre, String apellidoPaterno, String apellidoMaterno, String carnet, boolean sexo,
			String matricula) {
		super(nombre, apellidoPaterno, apellidoMaterno, carnet, sexo);
		this.matricula = matricula;
	}

	/**
	 * @return la matricula de un estudiante
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula
	 *            la matricula a ser establecido
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * @return en una cadena los datos de un estudiante
	 * @see java.lang.Object#toString()
	 * @see clase9.javadoc.ejemplo1#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + ", " + matricula;
	}

}
