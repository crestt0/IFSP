package aula2_java;

public class Música extends Mídia {
	private String genero;
	
	public Música (String titulo, String autor, int duraçao, String genero) {
		super(titulo, autor, duraçao);
		this.genero = genero;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void seteGenero (String newGenero) {
		this.genero = newGenero;
	}
}
