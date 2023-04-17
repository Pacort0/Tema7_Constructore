package ejercicio03;

public class Pizza {
	
	enum Tamanio{
		Mediana, Familiar
	}
	enum Tipo{
		Margarita, CuatroQuesos, Funghi
	}
	enum Estado{
		Pedida, Servida
	}
	private int codigo = 0;
	private Tamanio tamanio = Tamanio.Mediana;
	private Tipo tipo = Tipo.Margarita;
	private Estado estado = Estado.Pedida;
	
	public Pizza() {
	}

	public Pizza(int codigo, Tamanio tamanio, Tipo tipo, Estado estado) {
		this.codigo = codigo;
		this.tamanio = tamanio;
		this.tipo = tipo;
		this.estado = estado;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Tamanio getTamanio() {
		return tamanio;
	}

	public void setTamanio(Tamanio tamanio) {
		this.tamanio = tamanio;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Pizza [codigo=" + codigo + ", tamanio=" + tamanio + ", tipo=" + tipo + ", estado=" + estado + "]";
	}
	
}
