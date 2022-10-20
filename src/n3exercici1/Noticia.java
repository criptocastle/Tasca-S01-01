package n3exercici1;

abstract class Noticia {
	private String titular, text;
	private byte puntuacio = 0;
	private int preu;

	
		
	public Noticia(String titular, String text, byte puntuacio, int preu) {
		super();
		this.titular = titular;
		this.text = "";
		this.puntuacio = puntuacio;
		this.preu = preu;
	}
	

	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}
	

	public byte getPuntuacio() {
		return puntuacio;
	}


	public void setPuntuacio(byte puntuacio) {
		this.puntuacio = puntuacio;
	}


	public int getPreu() {
		return preu;
	}


	public void setPreu(int preu) {
		this.preu = preu;
	}


	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}


	public abstract void calcularPreuNoticia();
	
}
