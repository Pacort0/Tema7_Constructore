package ejercicio03;

import ejercicio03.Articulo.Departamento;

/**
 * Clase main desde la que vamos a comprobar que funcionan todos los métodos de 'articulo'
 * @author frodriguez
 *
 */
public class Main03 {

	public static void main(String[] args) {
		//Creamos dos objetos para probar que todo funciona
		Articulo gorro = new Articulo ("Gorro rana", 15, 10, "Droguería");
		Articulo dildo = new Articulo ("Hot Pleasure", 20, 30, "Electrónica");
		
		//Mostramos la información de 'gorro'
		gorro.muestraInfo();
		System.out.println("El artículo vale (con IVA) un total de " + gorro.getPVP()); //Precio con IVA del gorro
		//Precio del gorro con descuento
		System.out.println("El artículo con su código de descuento del 15% vale " + gorro.getPVPDescuento(15));
		//Se venden 3 gorros
		System.out.println(gorro.vender(3));
		//Mostramos cuantos gorros quedan
		System.out.println(gorro.toString());
		//Intentamos vender 14 gorros
		System.out.println(gorro.vender(14));
		//Se muestran cuantos gorros quedan
		System.out.println(gorro.toString());
		//Se almacenan 8 nuevos gorros
		gorro.almacenar(8);
		//Mostramos cuantos gorros quedan
		System.out.println(gorro.toString());
		//Cambiamos el departamento del gorro
		gorro.setDepartamento(Departamento.Alimentación);
		System.out.println(gorro.toString());
		
		//Mostramos la información de 'dildo'
		dildo.muestraInfo();
		System.out.println("El artículo vale (con IVA) un toal de " + dildo.getPVP());  //Precio con IVA del dildo
		//Precio del dildo con descuento
		System.out.println("El artículo con su código de descuento del 20% vale " + dildo.getPVPDescuento(20));
		//Se venden 23 dildos
		System.out.println(dildo.vender(23));
		//Mostramos cuantos gorros quedan
		System.out.println(dildo.toString());
		//Se intentan vender 14 dildos
		System.out.println(dildo.vender(14));
		//Mostramos cuantos dildos quedan
		System.out.println(dildo.toString());
		//Almacenamos 8 dildos nuevos
		dildo.almacenar(8);
		//Mostramos cuantos dildos queadan
		System.out.println(dildo.toString());
		//Cambiamos el departemento del dildo
		dildo.setDepartamento(Departamento.Alimentación);
		System.out.println(dildo.toString());
		
	}

}
