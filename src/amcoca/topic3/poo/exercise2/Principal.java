package amcoca.topic3.poo.exercise2;

class Principal {

	public static void main(String[] args) {
		Automovil auto1 = new Automovil();
		Automovil auto2 = new Automovil(2013, "KPF-2562");

		System.out.println(auto1.getMarca() + " " + auto1.getModelo() + " " + auto1.getPlaca());
		System.out.println(auto2.getMarca() + " " + auto2.getModelo() + " " + auto2.getPlaca());

	}
}