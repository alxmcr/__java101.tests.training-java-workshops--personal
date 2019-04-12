package amcoca.topic3.poo.exercise1;

public class Persona {

	// Atributos
	private String nombre;
	private String apPaterno;
	private String apMaterno;
	private String direccion;
	private String carnet;
	private int telefono;
	private boolean sexo; // true: Masculino, false: femenino

	public Persona() {
		this.nombre = "Alejandro";
		this.apPaterno = "Coca";
		this.apMaterno = "Rojas";
		this.direccion = "6 de octubre #454";
		this.carnet = "123456 L.P.";
		this.telefono = 5265656;
		this.sexo = true;
	}

	public String toString() {

		String sexo = "femenino";

		if (this.sexo) {
			sexo = "masculino";
		}

		// return this;

		return this.nombre + " " + this.apPaterno + " " + this.apMaterno + " "
				+ this.direccion + " " + this.carnet + " " + this.telefono
				+ " " + sexo;
	}

	// get's y set's

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCarnet() {
		return carnet;
	}

	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public boolean isSexo() {
		return sexo;
	}

	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}

	public boolean isIguales(Persona p1) {

		if (this.nombre.equals(p1.getNombre())
				&& this.apPaterno.equals(p1.getApPaterno())
				&& this.apMaterno.equals(p1.getApMaterno())
				&& this.direccion.equals(p1.getDireccion())
				&& this.carnet.equals(p1.getCarnet())
				&& this.telefono == p1.getTelefono()
				&& this.sexo == p1.isSexo()) {
			return true;
		}
		return false;

	}

	// fin clase

}