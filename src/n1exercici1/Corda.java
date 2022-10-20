package n1exercici1;

public class Corda extends Instrument {

	public Corda(String name, float price) {
		super(name, price);
		
	}
	
	public void tocar() {
		System.out.println("Està sonant un instrument de corda.");
	}
}
