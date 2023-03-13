package ejercicio01;

public class Principal {

	public static void main(String[] args) {
		CuentaCorriente nabo = new CuentaCorriente("29504688N", "Juan Peto Hoja", 46);
		nabo.sacarDinero(37);
		nabo.ingresaDinero(100);
		nabo.sacarDinero(69);
		nabo.mustraInfo();
	}

}
