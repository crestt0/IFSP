package aula2_java;

public class AlunoPosGraduacao extends Aluno{
	String areaPesquisa;
	
	void defenderTese() {
		System.out.println("O aluno está defendendo a tese.");
	}
	
	void mostrarInfo() {
		System.out.println("Nome do aluno: " + nome + "\nMatricula: " + matricula + "\nÁrea da pesquisa: " + areaPesquisa);
	}
	
	public AlunoPosGraduacao (String nome, String matricula, String areaPesquisa) {
		super (nome, matricula);
		this.areaPesquisa = areaPesquisa;
	}
}
