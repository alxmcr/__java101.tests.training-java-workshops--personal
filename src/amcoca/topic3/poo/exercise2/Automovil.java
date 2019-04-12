package amcoca.topic3.poo.exercise2;

public class Automovil {
	private String marca;
	private int modelo;
	private String placa;

	public Automovil() {
		this.marca = "Ford";
		this.modelo = 2013;
		this.placa = "FCZ-123";
	}

	public Automovil(String marca, int modelo, String placa) {
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
	}

	public Automovil(int modelo, String placa) {
		this.marca = "Ford";
		this.modelo = modelo;
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

}
