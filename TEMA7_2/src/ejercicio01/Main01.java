package ejercicio01;

import java.util.Scanner;

/**
 * Clase main desde la que vamos a probar todos los métodos de 'hora'
 * @author frodriguez
 *
 */
public class Main01 {

	public static void main(String[] args) {
		int incremento = 0; //Variable para guardar los segundos a incrementar
		
		Hora primera = new Hora(0, 0, 0); //Creamos un objeto de tipo Hora
		
		Scanner sc = new Scanner(System.in); //Escáner del programa
		
		//Pedimos la hora
		System.out.println("Introduzca la hora que es: ");
		primera.setHora(sc.nextInt());
		System.out.println("Introduzca los minutos: ");
		primera.setMinuto(sc.nextInt());
		System.out.println("Introduzca los segundos: ");
		primera.setSegundos(sc.nextInt());
		
		//Mostramos la hora actual
		System.out.println("La hora actual es: " + primera.getHora() + " : " + primera.getMinuto() + " : " + primera.getSegundos());
		
		//Pedimos los segundos a incrementar
		System.out.println("Introduzca una cantidad de segundos a incrementar: ");
		incremento = sc.nextInt();
		
		//Incrementamos la hora
		primera.incrementaSegundos(incremento);
		
		//Mostramos la hora resultante
		System.out.println("La hora actual es: " + primera.getHora() + " : " + primera.getMinuto() + " : " + primera.getSegundos());
		
		//Cerramos el escáner
		sc.close();
	}

}
