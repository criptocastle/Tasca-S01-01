package n1exercici1;

public class n1exercici1 {

	public static void main(String[] args) {

		// càrrega d'una classe

		Percussio timbal = new Percussio("Timbal", 150.50);
		System.out.println(timbal.toString());
		
		Percussio plat = new Percussio("Plat", 49.95); 
		System.out.println(plat.toString());
		
		Percussio tambor = new Percussio("Tambor", 100.00);
		System.out.println(tambor.toString());

				
		Corda guitarra = new Corda("Guitarra", 195.50);
		System.out.println(guitarra.toString());

		Vent flauta = new Vent("Flauta", 59.95);
		System.out.println(flauta.toString());
		
		//falta imprimir mètode abstractes
		//inicialitzar bloc estatic en cada subclasse per fer la comprovacio
		
		

	}

}
