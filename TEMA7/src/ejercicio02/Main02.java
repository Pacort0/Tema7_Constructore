package ejercicio02;

/**
 * Clase main desde la que vamos a usar y comprobar que los métodos de Libro funcionan
 * @author frodriguez
 *
 */
public class Main02 {
	public static void main(String[] args) {
		//Creamos un objeto de tipo libro
		Libro animale = new Libro("Un elefante se balanceaba", "Bécquer", 10, 0);
		
		//Prestamos 6 libros
		System.out.println(animale.prestamo(6) + ", quedan " + animale.ejemplares);
		//Se devuelven 4 libros
		System.out.println(animale.devolucion(4) + ", quedan " + animale.ejemplares);
		//Se prestan 7 libros
		System.out.println(animale.prestamo(7) + ", quedan " + animale.ejemplares);
		//Se intentar prestar 6 libros
		System.out.println(animale.prestamo(6) + ", quedan " + animale.ejemplares);
		//Se devuelven 9 libros
		System.out.println(animale.devolucion(9) + ", quedan " + animale.ejemplares);
		//Se devuelve el último libro
		System.out.println(animale.devolucion(1) + ", quedan " + animale.ejemplares);
	}
}
