package n1exercici1;

public class Vent extends Instrument {

	public Vent(String name, double price) {
		super(name, price);
	}

	static {
		System.out.println("Sóc de Vent static, fill de la mare Instrument");
	}

	public void tocar() {
		System.out.println("Està sonant un instrument de vent.");
	}

}
