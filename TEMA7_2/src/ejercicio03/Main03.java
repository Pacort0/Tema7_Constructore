package ejercicio03;

import java.util.Scanner;

public class Main03 {

	public static void main(String[] args) {
		Fecha primera = new Fecha(19, 2, 1924);

		Scanner sc = new Scanner(System.in);

if (!primera.fechaCorrecta()) {
			System.out.println("La fecha introducida es incorrecta.");
		} else {
			System.out.println("La fecha introducida es correcta.");
			
			if (primera.esBisiesto()) {
				System.out.println("El año introducido es bisiesto.");
			} else {
				System.out.println("El año introducido no es bisiesto");
			}
		}
		
		sc.close();
	}

}
