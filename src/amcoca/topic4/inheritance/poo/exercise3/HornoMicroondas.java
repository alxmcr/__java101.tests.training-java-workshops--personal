package amcoca.topic4.inheritance.poo.exercise3;

public class HornoMicroondas extends Electrodomestico {
	private String fuenteDeCalor;
	private int nroPotencias;
	private String temperaturaMinima;
	private String temperaturaMaxima;

	public HornoMicroondas(String nombre, int alturaCM, int anchoCM, int profundidadCM,
			double pesoKG, String color, double capacidadTotalEnKG, double precioEnBolivianos) {
		super(nombre, alturaCM, anchoCM, profundidadCM, pesoKG, color, capacidadTotalEnKG,
				precioEnBolivianos);
	}

	public String getFuenteDeCalor() {
		return fuenteDeCalor;
	}

	public void setFuenteDeCalor(String fuenteDeCalor) {
		this.fuenteDeCalor = fuenteDeCalor;
	}

	public int getNroPotencias() {
		return nroPotencias;
	}

	public void setNroPotencias(int nroPotencias) {
		this.nroPotencias = nroPotencias;
	}

	public String getTemperaturaMinima() {
		return temperaturaMinima;
	}

	public void setTemperaturaMinima(String temperaturaMinima) {
		this.temperaturaMinima = temperaturaMinima;
	}

	public String getTemperaturaMaxima() {
		return temperaturaMaxima;
	}

	public void setTemperaturaMaxima(String temperaturaMaxima) {
		this.temperaturaMaxima = temperaturaMaxima;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HornoMicroondas [");
		if (fuenteDeCalor != null) {
			builder.append("fuenteDeCalor=");
			builder.append(fuenteDeCalor);
			builder.append(", ");
		}
		builder.append("nroPotencias=");
		builder.append(nroPotencias);
		builder.append(", ");
		if (temperaturaMinima != null) {
			builder.append("temperaturaMinima=");
			builder.append(temperaturaMinima);
			builder.append(", ");
		}
		if (temperaturaMaxima != null) {
			builder.append("temperaturaMaxima=");
			builder.append(temperaturaMaxima);
		}
		builder.append("]");
		return builder.toString();
	}

}
