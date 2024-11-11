package aula2_java;

public class Livro extends ItemBiblioteca {
	private String genero;
	
	public void exibirGenero() {
		System.out.println("O gẽnero do livro é: " + genero);
	}
	
	public Livro (String nome, String autor, int anoPublicacao, String genero) {
		super (nome, autor, anoPublicacao);
		this.genero = genero;
	}

}
