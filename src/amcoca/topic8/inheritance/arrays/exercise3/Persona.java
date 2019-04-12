package amcoca.topic8.inheritance.arrays.exercise3;

public class Persona {
	private String nombre;
	private String apPaterno;
	private String apMaterno;
	private String direccion;
	private int telefono;
	private int carnet;

	public Persona(String nombre, String apPaterno, String apMaterno,
			String direccion, int telefono, int carnet) {
		this.nombre = nombre;
		this.apPaterno = apPaterno;
		this.apMaterno = apMaterno;
		this.direccion = direccion;
		this.telefono = telefono;
		this.carnet = carnet;
	}

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

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public int getCarnet() {
		return carnet;
	}

	public void setCarnet(int carnet) {
		this.carnet = carnet;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("nombre=");
		builder.append(nombre);
		builder.append(", apPaterno=");
		builder.append(apPaterno);
		builder.append(", apMaterno=");
		builder.append(apMaterno);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append(", telefono=");
		builder.append(telefono);
		builder.append(", carnet=");
		builder.append(carnet);
		return builder.toString();
	}
}
