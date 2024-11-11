package aula2;

public class Aluno {
	private String nome;
	
	public Aluno (String nome) {
		this.nome = nome;
	}
	
	public void setAluno(String novo_aluno) {
		this.nome = novo_aluno;
	}
	
	public String getAluno() {
		return nome;
	}
	
	public void solicitarEmprestimo(Livro livro) {
		if (Livro.getDisponivel()) {
			System.out.println("O aluno " + nome + " gostaria de emprestar o livro " + Livro.getTitulo());
			Livro.setDisponivel(false);}
		else {
			System.out.println("O aluno" + nome + " não pegou o livro emprestado pois ele não está disponível");
		}
	}
	
	public void devolverLivro(Livro livro) {
		System.out.println("O aluno " + nome + " gostaria de devolver o livro " + Livro.getTitulo());
		Livro.setDisponivel(true);
	}
	
}
