package ejercicio02;

/**
 * Clase que guarda la información acerca de los libros y dirige el
 * funcionamiento de la biblioteca Todos los libros disponen de los atributos
 * 'titulo', 'autor', 'ejemplares' y 'prestados'
 * 
 * @author frodriguez
 *
 */
public class Libro {
	enum Genero{
		Narrativo, Lírico, Dramático, Didáctico, Poético
	}
	private String titulo;
	private String autor;
	private int ejemplares;
	private int prestados;
	private Genero genero;

	/**
	 * Constructor vacío por defecto
	 */
	Libro() {
	}

	/**
	 * Constructor de Libro
	 * 
	 * @param titulo     Asigna un título al libro
	 * @param autor      Asigna un autor del libro
	 * @param ejemplares Determina el número de ejemplares iniciales
	 * @param prestados  Determina la cantidad de ejemplares que han sido prestados
	 */
	public Libro(String titulo, String autor, int ejemplares, int prestados, String genero) {
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.prestados = prestados;
		this.genero = Genero.valueOf(genero);
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	/**
	 * Método que determina si se puede o no realizar el préstamo de libros En caso
	 * de poderse, también decrementa la cantidad de ejemplares disponibles y
	 * aumenta la cantidad de libros prestados
	 * 
	 * @param deseados Cantidad de ejemplares que se desean tomar prestados
	 * @return Devuelve un booleano en función de si se puede o no realizar la
	 *         prestación
	 */
	Boolean prestamo(int deseados) {
		Boolean prestado = false;

		if ((ejemplares - deseados) >= 0) {
			prestado = true;
			this.ejemplares -= deseados;
			this.prestados += deseados;
		}

		return prestado;
	}

	/**
	 * Método que determina si se puede o no devolver los ejemplares de un libro Si
	 * se pueden devolver (si se ha prestado algún ejemplar con anterioridad),
	 * decrementa el número de ejemplares prestados y aumenta los ejemplares
	 * disponibles
	 * 
	 * @param devolvibles Cantidad de libros que se desea devolver
	 * @return Devuelve un booleano en función de si se pueden o no devolver libros
	 */
	Boolean devolucion(int devolvibles) {
		Boolean devolvido = false;

		if (this.prestados != 0 && this.prestados - devolvibles >= 0) {
			devolvido = true;
			this.prestados -= devolvibles;
			this.ejemplares += devolvibles;
		}

		return devolvido;
	}

	public String toString() {
		return "Libro [titulo = " + titulo + ", autor = " + autor + ", ejemplares = " + ejemplares + ", prestados = "
				+ prestados + ", genero = " + genero + "]";
	}
	
	
}
