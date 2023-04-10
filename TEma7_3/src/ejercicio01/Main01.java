package ejercicio01;

import ejercicio01.CuentaCorriente.Sexo;

/**
 * Clase main desde la que ponemos en uso los métodos de CuentaCorriente
 * @author frodriguez
 *
 */
public class Main01 {

	public static void main(String[] args) {
		//Creamos un ojeto de tipo CuentaCorriente
		CuentaCorriente nabo = new CuentaCorriente("29504688N", "Juan Peto Hoja", 46, "Femenino");
		System.out.println(nabo.toString());
		nabo.sacarDinero(37); //Sacamos 37 euros
		System.out.println(nabo.toString());
		nabo.ingresaDinero(100); //Ingresamos 100 euros
		System.out.println(nabo.toString());
		nabo.sacarDinero(69); //Sacamos 69
		System.out.println(nabo.toString());
		nabo.setSexo(Sexo.Masculino);
		System.out.println(nabo.toString());
	}

}
