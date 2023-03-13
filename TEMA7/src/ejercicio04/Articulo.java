package ejercicio04;

public class Articulo {
	final int IVA = 21;
	String nombre;
	double precio;
	int cuantosQuedan;

	public Articulo(String nombre, double precio, int cuantosQuedan) {

		if (precio <= 0 || cuantosQuedan < 0) {
			System.err.println("Parámetros introducidos incorrectos.");
		} else {
			this.nombre = nombre;
			this.precio = precio;
			this.cuantosQuedan = cuantosQuedan;
		}
	}
	
	void muestraInfo() {
		System.out.println("Nombre del producto: " + this.nombre
				+ "\nPrecio del producto: " + this.precio
				+ "\ncuantosQuedan: " + this.cuantosQuedan);
	}
	
	double getPVP() {
		double pvp = this.precio + (precio * IVA * 0.01);
		
		return pvp;
	}
	
	double getPVPDescuento(double descuento) {
		double pvp = 0;
		double pvpDisc = 0;
		descuento *= 0.01;
		
		pvp = (this.precio + (this.precio * IVA * 0.01));
		pvpDisc = pvp - (pvp * descuento);
		
		return pvpDisc;
	}
	
	Boolean vender (int x) {
		Boolean vender = false;
		
		if((cuantosQuedan - x) >= 0) {
			vender = true;
			cuantosQuedan -= x;
		}
		
		return vender;
	}
	
	void almacenar(int cargamento) {
		this.cuantosQuedan += cargamento;
	}

}
