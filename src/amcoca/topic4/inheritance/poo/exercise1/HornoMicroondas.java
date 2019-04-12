package amcoca.topic4.inheritance.poo.exercise1;

public class HornoMicroondas extends Electrodomestico {
	private String fuenteDeCalor;
	private int nroPotencias;
	private String temperaturaMinima;
	private String temperaturaMaxima;

	public HornoMicroondas(String nombre, int alturaCM, int anchoCM, int profundidadCM, double pesoKG, String color,
			double capacidadTotalEnKG, double precioEnBolivianos, String fuenteDeCalor, int nroPotencias,
			String temperaturaMinima, String temperaturaMaxima) {
		super(nombre, alturaCM, anchoCM, profundidadCM, pesoKG, color, capacidadTotalEnKG, precioEnBolivianos);
		this.fuenteDeCalor = fuenteDeCalor;
		this.nroPotencias = nroPotencias;
		this.temperaturaMinima = temperaturaMinima;
		this.temperaturaMaxima = temperaturaMaxima;
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
		if (super.toString() != null) {
			builder.append("toString()=");
			builder.append(super.toString());
			builder.append(", ");
		}
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
