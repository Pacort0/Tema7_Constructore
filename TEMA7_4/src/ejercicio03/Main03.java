package ejercicio03;

import java.util.Arrays;
import java.util.Scanner;

public class Main03 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int opcion;
		int posicion;
		Pizza[] pedidos = new Pizza[0];

		do {
			menu();
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				if (pedidos.length > 0) {
					muestraPedidos(pedidos);
				} else {
					System.err.println("No hay pedidos en la lista.");
				}
				break;
			case 2:
				posicion = posicionLibre(pedidos);
				pedidos = nuevoPedido(pedidos, posicion);
				break;
			case 3:
				if (cambioEstado(pedidos) < 0) {
					System.err.println("El código introducido no existe o el pedido ya ha sido entregado.");
				}
				break;
			case 4:
				if (finJornada(pedidos) != 0) {
					System.err.println("No se puede cerrar la jornada laboral, aún hay " + finJornada(pedidos)
							+ " pizza(s) sin entregar.");
				} else {
					pedidos = Arrays.copyOf(pedidos, 0);
				}
				break;
			case 5:
				cancelaPedido(pedidos);
				break;
			case 6:
				System.out.println("Hasta luego.");
				break;
			default:
				System.err.println("Esa opción no está contemplada.");
			}

		} while (opcion != 6);
	}

	private static void menu() {
		System.out
				.println("Introduzca una opción: " + "\n1. Mostrar pizzas" + "\n2. Nuevo pedido" + "\n3. Pizza servida"
						+ "\n4. Cerrar jornada (limpiar pedidos)" + "\n5. Cancelar pedido" + "\n6. Salir");
	}

	private static void muestraPedidos(Pizza[] pedidos) {

		for (Pizza pizza : pedidos) {
			if (pizza != null) {
				System.out.println(pizza);
			}
		}
	}

	private static Pizza[] nuevoPedido(Pizza[] pedidos, int posicion) {

		if (posicion >= 0) {
			sc.nextLine();

			pedidos[posicion] = new Pizza(posicion, elijeTamanio(), elijeTipo());
			pedidos[posicion].setEstado("Pedida");
		} else {
			pedidos = Arrays.copyOf(pedidos, pedidos.length + 1);
			sc.nextLine();

			posicion = pedidos.length - 1;

			pedidos[posicion] = new Pizza(posicion, elijeTamanio(), elijeTipo());
			pedidos[posicion].setEstado("Pedida");
		}

		return pedidos;
	}

	private static int posicionLibre(Pizza[] pedidos) {
		int posicion = 0;

		while (posicion < pedidos.length && pedidos[posicion] != null) {
			posicion++;
		}
		if (posicion == pedidos.length) {
			posicion = -1;
		}

		return posicion;
	}

	private static String elijeTamanio() {
		int opcion;
		String tamanio = "";

		do {
			System.out.println("Introduzca el tamaño de su pizza: " + "\n1. Mediana" + "\n2. Familiar");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				tamanio = String.valueOf(Pizza.Tamanio.Mediana);
				break;
			case 2:
				tamanio = String.valueOf(Pizza.Tamanio.Familiar);
				break;
			default:
				tamanio = "Esa opción no está contemplada";
			}
		} while (opcion != 1 && opcion != 2);

		return tamanio;
	}

	private static String elijeTipo() {
		int opcion;
		String tipo;

		do {
			System.out.println(
					"Introduzca el tipo de su pizza: " + "\n1. Cuatro Quesos" + "\n2. Funghi" + "\n3. Margarita");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				tipo = String.valueOf(Pizza.Tipo.CuatroQuesos);
				break;
			case 2:
				tipo = String.valueOf(Pizza.Tipo.Funghi);
				break;
			case 3:
				tipo = String.valueOf(Pizza.Tipo.Margarita);
				break;
			default:
				tipo = "Esa opción no está contemplada";
			}
		} while (opcion <= 0 || opcion > 3);

		return tipo;
	}

	private static int cambioEstado(Pizza[] pedidos) {
		int codigo;
		int indice = 0;
		System.out.println("Introduzca el código del pedido: ");
		codigo = sc.nextInt();

		if (codigo < 0 || codigo >= pedidos.length || pedidos[codigo] == null
				|| pedidos[codigo].getEstado().equals("Servida")) {
			indice = -1;
		} else {
			pedidos[codigo].setEstado("Servida");
		}

		return indice;
	}

	private static int finJornada(Pizza[] pedidos) {
		int pedida = 0;

		for (Pizza pizza : pedidos) {
			if (pizza.getEstado().equals("Pedida")) {
				pedida++;
			}
		}

		if (pedida == 0) {
			pedidos = new Pizza[0];
		}
		return pedida;
	}

	private static Pizza[] cancelaPedido(Pizza[] pedidos) {
		int codigo;

		System.out.println("Introduzca el código del pedido a cancelar: ");
		codigo = sc.nextInt();

		if (codigo < 0 || codigo >= pedidos.length || pedidos[codigo] == null
				|| pedidos[codigo].getEstado().equals("Servida")) {
			System.err.println("No se puede cancelar el pedido porque éste no existe o ya ha sido entregado.");
		} else {
			pedidos[codigo] = null;
		}

		return pedidos;
	}
}
