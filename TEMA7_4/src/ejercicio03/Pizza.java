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

	public Pizza(int codigo, String tamanio, String tipo, String estado) {
		this.codigo = codigo;
		this.tamanio = Tamanio.valueOf(tamanio);
		this.tipo = Tipo.valueOf(tipo);
		this.estado = Estado.valueOf(estado);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTamanio() {
		return String.valueOf(tamanio);
	}

	public void setTamanio(String tamanio) {
		this.tamanio = Tamanio.valueOf(tamanio);
	}

	public String getTipo() {
		return String.valueOf(tipo);
	}

	public void setTipo(String tipo) {
		this.tipo = Tipo.valueOf(tipo);
	}

	public String getEstado() {
		return String.valueOf(estado);
	}

	public void setEstado(String estado) {
		this.estado = Estado.valueOf(estado);
	}

	@Override
	public String toString() {
		return "Código de la pizza = " + codigo +  ", tamaño = " + tamanio + ", tipo = " + tipo + ", estado = " + estado + "";
		
	}
	
}
