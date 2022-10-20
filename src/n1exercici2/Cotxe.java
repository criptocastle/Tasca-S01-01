package n1exercici2;

public class Cotxe {
	private static final String marca = "Mercedes"; //ambdós 
	private static String model; //només pertany a la classe, atribut compartit per tots els objectes
	private final int potencia = 200; //no pot ser modificat	
	
	
	/*
	 * Cap dels 3 atributs amb els respectius modificadors perquè, els statics es criden desde la classe,
	 * i els final no son modificables */
	
	
	public static String getModel() {
		return model;
	}

	public static void setModel(String model) {
		Cotxe.model = model;
	}

	public static String getMarca() {
		return marca;
	}

	public int getPotencia() {
		return potencia;
	}

	
	public static void Frenar() {
		System.out.println("El vehicle està frenant.");
	}
	
	public void Accelerar() {
		System.out.println("El vehicle està accelerant.");
	}
	
}
