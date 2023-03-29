package ejercicio01;
/**
 * Clase main desde la que ponemos en uso los métodos de CuentaCorriente
 * @author frodriguez
 *
 */
public class Main01 {

	public static void main(String[] args) {
		//Creamos un ojeto de tipo CuentaCorriente
		CuentaCorriente nabo = new CuentaCorriente("29504688N", "Juan Peto Hoja", 46);
		nabo.sacarDinero(37); //Sacamos 37 euros
		nabo.ingresaDinero(100); //Ingresamos 100 euros
		nabo.sacarDinero(69); //Sacamos 69
		nabo.toString(); //Mostramos la información de la cuenta
	}

}
