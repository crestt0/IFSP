package aula2_java;

public class Aluno {
	
	String nome;
	String matricula;
	
	void estudar() {
		System.out.println("O aluno está estudando.");
	}
	
	public Aluno (String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
}
