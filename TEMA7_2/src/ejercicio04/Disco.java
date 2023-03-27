package ejercicio04;

public class Disco {
	private String codigo = "LIBRE";
	private String autor = "";
	private String titulo = "";
	private String genero = "";
	private int duracion = 0;
	
	public Disco() {
		
	}

	public Disco(String codigo, String autor, String titulo, String genero, int duracion) {
		this.codigo = codigo;
		this.autor = autor;
		this.titulo = titulo;
		this.genero = genero;
		this.duracion = duracion;
	}
	
	public Disco (Disco obj) {
		this.autor = obj.autor;
		this.codigo = obj.codigo;
		this.titulo = obj.titulo;
		this.genero = obj.genero;
		this.duracion = obj.duracion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		if(duracion > 0) {
			this.duracion = duracion;
		}	
	}

	@Override
	public String toString() {
		return "Disco [codigo = " + codigo + ", autor= " + autor + ", titulo = " + titulo + ", genero = " + genero
				+ ", duracion = " + duracion + "]";
	}
	
	
}
