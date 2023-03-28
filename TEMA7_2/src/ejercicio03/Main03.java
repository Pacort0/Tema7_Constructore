package ejercicio03;

public class Main03 {

	public static void main(String[] args) {
		Fecha primera = new Fecha(31, 5, 1999);

		if (!primera.fechaCorrecta()) {
			System.err.println("La fecha introducida es incorrecta.");
		} else {
			System.out.println("La fecha introducida es correcta.");

			if (primera.esBisiesto()) {
				System.out.println("El año introducido es bisiesto.");
			} else {
				System.out.println("El año introducido no es bisiesto");
			}

			primera.diaSiguiente();
			System.out.println("El día siguiente será el " + primera.toString());
		}
	}

}
