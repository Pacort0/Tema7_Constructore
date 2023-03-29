package ejercicio04;

/**
 * Clase que crea los discos y recoge sus datos Todos los discos disponen de un
 * código, un autor, un título, un género y una determinada duración
 * 
 * @author frodriguez
 *
 */
public class Disco {
	private String codigo = "LIBRE";
	private String autor = "";
	private String titulo = "";
	private String genero = "";
	private int duracion = 0;

	/**
	 * Constructor por defecto
	 */
	public Disco() {

	}

	/**
	 * Constructor de Disco
	 * 
	 * @param codigo   Código del disco
	 * @param autor    Autor del disco
	 * @param titulo   Título del disco
	 * @param genero   Género del disco
	 * @param duracion Duración del disco
	 */
	public Disco(String codigo, String autor, String titulo, String genero, int duracion) {
		this.codigo = codigo;
		this.autor = autor;
		this.titulo = titulo;
		this.genero = genero;
		this.duracion = duracion;
	}
	
	/**
	 * Constructor copia de Disco
	 * @param obj Objeto Disco
	 */
	public Disco(Disco obj) {
		this.autor = obj.autor;
		this.codigo = obj.codigo;
		this.titulo = obj.titulo;
		this.genero = obj.genero;
		this.duracion = obj.duracion;
	}
	
	/**
	 * Método que recoge el valor de 'codigo'
	 * @return El valor de 'codigo'
	 */
	public String getCodigo() {
		return codigo;
	}
	
	/**
	 * Método que asigna un nuevo valor a 'codigo'
	 * @param codigo Nuevo valor de 'codigo'
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	/**
	 * Método que recoge el valor de 'autor'
	 * @return El valor de 'autor'
	 */
	public String getAutor() {
		return autor;
	}
	
	/**
	 * Método que asigna un nuevo valor a 'autor'
	 * @param autor Nuevo valor de 'autor'
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	/**
	 * Método que recoge el valor de 'titulo'
	 * @return El valor de 'titulo'
	 */
	public String getTitulo() {
		return titulo;
	}
	
	/**
	 * Método que asigna un nuevo valor a 'titulo'
	 * @param titulo Nuevo valor para 'titulo'
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	/**
	 * Método que recoge el valor de 'genero'
	 * @return El valor de 'genero'
	 */
	public String getGenero() {
		return genero;
	}
	
	/**
	 * Método que asigna un nuevo valor a 'genero'
	 * @param genero Nuevo valor para 'genero'
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	/**
	 * Método que recoge el valor de 'duracion'
	 * @return El valor de 'duracion
	 */
	public int getDuracion() {
		return duracion;
	}
	
	/**
	 * Método que asigna un nuevo valor a 'duracion'
	 * @param duracion Nuevo valor para 'duracion'
	 */
	public void setDuracion(int duracion) {
		if (duracion > 0) {
			this.duracion = duracion;
		}
	}
	
	/**
	 * Método toString
	 */
	public String toString() {
		return "Disco [codigo = " + codigo + ", autor= " + autor + ", titulo = " + titulo + ", genero = " + genero
				+ ", duracion = " + duracion + "]";
	}

}
