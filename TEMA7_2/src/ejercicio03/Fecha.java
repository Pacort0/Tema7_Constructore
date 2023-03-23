package ejercicio03;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;

	public Fecha() {

	}

	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		if (dia > 0 && dia <= 31) {
			if (getMes() == 2 && dia <= 28) {
				this.dia = dia;
			}
			else if ((getMes() == 1 || getMes() == 3 || getMes() == 5 || getMes() == 7 || getMes() == 8 || getMes() == 10
					|| getMes() == 12) && dia <= 31) {
				this.dia = dia;
			}
			else {
				this.dia =  dia;
			}
		}
		else {
			System.err.println("Día introducido incorrecto.");
		}
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		if(mes > 0 && mes <= 12) {
			this.mes = mes;
		}
		else {
			System.err.println("Mes introducido incorrecto.");
		}
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		if(anio > 1908 && anio <= 2023) {
			this.anio = anio;
		}
		else {
			System.err.println("Año introducido incorrecto.");
		}
	}
	
	public boolean esBisiesto() {
		boolean bisiesto;
		if(getAnio() % 4 == 0 || (getAnio() % 100 == 0 && getAnio() % 400 == 0)) { //Si además es divisible entre 100
					bisiesto = true; //Si es divisible entre 100 y 400 es bisiesto
				}
				else {
					bisiesto = false; //Si no, no lo es
				}
		
		return bisiesto;
	}
	
}
