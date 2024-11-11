package aula2_java;

public class AlunoTecnico extends Aluno{
	int cargaHoraria;
	
	void realizarProjeto() {
		System.out.println("O aluno está realizando um projeto.");
	}
	
	void mostrarInfo() {
		System.out.println("Nome do aluno: " + nome + "\nMatricula: " + matricula + "\nCarga Horária: " + cargaHoraria);
	}
	
	public AlunoTecnico (String nome, String matricula, int cargaHoraria) {
		super (nome, matricula);
		this.cargaHoraria = cargaHoraria;
	}
}
