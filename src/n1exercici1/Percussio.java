package n1exercici1;

public class Percussio extends Instrument {
	
	public Percussio(String name, float price) {
		super(name, price);
		
	}
	
	public void tocar() {
		System.out.println("Està sonant un instrument de percussió. ");
	}

	
	{
		System.out.println("jo no sóc static");
	}
	static {
		System.out.println("sóc estatic");
	}
	
	
}
