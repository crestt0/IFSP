package aula2_java;

public class Main {

	public static void main(String[] args) {
		AlunoGraduacao alunogradua = new AlunoGraduacao();
		AlunoPosGraduacao alunopos = new AlunoPosGraduacao();
		AlunoTecnico alunotec = new AlunoTecnico();
		
		alunogradua.curso = "Sistemas de Informação.";
		alunogradua.matricula = "SP111222333";
		alunogradua.nome = "Vinicius";
		
		alunopos.areaPesquisa = "Tecnologia da Informação";
		alunopos.matricula = "SP333222111";
		alunopos.nome = "João";
		
		alunotec.cargaHoraria = 360;
		alunotec.matricula = "SP000000000";
		alunotec.nome = "Pedro";
		
		alunogradua.estudar();
		alunogradua.fazerEstagio();
		
		alunopos.estudar();
		alunopos.defenderTese();
		
		alunotec.estudar();
		alunotec.realizarProjeto();
	}

}
