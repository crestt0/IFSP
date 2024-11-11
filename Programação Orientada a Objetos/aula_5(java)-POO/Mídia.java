package aula2_java;

public class Mídia {
	private String titulo;
	private String autor;
	private int duraçao;
	
	public void exibirInfo() {
		System.out.println("Título da mídia: " + titulo + " // Autor da mídia: " + autor + " // Duração (segundos) da mídia: " + duraçao);
	}
	
	public Mídia (String titulo, String autor, int duraçao) {
		this.titulo = titulo;
		this.autor = autor;
		this.duraçao = duraçao;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public int getDuraçao() {
		return duraçao;
	}
	
	public void setTitulo (String newTitulo) {
		this.titulo = newTitulo;
	}
	
	public void setAutor (String newAutor) {
		this.autor = newAutor;
	}
	
	public void setDuraçao(int newDuraçao) {
		this.duraçao = newDuraçao;
	}
}
