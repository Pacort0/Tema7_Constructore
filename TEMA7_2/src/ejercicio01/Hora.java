package ejercicio01;

public class Hora {
	int hora;
	int minuto;
	int segundos;

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
		if (hora >= 0 && hora <= 23) {
			this.hora = hora;
		} else {
			System.err.println("La hora introducida no existe");
		}
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		if (minuto >= 0 && minuto <= 59) {
			this.minuto = minuto;
		} else {
			System.err.println("Los minutos introducidos no existen");
		}
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		if (segundos >= 0 && segundos <= 59) {
			this.segundos = segundos;
		} else {
			System.err.println("Los segundos introducidos no existen");
		}
	}

	public void incrementaSegundos(int incremento) {

		for (int i = 1; i <= incremento; i++) {

			segundos++;
			if (getSegundos() > 59) {
				minuto++;
				setSegundos(0);
			}
			if (getMinuto()> 59) {
				hora++;
				setMinuto(0);
			}
			if (getHora() > 23) {
				setMinuto(0);
			}
		}
	}

}
