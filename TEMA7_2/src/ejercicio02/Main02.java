package ejercicio02;

import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {
		int opcion;

		Scanner sc = new Scanner(System.in);

		Contador cont1 = new Contador(0);

		System.out.println("Inicie el contador con un valor: ");
		cont1.setCont(sc.nextInt());

		do {
			System.out.println("Elija una opción: " + "\n1. Incrementar contador." + "\n2. Decrementar contador."
					+ "\n3. Cerrar programa.");
			opcion = sc.nextInt();
			switch(opcion) {
			case 1: cont1.incrementar();
			System.out.println("El contador vale " + cont1.cont);
			break;
			case 2: cont1.decrementar();
			System.out.println("El contador vale " + cont1.cont);
			break;
			case 3: System.out.println("Hasta luego Lucas.");
			break;
			default: System.err.println("La opción introducida no existe.");
			}
		} while (opcion != 3);
		
		sc.close();
	}

}
