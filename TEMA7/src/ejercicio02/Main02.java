package ejercicio02;

public class Main02 {
	public static void main(String[] args) {
		Libro furbo = new Libro();
		Libro animale = new Libro("Un elefante se balanceaba", "Bécquer", 10, 0);
		
		System.out.println(animale.prestamo(6) + ", quedan " + animale.ejemplares);
		System.out.println(animale.devolucion(4) + ", quedan " + animale.ejemplares);
		System.out.println(animale.prestamo(7) + ", quedan " + animale.ejemplares);
		System.out.println(animale.prestamo(6) + ", quedan " + animale.ejemplares);
		System.out.println(animale.devolucion(9) + ", quedan " + animale.ejemplares);
		System.out.println(animale.devolucion(1) + ", quedan " + animale.ejemplares);
	}
}
