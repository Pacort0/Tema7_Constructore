package ejercicio03;

/**
 * Clase main desde la que vamos a comprobar que funcionan todos los métodos de 'punto'
 * @author frodriguez
 *
 */
public class Main03 {

	public static void main(String[] args) {
		//Creamos dos objetos para comprobar que todo funciona
		Punto original = new Punto(1,1);
		Punto p = new Punto(5, 6);
		
		//Mostramos la posicion del punto 'original'
		System.out.println(original.toString());
		//Cambiamos las coordinadas de 'original'
		original.setXY(4, 7);
		//Mostramos las nuevas coordenadas de 'original'
		System.out.println(original.toString());
		//Desplazamos el punto 'original'
		original.desplaza(1, -4);
		//Mostramos las nuevas coordenadas de 'original'
		System.out.println(original.toString());
		//Mostramos la distancia entre 'original' y 'p'
		System.out.println("La distancia entre los dos puntos es de " + original.distancia(p) + " unidades.");
	}

}
