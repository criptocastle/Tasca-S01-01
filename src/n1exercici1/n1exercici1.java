package n1exercici1;

public class n1exercici1 {

	public static void main(String[] args) {


		Vent vent = new Vent("flauta", 35f);
		vent.tocar();
		System.out.println(vent.toString());

		Corda corda = new Corda("guitarra", 120.5f);
		corda.tocar();
		System.out.println(corda.toString());

		Percussio percussio = new Percussio("bateria", 275f);
		percussio.tocar();
		System.out.println(percussio.toString());

		Percussio percussio2 = new Percussio("tambor", 75f);
		System.out.println(percussio2.toString());

		Percussio percussio3 = new Percussio("plato", 5f);
		System.out.println(percussio3.toString());

		
	}

}
