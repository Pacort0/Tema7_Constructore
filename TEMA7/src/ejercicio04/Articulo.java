package ejercicio04;

/**
 * Clase que asigna la información de los artículos y determina las acciones que se pueden efectuar con dichos artículos
 * Cada artículo tiene un IVA del 21%, un nombre, un precio unitario y una cantidad de stock
 * @author frodriguez
 *
 */
public class Articulo {
	final int IVA = 21;
	String nombre;
	double precio;
	int cuantosQuedan;

	/**
	 * Constructor que asigna valores a cada artículo
	 * @param nombre Asigna un nombre al artículo
	 * @param precio Asigna un precio al artíclo
	 * @param cuantosQuedan Asigna una cantidad de stock del artículo
	 */
	public Articulo(String nombre, double precio, int cuantosQuedan) {

		if (precio <= 0 || cuantosQuedan < 0) {
			System.err.println("Parámetros introducidos incorrectos.");
		} else {
			this.nombre = nombre;
			this.precio = precio;
			this.cuantosQuedan = cuantosQuedan;
		}
	}
	
	/**
	 * Método que muestra la información disponible acerca del artículo
	 */
	void muestraInfo() {
		System.out.println("Nombre del producto: " + this.nombre
				+ "\nPrecio unitario del producto: " + this.precio
				+ "\ncuantosQuedan: " + this.cuantosQuedan);
	}
	
	/**
	 * Método que calcula y devuelve el precio con el IVA aplicado
	 * @return Devuelve el precio con el IVA aplicado
	 */
	double getPVP() {
		double pvp = this.precio + (precio * IVA * 0.01);
		
		return pvp;
	}
	
	/**
	 * Método que calcula el precio de un precio con IVA y un descuento aplicado
	 * @param descuento Descuento del producto
	 * @return Devuelve el precio descontado
	 */
	double getPVPDescuento(double descuento) {
		double pvp = 0;
		double pvpDisc = 0;
		descuento *= 0.01;
		
		pvp = (this.precio + (this.precio * IVA * 0.01));
		pvpDisc = pvp - (pvp * descuento);
		
		return pvpDisc;
	}
	
	/**
	 * Método que determina si se puede o no vender una cantidad de productos
	 * De poderse vender, se restan de los productos disponibles en stock 
	 * @param aComprar Cantidad de productos que se desean adquirir
	 * @return Devuelve un booleano en función de la comprabilidad de dicha cantidad de productos
	 */
	Boolean vender (int aComprar) {
		Boolean vender = false;
		
		if((cuantosQuedan - aComprar) >= 0) {
			vender = true;
			cuantosQuedan -= aComprar;
		}
		
		return vender;
	}
	
	/**
	 * Método que recibe cargamentos de nuevos productos
	 * @param cargamento Cantidad de productos que se reciben en el cargamento
	 */
	void almacenar(int cargamento) {
		this.cuantosQuedan += cargamento;
	}

}
