package ejercicio02;

public class Libro {
	String titulo;
	String autor;
	int ejemplares;
	int prestados;
	
	Libro(){
	}

	public Libro(String titulo, String autor, int ejemplares, int prestados) {
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.prestados = prestados;
	}
	
	Boolean prestamo (int deseados) {
		Boolean prestado = false;
		
		if((ejemplares - deseados) >= 0) {
			prestado = true;
			this.ejemplares -= deseados;
			this.prestados += deseados;
		}
		
		return prestado;
	}
	
	Boolean devolucion (int devueltos) {
		Boolean devolvido = false;
		
		if(this.prestados != 0 && this.prestados - devueltos >= 0) {
			devolvido = true;
			this.prestados -= devueltos;
			this.ejemplares += devueltos;
		}
		
		return devolvido;
	}
}
