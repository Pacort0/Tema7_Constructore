package ejercicio02;

import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {
		int opcion; //Variable para guardar la opcion del menú

		Scanner sc = new Scanner(System.in); //Escáner del programa

		Contador cont1 = new Contador(0); //Objeto iniciado a 0

		//Pedimos al usuario un valor inicial para el contador
		System.out.println("Inicie el contador con un valor: ");
		cont1.setCont(sc.nextInt());
		
		//Menú del programa
		do {
			System.out.println("Elija una opción: " + "\n1. Incrementar contador." + "\n2. Decrementar contador."
					+ "\n3. Cerrar programa.");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1: //Si la opcion es 1, incrementamos el valor del contador en 1
				cont1.incrementar();
				System.out.println("El contador vale " + cont1.cont);
				break;
			case 2: //Si la opción es 2, decrementamos el valor del contador en 1
				cont1.decrementar(); 
				if (cont1.esNegativo()) { //Si el contador ya es 0, no se puede decrementar más
					System.err.println("El contador no puede tener un valor negativo.");
				}
				System.out.println("El contador vale " + cont1.cont);
				break;
			case 3: //Si la opción es 3, se cierra el programa
				System.out.println("Hasta luego Lucas.");
				break;
			default: //Si se introduce una opción inexistente, se informa al usuario
				System.err.println("La opción introducida no existe.");
			}
		} while (opcion != 3); //El menú se seguirá imprimiendo mientras no se escoja cerrarlo

		sc.close(); //Cerramos el escáner
	}

}
