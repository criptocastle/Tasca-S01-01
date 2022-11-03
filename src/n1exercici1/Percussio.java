package n1exercici1;

public class Percussio extends Instrument {

	public Percussio(String name, double price) {
		super(name, price);
	}

	static {
		System.out.println("Jo sóc de percussió static.");
	}

	public void tocar() {
		System.out.println("Està sonant un instrument de percussió.");
	}

	
}
