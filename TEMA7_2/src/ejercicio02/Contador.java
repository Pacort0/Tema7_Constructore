package ejercicio02;

public class Contador {
	int cont = 0;

	public Contador() {
	}

	public Contador(int cont) {
		if (cont >= 0) {
			this.cont = cont;
		}
	}

}
