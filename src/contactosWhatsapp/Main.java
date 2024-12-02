package contactosWhatsapp;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("case 1 agregar contacto \r\n"
				+ "case 2 editar contacto \r\n"
				+ "case 3 borrar contacto\r\n"
				+ "case 4 ver contactos \r\n"
				+ "case 5 agregar \r\n"
				+ "case 6 salir ");
		
		Scanner scanner = new Scanner(System.in);
		
		int opcion = Integer.parseInt(scanner.nextLine());
		
			switch (opcion) {
			case 1:
				System.out.println("Agregar contacto");
				break;
			case 2:
				System.out.println("Editar contacto");
				break;
			case 3:
				System.out.println("Borrar contacto");
				break;
			case 4:
				System.out.println("Ver contactos");
				break;
			case 5:
				System.out.println("Agregar contacto");
				break;
			case 6:
				System.out.println("Salir");
				break;
			default:
				System.out.println("Opción no válida");
				break;
		}
		scanner.close();
	}
	
}
