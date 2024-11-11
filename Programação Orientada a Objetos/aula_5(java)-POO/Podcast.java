package aula2_java;

public class Podcast extends Mídia {
	private int episodio;
	
	public Podcast(String nome, String autor, int duraçao, int episodio) {
		super(nome, autor, duraçao);
		this.episodio = episodio;
	}
	
	public int getEpisodio() {
		return episodio;
	}
	
	public void setEpisodio(int newEpisodio) {
		this.episodio = newEpisodio;
	}
}
