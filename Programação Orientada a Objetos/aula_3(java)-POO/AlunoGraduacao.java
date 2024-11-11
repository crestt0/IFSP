package aula2_java;

public class AlunoGraduacao extends Aluno {
	String curso;
	
	void fazerEstagio() {
		System.out.println("O aluno está estagiando.");
	}
	
	void mostrarInfo() {
		System.out.println("Nome do aluno: " + nome + "\nMatricula: " + matricula + "\nCurso: " + curso);
	}
	
	public AlunoGraduacao(String nome, String matricula, String curso) {
		super (nome, matricula);
		this.curso = curso;
	}
}
