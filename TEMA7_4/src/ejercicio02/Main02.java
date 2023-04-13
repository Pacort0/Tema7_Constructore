package ejercicio02;

import java.util.Arrays;
import java.util.Scanner;

public class Main02 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int opcion = 0;
		int contador = 0;
		int posicion = 0;

		Gestisimal[] articulos = new Gestisimal[0];

		do {
			menu();
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				if (contador > 0) {
					listado(articulos);
				} else {
					System.err.println("No existen artículos en el almacén.\n");
				}
				break;
			case 2:
				posicion = posicionLibre(articulos);
				articulos = nuevoArticulo(articulos, posicion);
				if (posicion < 0) {
					contador++;
				}
				break;
			case 3:
				if (borrarArticulo(articulos) < 0 || contador == 0) {
					System.err.println("Ese artículo no existe.");
				} else {
					System.out.println("Artículo eliminado con éxito.");
					contador--;
				}
				break;
			case 4:
				if (modificaArticulo(articulos) < 0 || contador == 0) {
					System.err.println("Ese artículo no existe.");
				} else {
					System.out.println("Artículo modificado con éxito.");
				}
				break;
			case 5:
				if (contador > 0) {
					importeArticulos(articulos);
				} else {
					System.err.println("Ese artículo no existe.");
				}
				break;
			case 6:
				if (contador > 0) {
					exporteArticulos(articulos);
				} else {
					System.err.println("Ese artículo no existe.");
				}
				break;
			case 7:
				System.out.println("Hasta luego illo.");
				break;
			default:
				System.out.println("Esa opción no está contemplada.");
			}
		} while (opcion != 7);
	}

	private static void menu() {
		System.out.println("Elija una opción: " + "\n1. Listar artículos" + "\n2. Añadir artículo"
				+ "\n3. Borrar artículo" + "\n4. Modificar artículo" + "\n5. Importación de artículos"
				+ "\n6. Exportación de artículos" + "\n7. Salir");
	}

	private static void listado(Gestisimal[] listado) {
		for (Gestisimal articulo : listado) {
			if (articulo != null) {
				System.out.println(articulo);
			}
		}
	}

	private static Gestisimal[] nuevoArticulo(Gestisimal[] listado, int posicion) {
		String descripcion;
		double venta;
		double compra;
		int stock;

		if (posicion >= 0) {
			sc.nextLine();
			System.out.println("Introduzca la descripción del artículo: ");
			descripcion = sc.nextLine();
			System.out.println("Introduzca el precio de venta del artículo: ");
			venta = sc.nextDouble();
			System.out.println("Introduzca el precio de compra del artículo: ");
			compra = sc.nextDouble();
			System.out.println("Introduzca la cantidad de unidades del artículo de las que se disponen: ");
			stock = sc.nextInt();

			listado[posicion] = new Gestisimal(posicion, descripcion, venta, compra, stock);
		} else {
			listado = Arrays.copyOf(listado, listado.length + 1);
			sc.nextLine();
			System.out.println("Introduzca la descripción del artículo: ");
			descripcion = sc.nextLine();
			System.out.println("Introduzca el precio de venta del artículo: ");
			venta = sc.nextDouble();
			System.out.println("Introduzca el precio de compra del artículo: ");
			compra = sc.nextDouble();
			System.out.println("Introduzca la cantidad de unidades del artículo de las que se disponen: ");
			stock = sc.nextInt();

			if (posicion == -1) {
				posicion = listado.length - 1;
			}

			listado[listado.length - 1] = new Gestisimal(posicion, descripcion, venta, compra, stock);
		}

		return listado;

	}

	private static int posicionLibre(Gestisimal[] listado) {
		int posicion = 0;

		while (posicion < listado.length && listado[posicion] != null) {
			posicion++;
		}
		if (posicion == listado.length) {
			posicion = -1;
		}

		return posicion;
	}

	private static int modificaArticulo(Gestisimal[] listado) {
		int codigo;
		int indice = 0;

		sc.nextLine();
		System.out.println("Introduzca el código del artículo a modificar: ");
		codigo = sc.nextInt();

		if(codigo < 0 || codigo >= listado.length || listado[codigo] == null) {
			indice = -1;
		} else {
			do {
				sc.nextLine();
				System.out.println("Introduzca la descripción del artículo: ");
				listado[indice].setDescripcion(sc.nextLine());
				System.out.println("Introduzca el precio de venta del artículo: ");
				listado[indice].setPrecioVenta(sc.nextDouble());
				System.out.println("Introduzca el precio de compra del artículo: ");
				listado[indice].setPrecioCompra(sc.nextDouble());
				System.out.println("Introduzca la cantidad de unidades del artículo de las que se disponen: ");
				listado[indice].setStock(sc.nextInt());
			} while (listado[indice].getPrecioVenta() < 0 || listado[indice].getPrecioCompra() < 0);
		}

		return indice;
	}

	private static int borrarArticulo(Gestisimal[] listado) {
		int codigo;
		int indice = 0;

		sc.nextLine();
		System.out.println("Introduzca el código del artículo a modificar: ");
		codigo = sc.nextInt();

		while (listado[indice] != null && indice < listado.length && listado[indice].getCodigo() != codigo) {
			indice++;
		}
		if (indice == listado.length || listado[indice] == null) {
			indice = -1;
		} else {
			listado[indice] = null;
		}

		return indice;
	}

	private static void importeArticulos(Gestisimal[] listado) {
		int codigo;
		int articulos;

		System.out.println("Introduzca el código del artículo recibido: ");
		codigo = sc.nextInt();
		System.out.println("Introduzca la cantidad de articulos recibidos: ");
		articulos = sc.nextInt();

		if(codigo > 0 && codigo < listado.length && listado[codigo] != null) {
			if (articulos <= 0) {
				System.err.println("El cargamento debe de tener algún artículo.");
			} else {
				listado[codigo].setStock(articulos + listado[codigo].getStock());
				System.out.println("Stock aumentado con éxito.");
			}
		} else {
			System.err.println("Ese articulo no existe.");
		}

	}

	private static void exporteArticulos(Gestisimal[] listado) {
		int codigo;
		int articulos;

		System.out.println("Introduzca el código del artículo a exportar: ");
		codigo = sc.nextInt();
		System.out.println("Introduzca la cantidad de articulos a exportar: ");
		articulos = sc.nextInt();

		if(codigo > 0 && codigo < listado.length && listado[codigo] != null) {
			if (articulos <= 0) {
				System.err.println("El cargamento debe de tener algún artículo.");
			} else if (listado[codigo].getStock() - articulos >= 0) {
				listado[codigo].setStock(listado[codigo].getStock() - articulos);
				System.out.println("Artículo(s) exportados con éxito.");
			} else {
				System.err.println("No se pueden exportar más artículos de los que se tienen en el almacén.");
			}
		} else {
			System.err.println("Ese articulo no existe.");
		}

	}

}