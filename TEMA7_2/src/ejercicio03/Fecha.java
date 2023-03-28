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
		if (fechaCorrecta()) {
			this.dia = dia;
		}
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		if (fechaCorrecta()) {
			this.mes = mes;
		}
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		if (fechaCorrecta()) {
			this.anio = anio;
		}
	}

	public boolean esBisiesto() {
		boolean bisiesto;
		if (getAnio() % 4 == 0 || (getAnio() % 100 == 0 && getAnio() % 400 == 0)) { // Si además es divisible entre 100
			bisiesto = true; // Si es divisible entre 100 y 400 es bisiesto
		} else {
			bisiesto = false; // Si no, no lo es
		}

		return bisiesto;
	}

	public boolean fechaCorrecta() {
		boolean correcta = false;

		if (getDia() > 0 && getDia() <= 31) {
			if (getMes() == 2 && getDia() <= 28) {
				correcta = true;
			}
			if (getMes() == 2 && getDia() == 29 && !esBisiesto()) {
				correcta = false;
			} else if ((getMes() == 1 || getMes() == 3 || getMes() == 5 || getMes() == 7 || getMes() == 8
					|| getMes() == 10 || getMes() == 12) && getDia() <= 31) {
				correcta = true;
			} else {
				correcta = true;
			}
		}

		if (getMes() <= 0 || getMes() > 12) {
			correcta = false;
		}

		if (getAnio() < 0 || getAnio() > 2023) {
			correcta = false;
		}

		return correcta;
	}
}
