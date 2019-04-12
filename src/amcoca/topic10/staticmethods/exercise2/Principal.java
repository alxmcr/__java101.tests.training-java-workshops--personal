package amcoca.topic10.staticmethods.exercise2;

public class Principal {

	public static void main(String[] args) {
		demo1();
		demo2();
	}

	private static void demo1() {

		System.out.println(ConstantesMensajes.MOSTRAR_DATOS_PERSONA);

		StringBuffer amcoca = new StringBuffer();
		amcoca.append(ConstantesAMCOCA.ALEJANDRO).append(ConstantesLiterales.ESPACIO_BLANCO)
				.append(ConstantesAMCOCA.MAURICIO).append(ConstantesLiterales.ESPACIO_BLANCO)
				.append(ConstantesAMCOCA.COCA).append(ConstantesLiterales.ESPACIO_BLANCO).append(ConstantesAMCOCA.ROJAS)
				.append(ConstantesLiterales.ESPACIO_BLANCO);
		System.out.println(amcoca.toString());
		System.out.println(ConstantesLiterales.SALTO_LINEA);
	}

	private static void demo2() {
		System.out.println(ConstantesMensajes.MOSTRAR_DATOS_BD);

		System.out.println(ConstantesConfiguracion.NAME_DATABASE_IIAG_BD);
		System.out.println(ConstantesConfiguracion.USUARIO_IIAG_BD);
		System.out.println(ConstantesConfiguracion.PASSWORD_IIAG_BD);
		System.out.println(ConstantesConfiguracion.HOST_IIAG_BD);
		System.out.println(ConstantesLiterales.SALTO_LINEA);

	}

}
