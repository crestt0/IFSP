package aula2_java;

public class Main {

	public static void main(String[] args) {
		Livro livro1 = new Livro("Crime e Castigo", "Dostoiévski", 1866, "Romance");
		Revista revista1 = new Revista("Super Interessante", "Editora Abril", 1987, 1);
		Artigo artigo1 = new Artigo("Inteligência Artificial e sociedade: avanços e riscos", "Jaime Simão Sichman", 2021, "Inteligência Artificial");
		
		
		livro1.mostrarInfo();
		livro1.exibirGenero();
		
		System.out.println("-------------------------------------------");
		
		revista1.mostrarInfo();
		revista1.exibirEdicao();
		
		System.out.println("-------------------------------------------");
		
		artigo1.mostrarInfo();
		artigo1.exibirAreaPesquisa();
	}

}
