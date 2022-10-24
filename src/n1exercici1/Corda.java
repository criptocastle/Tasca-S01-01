package n1exercici1;

public class Corda extends Instrument{
	
	public Corda(String name, double price) {
		super(name, price);
	}
	
	public void tocar() {
		System.out.println("Està sonant un instrument de corda.");
	}

}
