package n3exercici1;

import java.util.ArrayList;
import java.util.Scanner;

public class n3exercici1 {

	public static void main(String[] args) {
		byte opcio = 0;
		Scanner sc = new Scanner(System.in);

		//Menu
		
		System.out.println("- MENU -\n "
				+ "Escull una opció: \n "
				+ "1. Introduïr un redactor\n "
				+ "2. Eliminar un redactor\n "
				+ "3. Introduïr notícia a un redactor\n "
				+ "4. Eliminar una notícia\n "
				+ "5. Mostrar totes les notícies per redactor\n "
				+ "6. Calcular puntuació de la notícia\n "
				+ "7. Calcular preu/notícia\n"
				+ "Opció:  ");
		
		opcio = sc.nextByte();
		
		
		switch(opcio) {
		case 1:
			introduirRedactor();
			break;
		case 2:
			eliminarRedactor();
			break;
		case 3:
			introduirNoticia();
			break;
		case 4:
			eliminarNoticia();
			break;
		case 5:
			mostrarNoticies();
			break;
		case 6:
			calcularPuntuacioNoticia();
			break;
		case 7:
			calcularPreuNoticia();
			break;
		default:
			System.out.println("Introdueix una opció vàlida.");
			
			
			
			
		}
		
		
		
		
		
	}
	public static void introduirRedactor() {
		
		ArrayList<Redactor> redactors = new ArrayList<Redactor>();
		Scanner sc = new Scanner(System.in);
		Redactor newRedactor = new Redactor(0);

		
		System.out.println("Introdueix el nom: ");
		newRedactor.setNom(sc.nextLine());
		
		System.out.println("Introdueix el dni: ");
		newRedactor.setDni(sc.nextLine());
		
		System.out.println("S'ha introduït correctament al/la " + newRedactor.getNom()
				+ " amb dni " + newRedactor.getDni() + ""
				+ " i un sou base de " + newRedactor.getSou() + " Euros.");
		
		redactors.add(newRedactor);
		

		
	}
	public static void eliminarRedactor() {
		
		
	}
	public static void introduirNoticia() {
		byte opcio;
		Scanner sc = new Scanner(System.in);
		
		ArrayList<NoticiaFutbol> noticiesFutbol = new ArrayList<NoticiaFutbol>();
	
		
		System.out.println("Indica quin tipus de Noticia vols introduïr:\n"
				+ "1. Futbol\n"
				+ "2. Bàsquet\n"
				+ "3. Tenis\n"
				+ "4. F1\n"
				+ "5. Motociclisme\n"
				+ "Opció: ");
		
		opcio = sc.nextByte();
		
		switch(opcio){
		case 1:
			//NoticiaFutbol futbol = new NoticiaFutbol("", "", 0, 0, "", "", "");
			
			
		}
		
		
		
	}
	public static void eliminarNoticia() {
		
	}
	public static void mostrarNoticies() {
		
	}
	public static void calcularPuntuacioNoticia() {
		
	}
	public static void calcularPreuNoticia() {
		
	}

}
