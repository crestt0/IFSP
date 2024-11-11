package aula2;

public class Livro {
	private String titulo;
	private boolean disponivel;
	
	public Livro (String titulo, boolean disponivel) {
		this.titulo = titulo;
		this.disponivel = disponivel;
	}
	
	public void setTitulo(String novo_titulo) {
		this.titulo = novo_titulo;
	}
	
	public void setDisponivel(boolean novo_disponivel) {
		this.disponivel = novo_disponivel;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public boolean getDisponivel() {
		return disponivel;
	}
}
