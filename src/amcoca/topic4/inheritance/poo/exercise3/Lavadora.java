package amcoca.topic4.inheritance.poo.exercise3;

public class Lavadora extends Electrodomestico {

	private int nroRevolucionesPorMinuto;
	private String velocidadMinima;
	private String velocidadMaxima;

	public Lavadora(String nombre, int alturaCM, int anchoCM, int profundidadCM, double pesoKG,
			String color, double capacidadTotalEnKG, double precioEnBolivianos) {
		super(nombre, alturaCM, anchoCM, profundidadCM, pesoKG, color, capacidadTotalEnKG,
				precioEnBolivianos);
	}

	public int getNroRevolucionesPorMinuto() {
		return nroRevolucionesPorMinuto;
	}

	public void setNroRevolucionesPorMinuto(int nroRevolucionesPorMinuto) {
		this.nroRevolucionesPorMinuto = nroRevolucionesPorMinuto;
	}

	public String getVelocidadMinima() {
		return velocidadMinima;
	}

	public void setVelocidadMinima(String velocidadMinima) {
		this.velocidadMinima = velocidadMinima;
	}

	public String getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(String velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Lavadora [");
		if (super.toString() != null) {
			builder.append("toString()=");
			builder.append(super.toString());
			builder.append(", ");
		}
		builder.append("nroRevolucionesPorMinuto=");
		builder.append(nroRevolucionesPorMinuto);
		builder.append(", ");
		if (velocidadMinima != null) {
			builder.append("velocidadMinima=");
			builder.append(velocidadMinima);
			builder.append(", ");
		}
		if (velocidadMaxima != null) {
			builder.append("velocidadMaxima=");
			builder.append(velocidadMaxima);
		}
		builder.append("]");
		return builder.toString();
	}

}
