package ejercicio04;

public class CuentaCorrienteCRUD {
	/**
	 * Clase CuentaCorriente que dictamina el funcionamiento de las cuentas del
	 * banco Todas las cuentas tienen los atributos DNI, nombre y saldo
	 * 
	 * @author frodriguez
	 *
	 */
	enum Sexo {
		Femenino, Masculino
	}

	enum Estado {
		Activa, Bloqueada
	}

	String DNI;
	String nombre;
	double saldo;
	Sexo sexo;
	Estado estado;

	/**
	 * Constructor que crea una cuenta nueva
	 * 
	 * @param DNI   DNI del titular de la cuenta
	 * @param saldo Dinero disponible en la cuenta
	 */
	CuentaCorrienteCRUD(String DNI, double saldo) {
		this.DNI = DNI;
		this.saldo = saldo;
	}

	/**
	 * Constructor que crea una cuenta nueva
	 * 
	 * @param DNI    DNI del titular de la cuenta
	 * @param nombre Nombre del titular de la cuenta
	 * @param saldo  Dinero disponible en la cuenta
	 */
	CuentaCorrienteCRUD(String DNI, String nombre, double saldo, String sexo, String estado) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.saldo = saldo;
		this.sexo = Sexo.valueOf(sexo);
		this.estado = Estado.valueOf(estado);
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getEstado() {
		return String.valueOf(estado);
	}

	public void setEstado(String estado) {
		this.estado = Estado.valueOf(estado);
	}

	public String getSexo() {
		return String.valueOf(sexo);
	}

	public void setSexo(String sexo) {
		this.sexo = Sexo.valueOf(sexo);
	}

	/**
	 * Método para extraer dinero de la cuenta Si se dispone de la cantidad de
	 * dinero que se desea extraer o más, se hará Si no, mostrará un mensaje de
	 * error
	 * 
	 * @param dinero Dinero que se desea extraer de la cuenta
	 */
	void sacarDinero(double dinero) {
		if ((this.saldo - dinero) >= 0) {
			System.out.println("La operación puede proceder.");
			this.saldo -= dinero;
		} else {
			System.err.println("No puede extraer una cantidad de dinero superior a su saldo actual.");
		}
	}

	/**
	 * Método para ingresar dinero en la cuenta
	 * 
	 * @param dinero Dinero que se desea ingresar en la cuenta
	 */
	void ingresaDinero(double dinero) {
		saldo += dinero;
	}

	/**
	 * Método que muestra toda la información disponible de la cuenta
	 */
	public String toString() {
		return "CuentaCorriente [ DNI = " + DNI + ", nombre = " + nombre + ", saldo = " + saldo + ", sexo = " + sexo
				+ " estado = " + estado + " ]";
	}

}