package n1exercici2;

public class n1exercici2 {

	public static void main(String[] args) {

		// crida mètode public a partir de crear un objecte de la classe.

		//instancia objecte cotxe omplint paràmetres
		Cotxe c1 = new Cotxe("Ferrari", "Classe G", 500);
		
		//comprovació que static final pertany a la classe
		System.out.println(c1.toString() + ". Voliem un Ferrari però tenim un Mercedes.");

		
		Cotxe.getMarca(); // instanciat desde la classe Cotxe.getModel(); //idem
		c1.getPotencia(); // no static, instanciat desde l'objecte
		
		//comprovació que static final pertany a la classe
		c1.setModel("AMG");
		System.out.println("Ara tenim un " + c1.toString());

		// invocació de mètodes
		Cotxe.Frenar();  // instanciat desde la classe (metode static)
		c1.Accelerar(); // desde l'objecte creat de la classe (no static)
		
		

	}


}
