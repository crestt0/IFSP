package aula2_java;

public class Artigo extends ItemBiblioteca {
	private String areaPesquisa;
	
	public void exibirAreaPesquisa() {
		System.out.println("A área da pesquisa do artigo é: " + areaPesquisa);
	}
	
	public Artigo(String nome, String autor, int anoPublicacao, String areaPesquisa) {
		super(nome, autor, anoPublicacao);
		this.areaPesquisa = areaPesquisa;
	}

}
