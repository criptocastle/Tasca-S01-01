package n3exercici1;

public class NoticiaFutbol extends Noticia {
	private String competicio, club, jugador;

	public NoticiaFutbol(String titular, String text, byte puntuacio, int preu, String competicio, String club,
			String jugador) {
		super(titular, text, puntuacio, 300);
		this.competicio = competicio;
		this.club = club;
		this.jugador = jugador;
	}

	public String getCompeticio() {
		return competicio;
	}

	public void setCompeticio(String competicio) {
		this.competicio = competicio;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	public String getJugador() {
		return jugador;
	}

	public void setJugador(String jugador) {
		this.jugador = jugador;
	}

	public void calcularPreuNoticia() {
		// 300 euros preu inicial, if champions true + 100, if b o m true + 100, if
		// ftorres o benz true + 50,

	}

}
