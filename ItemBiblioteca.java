package aula2_java;

public class ItemBiblioteca {
	private String nome;
	private String autor;
	protected int anoPublicacao;
	
	public void mostrarInfo() {
		System.out.println("Nome da obra: " + nome + " // Autor da obra: " + autor + " // Ano de publicação: " + anoPublicacao);
	}
	
	public ItemBiblioteca (String nome, String autor, int anoPublicacao) {
		this.nome = nome;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
}
}