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
			if(getMes() != 2 && dia <= 28) {
				this.dia = dia;
			}
			if(getMes() != 1) {
				
			}
		}
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

}
