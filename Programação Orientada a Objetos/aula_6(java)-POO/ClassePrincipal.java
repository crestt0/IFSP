package aula2;

public class ClassePrincipal {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("João");
		Livro livro1 = new Livro("Crime e Castigo", true);
		
		aluno1.solicitarEmprestimo(livro1);
		aluno1.devolverLivro(livro1);
	}

}
