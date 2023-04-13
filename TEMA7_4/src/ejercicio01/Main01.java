package ejercicio01;

import java.util.Scanner;

public class Main01 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int opcion;
		int contador = 0;
		int posicion;
		Alumno[] lista = new Alumno[30];

		do {
			menu();
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				if (contador > 0) {
					listado(lista);
				} else {
					System.err.println("No existen alumnos en el registro aún.\n");
				}
				break;
			case 2:
				posicion = posicionLibre(lista);
				if (posicion >= 0) {
					nuevoAlumno(lista, posicion);
					contador++;
				} else {
					System.err.println("La lista de alumnos de esta clase ya está llena.");
				}
				break;
			case 3:
				if (modificaAlumno(lista) < 0) {
					System.err.println("Ese alumno no existe.");
				} else {
					System.out.println("Alumno modificado con éxito.");
				}
				break;
			case 4:
				if (borrarAlumno(lista) < 0) {
					System.err.println("Ese alumno no existe.");
				} else {
					System.out.println("Alumno eliminado con éxito.");
				}
				break;
			case 5:
				System.out.println("Hasta luego illo.");
				break;
			default:
				System.out.println("Esa opción no está contemplada.");
			}
		} while (opcion != 5);
	}

	private static void menu() {
		System.out.println("ALUMNES." + "" + "\n===================" + "\n1. Listado" + "\n2. Nuevo alumno"
				+ "\n3. Modificar" + "\n4. Borrar" + "\n5. Salir");
	}

	private static void listado(Alumno[] listado) {
		for (Alumno alumno : listado) {
			if (alumno != null) {
				System.out.println(alumno);
			}
		}
	}

	private static int posicionLibre(Alumno[] listado) {
		int posicion = 0;

		while (posicion < listado.length && listado[posicion] != null) {
			posicion++;
		}
		if (posicion == listado.length) {
			posicion = -1;
		}

		return posicion;
	}

	private static void nuevoAlumno(Alumno[] listado, int posicion) {
		String nombre;
		double notaMedia;

		sc.nextLine();
		System.out.println("Introduzca el nombre del alumne: ");
		nombre = sc.nextLine();
		do {
			System.out.println("Introduzca la nota media del alumne: ");
			notaMedia = sc.nextDouble();
		} while (notaMedia < 0 || notaMedia > 10);

		listado[posicion] = new Alumno(nombre, notaMedia);
	}

	private static int modificaAlumno(Alumno[] listado) {
		String nombre;
		int indice = 0;

		sc.nextLine();
		System.out.println("Introduzca el nombre del alumno a modificar: ");
		nombre = sc.nextLine();

		while (listado[indice] != null && indice < listado.length && !listado[indice].getNombre().equals(nombre)) {
			indice++;
		}

		if (indice == listado.length || listado[indice] == null) {
			indice = -1;
		} else {
			do {
				System.out.println("Introduzca la nota media del alumne: ");
				listado[indice].setNotaMedia(sc.nextDouble());
			} while (listado[indice].getNotaMedia() < 0 || listado[indice].getNotaMedia() > 10);
		}

		return indice;
	}

	private static int borrarAlumno(Alumno[] listado) {
		String nombre;
		int indice = 0;

		sc.nextLine();
		System.out.println("Introduzca el nombre del alumno a modificar: ");
		nombre = sc.nextLine();

		while (listado[indice] != null && indice < listado.length && !listado[indice].getNombre().equals(nombre)) {
			indice++;
		}

		if (indice == listado.length || listado[indice] == null) {
			indice = -1;
		} else {
			listado[indice] = null;
		}

		return indice;
	}
}