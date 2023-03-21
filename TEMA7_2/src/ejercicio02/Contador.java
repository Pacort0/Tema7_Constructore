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
	
	public Contador (Contador objContador) {
		this.cont = objContador.cont;
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}
	
	public void incrementar() {
		this.cont++;
	}
	
	public void decrementar() {
		if(this.cont - 1 < 0) {
			this.cont = 0;
			System.err.println("El contador no puede tener un valor negativo.");
		}
		else {
			this.cont--;
		}
	}

}
