package n1exercici1;

public class Percussio extends Instrument {
	
	public Percussio (String name, double price) {
		super(name, price);
	}
	{
		System.out.println("Jo estava escrit abans, però no sóc static.\n ");
	}
	static {
		System.out.println("Jo sóc static.");
	}
	
	
	
	public void tocar() {
		System.out.println("Està sonant un instrument de percussió.");	}

}
