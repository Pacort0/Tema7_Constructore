package ejercicio04;

public class Main04 {

	public static void main(String[] args) {
		Articulo gorro = new Articulo ("Gorro rana", 15, 10);
		Articulo dildo = new Articulo ("Hot Pleasure", 20, 30);
		
		gorro.muestraInfo();
		System.out.println("El artículo vale (con IVA) un total de " + gorro.getPVP());
		System.out.println("El artículo con su código de descuento del 15% vale " + gorro.getPVPDescuento(15));
		System.out.println(gorro.vender(3));
		System.out.println("Quedan " + gorro.cuantosQuedan);
		System.out.println(gorro.vender(14));
		System.out.println("Quedan " + gorro.cuantosQuedan);
		gorro.almacenar(8);
		System.out.println("Quedan " + gorro.cuantosQuedan);
		
		dildo.muestraInfo();
		System.out.println("El artículo vale (con IVA) un toal de " + dildo.getPVP());
		System.out.println("El artículo con su código de descuento del 20% vale " + dildo.getPVPDescuento(20));
		System.out.println(dildo.vender(23));
		System.out.println("Quedan " + dildo.cuantosQuedan);
		System.out.println(dildo.vender(14));
		System.out.println("Quedan " + dildo.cuantosQuedan);
		dildo.almacenar(8);
		System.out.println("Quedan " + dildo.cuantosQuedan);
		
	}

}
