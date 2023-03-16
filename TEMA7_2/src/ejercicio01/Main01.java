package ejercicio01;

import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		int incremento = 0;
		
		Hora primera = new Hora(0, 0, 0);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca la hora que es: ");
		primera.setHora(sc.nextInt());
		System.out.println("Introduzca los minutos: ");
		primera.setMinuto(sc.nextInt());
		System.out.println("Introduzca los segundos: ");
		primera.setSegundos(sc.nextInt());
		
		System.out.println("La hora actual es: " + primera.getHora() + " : " + primera.getMinuto() + " : " + primera.getSegundos());
		
		System.out.println("Introduzca una cantidad de segundos a incrementar: ");
		incremento = sc.nextInt();
		
		primera.incrementaSegundos(incremento);
		
		System.out.println("La hora actual es: " + primera.getHora() + " : " + primera.getMinuto() + " : " + primera.getSegundos());
		
		sc.close();
	}

}
