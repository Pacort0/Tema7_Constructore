package ejercicio02;

public class Gestisimal {
	
	private int codigo = 0;
	private String descripcion = "";
	private double precioVenta = 0;
	private double precioCompra = 0;
	private int stock = 0;
	
	public Gestisimal() {
	}

	public Gestisimal(int codigo, String descripcion, double precioVenta, double precioCompra, int stock) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precioVenta = precioVenta;
		this.precioCompra = precioCompra;
		this.stock = stock;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Gestisimal [codigo = " + codigo + ", descripcion = " + descripcion + ", precio de venta = " + precioVenta
				+ ", precio de compra = " + precioCompra + ", stock = " + stock + "]";
	}
	
	
	
}
