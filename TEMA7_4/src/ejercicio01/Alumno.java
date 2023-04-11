package ejercicio01;

public class Alumno {
	
	private String nombre = "null";
	private double notaMedia = 0;
	
	public Alumno() {
	}
	
	public Alumno(String nombre, double notaMedia) {
		this.nombre = nombre;
		this.notaMedia = notaMedia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	@Override
	public String toString() {
		return "Alumno [nombre = " + nombre + ", notaMedia = " + notaMedia + "]";
	}
	
	
	
}
