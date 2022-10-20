package n1exercici2;

public class n1exercici2 {

	public static void main(String[] args) {
		
		//crida mètode static sense crear objecte de la classe.
		Frenar();
		
		//crida mètode public a partir de crear un objecte de la classe.
		
		Cotxe cotxe = new Cotxe();
		/*
		 * Cotxe.getMarca(); //instanciat desde la classe Cotxe.getModel(); //idem
		 * cotxe.getPotencia(); //no static, instanciat desde l'objecte
		 */
		
		//invocació de mètodes
		
		Cotxe.Frenar(); //instanciat desde la classe
		cotxe.Accelerar(); //desde l'objecte creat de la classe
		
		
		
	}

	private static void Frenar() {
		
		
	}


		
	}

