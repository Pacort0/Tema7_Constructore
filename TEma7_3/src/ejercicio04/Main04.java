package ejercicio04;

import java.util.Scanner;

/**
 * Clase main que controla el funcionamiento de la coleccion de Discos
 * @author frodriguez
 *
 */
public class Main04 {
	//Escáner de la clase
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int opcion; //opcion del menú
		int contador; //contador que lleva cuenta de la próxima posición libre de la colección

		Disco[] coleccion = new Disco[10]; //Creamos un array de Discos

		for (int i = 0; i < coleccion.length; i++) { //Asignamos un objeto Disco a cada posicion del array 
			coleccion[i] = new Disco();
		}

		do { 
			menu(); //Mostramos el menú de opciones
			opcion = sc.nextInt();
			switch (opcion) {
			case 1: //Si la opción es 1
				listado(coleccion); //Mostramos el listado de discos
				break;
			case 2: //Si la opción es 2
				contador = posicionLibre(coleccion); //Buscamos la primera posición libre
				if (contador < 0) { //Si no se encuentra ninguna, no hay huecos
					System.out.println("No hay hueco.");
				} else { //Si hay huecos, creamos un nuevo disco
					nuevoDisco(coleccion, contador);
				}
				break;
			case 3: //Si la opción es 3
				modificar(coleccion); //modificamos el disco que se elija 
				break;
			case 4: //Si la opción es 4
				borrarDisco(coleccion); //Borramos el disco que se elija
				break;
			case 5: //Si la opción es 5, cerramos el programa
				System.out.println("HASTA LUEGO"); 
				break;
			default: //Si se introduce una opción inexistente
				System.err.println("Opción introducida incorrecta");
			}
		} while (opcion != 5); //Todo esto se seguirá mostrando mientras la opción no sea 5
	}
	
	/**
	 * Función que imprime el menú del programa
	 */
	private static void menu() {
		System.out.println("COLECCIÓN DE DISCOS." + "" + "\n===================" + "\n1. Listar discos"
				+ "\n2. Nuevo disco" + "\n3. Modificar disco" + "\n4. Borrar disco" + "\n5. Salir");
	}
	
	/**
	 * Función que lista los discos de la colección que no estén 'libres'
	 * @param coleccion Recibe el array de discos
	 */
	private static void listado(Disco[] coleccion) {
		for (Disco disco : coleccion) { // Para cada objeto disco del array de discos
			if (!disco.getCodigo().equals("LIBRE")) {
				System.out.println(disco); // Si el código no es 'LIBRE' se imprime el disco
			}
		}
	}
	
	/**
	 * Función que crea nuevos discos
	 * @param coleccion Recibe el array de discos
	 * @param contador Recibe el valor de la primera posición libre
	 */
	private static void nuevoDisco(Disco[] coleccion, int contador) {
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

	}
	
	/**
	 * Función que busca la primera posición libre de la colección
	 * @param coleccion Recibe el array de discos
	 * @return Devuelve la primera posición libre del array
	 */
	private static int posicionLibre(Disco[] coleccion) {
		int posicion = 0;
		
		//Búsqueda de la primera posición que esté 'libre'
		while (posicion < coleccion.length && !coleccion[posicion].getCodigo().equals("LIBRE")) { 
			posicion++;
		}
		if (posicion == coleccion.length) { //Si no se encuentra posición libre, 'posicion' = -1
			posicion = -1;
		}
		return posicion;
	}	
	
	/**
	 * Función que modifica un disco de la colección 
	 * @param coleccion Recibe el array de discos
	 */ 
	private static void modificar(Disco[] coleccion) {
		int codigo;

		System.out.println("Introduzca el código del disco a modificar: ");
		codigo = sc.nextInt();

		//Si el disco a modificar existe en la colección
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
	
	/**
	 * Función que borra un disco de la colección 
	 * @param coleccion Recibe el array de discos
	 */
	private static void borrarDisco(Disco[] coleccion) {
		int codigo;

		System.out.println("Introduza el código del disco a borrar: ");
		codigo = sc.nextInt();
		
		//Comprobamos que el disco introducido no está 'libre'
		if (codigo >= 0 && codigo < coleccion.length && !coleccion[codigo].getCodigo().equals("LIBRE")) {
			coleccion[codigo].setCodigo("LIBRE");
		} else {
			System.out.println("Codigo introducido incorrecto");
		}
	}

}
