package ejercicio02;

/**
 * Clase que controla el contador
 * Todos los contador tienen el parámetro 'cont'
 * @author frodriguez
 *
 */
public class Contador {
	int cont = 0;
	
	/**
	 * Constructor por defecto
	 */
	public Contador() {
	}
	
	/**
	 * Constructor de Contador
	 * @param cont Recibe el valor con el que se debe iniciar el contador
	 */
	public Contador(int cont) {
		if (cont >= 0) {
			this.cont = cont;
		}
	}
	
	/**
	 * Constructor copia de Contador
	 * @param objContador Recibe por parámetros un objeto de tipo contador
	 */ 
	public Contador (Contador objContador) {
		this.cont = objContador.cont;
	}
	
	/**
	 * Método get que recoje el valor del contador actualmente
	 * @return Devuelve el valor del contador
	 */
	public int getCont() {
		return cont;
	}
	
	/**
	 * Método que cambia el valor del contador
	 * @param cont Cantidad que poner al contador
	 */
	public void setCont(int cont) {
		this.cont = cont;
	}
	
	/**
	 * Método que incrementa el valor del contador en 1
	 */
	public void incrementar() {
		this.cont++;
	}
	
	/**
	 * Método que decrementa el valor del contador en 1, comprobando que éste no llega a ser < 0
	 */
	public void decrementar() {
		
		if(this.cont - 1 < 0) {
			this.cont = 0;
		}
		else {
			this.cont--;
		}
	}
	
	/**
	 * Método que comprueba si el contador está a 0 cuando se desea decrementar
	 * @return Devuelve un booleano que informa de si el contador está a 0 o no
	 */
	public boolean esNegativo() {
		boolean negativo = false;
		
		if(this.cont == 0) {
			negativo = true;
		}
		
		return negativo;
	}

}
