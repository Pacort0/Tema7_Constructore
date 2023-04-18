package ejercicio04;

import java.util.Arrays;
import java.util.Scanner;

public class Main04 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int posicion;
		int opcion;
		CuentaCorrienteCRUD[] cuentas = new CuentaCorrienteCRUD[0];

		System.out.println("Bienvenidos al banco de ESPAÑA");

	}

	private static void menu() {
		System.out.println("¿Qué desea hacer en el día de hoy?: " + "\n1. Leakear datos de los usuarios a Facebook."
				+ "\n2. Abrir una nueva cuenta." + "\n3. Bloquear una cuenta." + "\n4. Modificar datos de una cuenta."
				+ "\n5. Ingresar dinero en una cuenta." + "\n6. Retirar dinero de una cuenta."
				+ "\n7. Cerrar programa.");
	}

	private static void muestraDatos(CuentaCorrienteCRUD[] cuentas) {
		for (CuentaCorrienteCRUD cuenta : cuentas) {
			if (cuenta != null) {
				System.out.println(cuenta);
			}
		}
	}

	private static CuentaCorrienteCRUD[] nuevaCuenta(CuentaCorrienteCRUD[] cuentas, int posicion) {
		String DNI;
		String nombre;
		int saldo;

		if (posicion > 0) {
			sc.nextLine();
			System.out.println("Introduzca el DNI del titular de la cuenta: ");
			DNI = sc.nextLine();
			System.out.println("Introduzca el nombre del titular de la cuenta: ");
			nombre = sc.nextLine();
			System.out.println("Introduzca el saldo inicial de la cuenta: ");
			saldo = sc.nextInt();

			cuentas[posicion] = new CuentaCorrienteCRUD(DNI, nombre, saldo, elijeSexo(), "Activa");
		} else {
			cuentas = Arrays.copyOf(cuentas, cuentas.length + 1);

			sc.nextLine();
			System.out.println("Introduzca el DNI del titular de la cuenta: ");
			DNI = sc.nextLine();
			System.out.println("Introduzca el nombre del titular de la cuenta: ");
			nombre = sc.nextLine();
			System.out.println("Introduzca el saldo inicial de la cuenta: ");
			saldo = sc.nextInt();

			cuentas[posicion] = new CuentaCorrienteCRUD(DNI, nombre, saldo, elijeSexo(), "Activa");
		}

		return cuentas;
	}

	private static int posicionLibre(CuentaCorrienteCRUD[] cuentas) {
		int posicion = 0;

		while (posicion < cuentas.length && cuentas[posicion] != null) {
			posicion++;
		}
		if (posicion == cuentas.length) {
			posicion = -1;
		}

		return posicion;
	}

	private static String elijeSexo() {
		int opcion;
		String sexo = "";

		do {
			System.out.println("Introduzca su sexo: " + "\n1. Masculino." + "\n2. Femenino.");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				sexo = String.valueOf(CuentaCorrienteCRUD.Sexo.Masculino);
				break;
			case 2:
				sexo = String.valueOf(CuentaCorrienteCRUD.Sexo.Femenino);
				break;
			default:
				System.out.println("Esa opción no está contemplada.");
			}
		} while (opcion != 1 && opcion != 2);

		return sexo;
	}

	private static int bloqueaCuenta(CuentaCorrienteCRUD[] cuentas) {
		String dni;
		int indice = 0;

		System.out.println("Introduce el DNI del titular de la cuenta: ");
		dni = sc.nextLine();

		while (!cuentas[indice].getDNI().equalsIgnoreCase(dni) && !cuentas[indice].getEstado().equals("Bloqueada")
				&& indice < cuentas.length) {
			indice++;
		}

		if (indice == cuentas.length || cuentas[indice].getDNI().equalsIgnoreCase(dni)
				|| cuentas[indice].getEstado().equals("Bloqueada")) { // Aquí me he quedao
			indice = -1;
		}
		
		else {
			cuentas[indice].setEstado("Bloqueada");
		}

		return indice;
	}
}