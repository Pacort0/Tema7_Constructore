package ejercicio02;

import ejercicio02.Libro.Genero;

/**
 * Clase main desde la que vamos a usar y comprobar que los métodos de Libro funcionan
 * @author frodriguez
 *
 */
public class Main02 {
	public static void main(String[] args) {
		//Creamos un objeto de tipo libro
		Libro animale = new Libro("Un elefante se balanceaba", "Bécquer", 10, 0, "Narrativo");
		Libro kkk = new Libro("mi lucha", "David Beckham", 12, 3, "Dramático");
		
		System.out.println(animale.toString());
		animale.setGenero(Genero.Didáctico);
		System.out.println(animale.toString());
		
		System.out.println();
		
		System.out.println(kkk.toString());
		kkk.setGenero(Genero.Poético);
		System.out.println(kkk.toString());
	}
}
