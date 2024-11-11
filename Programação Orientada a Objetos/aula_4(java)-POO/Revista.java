package aula2_java;

public class Revista extends ItemBiblioteca {
	private int edicao;
	
	public void exibirEdicao() {
		System.out.println("O número da edição da revista é: " + edicao);
	}
	
	public Revista (String nome, String autor, int anoPublicacao, int edicao) {
		super(nome, autor, anoPublicacao);
		this.edicao = edicao;
	}

}
