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
		boolean bisiesto = false;
		if (getAnio() % 4 == 0 || (getAnio() % 100 == 0 && getAnio() % 400 == 0)) { // Si además es divisible entre 100
			bisiesto = true; // Si es divisible entre 100 y 400 es bisiesto
		}

		return bisiesto;
	}

	public boolean fechaCorrecta() {
		boolean correcta = false;

		if (getDia() > 0 && getDia() <= 31) {
			if (getMes() == 2 && getDia() <= 28) {
				correcta = true;
			} else if (getMes() == 2 && getDia() <= 29 && esBisiesto()) {
				correcta = true;
			} else if ((mesDe31()) && getDia() <= 31) {
				correcta = true;
			} else if (getMes() != 2 && getDia() <= 30) {
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

	public void diaSiguiente() {
		if (this.dia == 31 && mesDe31()) {

			if (lastMonth()) {
				this.dia = 1;
				this.mes = 1;
				this.anio++;

			} else {
				this.dia = 1;
				this.mes++;
			}
		}

		else if ((this.dia == 29 && this.mes == 2) || this.dia == 30 && this.mes != 2) {
			this.dia = 1;
			this.mes++;
		}

		else {
			this.dia++;
		}
	}

	public boolean lastMonth() {
		boolean ultimo = false;

		if (this.mes == 12) {
			ultimo = true;
		}

		return ultimo;
	}

	public boolean mesDe31() {
		boolean mesLargo = false;

		if (getMes() == 1 || getMes() == 3 || getMes() == 5 || getMes() == 7 || getMes() == 8 || getMes() == 10
				|| getMes() == 12) {
			mesLargo = true;
		}

		return mesLargo;
	}

	public String toString() {
		String formato = "";

		if (this.dia < 10) {
			formato = "0" + dia + "-" + mes + "-" + anio;
		} else if (this.mes < 10) {
			formato = dia + "-0" + mes + "-" + anio;
		}
		if (this.mes < 10 && this.dia < 10) {
			formato = "0" + dia + "-0" + mes + "-" + anio;
		}

		return formato;
	}

}
