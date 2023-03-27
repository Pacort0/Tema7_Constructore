package ejercicio04;

import java.util.Scanner;

public class Main04 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int opcion;
		int contador;

		Disco[] coleccion = new Disco[10];

		for (int i = 0; i < coleccion.length; i++) {
			coleccion[i] = new Disco();
		}

		do {
			menu();
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				listado(coleccion);
				break;
			case 2:
				contador = posicionLibre(coleccion);
				if (contador < 0) {
					System.out.println("No hay hueco.");
				} else {
					nuevoDisco(coleccion, contador);
				}
				break;
			case 3:
				modificar(coleccion);
				break;
			case 4:
				borrarDisco(coleccion);
				break;
			case 5:
				System.out.println("HASTA LUEGO");
				break;
			default:
				System.err.println("Opción introducida incorrecta");
			}
		} while (opcion != 5);
	}

	private static void menu() {
		System.out.println("COLECCIÓN DE DISCOS." + "" + "\n===================" + "\n1. Listar discos"
				+ "\n2. Nuevo disco" + "\n3. Modificar disco" + "\n4. Borrar disco" + "\n5. Salir");
	}

	private static void listado(Disco[] coleccion) {
		for (Disco disco : coleccion) { // Para cada objeto disco del array de discos
			if (!disco.getCodigo().equals("LIBRE")) {
				System.out.println(disco); // Si el código no es 'LIBRE' se imprime el disco
			}
		}
	}

	private static int nuevoDisco(Disco[] coleccion, int contador) {
		String codigo;
		String autor, titulo, genero;
		int duracion;

		codigo = String.valueOf(contador); // Cambiamos el código del disco.
		coleccion[contador].setCodigo(codigo);

		sc.nextLine();
		System.out.println("Introduzca el autor del disco: "); // Asigno el autor al disco
		autor = sc.nextLine();
		System.out.println("Introduzca el título del disco: ");
		titulo = sc.nextLine();
		System.out.println("Introduzca el genero del disco: ");
		genero = sc.nextLine();
		System.out.println("Introduzca la duración del disco: ");
		duracion = sc.nextInt();
		sc.hasNextLine();

		coleccion[contador] = new Disco(codigo, autor, titulo, genero, duracion);

		return contador;
	}

	private static int posicionLibre(Disco[] coleccion) {
		int posicion = 0;

		while (posicion < coleccion.length && !coleccion[posicion].getCodigo().equals("LIBRE")) {
			posicion++;
		}
		if (posicion == coleccion.length) {
			posicion = -1;
		}
		return posicion;
	}

	private static void modificar(Disco[] coleccion) {
		int codigo;

		System.out.println("Introduzca el código del disco a modificar: ");
		codigo = sc.nextInt();

		if (!coleccion[codigo].getCodigo().equals("LIBRE")) {
			sc.nextLine();
			System.out.println("Introduzca el autor del disco: ");
			coleccion[codigo].setAutor(sc.nextLine());

			System.out.println("Introduzca el titulo del disco: ");
			coleccion[codigo].setTitulo(sc.nextLine());

			System.out.println("Introduzca el genero del disco: ");
			coleccion[codigo].setGenero(sc.nextLine());

			System.out.println("Introduzca la duración del disco: ");
			coleccion[codigo].setDuracion(sc.nextInt());
			sc.nextLine();
		} else {
			System.err.println("El disco introducido no existe");
		}
	}

	private static void borrarDisco(Disco[] coleccion) {
		int codigo;

		System.out.println("Introduza el código del disco a borrar: ");
		codigo = sc.nextInt();

		if (codigo >= 0 && codigo < coleccion.length && !coleccion[codigo].getCodigo().equals("LIBRE")) {
			coleccion[codigo].setCodigo("LIBRE");
		} else {
			System.out.println("Codigo introducido incorrecto");
		}
	}

}
