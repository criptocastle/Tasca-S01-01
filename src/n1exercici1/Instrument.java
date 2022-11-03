package n1exercici1;

abstract class Instrument {
	private String name = "";
	private double price = 0d;

	{
		System.out.println("M'inicialitzo per cada objecte de la meva classe. ");
	}
	
	static {
		System.out.println("Està sonant un INSTRUMENT, però quin?\n");
	}

	// constructor

	public Instrument(String name, double price) {
		this.name = name;
		this.price = price;
	}

	// getters

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	// setters

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// mètode abstracte

	public abstract void tocar();
	
	public String toString() {
		return "És un/a " + name + " i val " + price + "€."; 
	}
}
