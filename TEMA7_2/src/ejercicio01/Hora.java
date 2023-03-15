package ejercicio01;

public class Hora {
	private int hora = 0;
	private int minuto = 0;
	private int segundos = 0;

	public Hora() {

	}

	public Hora(int hora, int minuto, int segundos) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundos = segundos;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		if (hora < 0 || hora > 23) {
			this.hora = hora;
		}
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		if (minuto < 0 || minuto > 59) {
			this.minuto = minuto;
		}
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		if (segundos < 0 || segundos > 59) {
			this.segundos = segundos;
		}
	}

	public void incrementaSegundos(int incremento) {

		for (int i = 0; i <= incremento; i++) {

			segundos++;

			if (this.segundos == 59) {
				this.minuto++;
			}
			if (this.minuto == 59) {
				this.hora++;
			}
			if (this.hora == 23) {
				hora = 0;
			}
		}
	}
}
