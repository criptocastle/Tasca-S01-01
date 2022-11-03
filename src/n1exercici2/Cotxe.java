package n1exercici2;

public class Cotxe {
	// pot ser public un static final, perqué SEMPRE serà aquest valor final de la classe independentment de l'accés.
	public static final String marca = "Mercedes"; 
	private static String model; // només pertany a la classe, atribut compartit per tots els objectes
	private final int potencia; // no pot/podrà ser modificat

	// constructor

	public Cotxe(String marca, String model, int potencia) { //tot i així, el static final el passem per constructor per inicialitzar-lo en l'objecte
		this.model = model;
		this.potencia = potencia;
	}

	// 2/3 atributs amb els respectius modificadors perquè, el static no 
	 
	//getters
	
	public static String getMarca() {
		return marca;
	}

	public static String getModel() {
		return model;
	}

	public int getPotencia() {
		return potencia;
	}
	
	//setters
	
	public static void setModel(String model) {
		Cotxe.model = model;
	}
	

	//methods
	
	public static void Frenar() {
		System.out.println("El vehicle està frenant.");
	}
	public void Accelerar() {
		System.out.println("El vehicle està accelerant.");
	}

	@Override
	public String toString() {
		return marca + " " + model + ", " + potencia + " CV";
	}

}
