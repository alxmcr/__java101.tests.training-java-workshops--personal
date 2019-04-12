package amcoca.topic4.inheritance.poo.exercise2;

public class Mesa extends Mobiliario {
	private String forma; // Redonda, cuadrada, rectangular

	public Mesa(String nombre, String material, double pesoKG, int alturaCM, int anchoCM, int profundidadCM,
			String color, double precioEnBolivianos, String forma) {
		super(nombre, material, pesoKG, alturaCM, anchoCM, profundidadCM, color, precioEnBolivianos);
		this.forma = forma;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mesa [");
		if (super.toString() != null) {
			builder.append("toString()=");
			builder.append(super.toString());
			builder.append(", ");
		}
		if (forma != null) {
			builder.append("forma=");
			builder.append(forma);
		}
		builder.append("]");
		return builder.toString();
	}

}
