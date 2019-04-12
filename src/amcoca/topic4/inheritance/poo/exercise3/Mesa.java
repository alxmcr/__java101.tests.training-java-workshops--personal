package amcoca.topic4.inheritance.poo.exercise3;

public class Mesa extends Mobiliario {
	private String forma; // Redonda, cuadrada, rectangular

	public Mesa(String nombre, int alturaCM, int anchoCM, int profundidadCM, double pesoKG,
			String color, double capacidadTotalEnKG, double precioEnBolivianos) {
		super(nombre, alturaCM, anchoCM, profundidadCM, pesoKG, color, capacidadTotalEnKG,
				precioEnBolivianos);
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

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
