package ejercicio03;

public class Punto {
	int x;
	int y;
	
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void imprime() {
		System.out.println("Las coordenadas del punto son: (" + this.x + ", " + this.y + ")");
	}
	
	void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void desplaza(int dx, int dy) {
		this.x += dx;
		this.y += dy;
		
		System.out.println("El punto se ha desplazado a las coordenadas (" + this.x + ", " + this.y + ")");
	}
	
	double distancia(Punto p) {
		double distancia = 0;
		
		distancia = Math.sqrt((Math.pow(this.x - p.x, 2)) + (Math.pow(this.y - p.y, 2)));
		
		return distancia;
	}
}
