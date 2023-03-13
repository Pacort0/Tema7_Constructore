package ejercicio01;

public class CuentaCorriente {
	String DNI;
	String nombre;
	double saldo;
	
	CuentaCorriente (String DNI, double saldo){
		this.DNI = DNI;
		this.saldo = saldo;
	}
	
	CuentaCorriente (String DNI, String nombre, double saldo){
		this.DNI = DNI;
		this.nombre = nombre;
		this.saldo = saldo;
	}
	
	void sacarDinero(double dinero) {
		if((this.saldo - dinero) >= 0) {
			System.out.println("La operación puede proceder.");
			this.saldo -= dinero;
		}
		else {
			System.out.println("No puede extraer una cantidad de dinero superior a su saldo actual.");
		}
	}
	void ingresaDinero(double dinero) {
		saldo += dinero;
	}
	
	void mustraInfo() {
		System.out.println("El DNI del titular de la cuenta es: " + this.DNI
				+ "\nEl nombre del titular de la cuenta es: " + this.nombre
				+ "\nEl saldo actual de esta cuenta es: " + this.saldo);
	}
}

