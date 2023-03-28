package ejercicio03;

/**
 * Clase que determina el funcionamiento de los puntos
 * Cada punto tiene los atributos 'x' e 'y' que determinan su posición en el plano
 * @author frodriguez
 *
 */
public class Punto {
	int x;
	int y;
	
	/**
	 * Constructor de puntos
	 * @param x Posición 'x' del punto
	 * @param y Posición 'y' del punto
	 */
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Método que altera el valor de 'x' e 'y' directamente
	 * @param x Nueva posición 'x' del punto
	 * @param y Nueva posición 'y' del punto
	 */
	void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Método que altera la posición de 'x' e 'y' mediante suma
	 * También muestra la posición del punto después del incremento
	 * @param dx Posiciones que debe incrementar la 'x'
	 * @param dy Posiciones que debe incrementar la 'y'
	 */
	void desplaza(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}
	
	/**
	 * Método que calcula la distancia entre dos puntos dados
	 * @param p Recibe un punto a comparar
	 * @return Devuelve un entero que indica las unidades de distancia entre ambos puntos
	 */
	double distancia(Punto p) {
		double distancia = 0;
		
		distancia = Math.sqrt((Math.pow(this.x - p.x, 2)) + (Math.pow(this.y - p.y, 2)));
		
		return distancia;
	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
	
	
}
